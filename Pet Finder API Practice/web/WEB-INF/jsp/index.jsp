<%@page contentType="text/html" pageEncoding="UTF-8" import="java.time.LocalTime"%>
<%
	final LocalTime noon = LocalTime.of(12, 0);
	final LocalTime evening = LocalTime.of(17, 0);
	String greeting;
	if (LocalTime.now().isBefore(noon)) {
		greeting = "morning";
	} else if (LocalTime.now().isBefore(evening)) {
		greeting = "afternoon";
	} else {
		greeting = "evening";
	}
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome to Pet Rescue</title>
    </head>

    <body>
        Good <%=greeting%>! Welcome the the PetFinder API Practice Project! Here you can find a fluffy (or scaly!) new friend!
    </body>
</html>
