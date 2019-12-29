<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!doctype html>
<html lang="en">
<head>
    <title>风叶 - 主页</title>
    <jsp:include page="../includes/header.jsp"/>
</head>
<body>

    <jsp:include page="../includes/nav.jsp"/>

    <section class="speciality">
        <div class="container-fluid">
            <div class="row">
                <div class="col-12 mt-5">
                    <div class="text-center"><a href="blogpage.html" class="btn btn-primary main-btn btn-reload"><i class="fa fa-spinner fa-spin"></i> 加入集体</a></div>
                    <div class="text-center"><a href="/organization/form" class="btn btn-primary main-btn btn-reload"><i class="fa fa-spinner fa-spin"></i>创建集体</a></div>
                </div>
            </div>
        </div>
    </section>

    <!--=== blog page ===-->
    <section class="blog-page-1">

        <div class="container-fluid">

            <div class="row">

                <div class="col-lg-12">
                    <div class="blog-page-header">

                    </div>
                </div>
            </div>
            <div class="row">
                <div class="col">
                    <div class="row">
                        <c:forEach items="${organizations}" var="org">
                            <div class="col-lg-4 col-md-6 col-sm-6">
                                <div class="blog-post">
                                    <div class="post-img">
                                        <img class="img-fluid" src="/static/assets/images/thumb/blog-item_02.jpg" alt="image">
                                    </div>
                                    <div class="blog-details">
                                        <ul class="list-inline blog-item-links">
                                            <li class="list-inline-item"><a href="#"><i class="ion ion-person"></i>${org.nickname}</a></li>
                                            <li class="list-inline-item"><a href="#"><i class="ion ion-calendar"></i>${org.created}</a></li>
                                            <li class="list-inline-item"><a href="#"><i class="ion ion-chatbubbles"></i>Comments 113</a></li>
                                        </ul>
                                        <a href="single-post.html"><h4 class="media-heading">${org.orgName}</h4></a>
                                        <p>${org.intro == null ? "暂无" : org.intro}</p>
                                        <a href="/organization?id=${org.orgId}" class="blog-post-link">进入集体 <i class="fa fa-angle-double-right"></i></a>
                                    </div>
                                </div>
                            </div>
                        </c:forEach>
                    </div>
                </div>


            </div>


        </div>
    </section>

    <jsp:include page="../includes/menu.jsp"/>

    <jsp:include page="../includes/footer.jsp"/>

    <jsp:include page="../includes/copyright.jsp"/>
</body>
</html>
