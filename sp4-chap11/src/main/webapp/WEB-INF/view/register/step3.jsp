<%@ page contentType="text/html; charset=utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>회원가입</title>
</head>
<body><!-- 뷰 코드는 클래스 이름을 사용해서 커맨드 객체에 접근 Controller 확인  -->
    <%-- <h2><strong>${registerRequest.name }님</strong> --%>
     <h2><strong>${formData.name }님</strong> 
          회원 가입을 완료했습니다.</h2>
    <p><a href="<c:url value='/main'/>">[첫 화면 이동]</a></p>
</body>
</html>
