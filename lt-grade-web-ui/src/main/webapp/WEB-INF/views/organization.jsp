<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html lang="en">
<head>
    <title>风叶 - 团体界面</title>
    <jsp:include page="../includes/header.jsp"/>
</head>
<body>

    <jsp:include page="../includes/nav.jsp"/>



    <!--=== page header ===-->
    <section class="page-header d-flex align-items-center">
        <div class="container-fluid">
            <div class="page-header-content text-center">
                <div class="page-header-tag">Post Detail</div>
                <div class="page-header-title">Read Single Post</div>
            </div>
        </div>
    </section>

    <!--=== single blog post ===-->
    <section class="blog-home">
        <div class="container-fluid">
            <div class="row">
                <div class="col-12 col-lg-8 mx-auto">
                    <div class="post post-card">
                        <div class="single-post-header">
                            <h1>The best preparation for tomorrow is doing your best today </h1>
                            <ul class="nav nav-tabs" id="myTab" role="tablist">
                                <li class="nav-item">
                                    <a class="nav-link active" id="home-tab" data-toggle="tab" href="#home" role="tab" aria-controls="home" aria-selected="true">Home</a>
                                </li>
                                <li class="nav-item">
                                    <a class="nav-link" id="profile-tab" data-toggle="tab" href="#profile" role="tab" aria-controls="profile" aria-selected="false">Profile</a>
                                </li>
                                <li class="nav-item">
                                    <a class="nav-link" id="contact-tab" data-toggle="tab" href="#contact" role="tab" aria-controls="contact" aria-selected="false">Contact</a>
                                </li>
                                <li class="nav-item">
                                    <a class="nav-link" id="dash-tab" data-toggle="tab" href="#dash" role="tab" aria-controls="dash" aria-selected="false">Dash</a>
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
                                <div class="row">
                                    <div class="col-12">
                                        <div class="card-details">
                                            <p>
                                                There are many variations of passages of Lorem Ipsum available, but the majority have suffered alteration in some form, by injected humour, or randomised words which don’t look even slightly believable. If you are going to use a passage of Lorem Ipsum, you need to be sure there isn’t anything embarrassing hidden in the middle of text.
                                            </p>
                                            <p>
                                                All the Lorem Ipsum generators on the Internet tend to repeat predefined chunks as necessary, making this the first true generator on the Internet. It uses a dictionary of over 200 Latin words, combined with a handful of model sentence structures, to generate Lorem Ipsum which looks reasonable. The generated Lorem Ipsum is therefore always free from repetition, injected humour, or
                                            </p>
                                            <h2>The best preparation for tomorrow is doing your best today </h2>
                                            <p>Ullamco laboris nisi ut aliquip ex ea commodo consequat, duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.</p>
                                            <h3>There are two ways of spreading light to be the candle</h3>
                                            <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur, excepteur sint occaecat.</p>

                                            <p>Cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum. Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi.</p>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <!--three-->
                            <div class="tab-pane fade" id="contact" role="tabpanel" aria-labelledby="contact-tab">
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

                            <div class="tab-pane fade" id="dash" role="tabpanel" aria-labelledby="dash-tab">
                                <div class="card-body">
                                    <div class="chart-pie pt-4 pb-2"><div class="chartjs-size-monitor"><div class="chartjs-size-monitor-expand"><div class=""></div></div><div class="chartjs-size-monitor-shrink"><div class=""></div></div></div>
                                        <canvas id="myPieChart" width="572" height="545" class="chartjs-render-monitor" style="display: block; height: 208px; width: 218px;"></canvas>
                                    </div>
                                    <div class="mt-4 text-center small">
                                        <span class="mr-2">
                                            <i class="fas fa-circle text-primary"></i> Direct
                                        </span>
                                        <span class="mr-2">
                                            <i class="fas fa-circle text-success"></i> Social
                                        </span>
                                        <span class="mr-2">
                                            <i class="fas fa-circle text-info"></i> Referral
                                        </span>
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


    <jsp:include page="../includes/menu.jsp"/>

    <jsp:include page="../includes/footer.jsp"/>

    <jsp:include page="../includes/copyright.jsp"/>
</body>
</html>
