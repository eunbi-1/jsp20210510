<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/login/nav.jsp" %>
 <%-- <%@ include file="/login/homepage.html" %> --%>  <!-- 여기 있는 내용이 홈페이지 내용들 까지 포함된거  -->

<!-- 
<head>  사실은 내가 쓰고 싶은거는 스타일 css및 이미지들이기떄문에 아래 css만 넣어주면 될듯
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<meta name="description" content="">
	<meta name="author" content="ninodezign.com, ninodezign@gmail.com">
	<meta name="copyright" content="ninodezign.com"> 
	<title>Mogo | OnePage Responsive Theme</title>
	
	favicon
    <link rel="shortcut icon" href="images/ico/favicon.jpg">.........
    <link rel="apple-touch-icon-precomposed" sizes="144x144" href="images/ico/apple-touch-icon-144-precomposed.png">
    <link rel="apple-touch-icon-precomposed" sizes="114x114" href="images/ico/apple-touch-icon-114-precomposed.png">
    <link rel="apple-touch-icon-precomposed" sizes="72x72" href="images/ico/apple-touch-icon-72-precomposed.png">
    <link rel="apple-touch-icon-precomposed" href="images/ico/apple-touch-icon-57-precomposed.png">
	
	css
	<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css" />
	<link rel="stylesheet" type="text/css" href="css/materialdesignicons.min.css" />
	<link rel="stylesheet" type="text/css" href="css/jquery.mCustomScrollbar.min.css" />
	<link rel="stylesheet" type="text/css" href="css/prettyPhoto.css" />
	<link rel="stylesheet" type="text/css" href="css/unslider.css" />
	<link rel="stylesheet" type="text/css" href="css/template.css" />
	
</head>

 -->
<div class="container">  <!-- 실제 화면에 보이는 레이아웃인데  -->
	<form action="/blog/user?cmd=loginProc" method="post" class="was-validated">
	  <div class="form-group">
	    <label for="username">사용자 ID</label>
	    <input type="text" class="form-control" id="username" placeholder="Enter username" name="username" required>
	    <div class="valid-feedback">Valid.</div>  <!-- valid-feedback  -> 이거는 class로 보통 이런 경우는 디자인 떔에 class를 쓰거든.. 디자인을 하려면 css파일이 있어야되는거지, 그래서 위에 css 경로를 넣어주면서 그 css를 가져다 쓸수있는게 head안에 import한거라고 보면됨-->
	    <div class="invalid-feedback">Please fill out this field.</div>
	  </div>
	  
	  <div class="form-group">
	    <label for="password">사용자 Password:</label>
	    <input type="password" class="form-control" id="password" placeholder="Enter password" name="password" required>
	    <div class="valid-feedback">Valid.</div>
	    <div class="invalid-feedback">Please fill out this field.</div>
	  </div>
	
	  <div class="form-group form-check">
	    <label class="form-check-label">
	      <input class="form-check-input" type="checkbox" name="remember" required> 아이디 기억하기.
	      <div class="valid-feedback">Valid.</div>
	      <div class="invalid-feedback">Check this checkbox to continue.</div>
	    </label>
	  </div>
	 
	  <button type="submit" class="btn btn-primary">로그인</button>
	</form>
</div>