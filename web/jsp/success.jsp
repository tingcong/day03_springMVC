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
姓名：${requestScope.emp.username}<br/>
性别：${requestScope.emp.gender}<br/>

入职时间：${requestScope.emp.hiredate}<br/>
入职时间：<fmt:formatDate
        value="${requestScope.emp.hiredate}"
        type="date"
        dateStyle="full"
/>
<hr>
${user.id}<br>
${user.username}<br>
${user.salary}<br>
<fmt:formatDate value="${user.hiredate}" type="date" dateStyle="full"/><br>
<hr>
<a href="${pageContext.request.contextPath}/add.action" class="no_underline">增加用户</a><br/>

<hr/>

<a href="${pageContext.request.contextPath}/update.action" class="no_underline" >修改用户</a><br/>
<a href="${pageContext.request.contextPath}/delete.action" class="no_underline" >删除用户</a><br/>
<a href="${pageContext.request.contextPath}/find.action" class="no_underline" >查询用户</a><br/>
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
