<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html >
<html>
<head>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=0">
<title>Module Details | RF-Campus</title>

<!--=== CSS ===-->

 <jsp:include page="script.jsp" /> 



<script type="text/javascript"
	src="<c:url value="/resources/common/ajax-call.js"/>"></script>

<script type="text/javascript">
var currentModuleId;
	
	$(document).ready(function(){
		
	    $("#add-edit-module").validate({
	    
	        // Specify the validation rules
	        rules: {
	            moduleName: {
	            	required:true//,
	            	//remote: './modules/exist'
	            }
	        },
	        
	        // Specify the validation error messages
	        messages: {
	        	moduleName: {
	        		required : "Please enter Module name"//,
	        		//remote: "Module already Exist"
	        	}
	        },
	        
	        submitHandler: function(form) {
	            form.submit();
	        }
	    });
	    
	    
		$('#active').change(function() {
	        if($(this).is(":checked")) {
	            
	        	$("#active").val(1);
	        }
	                
	    });
		
		$("#add-edit-btn").click(function(){
			var moduleId = $("#moduleId").val();;
			var moduleName = $("#moduleName").val();
			
			ajaxParams.url = "./modules/exist";
			ajaxParams.data = {"moduleId":moduleId, "moduleName":moduleName};
			ajaxParams.formType = "module";
			
			if($("form").valid()){
				alert('valid...');
				var flag = ajaxRequest();
				if(flag == true){
					$("#add-edit-module").submit();
				}
				
				
			}
		});
	});
	
	function updateModule(moduleId, moduleName, active){
			//alert(moduleId +" - "+ moduleName +" - "+ active);
			currentModuleId = moduleId
			console.log(currentModuleId);
			$("#moduleId").val(moduleId);
			$("#moduleName").val(moduleName);
			if(active == 1){
				$("#active").prop("checked", true);
				$("#active").val(1);
			}else{
				$("#active").prop("checked", false);
				$("#active").val(0);
			} 
		}
</script>

</head>

<body class="breakpoint-1200" style="height: 609px;">

	<jsp:include page="header.jsp" />
	<div id="container" class="fixed-header">
		<div id="content">
			<div class="layout-container">
				<div class="">
					<!--=== Page Header ===-->
					<div class="page-header">

						<div class="container">

							<div id="navbar">
								<nav class="navbar navbar-default navbar-static-top"
									role="navigation">
									<div class="navbar-header">
										<button type="button" class="navbar-toggle"
											data-toggle="collapse" data-target="#navbar-collapse-1">
											<span class="sr-only">Toggle navigation</span> <span
												class="icon-bar"></span> <span class="icon-bar"></span> <span
												class="icon-bar"></span>
										</button>
										<a class="navbar-brand" href="#">Brand</a>
									</div>

									<div class="collapse navbar-collapse" id="navbar-collapse-1">
										<ul class="nav navbar-nav">
											<li class="active"><a href="#">Active Link</a></li>
											<li><a href="#">Link</a></li>

											<li class="dropdown"><a href="#" class="dropdown-toggle"
												data-toggle="dropdown">Dropdown <b class="caret"></b></a>

												<ul class="dropdown-menu">
													<li class="kopie"><a href="#">Dropdown</a></li>
													<li><a href="#">Dropdown Link 1</a></li>
													<li class="active"><a href="#">Dropdown Link 2</a></li>
													<li><a href="#">Dropdown Link 3</a></li>

													<li class="dropdown dropdown-submenu"><a href="#"
														class="dropdown-toggle" data-toggle="dropdown">Dropdown
															Link 4</a>
														<ul class="dropdown-menu">
															<li class="kopie"><a href="#">Dropdown Link 4</a></li>
															<li><a href="#">Dropdown Submenu Link 4.1</a></li>
															<li><a href="#">Dropdown Submenu Link 4.2</a></li>
															<li><a href="#">Dropdown Submenu Link 4.3</a></li>
															<li><a href="#">Dropdown Submenu Link 4.4</a></li>

														</ul></li>

													<li class="dropdown dropdown-submenu"><a href="#"
														class="dropdown-toggle" data-toggle="dropdown">Dropdown
															Link 5</a>
														<ul class="dropdown-menu">
															<li class="kopie"><a href="#">Dropdown Link 5</a></li>
															<li><a href="#">Dropdown Submenu Link 5.1</a></li>
															<li><a href="#">Dropdown Submenu Link 5.2</a></li>
															<li><a href="#">Dropdown Submenu Link 5.3</a></li>

															<li class="dropdown dropdown-submenu"><a href="#"
																class="dropdown-toggle" data-toggle="dropdown">Dropdown
																	Submenu Link 5.4</a>
																<ul class="dropdown-menu">
																	<li class="kopie"><a href="#">Dropdown Submenu
																			Link 5.4</a></li>
																	<li><a href="#">Dropdown Submenu Link 5.4.1</a></li>
																	<li><a href="#">Dropdown Submenu Link 5.4.2</a></li>


																</ul></li>
														</ul></li>
												</ul></li>
											<li class="dropdown"><a href="#" class="dropdown-toggle"
												data-toggle="dropdown">Dropdown2 <b class="caret"></b></a>
												<ul class="dropdown-menu">
													<li class="kopie"><a href="#">Dropdown2</a></li>
													<li><a href="#">Dropdown2 Link 1</a></li>
													<li><a href="#">Dropdown2 Link 2</a></li>
													<li><a href="#">Dropdown2 Link 3</a></li>

													<li class="dropdown dropdown-submenu"><a href="#"
														class="dropdown-toggle" data-toggle="dropdown">Dropdown2
															Link 4</a>
														<ul class="dropdown-menu">
															<li class="kopie"><a href="#">Dropdown2 Link 4</a></li>
															<li><a href="#">Dropdown2 Submenu Link 4.1</a></li>
															<li><a href="#">Dropdown2 Submenu Link 4.2</a></li>
															<li><a href="#">Dropdown2 Submenu Link 4.3</a></li>
															<li><a href="#">Dropdown2 Submenu Link 4.4</a></li>

														</ul></li>
													<li class="dropdown dropdown-submenu"><a href="#"
														class="dropdown-toggle" data-toggle="dropdown">Dropdown2
															Link 5</a>
														<ul class="dropdown-menu">
															<li class="kopie"><a href="#">Dropdown Link 5</a></li>
															<li><a href="#">Dropdown2 Submenu Link 5.1</a></li>
															<li><a href="#">Dropdown2 Submenu Link 5.2</a></li>
															<li><a href="#">Dropdown2 Submenu Link 5.3</a></li>
															<li class="dropdown dropdown-submenu"><a href="#"
																class="dropdown-toggle" data-toggle="dropdown">Dropdown
																	Submenu Link 5.4</a>
																<ul class="dropdown-menu">
																	<li class="kopie"><a href="#">Dropdown2
																			Submenu Link 5.4</a></li>
																	<li><a href="#">Dropdown2 Submenu Link 5.4.1</a></li>
																	<li><a href="#">Dropdown2 Submenu Link 5.4.2</a></li>

																</ul></li>
														</ul></li>
												</ul></li>
										</ul>
									</div>
									<!-- /.navbar-collapse -->
								</nav>
							</div>


						</div>















					</div>
					<!-- /Page Header -->

					<div
						class="second-column one-child-container relative padding-top-75px">
						<!--=== Navigation Vertical ===-->
						<div class="first-column">
							info-popup-table
							<ul class="navigation v-navbar-container">
								<li><a href="hr-dashboard.html"> <span
										class="image nav-dashboard"><i></i></span> Dashboard
								</a></li>
								<li><a class="active" href="staff-details.html"> <span
										class="image nav-list"><i></i></span> info-popup-table
								</a></li>
								<li><a href="staff-create-form.html"> <span
										class="image nav-create"><i></i></span> Create a Staff
								</a></li>
							</ul>
							<div class="clearfloat"></div>
						</div>
						<!-- /Navigation Vertical -->

						<div id="my_documents_container" class="column-one clearfix">
							<div class="grid box-filters">
								<!-- <div class="table-header">
									<form class="form-inline ng-pristine ng-valid" method="get"
										action="">
										<div class="row-fluid">
											<div class="span4">
												<div class="">
													<table width="100%" cellspacing="0" cellpadding="0">
														<tbody>
															<tr>
																<td class="padding0 no_border" width="15%"><label
																	class="float_left mrgall-01 font13"> <strong
																		class="">Department</strong>
																</label></td>
																<td class="no_border"><div
																		class="controls project-input-contr">
																		<div
																			class="select2-container col-md-6 select2 full-width-fix required"
																			id="s2id_autogen3" style="width: 263px;">
																			<a href="javascript:void(0)" onclick="return false;"
																				class="select2-choice select3-choice select4-choice select5-choice"
																				tabindex="-1"> <span class="select2-chosen">Select
																					Department</span><abbr class="select2-search-choice-close"></abbr>
																				<span class="select2-arrow"><b></b></span></a><input
																				class="select2-focusser select2-offscreen"
																				type="text" id="s2id_autogen4">
																			<div
																				class="select2-drop select2-display-none select2-with-searchbox">
																				<div class="select2-search">
																					<input type="text" autocomplete="off"
																						autocorrect="off" autocapitalize="off"
																						spellcheck="false" class="select2-input">
																				</div>
																				<ul class="select2-results">
																				</ul>
																			</div>
																		</div>
																		<select name="department"
																			class="col-md-6 select2 full-width-fix required select2-offscreen"
																			tabindex="-1">
																			<option selected="">Select Department</option>
																			<option value="1">Admin</option>
																			<option value="2">Mechanical</option>
																			<option value="3">Technical</option>
																			<option value="4">HR &amp; Admin</option>
																			<option value="5">Stores</option>
																			<option value="6">Safety</option>
																			<option value="7">Finance &amp; Accounts</option>
																			<option value="8">Stores</option>
																			<option value="9">PDM</option>
																			<option value="10">HR</option>
																		</select>
																	</div></td>
															</tr>
														</tbody>
													</table>
												</div>
											</div>
											<div class="span4">
												<div class="">
													<table width="100%" cellspacing="0" cellpadding="0">
														<tbody>
															<tr>
																<td class="padding0 no_border" width="15%"><label
																	class="float_left mrgall-01 font13"> <strong
																		class="">Job Category</strong>
																</label></td>
																<td class="no_border"><div
																		class="controls project-input-contr">
																		<div
																			class="select2-container col-md-6 select2 full-width-fix required"
																			id="s2id_autogen5" style="width: 253px;">
																			<a href="javascript:void(0)" onclick="return false;"
																				class="select2-choice select3-choice select4-choice select5-choice"
																				tabindex="-1"> <span class="select2-chosen">Select
																					Job Category</span><abbr
																				class="select2-search-choice-close"></abbr> <span
																				class="select2-arrow"><b></b></span></a><input
																				class="select2-focusser select2-offscreen"
																				type="text" id="s2id_autogen6">
																			<div
																				class="select2-drop select2-display-none select2-with-searchbox">
																				<div class="select2-search">
																					<input type="text" autocomplete="off"
																						autocorrect="off" autocapitalize="off"
																						spellcheck="false" class="select2-input">
																				</div>
																				<ul class="select2-results">
																				</ul>
																			</div>
																		</div>
																		<select name="jobcategory"
																			class="col-md-6 select2 full-width-fix required select2-offscreen"
																			tabindex="-1">
																			<option selected="">Select Job Category</option>
																			<option value="1">Job Category 1</option>
																			<option value="2">Job Category 2</option>
																			<option value="3">Job Category 3</option>
																			<option value="4">Job Category 4</option>
																		</select>
																	</div></td>
															</tr>
														</tbody>
													</table>
												</div>
											</div>
											<div class="span3">
												<button class="btn btn-actions">
													<i class="icon-search"></i>
												</button>
												<a href="#" class="btn-link btn-small">Clear</a>
											</div>
										</div>
									</form>
								</div> -->
								<div class="grid-title">
									<div class="pull-left">Module List</div>
									<!--<div class="pull-right">
                        <a href="assets-create-reminders-form.html" target="_blank" class="btn btn-xl btn-success button-submit font13">
                          <i class="icon-plus-sign margin_right5"></i>Add
                        </a>
                    </div>-->
									<div class="clear"></div>
								</div>
								<div class="grid-content">
									<div id="DataTables_Table_0_wrapper"
										class="dataTables_wrapper form-inline" role="grid">
										<div class="row">
											<div class="dataTables_header clearfix">
												<div class="col-md-6">
													
											</div>
										</div>
										<table
											class="table table-striped table-bordered table-hover table-checkable table-responsive datatable dataTable"
											id="DataTables_Table_0"
											aria-describedby="DataTables_Table_0_info">
											<thead>
												<tr role="row">
													<th class="sorting" role="columnheader" tabindex="0"
														aria-controls="DataTables_Table_0" rowspan="1" colspan="1"
														aria-label="Email ID: activate to sort column ascending">Sr
														No</th>
													<th class="sorting" role="columnheader" tabindex="0"
														aria-controls="DataTables_Table_0" rowspan="1" colspan="1"
														aria-label="Job Category: activate to sort column ascending">Module
														Name</th>
													<th class="sorting" role="columnheader" tabindex="0"
														aria-controls="DataTables_Table_0" rowspan="1" colspan="1"
														aria-label="Department: activate to sort column ascending">Status</th>
													<th class="sorting" role="columnheader" tabindex="0"
														aria-controls="DataTables_Table_0" rowspan="1" colspan="1"
														aria-label="Assign to Project: activate to sort column ascending">Operation</th>
												</tr>
											</thead>

											<tbody role="alert" aria-live="polite" aria-relevant="all">
											<c:set var="srno" value="1" />
											<c:forEach items="${moduleList}" var="module">
												<tr class="odd">
													<td class=" "><a href="staff-user-profile.html">${srno}</a></td>
													<td class=" ">${module.moduleName}</td>
													<c:if test="${module.moduleStatus eq 1}">
														<td class=" ">Active</td>
													</c:if>
													<c:if test="${module.moduleStatus eq 0}">
														<td class=" ">Inactive</td>
													</c:if>
													<td class=" "><a href="#assigntoProject"
														data-toggle="modal" data-original-title="Edit"
														data-placement="top"
														style="border-radius: 40px; padding: 4px 6px 2px;"
														class="btn btn-xl btn-success button-submit font13 bs-tooltip" 
														onclick="updateModule(${module.id}, '${module.moduleName}', ${module.moduleStatus})">
															<i class="icon-cog font14"></i>
													</a></td>
												</tr>
												<c:set var="srno" value="${srno+1}"/>
											</c:forEach>
												
												
											</tbody>
										</table>
										
									</div>
									<div class="info-popup">
										<table width="100%" cellpadding="0" cellspacing="0">
											<tbody>
												<tr>
													<!--  <td class="info-popup-td">
                    <div class="info-popup-img">
                    	<img alt="Staff Photo" src="assets/img/staffs-img-new/staffprofile250-250.png">
                    </div>
                    </td> -->
													<!--  <td>
                    	<table cellspacing="0" cellpadding="0" border="0" style="width:100%;" class="info-popup-table">
                        <tbody><tr>
                              <td class="left_title dark-grey"><span class="stat_opt">Staff ID:</span></td>
                              <td>000001</td>
                            </tr>
                        <tr>
                              <td class="left_title dark-grey"><span class="stat_opt">Job Category:</span></td>
                              <td>Driver</td>
                            </tr>
                        <tr>
                              <td class="left_title dark-grey"><span class="stat_opt">Department:</span></td>
                              <td>Bilding &amp; Construction</td>
                            </tr>
                        <tr>
                              <td class="left_title dark-grey"><span class="stat_opt">Employee Type:</span></td>
                              <td>Permanent Employee</td>
                            </tr>
                        <tr>
                              <td class="left_title dark-grey"><span class="stat_opt">Mobile Number:</span></td>
                              <td>(+91) 9912 3456 78</td>
                            </tr>
                        <tr>
                              <td class="left_title dark-grey"><span class="stat_opt">Phone Number:</span></td>
                              <td>(+91) 040 - 0000 2222</td>
                            </tr>
                        </tbody><tbody>
                              <tr>
                            <td class="left_title dark-grey"><span class="stat_opt">Email ID:</span></td>
                            <td><a class="text-truncation" href="mailto:suresh@rnimobility.com">suresh@rnimobility.com</a></td>
                          </tr>
                              <tr>
                            <td class="left_title dark-grey"><span class="stat_opt">Joing Date :</span></td>
                            <td>25-June-2010</td>
                          </tr>
                              <tr>
                                <td colspan="2">&nbsp;</td>
                            </tr>
                            </tbody>
                      </table>
                    </td> -->
												</tr>
											</tbody>
										</table>

									</div>
								</div>
							</div>
						</div>

					</div>
					<!-- Modal dialog -->
					<div class="modal fade" id="assigntoProject">
					<form action="./modules/update" id="add-edit-module" method="post" novalidate="novalidate">
						<div class="modal-dialog">
							<div class="modal-content">
								<div class="modal-header">
									<button type="button" class="close" data-dismiss="modal"
										aria-hidden="true">×</button>
									<h4 class="modal-title">Module Master</h4>
								</div>
								<div class="modal-body">
									<div class="row">
										<div class="col-md-12">
											<div class="">
												<label>Note: </label> <span class="label label-danger">*
													Marked is Mandatory</span> </br>
												</br>
												<input type="hidden" name="id" id="moduleId">
												<div class="form-group">
													<label class="col-md-2 control-label-2">Module Name<span
														style="color: red">* </span>:
													</label>
													<div class="col-md-7">
														<div
															class="select2-container select2-container-multi col-md-6 select2 full-width-fix required"
															id="s2id_input20" style="width: 90%;">
															<ul class="select2-choices">
																<li class="select2-search-field"><input type="text"
																	autocomplete="off" autocorrect="off"
																	autocapitilize="off" spellcheck="false"
																	class="select2-input select2-default"
																	name="moduleName" id="moduleName" style="width: 100%;"></li>
															</ul>
															<div
																class="select2-drop select2-drop-multi select2-display-none">
																<ul class="select2-results">
																	<li class="select2-no-results">No matches found</li>
																</ul>
															</div>
														</div>
													</div>
												</div>
												<div class="form-group">
													<label class="col-md-2 control-label-2">Sr.No<span
														style="color: red">* </span> :
													</label>
													<div class="col-md-7">
														<div
															class="select2-container select2-container-multi col-md-6 select2 full-width-fix required"
															id="s2id_input20" style="width: 90%;">
															<ul class="select2-choices">
																<li class="select2-search-field"><input type="text"
																	autocomplete="off" autocorrect="off"
																	autocapitilize="off" spellcheck="false"
																	class="select2-input select2-default"
																	id="serialNUmber" style="width: 100%;"></li>
															</ul>
															<div
																class="select2-drop select2-drop-multi select2-display-none">
																<ul class="select2-results">
																	<li class="select2-no-results">No matches found</li>
																</ul>
															</div>
														</div>
													</div>
												</div>
												<div class="form-group">
													<label class="col-md-2 control-label-2">Active :</label>
													<div class="col-md-7">
														<input type="checkbox" name="moduleStatus" id="active">

													</div>
												</div>
											</div>
											<div class="modal-footer">
												<button type="button"
													class="btn btn-xl btn-cancel button-submit font13"
													data-dismiss="modal">Cancel</button>
												<!-- <a href="admin-projects.html"
													class="btn btn-xl btn-success button-submit font13 float_right">Submit</a> -->
													<button type="button"
													class="btn btn-xl btn-success button-submit font13 float_right" id="add-edit-btn">Add</button>
											</div>
										</div>
									</div>
								</div>
							</div>
							<!-- /.modal-content -->
						</div>
						</form>
						<!-- /.modal-dialog -->
					</div>
					<!-- /.modal -->
				</div>

				<!--=== Page Content ===-->
				<!--=== Managed Tables ===-->

				<!--=== Horizontal Scrolling ===-->

				<!-- /Horizontal Scrolling -->
				<!-- /Page Content -->
			</div>
			<!-- /.container -->

		</div>
	</div>
</div>


</body>

</html>