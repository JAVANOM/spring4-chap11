<%@ page contentType="text/html; charset=utf-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
    <title>회원가입</title>
</head>
<body>
    <h2>회원 정보 입력</h2>
    <!-- 커맨드 객체의 속성 값을 registerRequest 지정  -->
    <!-- commandName 스프링 5버전에서 삭제  -->
    <%-- <form action="step3" method="post">
	    <p>
	        <label>이메일:<br>
	        <form:input path="email" />
	        </label>
	    </p>
	    <p><!-- 커맨드 객체의 name 프로퍼티 값을 value속성으로 사용한다.  -->
	        <label>이름:<br>
	        <form:input path="name" />
	        </label>
	    </p>
	    <p>
	        <label>비밀번호:<br>
	        <form:password path="password" />
	        </label>
	    </p>
	    <p>
	        <label>비밀번호 확인:<br>
	        <form:password path="confirmPassword" />
	        </label>
	    </p>
	    <input type="submit" value="가입 완료">
    </form>
 --%>

   <form action="step3" method="post">
    <p>
        <label>이메일:<br>
        <input type="text" name="email" id="email" value="${formData.email}">
        </label>
    </p>
    <p>
        <label>이름:<br>
        <input type="text" name="name" id="name" value="${formData.name}">
        </label>
    </p>
    <p>
        <label>비밀번호:<br>
        <input type="password" name="password" id="password">
        </label>
    </p>
    <p>
        <label>비밀번호 확인:<br>
        <input type="password" name="confirmPassword" id="confirmPassword">
        </label>
    </p>
    <input type="submit" value="가입 완료">
    </form>
</body>
</html>
