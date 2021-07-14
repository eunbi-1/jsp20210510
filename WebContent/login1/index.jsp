<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
 
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>인덱스 데모</title>
    </head>
    <body>
        //세션 스코프를 통해 m으로 선언된 변수명에 m_id를 찾아서 출력
        ${sessionScope.m.m_id}님 안녕하세요. <br>
        <a href = "/demo/logout">로그아웃</a>
    </body>
</html>