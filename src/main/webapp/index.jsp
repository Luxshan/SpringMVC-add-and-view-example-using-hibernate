<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<jsp:include page="WEB-INF/views/fragments/htmlhead.jsp" />
<jsp:include page="WEB-INF/views/fragments/topnav.jsp" />


<div class="container-fluid">
	<div class="row">

		<jsp:include page="WEB-INF/views/fragments/sidebar.jsp" />
		<main role="main" class="col-md-9 ml-sm-auto col-lg-10 px-4">

		<div
			class="d-flex justify-content-between flex-wrap flex-md-nowrap align-items-center pt-3 pb-2 mb-3 border-bottom">
			<h1 class="h2">Create project</h1>

		</div>

		<!--  Multi step form starts here -->
		<link
			href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css"
			rel="stylesheet" id="bootstrap-css">
		<script
			src="//netdna.bootstrapcdn.com/bootstrap/3.0.0/js/bootstrap.min.js"></script>




		<div class="container">
			<div class="row form-group">
				<div class="col-xs-12">
					<ul class="nav nav-pills nav-justified thumbnail setup-panel">
						<li class="active"><a href="#step-1">
								<h4 class="list-group-item-heading">Step 1</h4>
								<p class="list-group-item-text">Project Details</p>
						</a></li>
						<li class="disabled"><a href="#step-2">
								<h4 class="list-group-item-heading">Step 2</h4>
								<p class="list-group-item-text">Client Details</p>
						</a></li>
						<li class="disabled"><a href="#step-3">
								<h4 class="list-group-item-heading">Step 3</h4>
								<p class="list-group-item-text">Defect Configurations</p>
						</a></li>
						<li class="disabled"><a href="#step-4">
								<h4 class="list-group-item-heading">Step 4</h4>
								<p class="list-group-item-text">Assign Peoples</p>
						</a></li>
					</ul>
				</div>
			</div>
		</div>

		<div class="container">
			<div class="row setup-content" id="step-1">
				<div class="col-xs-12">
					<div class="col-md-12 well ">
						<H1> Welcome to Defect tracker</H1>
						<h3>go to Project-> Create Project to add more</h3>
					</div>
						
				</div>





			</div>
		</div>

		</main>
	</div>
</div>

<jsp:include page="WEB-INF/views/fragments/footer.jsp" />