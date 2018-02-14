<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%-- <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> --%>
<%@ taglib prefix="sec"	uri="http://www.springframework.org/security/tags"%>
<div class="row">
	<div class="col-sm-12 col-xs-12">
		<form class="form-horizontal" action="/registration" method="POST">
  			<div class="form-group"><h2 class="col-sm-offset-5 col-sm-2">Registration</h2></div>
			<div class="form-group">
    			<label for="email" class="col-sm-4 control-label">Email</label>
    			<div class="col-sm-4">
      				<input class="form-control" name="email" id="name"/>
    			</div>
  			</div>
  			<div class="form-group">
    			<label for="name" class="col-sm-4 control-label">Name</label>
    			<div class="col-sm-4">
      				<input class="form-control" name="name" id="user"/>
    			</div>
  			</div>
  			<div class="form-group">
    			<label for="phoneNumber" class="col-sm-4 control-label">Phone Number</label>
    			<div class="col-sm-4">
      				<input class="form-control" name="phoneNumber" id="name"/>
    			</div>
  			</div>
			<div class="form-group">
    			<label for="password" class="col-sm-4 control-label">Password</label>
    			<div class="col-sm-4">
      				<input type="password" class="form-control" name="password" id="name"/>
    			</div>
  			</div>
  			<div class="form-group">
    			<div class="col-sm-offset-4 col-sm-4">
      				<button type="submit" class="btn btn-primary">Register</button>
      				<a href  = "/cancel" class="btn btn-primary" >Cancel</a>
    			</div>
  			</div>
		</form>
	</div>
</div>