



<%@include file="common/headerPerson.jspf"%>
<%@include file="common/navigationPerson.jspf"%>

<div class=container>
	<table class="table">
		<h1>Your Persons</h1>
		<table class="table">
			<thead>
				<tr>
					<th>Name</th>
					<th>Surname</th>
					<th>Age</th>
				</tr>
			</thead>
			<tbody>
				<d:forEach items="${persons}" var="person">
					<tr>
						<td>${person.name}</td>
						<td>${person.surname}</td>
						<td>${person.age}</td>
						<td><a href="update-person?id=${person.id}"
							CLASS="btn btn-success">Update</a></td>
						<td><a href="delete-person?id=${person.id}"
							CLASS="btn btn-warning">DELETE</a></td>
					</tr>
				</d:forEach>
			</tbody>
		</table>
		<a href="add-person" class="btn btn-success">Add Person</a>
		</div>

		<%@include file="common/footerPerson.jspf"%>