<%@ page import ="java.util.ArrayList"%>
<%@ page import ="java.util.List"%>
<%@ page import ="ru.gb.model.Product"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Product</title>
<head>
<body>
<h1>Products</h1>
<hr>
<ul>
    <% for (Product value: (List<Product>)request.getAttribute("products")) { %>
    <li>Id: <%=value.getId()%>; Title: <%=value.getTitle()%>; Cost: <%=value.getCost()%>
    </li>
    <% } %>
</ul>

</body>
</html>
