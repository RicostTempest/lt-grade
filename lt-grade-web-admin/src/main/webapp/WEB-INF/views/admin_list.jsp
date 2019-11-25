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

            <!-- Begin Page Content -->
            <div class="container-fluid">

                <!-- Page Heading -->
                <h1 class="h2 mb-4 text-gray-800">管理员列表</h1><sub>管理员管理</sub>

                <!-- DataTales Example -->
                <div class="card shadow mb-4">
                    <div class="card-header py-3">
                        <h6 class="m-0 font-weight-bold text-primary">管理员信息</h6>
                    </div>
                    <div class="card-body">
                        <div class="table-responsive">
                            <table class="table table-bordered" id="dataTable" width="100%" cellspacing="0">
                                <thead>
                                <tr>
                                    <th>ID</th>
                                    <th>Email</th>
                                    <th>Status</th>
                                    <th>Created</th>
                                    <th>Updated</th>
                                    <th>Operation</th>
                                </tr>
                                </thead>
                                <tfoot>
                                <tr>
                                    <th>ID</th>
                                    <th>Email</th>
                                    <th>Status</th>
                                    <th>Created</th>
                                    <th>Updated</th>
                                    <th>Operation</th>
                                </tr>
                                </tfoot>
                            </table>
                        </div>
                    </div>
                </div>

            </div>
            <!-- /.container-fluid -->

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
<script>
    // var _dataTable;
    // $(function () {
    //     var _columns = [
    //         {"data":"id"},
    //         {"data":"email"},
    //         {"data":"status"},
    //         {"data":function (row,type,val,meta) {
    //                 return DateTime.format(row.updated, 'yyyy-MM-dd HH:mm');
    //             }},
    //         {"data":function (row,type,val,meta) {
    //                 var detailUrl = "/user/detail?id=" + row.id;
    //                 return  '<div class="btn-group">'+
    //                     '<button type="button" class="btn btn-default" onclick="App.showDetail(\'' + detailUrl + '\')"><i class="fa fa-fw fa-tags"></i></button>'+
    //                     '<a href="/user/form?id='+ row.id +'" type="button" class="btn btn-default"><i class="fa fa-edit"></i></a>'+
    //                     '<button type="button" class="btn btn-default" onclick="App.deleteSignel(\'/user/delete\''+','+row.id+')"><i class="fa fa-fw fa-trash"></i></button>'+
    //                     '</div>'
    //             }}
    //     ];
    // });

    $(function () {
       $("#dataTable").DataTable({
           "info":true,
           "lengthChange":false,
           "ordering":false,
           "processing":true,
           "searching":false,
           "serverSide":true,
           "deferRender":true,
           "ajax":{
               "url":"/admin/page"
           },
           "columns":[
               {"data":"id"},
               {"data":"email"},
               {"data":"status"},
               {"data":function (row,type,val,meta) {
                       return DateTime.format(row.created, 'yyyy-MM-dd HH:mm');
                   }},
               {"data":function (row,type,val,meta) {
                       return DateTime.format(row.updated, 'yyyy-MM-dd HH:mm');
                   }},
               {"data":function (row,type,val,meta) {
                       var detailUrl = "/admin/detail?id=" + row.id;
                       return " <a href=\""+detailUrl+"\" class=\"btn btn-info btn-circle btn-sm\">\n" +
                           "        <i class=\"fas fa-info-circle\"></i>\n" +
                           "    </a>\n" +
                           "    <a href=\"#\" class=\"btn btn-warning btn-circle btn-sm\">\n" +
                           "        <i class=\"fa fa-edit\"></i>\n" +
                           "    </a>\n" +
                           "    <a href=\"#\" class=\"btn btn-danger btn-circle btn-sm\">\n" +
                           "        <i class=\"fas fa-trash\"></i>\n" +
                           "    </a>"
                   }},
           ]
       }) ;
    });

    function detail() {
        $.ajax({
            url:"/admin/detail?id=1",
            type:"get",
            dataType:"html",
            success:function (data) {
                $("#modal-body").html(data);
                $("#modalDefault").modal("show");
            }
        });
    }
</script>
</body>
</html>
