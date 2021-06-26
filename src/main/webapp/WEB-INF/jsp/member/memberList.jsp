<%--
  Created by IntelliJ IDEA.
  User: aspp1
  Date: 2021-05-22
  Time: 오후 3:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Member</title>
</head>
<body>
<input type="text" id="eid" placeholder="넥슨이메일ID" title="넥슨이메일ID"/>
<c:forEach items="${memberList}" var="list" varStatus="no">
    ${list.id},${list.name}
</c:forEach>
</body>
</html>