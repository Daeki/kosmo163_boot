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
                    <h1 class="h3 mb-4 text-gray-800">공지사항</h1>
                    
                    <!-- 테이블 DIV 시작 -->
                    <div class="row justify-content-center">
                    <div class="col-6">
                    	<table class="table">
                    		<thead class="thead-dark">
                    			<tr>
                    				<th>No</th>
                    				<th>Title</th>
                    				<th>Writer</th>
                    				<th>Date</th>
                    				<th>Hit</th>
                    			</tr>
                    		</thead>
                    		<tbody>
		                    	<c:forEach items="${list}" var="d">
		                    		<tr>
		                    			<td>${d.boardNum}</td>
		                    			<td>${d.boardTitle}</td>
		                    			<td>${d.boardWriter}</td>
		                    			<td>${d.boardDate}</td>
		                    			<td>${d.boardHit}</td>
		                    			
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
                    		<c:forEach begin="${pager.start}" end="${pager.end}" var="i">
                    			<a href="./list?page=${i}">${i}</a>
                    		</c:forEach>
                    	</div>
                    	
                    	<div>
                    		<a href="./create">공지 등록</a>
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