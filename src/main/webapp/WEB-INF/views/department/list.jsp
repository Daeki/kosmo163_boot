<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<c:import url="/WEB-INF/views/temp/head_css.jsp"></c:import>
</head>
<body id="page-top">
	<div id="wrapper">
		<c:import url="/WEB-INF/views/temp/sidebar.jsp"></c:import>
		<div id="content-wrapper" class="d-flex flex-column">
			<div id="content">
				<c:import url="/WEB-INF/views/temp/topbar.jsp"></c:import>
				
				<!-- Begin Page Content -->
                <div class="container-fluid">

                    <!-- Page Heading -->
                    <h1 class="h3 mb-4 text-gray-800">학과 목록 Page</h1>
                    
                    <!-- 테이블 DIV 시작 -->
                    <div class="row justify-content-center">
                    <div class="col-6">
                    	<table class="table">
                    		<thead class="thead-dark">
                    			<tr>
                    				<th>학과명</th>
                    				<th>계열</th>
                    				<th>개설여부</th>
                    			</tr>
                    		</thead>
                    		<tbody>
		                    	<c:forEach items="${list}" var="d">
		                    		<tr>
		                    			<td><a href="./detail?departmentNo=${d.departmentNo}">${d.departmentName}</a></td>
		                    			<td>${d.category}</td>
		                    			<c:choose>
		                    				<c:when test="${d.openYn eq 'Y'}">
		                    				<td>OPEN</td>
		                    				</c:when>
		                    				<c:otherwise>
		                    				<td>CLOSE</td>
		                    				</c:otherwise>
		                    			</c:choose>
		                    			
<%-- 		                    			<c:if test="${d.openYn ne 'Y'}">
		                    			<td>OPEN</td>
		                    			</c:if>
		                    			<c:if test="${d.openYn eq 'N'}">
		                    			<td>CLOSE</td>
		                    			</c:if> --%>
		                    			
		                    		</tr>
		                    	</c:forEach>
                    		</tbody>
                    	</table>
                    	
                    	<div>
                    		<a href="./create">학과등록</a>
                    	</div>
                    	
                    </div>
                    </div>
                    <!-- 테이블 DIV 끝 -->

                </div>
                <!-- End Page container-fluid -->
                
			</div>
			<!-- End page Content -->
			<c:import url="/WEB-INF/views/temp/footer.jsp"></c:import>
		</div>
		<!-- End Content wrapper -->
	</div>
	<!-- End Wrapper -->
	
	<c:import url="/WEB-INF/views/temp/footer_script.jsp"></c:import>

</body>
</html>