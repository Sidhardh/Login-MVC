<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="resources/bootstrap.css">
<link rel="stylesheet" href="resources/mycss.css">

<title>Insert title here</title>
</head>
<body>

	<nav class="navbar navbar-inverse first">
		<div class="container-fluid">
			<div class="navbar-header">
				<a class="navbar-brand fontfirst" href="#">Login </a>
			</div>
		</div>
	</nav>

<form action="Controller" method="post" class="form_login">
<h2 class="login_head">Please Login</h2>
<input type="text"  placeholder="Username" name="name"/>
<br>
<input type="password"  placeholder="Password" name="password"/>
<br>
<input type="Submit" class="submit_btn" value="Login"/>

</form>

</body>
</html>
