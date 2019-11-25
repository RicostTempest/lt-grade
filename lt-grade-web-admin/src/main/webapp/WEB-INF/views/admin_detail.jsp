<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>管理员管理 | 管理员详情</title>
    <jsp:include page="../includes/header.jsp" />
</head>
<body >
<div class="box-body">
    <table id="dataTable" class="table">
        <tbody>
        <tr>
            <td>Email:</td>
            <td>${admin.email}</td>
        </tr>
        <tr>
            <td>Created:</td>
            <td>${admin.created}</td>
        </tr>
        <tr>
            <td>Updated:</td>
            <td>${admin.updated}</td>
        </tr>
        </tbody>
    </table>
</div>
<jsp:include page="../includes/footer.jsp"/>
<script>
</script>
</body>
</html>