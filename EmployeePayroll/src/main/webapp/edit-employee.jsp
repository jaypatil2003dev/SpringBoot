<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action="../update" method="post">
    <input type="hidden" name="id" value="${emp.id}" />

    Name: <input type="text" name="name" value="${emp.name}" /><br>
    Basic Salary: <input type="number" name="basicSalary" value="${emp.basicSalary}" /><br>

    <input type="submit" value="Update" />
</form>


</body>
</html>