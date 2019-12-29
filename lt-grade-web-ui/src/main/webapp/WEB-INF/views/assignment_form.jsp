<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!doctype html>
<html lang="en">
<head>
    <title>风叶 - 团体界面</title>
    <jsp:include page="../includes/header.jsp"/>
    <link rel="stylesheet" href="/static/assets/plugins/dropzone/dropzone.css" />
    <link rel="stylesheet" href="/static/assets/plugins/dropzone/min/basic.min.css" />
</head>
<body>

    <jsp:include page="../includes/nav.jsp"/>
    <div class="content">
        <!--=== page header ===-->
        <section class="page-header d-flex align-items-center">
            <div class="container-fluid">
                <div class="page-header-content text-center">
                    <div class="page-header-tag">发布任务</div>
                    <div class="page-header-title">填写相关信息</div>
                </div>
            </div>
        </section>

        <!--=== single blog post ===-->
        <section class="blog-home">
            <div class="container-fluid">
                <div class="row">
                    <div class="col-8 col-lg-8 mx-auto">
                        <h1 class="page-title-1">创建任务</h1>
                        <form action="/organization/task/create" method="post" class="row justify-content-center">

                            <div class="col-12">
                                <p class="left-arrow">名称</p>
                                <div class="form-group">
                                    <label class="sr-only">任务名称</label>
                                    <input name="name" class="form-control" placeholder="任务名称" type="text">
                                </div>
                                <hr>
                            </div>

                            <div class="col-12 ">
                                <p class="left-arrow">任务内容</p>
                                <div class="form-group">
                                    <label class="sr-only">内容</label>
                                    <textarea class="form-control textarea" name="content" rows="5" placeholder="写入任务内容..."></textarea>
                                </div>
                            </div>
                            <div class="col-12 ">
                                <p class="left-arrow">任务分类</p>
                                <div class="form-group">
                                    <label class="sr-only">分类</label>
                                    <select class="form-control" name="type" id="assType">
                                        <option value="0">作业</option>
                                        <option value="1">实验</option>
                                        <option value="2">测试</option>
                                    </select>
                                </div>
                            </div>
                            <div class="col-12 ">
                                <p class="left-arrow">任务资源</p>
                                <div class="form-group">
                                    <label class="sr-only">资源</label>
                                    <input name="url" id="url" type="hidden"/>
                                    <input name="resName" id="resName" class="form-control" placeholder="任务名称" type="text">
                                    <div id="dropz" class="dropzone"></div>
                                </div>
                            </div>
                            <div class="col-12">
                                <div class="form-group text-center">
                                    <button type="submit" class="btn btn-secondary">创建</button>
                                </div>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </section>
    </div>

    <jsp:include page="../includes/menu.jsp"/>

    <jsp:include page="../includes/footer.jsp"/>

    <jsp:include page="../includes/copyright.jsp"/>
    <script src="/static/assets/plugins/dropzone/min/dropzone.min.js"></script> //图片上传
    <script>
        var myDropzone = new Dropzone("#dropz", {
            url: "/upload",
            paramName:"dropFile",  //后台接受的参数名称规定为 dropFile 在属性 MultipartFile dropFile中匹配
            maxFiles: 5,// 一次性上传的文件数量上限
            maxFilesize: 2, // 文件大小，单位：MB
            acceptedFiles: ".jpg,.gif,.png,.jpeg", // 上传的类型
            addRemoveLinks: true,
            parallelUploads: 5,// 一次上传的文件数量
            dictDefaultMessage: '拖动文件至此或者点击上传',
            dictMaxFilesExceeded: "您最多只能上传" + this.maxFiles + "个文件！",
            dictResponseError: '文件上传失败!',
            dictInvalidFileType: "文件类型只能是*.jpg,*.gif,*.png,*.jpeg",
            dictFallbackMessage: "浏览器不受支持",
            dictFileTooBig: "文件过大上传文件最大支持.",
            dictRemoveLinks: "删除",
            dictCancelUpload: "取消",
            init: function () {
                this.on("success", function (file, data) {
                    // 上传成功触发的事件
                    $("#url").val(data.fileName)
                });
            }
        });
    </script>
</body>
</html>
