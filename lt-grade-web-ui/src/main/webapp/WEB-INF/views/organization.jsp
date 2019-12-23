<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!doctype html>
<html lang="en">
<head>
    <title>风叶 - 团体界面</title>
    <jsp:include page="../includes/header.jsp"/>
</head>
<body>

    <jsp:include page="../includes/nav.jsp"/>
    <div class="content">
        <!--=== page header ===-->
        <section class="page-header d-flex align-items-center">
            <div class="container-fluid">
                <div class="page-header-content text-center">
                    <div class="page-header-tag">Post Detail</div>
                    <div class="page-header-title">Read Single Post</div>
                </div>
            </div>
        </section>

        <section class="speciality">
            <div class="container-fluid">
                <div class="row">
                    <div class="col-lg-2 col-md-3 col-sm-4">
                        <div class="speciality-wrap">
                            <div><i class="ion ion-ios-cloud-outline"></i></div>
                            <a href="#">签到</a>
                        </div>
                    </div>
                    <div class="col-lg-2 col-md-3 col-sm-4">
                        <div class="speciality-wrap">
                            <div><i class="ion ion-ios-book-outline"></i></div>
                            <a href="#">抽签</a>
                        </div>
                    </div>
                    <div class="col-lg-2 col-md-3 col-sm-4">
                        <div class="speciality-wrap">
                            <div><i class="ion ion-ios-browsers-outline"></i></div>
                            <a href="#">创建任务</a>
                        </div>
                    </div>
                </div>
            </div>
        </section>

        <!--=== single blog post ===-->
        <section class="blog-home">
            <div class="container-fluid">
                <div class="row">
                    <div class="col-12 col-lg-10 mx-auto">
                        <div class="post post-card">
                            <div class="single-post-header">
                                <ul class="nav nav-tabs" id="myTab" role="tablist">
                                    <li class="nav-item">
                                        <a class="nav-link active" id="home-tab" data-toggle="tab" href="#home" role="tab" aria-controls="home" aria-selected="true">资源</a>
                                    </li>
                                    <li class="nav-item">
                                        <a class="nav-link" id="profile-tab" data-toggle="tab" href="#profile" role="tab" aria-controls="profile" aria-selected="false">成员</a>
                                    </li>
                                    <li class="nav-item">
                                        <a class="nav-link" id="contact-tab" data-toggle="tab" href="#contact" role="tab" aria-controls="contact" aria-selected="false">任务</a>
                                    </li>
                                    <li class="nav-item">
                                        <a class="nav-link" id="dash-tab" data-toggle="tab" href="#dash" role="tab" aria-controls="dash" aria-selected="false">留言</a>
                                    </li>
                                </ul>
                            </div>
                            <div class="tab-content" id="myTabContent">
                                <!--one-->
                                <div class="tab-pane fade show active" id="home" role="tabpanel" aria-labelledby="home-tab">
                                    <a href="#" class="post-image" ><img src="/static/assets/images/thumb/blog-item_01.jpg" alt="#" class="img-fluid featured-img"></a>

                                </div>
                                <!--two-->
                                <div class="tab-pane fade" id="profile" role="tabpanel" aria-labelledby="profile-tab">
                                    <ul class="list-group">
                                        <c:forEach items="${member}" var="item">
                                            <li class="list-group-item">
                                                <div class="media">
                                                    <svg t="1576995280356" class="icon" viewBox="0 0 1029 1024" version="1.1" xmlns="http://www.w3.org/2000/svg" p-id="4609" width="64" height="64"><path d="M514.4 34.4c-266.4 0-482.4 213.6-482.4 477.6s216 477.6 482.4 477.6 482.4-213.6 482.4-477.6-216-477.6-482.4-477.6z m264.96 530.88c3.36 64.8-67.68 101.28-119.52 104.64 24-22.56 86.88-59.52 74.4-111.84-4.8-21.12-31.68-34.08-61.44-27.84 38.4-33.12 103.68-20.16 106.56 35.04z m-160.32-249.6c-17.28 14.4-48.48 33.6-50.4 59.52-2.4 39.84 58.56 76.32 25.92 126.72-12.48 19.2-33.12 27.36-59.52 39.36-3.36-5.76 6.72-10.56 11.04-16.8 40.8-59.04-42.24-78.72-31.68-151.2 10.08-70.08 93.12-94.56 169.92-104.64-21.6 15.36-42.24 28.32-65.28 47.04z m-214.56 33.6c30.72-56.64 122.4-90.72 155.04-151.2 7.68-14.88 13.92-37.44 3.84-56.16 12.96 12.48 22.56 35.04 22.56 59.52 0 72-76.32 113.76-113.76 162.24-8.16 11.04-18.72 27.36-18.72 44.64 0.48 39.36 41.28 83.52 56.16 115.68-25.92-17.28-57.6-40.32-80.16-67.2-23.04-26.4-45.6-70.08-24.96-107.52z m-9.6 164.16c6.72-0.48 19.68-3.36 29.76-1.92-19.2 9.12-51.36 10.56-65.28 29.76 14.4 10.56 35.04 10.08 54.24 11.04 78.72 3.36 177.12-3.36 244.32-14.88 2.4 4.8-9.12 13.44-16.8 18.72-42.24 31.2-174.24 39.84-264.96 33.6-30.24-1.92-99.84-10.08-100.8-37.44-0.48-33.12 84.48-36.48 119.52-38.88z m156.96 175.2c8.64-1.92 17.28-8.16 24.48-7.68 21.6 1.44 29.76 24 48.48 27.84-59.52 36.48-203.52 50.88-263.04 5.76-2.88-33.12 24-36.96 48.48-42.72 5.76 1.92-1.92 4.8-1.92 7.68 16.8 29.28 100.8 18.72 143.52 9.12z m-160.32-25.92c-20.64-3.84-56.64-14.88-57.6-31.68-1.44-22.56 35.52-32.16 52.32-35.52 8.64 0.96-6.24 6.24-3.84 12.96 32.16 31.68 132 22.56 180.96 12.96 10.08-1.92 20.64-8.16 27.84-7.68 18.72 1.44 30.72 23.52 46.56 25.92-57.12 25.92-166.56 37.92-246.24 23.04zM221.6 753.92c2.4-41.76 103.2-53.28 134.4-25.92-17.76 4.32-63.84-1.92-65.28 22.56-0.48 9.12 15.84 20.16 25.92 24.48 60.96 23.04 182.88 26.4 283.68 14.88 46.56-5.28 134.4-21.12 123.36-69.12 13.92 1.44 26.4 10.56 27.84 24.48 5.76 51.36-112.8 72.96-160.32 78.24-103.68 11.52-233.76 9.12-313.44-18.72-26.4-9.6-57.6-25.92-56.16-50.88zM594.56 882.56H514.4c-70.08-7.68-137.28-17.76-193.92-42.72 148.32 35.52 364.32 33.12 468.48-42.72 5.76-4.32 11.04-12 18.72-11.04-26.4 77.76-126.72 83.04-213.12 96.48z" fill="#108ee9" p-id="4610"></path></svg>
                                                    <div class="media-body">
                                                        <h5 class="mt-0">${item.nickname}</h5>
                                                        <p>${item.stuId}</p>
                                                    </div>
                                                </div>
                                            </li>
                                        </c:forEach>
                                    </ul>
                                </div>
                                <!--three-->
                                <div class="tab-pane fade" id="contact" role="tabpanel" aria-labelledby="contact-tab">
                                    <div class="accordion" id="accordionExample">
                                        <div class="card">
                                            <div class="card-header" id="headingOne">
                                                <h5 class="mb-0">
                                                    <button class="btn btn-link" type="button" data-toggle="collapse" data-target="#collapseOne" aria-expanded="true" aria-controls="collapseOne">
                                                        作业
                                                    </button>
                                                </h5>
                                            </div>

                                            <div id="collapseOne" class="collapse show" aria-labelledby="headingOne" data-parent="#accordionExample">
                                                <div class="card-body">
                                                    <c:forEach items="${assignment['work']}" var="ass">
                                                        <div class="media text-muted pt-3">
                                                            <svg t="1576999997289" class="icon" viewBox="0 0 1024 1024" version="1.1" xmlns="http://www.w3.org/2000/svg" p-id="1290" width="64" height="64"><path d="M493.987 578.298L178.58 893.686c-6.696 6.706-10.784 16.01-10.784 26.24 0 20.462 16.563 37.216 37.215 37.216a37.177 37.177 0 0 0 15.063-3.16s525.49-227.764 531.451-230.563c12.276-5.562 21.77-16.354 25.486-29.765l85.043-306.467 17.118 16.937c17.862 17.862 46.7 17.862 64.564 0 17.871-17.862 17.871-46.72 0-64.565l-262.182-262.2c-17.862-17.862-46.7-17.862-64.564 0-17.87 17.864-17.87 46.72 0 64.565l16.928 16.935-307.029 85.408c-13.401 3.925-24.187 13.592-29.774 26.24L66.933 801.595c-1.853 4.451-2.971 9.304-2.971 14.5 0 20.661 16.745 37.216 37.215 37.216 10.612 0 20.1-4.288 26.794-11.339l314.844-314.844c-4.28-10.994-6.696-22.713-6.696-35.18 0-51.354 41.685-93.04 93.039-93.04s93.039 41.686 93.039 93.04-41.686 93.038-93.04 93.038c-12.465 0-24.186-2.417-35.17-6.687z" p-id="1291"></path></svg>
                                                            <p class="media-body pb-3 mb-0 small lh-125 border-bottom border-gray">
                                                                <strong class="d-block text-gray-dark">${ass.name}</strong>
                                                                <strong class="d-block text-gray-dark">${ass.deadline}</strong>
                                                            </p>
                                                        </div>
                                                    </c:forEach>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="card">
                                            <div class="card-header" id="headingTwo">
                                                <h5 class="mb-0">
                                                    <button class="btn btn-link collapsed" type="button" data-toggle="collapse" data-target="#collapseTwo" aria-expanded="false" aria-controls="collapseTwo">
                                                        实验
                                                    </button>
                                                </h5>
                                            </div>
                                            <div id="collapseTwo" class="collapse" aria-labelledby="headingTwo" data-parent="#accordionExample">
                                                <div class="card-body">
                                                    <c:forEach items="${assignment['experiment']}" var="ass">
                                                        <div class="media text-muted pt-3">
                                                            <svg t="1576999997289" class="icon" viewBox="0 0 1024 1024" version="1.1" xmlns="http://www.w3.org/2000/svg" p-id="1290" width="64" height="64"><path d="M493.987 578.298L178.58 893.686c-6.696 6.706-10.784 16.01-10.784 26.24 0 20.462 16.563 37.216 37.215 37.216a37.177 37.177 0 0 0 15.063-3.16s525.49-227.764 531.451-230.563c12.276-5.562 21.77-16.354 25.486-29.765l85.043-306.467 17.118 16.937c17.862 17.862 46.7 17.862 64.564 0 17.871-17.862 17.871-46.72 0-64.565l-262.182-262.2c-17.862-17.862-46.7-17.862-64.564 0-17.87 17.864-17.87 46.72 0 64.565l16.928 16.935-307.029 85.408c-13.401 3.925-24.187 13.592-29.774 26.24L66.933 801.595c-1.853 4.451-2.971 9.304-2.971 14.5 0 20.661 16.745 37.216 37.215 37.216 10.612 0 20.1-4.288 26.794-11.339l314.844-314.844c-4.28-10.994-6.696-22.713-6.696-35.18 0-51.354 41.685-93.04 93.039-93.04s93.039 41.686 93.039 93.04-41.686 93.038-93.04 93.038c-12.465 0-24.186-2.417-35.17-6.687z" p-id="1291"></path></svg>
                                                            <p class="media-body pb-3 mb-0 small lh-125 border-bottom border-gray">
                                                                <strong class="d-block text-gray-dark">${ass.name}</strong>
                                                                <strong class="d-block text-gray-dark">${ass.deadline}</strong>
                                                            </p>
                                                        </div>
                                                    </c:forEach>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="card">
                                            <div class="card-header" id="headingThree">
                                                <h5 class="mb-0">
                                                    <button class="btn btn-link collapsed" type="button" data-toggle="collapse" data-target="#collapseThree" aria-expanded="false" aria-controls="collapseThree">
                                                        测试
                                                    </button>
                                                </h5>
                                            </div>
                                            <div id="collapseThree" class="collapse" aria-labelledby="headingThree" data-parent="#accordionExample">
                                                <div class="card-body">
                                                    <div class="card-body">
                                                        <c:forEach items="${assignment['test']}" var="ass">
                                                            <div class="media text-muted pt-3">
                                                                <svg t="1576999997289" class="icon" viewBox="0 0 1024 1024" version="1.1" xmlns="http://www.w3.org/2000/svg" p-id="1290" width="64" height="64"><path d="M493.987 578.298L178.58 893.686c-6.696 6.706-10.784 16.01-10.784 26.24 0 20.462 16.563 37.216 37.215 37.216a37.177 37.177 0 0 0 15.063-3.16s525.49-227.764 531.451-230.563c12.276-5.562 21.77-16.354 25.486-29.765l85.043-306.467 17.118 16.937c17.862 17.862 46.7 17.862 64.564 0 17.871-17.862 17.871-46.72 0-64.565l-262.182-262.2c-17.862-17.862-46.7-17.862-64.564 0-17.87 17.864-17.87 46.72 0 64.565l16.928 16.935-307.029 85.408c-13.401 3.925-24.187 13.592-29.774 26.24L66.933 801.595c-1.853 4.451-2.971 9.304-2.971 14.5 0 20.661 16.745 37.216 37.215 37.216 10.612 0 20.1-4.288 26.794-11.339l314.844-314.844c-4.28-10.994-6.696-22.713-6.696-35.18 0-51.354 41.685-93.04 93.039-93.04s93.039 41.686 93.039 93.04-41.686 93.038-93.04 93.038c-12.465 0-24.186-2.417-35.17-6.687z" p-id="1291"></path></svg>
                                                                <p class="media-body pb-3 mb-0 small lh-125 border-bottom border-gray">
                                                                    <strong class="d-block text-gray-dark">${ass.name}</strong>
                                                                    <strong class="d-block text-gray-dark">${ass.deadline}</strong>
                                                                </p>
                                                            </div>
                                                        </c:forEach>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>

                                <div class="tab-pane fade" id="dash" role="tabpanel" aria-labelledby="dash-tab">
                                    <div class="row">
                                        <div class="col col-lg-8 mx-auto">
                                            <div class="comment-posts">
                                                <div class="row">
                                                    <div class="col-lg-12">
                                                        <div class=""><h2 class="comment-section-title">Comments here</h2></div>

                                                        <div class="media single-content">
                                                            <a href="#"><img class=" img-responsive" src="/static/assets/images/team_1.jpg" alt="image"></a>
                                                            <div class="media-body">
                                                                <h3 class="">Jhon Doe | <span>Oct 03, 2016</span></h3>
                                                                <p>
                                                                    Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat.

                                                                </p>
                                                                <div class="media single-content">
                                                                    <a href="#"><img class=" img-responsive" src="/static/assets/images/team_2.jpg" alt="image"></a>
                                                                    <div class="media-body">
                                                                        <h3 class="">Jhon Doe | <span>Oct 03, 2016</span></h3>
                                                                        <p>
                                                                            Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat.

                                                                        </p>
                                                                    </div>
                                                                </div>
                                                            </div>
                                                        </div>
                                                        <div class="media single-content">
                                                            <a href="#"><img class=" img-responsive" src="/static/assets/images/team_3.jpg" alt="image"></a>
                                                            <div class="media-body">
                                                                <h3 class="">Jhon Doe | <span>Oct 03, 2016</span></h3>
                                                                <p>
                                                                    Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat.
                                                                </p>
                                                            </div>
                                                        </div>
                                                    </div>
                                                </div>

                                                <div class="row">
                                                    <div class="col-12">
                                                        <div class="border-wrapper"><h2 class="comment-section-title">Reply a Comment</h2></div>
                                                    </div>
                                                    <div class="col-12">
                                                        <div class="form-group">
                                                            <label class="sr-only">Your Name</label>
                                                            <input name="name" class="form-control" placeholder="First Name" type="text">
                                                        </div>
                                                    </div>
                                                    <div class="col-12">
                                                        <div class="form-group">
                                                            <label class="sr-only">Your Email</label>
                                                            <input name="email" class="form-control" placeholder="Your Email" type="email">
                                                        </div>
                                                    </div>
                                                    <div class="col-12">
                                                        <div class="form-group">
                                                            <label class="sr-only">Massage</label>
                                                            <textarea class="form-control textarea" name="message" rows="5" placeholder="Massage"></textarea>
                                                        </div>
                                                    </div>
                                                    <div class="col-12">
                                                        <div class="form-group">
                                                            <button type="submit" class="btn btn-secondary">Leave a post</button>
                                                        </div>
                                                    </div>
                                                </div>

                                            </div>
                                        </div>
                                    </div>
                                </div>

                            </div>



                            <ul class="list-inline share-icon text-left">
                                <li class="list-inline-item"><span>Theme</span></li>
                                <li class="list-inline-item"><span>Blog</span></li>
                                <li class="list-inline-item"><span>Wordpress</span></li>
                            </ul>
                        </div>


                    </div>
                </div>
            </div>
        </section>
    </div>

    <jsp:include page="../includes/menu.jsp"/>

    <jsp:include page="../includes/footer.jsp"/>

    <jsp:include page="../includes/copyright.jsp"/>
</body>
</html>
