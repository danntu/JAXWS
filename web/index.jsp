<%--
  Created by IntelliJ IDEA.
  User: mdaniyar
  Date: 8/29/18
  Time: 1:30 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <a href="rest/hello">Click Here Rest Jersey</a><br>
  <a href="restanot/hello/javatpoint">Click Here Rest annotation</a><br>
  <a href="restanot/hello/2018/08/29">Click Here JAX-RS Multiple @PathParam Annotation</a><br>

  <form action="restanot/product/add" method="post">
    Enter Id:<input type="text" name="id"/><br/><br/>
    Enter Name:<input type="text" name="name"/><br/><br/>
    Enter Price:<input type="text" name="price"/><br/><br/>
    <input type="submit" value="Add Product"/>
  </form>
  </body>
</html>
