<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html lang="en">
<head>
<title>JSON Form</title>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
</head>
<body class="goto-here">
	<div class="container">
		<div class="row">
			<div class="col-12">
				<form>
					<div class="form-group">
						<label for="exampleInputname">Nom</label> <input type="text"
							class="form-control" id="exampleInputname"
							placeholder="Enter Nom" name="nom">
					</div>
					<div class="form-group">
						<label for="exampleInputPrenom">Prenom</label> <input type="text"
							class="form-control" id="exampleInputPrenom"
							placeholder="Enter Prenom" name="prenom">
					</div>
					<div class="form-group">
						<label for="exampleInputAge">Age</label> <input type="text"
							class="form-control" id="exampleInputAge" placeholder="Enter Age" name="age">
					</div>

					<div class="form-row">
						<div class="form-group col-md-3">
							<label for="exampleInputNumero">Numero</label> <input type="text"
								class="form-control" id="exampleInputNumero"
								placeholder="Enter Numero" name="numero">
						</div>
						<div class="form-group col-md-3">
							<label for="exampleInputCP">CP</label> <input type="text"
								class="form-control" id="exampleInputCP" placeholder="Enter CP" name="cp">
						</div>
						<div class="form-group col-md-6">
							<label for="exampleInputRue">Rue</label> <input type="text"
								class="form-control" id="exampleInputRue"
								placeholder="Enter Rue" name="rue">
						</div>
					</div>

					<div class="form-row">

						<div class="form-group col-md-6">
							<label for="exampleInputBanque">Banque</label> <input type="text"
								class="form-control" id="exampleInputBanque" placeholder="Enter Banque" name="banque">
						</div>
						<div class="form-group col-md-6">
							<label for="exampleInputRib">Rib</label> <input type="text"
								class="form-control" id="exampleInputRib"
								placeholder="Enter Rib" name="rib">
						</div>
					</div>


					<button type="submit" class="btn btn-primary">Submit</button>
				</form>
			</div>
		</div>
	</div>
</body>
</html>