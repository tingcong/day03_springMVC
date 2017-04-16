<%--
  Created by IntelliJ IDEA.
  User: 聪
  Date: 2017/4/17
  Time: 0:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>员工信息</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/themes/default/easyui.css" type="text/css"></link>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/themes/icon.css" type="text/css"></link>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/example/jquery.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/example/jquery.easyui.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/example/easyui-lang-zh_TW.js"></script>
</head>
<body>
    <table id="dg"></table>
    <script type="text/javascript">
        $("#dg").datagrid({
            url:"${pageContext.request.contextPath}/emp/findAllEmpMethod.action?time="+new Date().getDate(),
            columns:[[
                {field:'empno',title:'员工',width:100},
                {field:'ename',title:'姓名',width:100},
                {field:'job',title:'职位',width:100},
                {field:'mrg',title:'上级编号',width:100},
                {field:'hiredate',title:'入职时间',width:100,
                    formatter: function(value){
                        var date = new Date(value);
                        var year=date.getFullYear();
                        var month=date.getMonth();
                        var day=date.getDay();
                        return year+"年"+month+"月"+day+"日";
                    }
                },
                {field:'sal',title:'薪水',width:100},
                {field:'comm',title:'佣金',width:100,
                    fommatter:function (value) {
                        if(value==null){
                            return 0;
                        }else {
                            return value;
                        }
                    }
                },
                {field:'deptno',title:'部门编号',width:100,align:'right'}
            ]],
            singleSelect:true,
            pagination:true
        });
    </script>
</body>
</html>
