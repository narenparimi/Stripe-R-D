<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="PaymentServlet" method="POST">
First Name : <input name="FirstName" type="textbox"/><br/>
Last Name : <input name="LastName" type="textbox"/><br/>
Email ID: <input name="email" type="textbox"/><br/>
  <script
    src="https://checkout.stripe.com/v2/checkout.js" class="stripe-button"
    data-key="pk_test_3NBjSZCuNRPQR2V4m0fJy1wX"
    data-name="ExpressQuote"
    data-description="Monthly Subscription"
    data-image="http://test.expressquote.co/style/img/logo-200.png"
    data-panel-label="Subscribe">
    
  </script>
  
</form>


</body>
</html>