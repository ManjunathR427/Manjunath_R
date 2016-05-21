<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Form</title>

</head>
<body bgcolor="#F3F781">

	<form action="/Project1/User_Details.html" method="post">
		

		<div align="Center">
			<div>
				<div>
					<h1>User Auth</h1>
				</div>

				<table >
				 
					<tr>
						<td><label>User name: </label>
						</td>
						<td align="Center"><input type="text" 
							 id="userName" name="userName">
						</td>
					</tr>

					<tr>
						<td><label>Password: </label>
						</td>
						<td align="Center"><input type="password" 
							 id="password" name="password">
						</td>
					</tr>

					<tr>
						<td><input type="submit" value="Login" /></td>
						<td><a class="login-link" href="#">Lost your password?</a></td>
					</tr>
					</table>
			</div>
		</div>


	</form>

</body>
</html>