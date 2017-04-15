<%--
  Created by IntelliJ IDEA.
  User: 聪
  Date: 2017/4/16
  Time: 0:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<html>
<head>
    <title>springMVC</title>
</head>
<body>
Success !</br>
${requestScope.message}<br>

<hr>
<p>
    1)fmt:formatDate 来源于 http://java.sun.com/jsp/jstl/fmt   <br>
    2)fmt:formatDate作用是格式化日期的显示，例如：2015年5月10日 星期日 <br>
    3)value表示需要格式化的值<br>
    4)type表示显示日期,时间,都显示<br>
      type=date表示只显示日期<br>
      type=time表示只显示时间<br>
      type=both表示日期时间均显示<br>
    5)dateStyle表示显示日期的格式：short/medium/default/long/full<br>
</p>
</body>
</html>
