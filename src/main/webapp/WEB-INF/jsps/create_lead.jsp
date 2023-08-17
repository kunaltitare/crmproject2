<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ include file="menu.jsp"  %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create Lead</title>
</head>
<body>
<h2>Lead | Create</h2>
<form action="saveLead" method="post">
          <pre>
                                First Name<input type="text" name="firstName"/>
                                Last Name<input type="text" name="lastName"/>
                                Email<input type="text" name="email"/>
                                Lead Source:
                                <select name="leadSource">
  								<option value="radio">Radio</option>
 							    <option value="newsPaper">News Paper</option>
   								<option value="online">Online</option>
   								<option value="socialMedia">Social Media</option>
								</select>
                                Mobile<input type="number" name="mobile"/>
                                <input type="submit" value="save"/>
                    
          </pre>
</form>
</body>
</html>