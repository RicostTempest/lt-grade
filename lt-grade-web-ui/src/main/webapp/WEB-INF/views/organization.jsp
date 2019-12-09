<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
                                    <div class="accordion" id="accordionExample">
                                        <div class="card">
                                            <div class="card-header" id="headingOne">
                                                <h5 class="mb-0">
                                                    <button class="btn btn-link" type="button" data-toggle="collapse" data-target="#collapseOne" aria-expanded="true" aria-controls="collapseOne">
                                                        测试1
                                                    </button>
                                                </h5>
                                            </div>

                                            <div id="collapseOne" class="collapse show" aria-labelledby="headingOne" data-parent="#accordionExample">
                                                <div class="card-body">
                                                    <div class="my-3 p-3 bg-white rounded shadow-sm">
                                                        <div class="media text-muted pt-3">
                                                            <svg t="1575515222985" class="icon" viewBox="0 0 1024 1024" version="1.1" xmlns="http://www.w3.org/2000/svg" p-id="2624" width="128" height="128"><path d="M921.6 851.968c-5.12-4.096-123.904-99.328-239.616-36.864-145.408 78.848-285.696 110.592-359.424 81.92-50.176-19.456-88.064-45.056-114.688-66.56l499.712-133.12c14.336-4.096 24.576-14.336 28.672-28.672L815.104 389.12c4.096-14.336 0-29.696-10.24-39.936L588.8 133.12c-10.24-10.24-25.6-14.336-39.936-10.24l-279.552 77.824c-14.336 4.096-24.576 15.36-28.672 28.672L89.088 799.744v1.024c0 2.048-1.024 3.072-1.024 5.12V815.104c0 2.048 1.024 4.096 1.024 6.144v1.024c1.024 2.048 1.024 3.072 2.048 5.12 1.024 0 1.024 1.024 1.024 1.024 1.024 2.048 2.048 3.072 3.072 5.12v1.024c5.12 7.168 68.608 88.064 196.608 138.24 26.624 10.24 59.392 16.384 95.232 16.384 92.16 0 209.92-34.816 332.8-101.376 67.584-36.864 148.48 27.648 148.48 27.648 17.408 14.336 43.008 11.264 57.344-6.144 15.36-17.408 13.312-43.008-4.096-57.344zM314.368 273.408l234.496-65.536 182.272 182.272L664.576 624.64l-399.36 106.496 168.96-168.96c29.696 8.192 62.464 1.024 84.992-21.504 33.792-33.792 33.792-88.064 0-121.856a85.9136 85.9136 0 0 0-121.856 0c-23.552 23.552-30.72 56.32-21.504 84.992L207.872 672.768l106.496-399.36zM833.536 309.248c8.192 8.192 18.432 12.288 28.672 12.288s20.48-4.096 28.672-12.288c16.384-16.384 16.384-41.984 0-58.368l-204.8-204.8c-15.36-15.36-40.96-15.36-57.344 1.024-16.384 16.384-16.384 41.984 0 58.368l204.8 203.776z" fill="#333C4F" p-id="2625"></path></svg>
                                                            <p class="media-body pb-3 mb-0 small lh-125 border-bottom border-gray">
                                                                <strong class="d-block text-gray-dark">@username</strong>
                                                                Donec id elit non mi porta gravida at eget metus. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus.
                                                            </p>
                                                        </div>
                                                        <div class="media text-muted pt-3">
                                                            <svg class="bd-placeholder-img mr-2 rounded" width="32" height="32" xmlns="http://www.w3.org/2000/svg" preserveAspectRatio="xMidYMid slice" focusable="false" role="img" aria-label="Placeholder: 32x32"><title>Placeholder</title><rect fill="#e83e8c" width="100%" height="100%"></rect><text fill="#e83e8c" dy=".3em" x="50%" y="50%">32x32</text></svg>
                                                            <p class="media-body pb-3 mb-0 small lh-125 border-bottom border-gray">
                                                                <strong class="d-block text-gray-dark">@username</strong>
                                                                Donec id elit non mi porta gravida at eget metus. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus.
                                                            </p>
                                                        </div>
                                                        <div class="media text-muted pt-3">
                                                            <svg class="bd-placeholder-img mr-2 rounded" width="32" height="32" xmlns="http://www.w3.org/2000/svg" preserveAspectRatio="xMidYMid slice" focusable="false" role="img" aria-label="Placeholder: 32x32"><title>Placeholder</title><rect fill="#6f42c1" width="100%" height="100%"></rect><text fill="#6f42c1" dy=".3em" x="50%" y="50%">32x32</text></svg>
                                                            <p class="media-body pb-3 mb-0 small lh-125 border-bottom border-gray">
                                                                <strong class="d-block text-gray-dark">@username</strong>
                                                                Donec id elit non mi porta gravida at eget metus. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus.
                                                            </p>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="card">
                                            <div class="card-header" id="headingTwo">
                                                <h5 class="mb-0">
                                                    <button class="btn btn-link collapsed" type="button" data-toggle="collapse" data-target="#collapseTwo" aria-expanded="false" aria-controls="collapseTwo">
                                                        测试2
                                                    </button>
                                                </h5>
                                            </div>
                                            <div id="collapseTwo" class="collapse" aria-labelledby="headingTwo" data-parent="#accordionExample">
                                                <div class="card-body">
                                                    <div class="media text-muted pt-3">
                                                        <svg t="1575515222985" class="icon" viewBox="0 0 1024 1024" version="1.1" xmlns="http://www.w3.org/2000/svg" p-id="2624" width="128" height="128"><path d="M921.6 851.968c-5.12-4.096-123.904-99.328-239.616-36.864-145.408 78.848-285.696 110.592-359.424 81.92-50.176-19.456-88.064-45.056-114.688-66.56l499.712-133.12c14.336-4.096 24.576-14.336 28.672-28.672L815.104 389.12c4.096-14.336 0-29.696-10.24-39.936L588.8 133.12c-10.24-10.24-25.6-14.336-39.936-10.24l-279.552 77.824c-14.336 4.096-24.576 15.36-28.672 28.672L89.088 799.744v1.024c0 2.048-1.024 3.072-1.024 5.12V815.104c0 2.048 1.024 4.096 1.024 6.144v1.024c1.024 2.048 1.024 3.072 2.048 5.12 1.024 0 1.024 1.024 1.024 1.024 1.024 2.048 2.048 3.072 3.072 5.12v1.024c5.12 7.168 68.608 88.064 196.608 138.24 26.624 10.24 59.392 16.384 95.232 16.384 92.16 0 209.92-34.816 332.8-101.376 67.584-36.864 148.48 27.648 148.48 27.648 17.408 14.336 43.008 11.264 57.344-6.144 15.36-17.408 13.312-43.008-4.096-57.344zM314.368 273.408l234.496-65.536 182.272 182.272L664.576 624.64l-399.36 106.496 168.96-168.96c29.696 8.192 62.464 1.024 84.992-21.504 33.792-33.792 33.792-88.064 0-121.856a85.9136 85.9136 0 0 0-121.856 0c-23.552 23.552-30.72 56.32-21.504 84.992L207.872 672.768l106.496-399.36zM833.536 309.248c8.192 8.192 18.432 12.288 28.672 12.288s20.48-4.096 28.672-12.288c16.384-16.384 16.384-41.984 0-58.368l-204.8-204.8c-15.36-15.36-40.96-15.36-57.344 1.024-16.384 16.384-16.384 41.984 0 58.368l204.8 203.776z" fill="#333C4F" p-id="2625"></path></svg>
                                                        <p class="media-body pb-3 mb-0 small lh-125 border-bottom border-gray">
                                                            <strong class="d-block text-gray-dark">@username</strong>
                                                            Donec id elit non mi porta gravida at eget metus. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus.
                                                        </p>
                                                    </div>
                                                    <div class="media text-muted pt-3">
                                                        <svg class="bd-placeholder-img mr-2 rounded" width="32" height="32" xmlns="http://www.w3.org/2000/svg" preserveAspectRatio="xMidYMid slice" focusable="false" role="img" aria-label="Placeholder: 32x32"><title>Placeholder</title><rect fill="#e83e8c" width="100%" height="100%"></rect><text fill="#e83e8c" dy=".3em" x="50%" y="50%">32x32</text></svg>
                                                        <p class="media-body pb-3 mb-0 small lh-125 border-bottom border-gray">
                                                            <strong class="d-block text-gray-dark">@username</strong>
                                                            Donec id elit non mi porta gravida at eget metus. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus.
                                                        </p>
                                                    </div>
                                                    <div class="media text-muted pt-3">
                                                        <svg class="bd-placeholder-img mr-2 rounded" width="32" height="32" xmlns="http://www.w3.org/2000/svg" preserveAspectRatio="xMidYMid slice" focusable="false" role="img" aria-label="Placeholder: 32x32"><title>Placeholder</title><rect fill="#6f42c1" width="100%" height="100%"></rect><text fill="#6f42c1" dy=".3em" x="50%" y="50%">32x32</text></svg>
                                                        <p class="media-body pb-3 mb-0 small lh-125 border-bottom border-gray">
                                                            <strong class="d-block text-gray-dark">@username</strong>
                                                            Donec id elit non mi porta gravida at eget metus. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus.
                                                        </p>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="card">
                                            <div class="card-header" id="headingThree">
                                                <h5 class="mb-0">
                                                    <button class="btn btn-link collapsed" type="button" data-toggle="collapse" data-target="#collapseThree" aria-expanded="false" aria-controls="collapseThree">
                                                        测试3
                                                    </button>
                                                </h5>
                                            </div>
                                            <div id="collapseThree" class="collapse" aria-labelledby="headingThree" data-parent="#accordionExample">
                                                <div class="card-body">
                                                    Anim pariatur cliche reprehenderit, enim eiusmod high life accusamus terry richardson ad squid. 3 wolf moon officia aute, non cupidatat skateboard dolor brunch. Food truck quinoa nesciunt laborum eiusmod. Brunch 3 wolf moon tempor, sunt aliqua put a bird on it squid single-origin coffee nulla assumenda shoreditch et. Nihil anim keffiyeh helvetica, craft beer labore wes anderson cred nesciunt sapiente ea proident. Ad vegan excepteur butcher vice lomo. Leggings occaecat craft beer farm-to-table, raw denim aesthetic synth nesciunt you probably haven't heard of them accusamus labore sustainable VHS.
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
