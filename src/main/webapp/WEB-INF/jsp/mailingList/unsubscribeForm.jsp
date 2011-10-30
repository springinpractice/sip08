<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<title>Mailing List</title>
		<link rel="stylesheet" type="text/css" href="${stylesUrl}" />
	</head>
	<body>
		<div id="body">
			<div><a href="${homeUrl}">Home</a></div>
			
			<h1>Unsubscribe from the Mailing List</h1>
			
			<c:if test="${not empty param.expired}">
				<div class="alert-box">
					Sorry, your previous unsubscription request has expired. To unsubscribe you
					will need to complete a new unsubscription request using the form below.
				</div>
			</c:if>
			<c:if test="${not empty param.failed}">
				<div class="alert-box">
					Sorry, we were unable to confirm your unsubscription. If you copied the
					URL from your confirmation e-mail into the browser, please make sure
					you copied the entire URL. Otherwise, you can complete a new unsubscription
					request using the form below.
				</div>
			</c:if>
			
			<p>To unsubscribe, please provide your e-mail address.</p>
			
			<%-- Specify the action explicitly to eliminate the expires param --%>
			<form:form modelAttribute="unsubscriber" action="unsubscribe.do">
			    <form:errors>
					<div class="alert-box">${messages[0]}</div>
			    </form:errors>
				<div class="form-item">
					<div>Your e-mail:</div>
					<form:input path="email" cssStyle="width:240px"/>
					<div class="form-error-message"><form:errors path="email"></form:errors></div>
				</div>
				<div class="form-item">
					<input type="submit" value="Unsubscribe"></input>
				</div>
			</form:form>
		</div>
	</body>
</html>
