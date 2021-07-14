package org.alpreah.demo;
 
import javax.inject.Inject;
import javax.servlet.http.HttpSession;
 
import org.alpreah.domain.member;
import org.alpreah.persistence.member_dao;
import org.springframework.context.annotation.Bean;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.method.annotation.AbstractJsonpResponseBodyAdvice;
 
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
 
@Controller
public class HomeController {
    
    //싱글톤으로 선언된 것을 주입 받는다.
    @Inject
    //해당하는 클레스에서 member_dao라는 자료형을 자기는 m_dao를 선언한다.
    private member_dao m_dao;
    //GET으로 /페이지를 요청하면
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String login() {
        //VIEW 폴더애 login.jsp 파일을 뷰페이지로 선언
        return "login";
    }
    //body의 값을 매핑하는 용도
    @ResponseBody
    //POST로 Login으로 요청을 할 경우
    @RequestMapping(value = "Login", method = RequestMethod.POST)
    //login이라는 메소드명을 가지고 매개변수는 member m, Httpsession session
    public int login(member m, HttpSession session) {
        //m_dao.Login(m, session)을 호출하고 반환한다.
        return m_dao.Login(m, session);
    }
    //GET으로 reigster페이지를 요청 할 경우
    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String register() {
        //view안에 있는 register.jsp를 뷰페이지로 지정한다.
        return "register";
    }
    //body의 값을 매핑하는 용도
    @ResponseBody
    //POST로 /register 페이지로 요청을 할 경우
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    //메소드 이름이 register 매게변수는 member 자료형의 변수명은 m
    public int register(member m) {
        //m_dao.Register(m)의 값을 반환한다.
        return m_dao.Register(m);
    }
    
    // GET으로 /index페이지에 요청을 할 때
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index() {
        //view폴더에 있는 index.jsp를 뷰페이지로 선언한다.
        return "index";
    }
    
    //로그아웃 관련 페이지
    // /logout으로 GET 방식으로 페이지를 접근하게 된다면
    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    //메소드 이름은 LOGOUT 매게 변수는 SESSION
    public String logout(HttpSession session) {
        //m으로 선언된 세션을 삭제시킨다.
        session.removeAttribute("m");
        // /페이지로 리다이렉트 시킨다.
        return "redirect:/";
    }
 
//JSONP를 사용하기 위해 선언
    @ControllerAdvice
    public class JsonpAdviceController extends AbstractJsonpResponseBodyAdvice {
        public JsonpAdviceController() {
            super("callback");
        }
    }
 
    @Bean
    public MappingJackson2HttpMessageConverter mappingJackson2HttpMessageConverter() {
        MappingJackson2HttpMessageConverter jsonConverter = new MappingJackson2HttpMessageConverter();
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        jsonConverter.setObjectMapper(objectMapper);
        return jsonConverter;
    }
 
}