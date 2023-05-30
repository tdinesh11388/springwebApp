<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="saveUserDetails">
	<div>
		<label for="firstName">firstName</label>
		<input type="text" name="firstName">
	</div>
	<div>
		<label for="contactNumber">ContactNubmer</label>
		<input type="tel" name="contactNumber">
	</div>
	<div>
		<label for="email">email</label>
		<input type="email" name="email">
	</div>
	<div>
		<label for="password">Password</label>
		<input type="password" name="password">
	</div>
	<div>
		<label for="country">Country</label>
		<input type="text" name="country">
	</div>
	<div>
		<input type="submit" value="Register">
	</div>
</form>
</body>
</html>