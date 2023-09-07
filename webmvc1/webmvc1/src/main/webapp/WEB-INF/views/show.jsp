<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<body>
<table border="1">
<c:forEach var="employee" items="${employeeList}">
	<tr>
		<td>${employee.employeeID}</td>
		<td>${employee.employeeName}</td>
		<td>${employee.employeeAge}</td>
		<td>${employee.employeeSalary}</td>
		<td>${employee.employeeDepartment}</td>
	</tr>
</c:forEach>
<form action="/">
            <H1>Operations Successful<H1>
            <button type="submit">Back</button>
        </form>
</table>
</body>
</html>