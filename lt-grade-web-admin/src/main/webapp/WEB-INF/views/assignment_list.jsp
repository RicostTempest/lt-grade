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
                        <h6 class="m-0 font-weight-bold text-primary">用户员列表</h6>
                    </div>
                    <div class="card-body">
                        <div class="table-responsive">
                            <table class="table table-bordered" id="dataTable" width="100%" cellspacing="0">
                                <thead>
                                <tr>
                                    <th>ID</th>
                                    <th>名称</th>
                                    <th>内容</th>
                                    <th>类型</th>
                                    <th>创建时间</th>
                                    <th>截止时间</th>
                                    <th>所在团体</th>
                                    <th>操作</th>
                                </tr>
                                </thead>
                                <tfoot>
                                <tr>
                                    <th>ID</th>
                                    <th>名称</th>
                                    <th>内容</th>
                                    <th>类型</th>
                                    <th>创建时间</th>
                                    <th>截止时间</th>
                                    <th>所在团体</th>
                                    <th>操作</th>
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

    $(function (data) {
       $("#dataTable").DataTable({
           "info":true,
           "lengthChange":false,
           "ordering":false,
           "processing":true,
           "searching":false,
           "serverSide":true,
           "deferRender":true,
           "pageLength": 6,
           "ajax":{
               "url":"/assignment/page",
           },
           "columns":[
               {"data":"assId"},
               {"data":"name"},
               {"data":"content"},
               {"data":function (row,type,val,meta) {
                       switch(row.type) {
                           case 0:
                               return "作业";
                           case 1:
                               return "实验";
                           default:
                               return "测试";
                       }
                   }},
               {"data":function (row,type,val,meta) {
                       return DateTime.format(row.created, 'yyyy-MM-dd HH:mm');
                   }},
               {"data":function (row,type,val,meta) {
                       return DateTime.format(row.deadline, 'yyyy-MM-dd HH:mm');
                   }},
               {"data":function (row,type,val,meta) {
                       return row.organization.orgName;
                   }},
               {"data":function (row,type,val,meta) {
                       var detailUrl = "/user/detail?id=" + row.uid;
                       var editlUrl = "/user/form?id=" + row.uid;
                       var deleteUrl = "/user/delete?uid=" + row.uid;
                       return '<a href="#" class="btn btn-info btn-circle btn-sm" onclick="detail(\'' + detailUrl + '\')">\n' +
                           "        <i class=\"fas fa-info-circle\"></i>\n" +
                           "    </a>\n" +
                           "    <a href=\""+editlUrl+"\" class=\"btn btn-warning btn-circle btn-sm\">\n" +
                           "        <i class=\"fa fa-edit\"></i>\n" +
                           "    </a>\n" +
                           '    <a href="#"  class="btn btn-danger btn-circle btn-sm" onclick="adminDelete(\'' + deleteUrl + '\')">\n' +
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

    function detail(url) {
        $.ajax({
            url:url,
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
    };

    function adminDelete(url) {
        $("#modalMessage").html("确定删除数据吗？");
        //点击删除按钮时弹框
        $("#modalDefault").modal("show");

        //绑定删除事件
        $("#checkOk").bind("click",function () {
            setTimeout(function () {
                $.ajax({
                    "url":url,
                    "type":"get",
                    "dataType":"JSON",
                    "success":function (data) {
                        //解除事件绑定
                        $("#checkOk").unbind("click");
                        if(data.status == 200){
                            $("#checkOk").bind("click",function () {
                                window.location.reload();
                            });
                        }
                        //删除失败
                        else{
                            //强制更改绑定事件
                            $("#checkOk").bind("click",function () {
                                $("#modalDefault").modal("hide");
                            });
                        }
                        $("#modalDefault").modal("show");
                        $("#modalMessage").html(data.message);
                    }
                });
            },500);
        });
    };


</script>
</body>
</html>
