<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="product.Products" %>

<html>
<head>
    <title>Product Listing</title>
</head>
<body>
    <h1>Product Listing</h1>
    <table border="1">
        <thead>
            <tr>
                <th>Name</th>
                <th>Price</th>
                <th>In Stock</th>
            </tr>
        </thead>
        <tbody>
          
            
            <c:forEach var="product" items="${products}">
                <tr>
                    <td>${product.name}</td>
                    <td>${product.price}</td>
                    <td>${product.inStock}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
    <%
        java.util.ArrayList<product.Products> productsList = new java.util.ArrayList<>();
        productsList.add(new product.Products("Product 1", 10.99, "Yes"));
        productsList.add(new product.Products("Product 2", 5.99, "No"));
        productsList.add(new product.Products("Product 3", 20.50, "Yes"));

        if (request.getParameter("orderByPrice") != null) {
            java.util.Collections.sort(productsList, new java.util.Comparator<product.Products>() {
                @Override
                public int compare(product.Products p1, product.Products p2) {
                    return Double.compare(p2.price, p1.price);
                }
            });
        }

        pageContext.setAttribute("products", productsList);
    %>
</body>
</html>
