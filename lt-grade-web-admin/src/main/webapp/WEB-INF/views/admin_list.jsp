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
                                    <th>Created</th>
                                    <th>Updated</th>
                                    <th>Status</th>
                                    <th>Operation</th>
                                </tr>
                                </thead>
                                <tfoot>
                                <tr>
                                    <th>ID</th>
                                    <th>Email</th>
                                    <th>Created</th>
                                    <th>Updated</th>
                                    <th>Status</th>
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

<tags:modal />
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
               {"data":function (row,type,val,meta) {
                       return DateTime.format(row.created, 'yyyy-MM-dd HH:mm');
                   }},
               {"data":function (row,type,val,meta) {
                       return DateTime.format(row.updated, 'yyyy-MM-dd HH:mm');
                   }},
               {"data":function (row, type, val, meta) {
                       var checked = "";
                       if(row.activity){
                           checked = "checked"
                       }
                       return " <label class=\"button-switch\">\n" +
                           "        <input onclick=\"activity("+row.id+")\" type='checkbox' " + checked + " >\n" +
                           "        <span class=\"button-slider round\"></span>\n" +
                           "    </label>"
                   }},
               {"data":function (row,type,val,meta) {
                       var detailUrl = "/admin/detail?id=" + row.id;
                       return " <a href='#' class='btn btn-info btn-circle btn-sm' onclick='detail()'>\n" +
                           "        <i class=\"fas fa-info-circle\"></i>\n" +
                           "    </a>\n" +
                           "    <a href='#' class=\"btn btn-warning btn-circle btn-sm\">\n" +
                           "        <i class=\"fa fa-edit\"></i>\n" +
                           "    </a>\n" +
                           "    <a href='#' class=\"btn btn-danger btn-circle btn-sm\">\n" +
                           "        <i class=\"fas fa-trash\"></i>\n" +
                           "    </a>"
                   }},

           ],
           "language": {
               "sProcessing": "处理中...",
               "sLengthMenu": "显示 _MENU_ 项结果",
               "sZeroRecords": "没有匹配结果",
               "sInfo": "显示第 _START_ 至 _END_ 项结果，共 _TOTAL_ 项",
               "sInfoEmpty": "显示第 0 至 0 项结果，共 0 项",
               "sInfoFiltered": "(由 _MAX_ 项结果过滤)",
               "sInfoPostFix": "",
               "sSearch": "搜索:",
               "sUrl": "",
               "sEmptyTable": "表中数据为空",
               "sLoadingRecords": "载入中...",
               "sInfoThousands": ",",
               "oPaginate": {
                   "sFirst": "首页",
                   "sPrevious": "上页",
                   "sNext": "下页",
                   "sLast": "末页"
               },
               "oAria": {
                   "sSortAscending": ": 以升序排列此列",
                   "sSortDescending": ": 以降序排列此列"
               }
           }
       }) ;
    });

    function detail() {
        $.ajax({
            url:"/admin/detail?id=1",
            type:"get",
            dataType:"html",
            success:function (data) {
                $("#modalMessage").html(data);
                $("#modalDefault").modal("show");
                $("#checkOk").bind("click",function () {
                    $("#modalDefault").modal("hide");
                });
            }
        });
    }

    function activity(id) {
        $.ajax({
            url:"/admin/activity?id=" + id,
            type:"get",
            dataType:"json",
            success:function (data) {
                $("#modalMessage").html(data.message);
                $("#modalDefault").modal("show");
                $("#checkOk").bind("click",function () {
                    $("#modalDefault").modal("hide");
                });
            }
        });
    }
</script>
</body>
</html>
