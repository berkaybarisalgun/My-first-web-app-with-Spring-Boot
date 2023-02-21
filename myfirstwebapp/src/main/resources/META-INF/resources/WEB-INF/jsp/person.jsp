
<%@include file="common/headerPerson.jspf" %>
<%@include file="common/navigationPerson.jspf" %>

	<div class="container">
		<h1>Enter Person Details</h1>
		<form:form method="post" modelAttribute="person">

			<fieldset class="mb-3">
				<form:label path="name">Name:</form:label>
				<form:input type="text" path="name" required="required" />
				<form:errors path="name" cssClass="text-danger" />
			</fieldset>



			<fieldset class="mb-3">
				<form:label path="surname">Surname:</form:label>
				<form:input type="text" path="surname" required="required" />
			</fieldset>



			<fieldset class="mb-3">
				<form:label path="age">Age:</form:label>
				<form:input type="text" path="age" required="required"
					class="age-input" />
			</fieldset>

			<form:input type="hidden" path="id" />
			<input type="submit" class="btn btn-success" />
			<br>
		</form:form>
	</div>
	
	<%@include file="common/footerPerson.jspf" %>
	
	<script type="text/javascript">
		$('#age').datepicker({
		    format: 'yyyy-mm-dd',
		});
		</script>
