<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<div class="row">
	<div class="col-sm-12 col-xs-12">
		<h2>Item view page</h2>
		<div class="row">
				<div class="col-md-2">Date</div>
				<div class="col-md-2">Title</div>
				<div class="col-md-6">Description</div>
				<div class="col-md-2">Price</div>
			</div>
		<c:forEach items="${items}" var="item">
			<div class="row" id="itemHover">
				<div class="col-md-2">
					<fmt:formatDate value="${item.createdAt}"
						pattern="yyyy-MM-dd HH:mm" />
				</div>
				<div class="col-md-2">${item.title}</div>
				<div class="col-md-6">${item.description}</div>
				<div class="col-md-2">${item.price} $</div>
			</div>
		</c:forEach>
	</div>
</div>
<style>
#itemHover:hover {
	color: #ffb300;
	font-weight: bold;
}
</style>