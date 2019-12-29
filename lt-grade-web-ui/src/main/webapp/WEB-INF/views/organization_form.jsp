<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html lang="en">
<head>
    <title>风叶 - 创建集体</title>
    <jsp:include page="../includes/header.jsp"/>
</head>
<body>

<jsp:include page="../includes/nav.jsp"/>

<!--=== contact ===-->
<section class="contact ">
    <div class="container-fluid content" >
        <div class="row justify-content-center">
            <div class="contact-overlay">
                <form method="post" action="/organization/created" class="col-10 mx-auto text-center">
                    <h1 class="page-title-1">创建集体</h1>
                    <div class="row justify-content-center">

                        <div class="col-12">
                            <p class="left-arrow">名称</p>
                            <div class="form-group">
                                <label class="sr-only">团体名称</label>
                                <input id="orgName" name="orgName" class="form-control" placeholder="团体名称" type="text">
                            </div>
                            <hr>
                        </div>

                        <div class="col-12 ">
                            <p class="left-arrow">简介</p>
                            <div class="form-group">
                                <label class="sr-only">简介</label>
                                <textarea class="form-control textarea" id="intro" name="intro" rows="5" placeholder="介绍你的团体..."></textarea>
                            </div>
                        </div>
                        <div class="col-12">
                            <div class="form-group text-center">
                                <button type="submit" class="btn btn-secondary">创建</button>
                            </div>
                        </div>
                    </div>
                </form>
            </div>
        </div>
    </div>
</section>

<jsp:include page="../includes/menu.jsp"/>

<jsp:include page="../includes/footer.jsp"/>

<jsp:include page="../includes/copyright.jsp"/>
</body>
</html>
