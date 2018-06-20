<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>Title</title>
<style type="text/css">
td{
border: 1px solid;
width: 120px;
}
table{
border: 1px solid;
}

</style>
<script type="text/javascript">
 $(function(){
	 
	 
 })

</script>
</head>
<body>
	<table>
			<tr>
				<td><span>编号</span></td>
				<td><span>姓名</span></td>
				<td><span>性别</span></td>
				<td><span>手机号</span></td> 
			</tr>
		<c:forEach var="student" items="${list}" varStatus="vs">
			<tr>
				<td>${student.id}</td>
				<td>${student.name}</td>
				
				<td>
				<c:if test="${student.sex==0}">男</c:if>
				<c:if test="${student.sex==1}">女</c:if>
				</td>
				<td>${student.mobilePhone}</td> 
			</tr>
		</c:forEach>
	</table>
</body>
</html>