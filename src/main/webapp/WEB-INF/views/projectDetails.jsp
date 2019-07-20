<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html lang="en">
<head>


<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<title>Project Details</title>
<!-- plugins:css -->
<link rel="stylesheet" href="../css/materialdesignicons.min.css">
<link rel="stylesheet" href="../css/vendor.bundle.base.css">

<link rel="stylesheet" href="../css/style.css">
<link rel="shortcut icon" href="../images/favicon.png" />
<style type="text/css">
body {
	font-family: Arial;
	font-size: 10pt;
}

table {
	border: 2px solid #ccc;
	border-collapse: collapse;
}

table th {
	background-color: #F7F7F7;
	color: #333;
	font-weight: bold;
}

table th, table td {
	padding: 5px;
	border-color: #ccc;
}
</style>
<script type="text/javascript"
	src="http://ajax.googleapis.com/ajax/libs/jquery/1.8.3/jquery.min.js"></script>
<script type="text/javascript">
	$(function() {
		$("#financialYear").change(function() {
			if ($(this).val() == "") {
				$("#dvFinancialYear").hide();
			} else {
				$("#dvFinancialYear").show();
			}
		});

		$(".custom-file-input").on(
				"change",
				function() {
					var fileName = $(this).val().split("\\").pop();
					$(this).siblings(".custom-file-label").addClass("selected")
							.html(fileName);
				});

	});
	function addPIRow(tableID1) {

		var table = document.getElementById(tableID1);
		var rowCount = table.rows.length;
		var row = table.insertRow(rowCount);

		var element1 = document.createElement("input");
		var element2 = document.createElement("input");
		var element3 = document.createElement("input");
		var element4 = document.createElement("input");
		var element5 = document.createElement("input");
		var cell1 = row.insertCell(0);
		var cell2 = row.insertCell(1);
		var cell3 = row.insertCell(2)
		var cell4 = row.insertCell(3);
		var cell5 = row.insertCell(4);

		element1.type = "checkbox";
		element1.name = "chkbox[]";
		element2.type = "text";
		element2.placeholder = "Enter PI Number";
		//element2.required = "required";
		element3.type = "date";
		element3.placeholder = "Select PI Date";
		//element3.required = "required";
		element4.type = "text";
		element4.placeholder = "Enter PI Amount";
		//element4.required = "required";
		element5.type = "file";
		//element5.required = "required";

		
		var length = (table.rows.length) - 1;
		cell1.appendChild(element1);
		element2.name = "pi[" + length + "].piNumber";
		cell2.appendChild(element2);
		element3.name = "pi[" + length + "].piDate";
		cell3.appendChild(element3);
		element4.name = "pi[" + length + "].piAmount";
		cell4.appendChild(element4);
		element5.name = "pi[" + length + "].file";
		cell5.appendChild(element5);
	}
	function deletePIRow(tableID1) {
		try {
			var table = document.getElementById(tableID1);
			var rowCount = table.rows.length;

			for (var i = 0; i < rowCount; i++) {
				var row = table.rows[i];
				var chkbox = row.cells[0].childNodes[0];
				if (null != chkbox && true == chkbox.checked) {
					table.deleteRow(i);
					rowCount--;
					i--;
				}
			}
		} catch (e) {
			alert(e);
		}
	}
	function addBillRow(tableID2) {

		var table = document.getElementById(tableID2);
		var rowCount = table.rows.length;
		var row = table.insertRow(rowCount);

		var element1 = document.createElement("input");
		var element2 = document.createElement("input");
		var element3 = document.createElement("input");
		var element4 = document.createElement("input");
		var element5 = document.createElement("input");
		var cell1 = row.insertCell(0);
		var cell2 = row.insertCell(1);
		var cell3 = row.insertCell(2);
		var cell4 = row.insertCell(3);
		var cell5 = row.insertCell(4);

		element1.type = "checkbox";
		element1.name = "chkbox[]";
		element2.type = "text";
		element2.placeholder = "Enter Bill Number";
		element3.type = "date";
		element3.placeholder = "Select Date";
		element4.type = "text";
		element4.placeholder = "Enter Bill Amount";
		element5.type = "file";
		element5.placeholder = "Choose Bill";

		//cell1.innerHTML = rowCount + 1;
		var length = (table.rows.length) - 1;
		cell1.appendChild(element1);
		element2.name = "bill[" + length + "].billNumber";
		cell2.appendChild(element2);
		element3.name = "bill[" + length + "].billDate";
		cell3.appendChild(element3);
		element4.name = "bill[" + length + "].billAmount";
		cell4.appendChild(element4);
		element5.name = "bill[" + length + "].file";
		cell5.appendChild(element5);
	}
	function deleteBillRow(tableID2) {
		try {
			var table = document.getElementById(tableID2);
			var rowCount = table.rows.length;

			for (var i = 0; i < rowCount; i++) {
				var row = table.rows[i];
				var chkbox = row.cells[0].childNodes[0];
				if (null != chkbox && true == chkbox.checked) {
					table.deleteRow(i);
					rowCount--;
					i--;
				}
			}
		} catch (e) {
			alert(e);
		}
	}
	
</script>

</head>

<body>

	<form action="save" method="POST"enctype="multipart/form-data" id="fileUploadForm" modelAttribute="projectDetails" class="form-sample">
										<h4 class="card-head">Project Details</h4>
										
										<div class="row">
											<div class="col-md-6">
												<div class="form-group row">
													<input type="text" class="form-control"
														placeholder="Enter Cloud Account Number"
														style="width: 480px; background-color: #FAFBFD;"
														 id="ip1" name="cloudAccNumber" />
												</div>
											</div>
											<div class="col-md-6">
												<div class="form-group row">
													<input type="text" class="form-control"
														placeholder="Enter Project Name"
														style="width: 480px; background-color: #FAFBFD;"
														 id="ip1" name="projName"/>
												</div>
											</div>
										</div>
										<hr color="#0073b7" style="height: 1px;">
										<h4 class="card-head">PI Details </h4>
										<div class="row">
											<div class="col-md-6">
												<div class="form-group row">
													<select id="financialYear" class="form-control"
														style="width: 480px; background-color: #FAFBFD;"
														 name="year">
														
															<option value="">-Select Year-</option>
															<option value="2018-2019">2018-2019</option>
															<option value="2017-2018">2017-2018</option>
															<option value="2016-2017">2016-2017</option>
				 										
													</select> 
												</div>
											</div>
										</div>
										
											<div id="dvFinancialYear" style="display: none">
											<div class="col-md-6">
												<table id="dataTable1" cellpadding="10" cellspacing="2"
													border="2">
													<thead>
														<tr>
															<td></td>
															<th>PI Number</th>
															<th>PI Date</th>
															<th>PI Amount</th>
															<th>Upload</th>
															<td><input type="button" value="Add More"
																onclick="addPIRow('dataTable1')"
																class="btn btn-success" /></td>
															<td><INPUT type="button" value="Delete"
																onclick="deletePIRow('dataTable1')"
																class="btn btn-danger" /></td>
														</tr>
													</thead>
													<tfoot>
														<tr>
															<td><input type="checkbox" name="chk"/></td>
															<td><input type="text" name="pi[0].piNumber" placeholder="Enter PI Number"/></td>
															<td><input type="date" name="pi[0].piDate" placeholder="Enter PI Date"/></td>
															<td><input type="text" name="pi[0].piAmount" placeholder="Enter PI Amount"
																 /></td>
															<td><input type="file" name="pi[0].file" placeholder="Select PDF Only" accept=".pdf" 
																 /></td>
																 <!-- <input type="file" accept=".xlsx,.xls,image/*,.doc, .docx,.ppt, .pptx,.txt,.pdf" />
-->
														</tr>
													</tfoot>
												</table>
											</div>
										<hr color="#0073b7" style="height: 1px;">
										
										<h3 class="card-head">Billing Details</h3>
										<div class="col-md-6">
											<div class="form-group row">
												<table id="dataTable2" cellpadding="10" cellspacing="2"
													border="2">
													<thead>
														<tr>
															<td></td>
															<th>Bill Number</th>
															<th>Bill Date</th>
															<th>Bill Amount</th>
															<th>Upload</th>
															<td><input type="button" value="Add More"
																onclick="addBillRow('dataTable2')"
																class="btn btn-success" /></td>
															<td><input type="button" value="Delete" width="148"
																height="148" onclick="deleteBillRow('dataTable2')"
																class="btn btn-danger" /></td>
														</tr>
													</thead>
													<tbody>
													</tbody>
													<tfoot>
														<tr>
															<td><input type="checkbox" name="chk"/></td>
															<td><input type="text" name="bill[0].billNumber"
																 placeholder="Enter Bill Number"/></td>
															<td><input type="date" name="bill[0].billDate"
																 placeholder="Select Bill Date"/></td>
															<td><input type="text" name="bill[0].billAmount"
																 placeholder="Enter Bill Amount"/></td>
															<td><input type="file" name="bill[0].file"
																 placeholder="Choose Bill"/></td>
														</tr>
													</tfoot>
												</table>
											</div>
										</div>
										<hr color="#0073b7" style="height: 1px;">
										
										<div align="center">
											<input type="submit" value="Save"
												class="btn btn-primary btn-lg" />
										</div>
									</form>
						
</body>

</html>