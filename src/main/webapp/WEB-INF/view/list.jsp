<%--
  Created by IntelliJ IDEA.
  User: 东方爆炸
  Date: 2019/5/23
  Time: 11:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.8.2.min.js"></script>
    <script>
        function toadd() {
            window.location = "toadd";
        }
    </script>
    <title>Title</title>
</head>
<body>
<input type="button" value="添加" onclick="toadd()">
${list}
</body>
</html>
