<%--
  Created by IntelliJ IDEA.
  User: 东方爆炸
  Date: 2019/5/23
  Time: 11:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.8.2.min.js"></script>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/likeit.css">
    <script>
        $(function () {
            $.post(
                "getBrand",
                {},
                function (obj) {
                    for(var i in obj){
                        $("[name='bid']").append("<option value="+obj[i].bid+">"+obj[i].bname+"</option>")
                    }
                },"json"
            );
            $("#one").click(function () {
                var id = $(this).val();
                $("[name='tid']").empty();
                $.post(
                    "getType",
                    {id:id},
                    function (obj) {
                        for (var i in obj){
                            $("[name='tid']").append("<option value="+obj[i].tid+">"+obj[i].tname+"</option>")
                        }
                    },"json"
                );
            })
        })
    </script>
    <title>Title</title>
</head>
<body>
    <form>
        <table>
            <tr>
                <td>
                    <input type="text" name="name">
                </td>
            </tr>
            <tr>
                <td>
                    <input type="text" name="price">
                </td>
            </tr>
            <tr>
                <td>
                    <select name="bid" id="one">

                    </select>
                </td>
            </tr>
            <tr>
                <td>
                    <select name="tid">

                    </select>
                </td>
            </tr>
        </table>
    </form>
</body>
</html>
