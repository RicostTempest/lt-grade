<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="tags" tagdir="/WEB-INF/tags" %>
<!DOCTYPE html>
<html lang="en">

<head>

    <title>风叶 - 用户管理</title>
    <jsp:include page="../includes/header.jsp"/>

</head>

<body id="page-top">

<!-- Page Wrapper -->
<div id="wrapper">

    <!-- Sidebar -->
    <jsp:include page="../includes/menu.jsp"/>
    <!-- End of Sidebar -->

    <!-- Content Wrapper -->
    <div id="content-wrapper" class="d-flex flex-column">

        <!-- Main Content -->
        <div id="content">

            <!-- Topbar -->
            <jsp:include page="../includes/nav.jsp"/>
            <!-- End of Topbar -->

        </div>
        <!-- End of Main Content -->

        <!-- Footer -->
        <jsp:include page="../includes/copyright.jsp"/>
        <!-- End of Footer -->

    </div>
    <!-- End of Content Wrapper -->

</div>
<!-- End of Page Wrapper -->

<!-- Scroll to Top Button-->
<a class="scroll-to-top rounded" href="#page-top">
    <i class="fas fa-angle-up"></i>
</a>

<jsp:include page="../includes/footer.jsp"/>

<tags:modal message='Select "Logout" below if you are ready to end your current session.' title="Ready to Leave?" ok="Logout"/>

</body>

</html>
