
 @RequestMapping(value="/login", method=RequestMethod.GET)
    public ModelAndView loginForm(LoginCommand loginCommand,
                    @CookieValue(value="REMEMBER", required=false) Cookie rememberCookie) throws Exception {
        
        if(rememberCookie!=null) {
            loginCommand.setId(rememberCookie.getValue());
            loginCommand.setRememberId(true);
        }
        
        ModelAndView mv = new ModelAndView("user/login/loginForm");
        return mv;
    }
