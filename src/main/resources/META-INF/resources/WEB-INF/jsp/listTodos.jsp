
<%@include file="common/headerTodo.jspf"%>
<%@include file="common/navigationTodo.jspf"%>

<div class="container">
	<h1>Your Todos</h1>
	<table class="table">
		<thead>
			<tr>

				<th>Description</th>
				<th>Target Date</th>
				<th>Is Done?</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${todos}" var="todo">
				<tr>

					<td>${todo.description}</td>
					<td>${todo.targetDate}</td>
					<td>${todo.done}</td>
					<td><a href="update-todo?id=${todo.id}"
						CLASS="btn btn-success">Update</a></td>
					<td><a href="delete-todo?id=${todo.id}" CLASS="btn btn-danger">Delete</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<a href="add-todo" class="btn btn-warning">Add Todo</a>
</div>
<%@include file="common/footerTodo.jspf"%>