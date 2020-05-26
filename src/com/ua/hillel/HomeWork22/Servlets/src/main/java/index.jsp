
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student</title>
</head>
<body>
<h2>Student List</h2>
<p><a href='<c:url value="/create" />'>Create new</a></p>
<table>
<tr><th>Id</th>
<th>first_name</th>
<th>last_name</th>
<th>groupp</th>
<th>year_of_receipt</th>
<th></th></tr>
<c:forEach var="student" items="${students}">
 <tr><td>${student.id}</td>
    <td>${student.First_name}</td>
     <td>${student.Last_name}</td>
     <td>${student.Groupp}</td>
      <td>${student.Year_of_receipt}</td>
    <td>
    <a href='<c:url value="/edit?id=${student.id}" />'>Edit</a> |
    <form method="post" action='<c:url value="/delete" />' style="display:inline;">
        <input type="hidden" name="id" value="${student.id}">
        <input type="submit" value="Delete">
    </form>
 </td></tr>
</c:forEach>
</table>
</body>
</html>