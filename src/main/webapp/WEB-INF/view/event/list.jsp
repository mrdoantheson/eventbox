<%@ page import="java.util.List" %>
<%@ page import="fa.tranning.eventbox.model.entity.Event" %><%--
  Created by IntelliJ IDEA.
  User: mac
  Date: 17/04/2023
  Time: 16:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>
<body>
<%
    List<Event> eventList = (List<Event>) request.getAttribute("eventList");
%>
<h1>Event List (<%=eventList.size()%>)</h1>
<table class="table w-50">
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Description</th>
    </tr>
    <%for (int i = 0; i < eventList.size(); i++) {
        Event event = eventList.get(i);
        %>
    <tr>
        <td><%=event.getId()%></td>
        <td><%=event.getName()%></td>
        <td><%=event.getOpenToRegistrationDateTime()%></td>
        <td><%=event.getCloseToRegistrationDateTime()%></td>
        <td><%=event.getStartDateTime()%></td>
        <td><%=event.getCapacity()%></td>
        <td><%=event.getStatus()%></td>
        <td><%=event.getCreatedBy()%></td>
        <td><%=event.%></td>
        <td><%=event.getDescription()%></td>
        <td><%=event.getDescription()%></td>
        <td><%=event.getDescription()%></td>
    </tr>
    <% } %>
</table>
</body>
</html>
