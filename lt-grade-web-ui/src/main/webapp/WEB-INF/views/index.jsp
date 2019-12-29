<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html lang="en">
<head>
    <title>风叶 - 首页</title>
    <jsp:include page="../includes/header.jsp"/>
</head>
<body>

    <jsp:include page="../includes/nav.jsp"/>

    <!--=== header intro ===-->
    <section id="home" class="header-intro-1 d-flex align-items-center">
        <div class="container-fluid">
            <div class="row">
                <div class="col-12">
                    <div class="header-intro-wrap text-center">
                        <div class="header-intro-title"><h3>风叶班级管理系统</h3></div>
                        <div class="header-intro-tag">发现更合适的班级管理方式 </div>
                        <ul class="list-inline">
                            <li class="list-inline-item"><a href="/login" class="btn btn-primary main-btn bg-main">登 录</a></li>
                            <li class="list-inline-item"><a href="/register" class="btn btn-primary main-btn bg-green">注 册</a></li>
                        </ul>
                    </div>
                </div>
            </div>
        </div>
    </section>

    <!--=== 系统介绍 ===-->
    <section id="feature" class="feature" >
        <div class="container-fluid">
            <div class="row">
                <div class="col-lg-12 text-center">
                    <div class="section-tag">PROFISE</div>
                    <div class="section-title mb-5"><h2>更加全面的班级管理</h2></div>
                </div>
                <div class="col-lg-3 col-md-4 col-sm-6">
                    <div class="feature-wrap">
                        <div><i class="ion ion-ios-gear-outline"></i></div>
                        <a href="#">Multi-file Package</a>
                        <p>You can use multiple file with single entry. at front-end those files will be downloaded as a zip</p>
                    </div>
                </div>
                <div class="col-lg-3 col-md-4 col-sm-6">
                    <div class="feature-wrap">
                        <div><i class="ion ion-ios-bell-outline"></i></div>
                        <a href="#">Multi-file Package</a>
                        <p>You can use multiple file with single entry. at front-end those files will be downloaded as a zip</p>
                    </div>
                </div>
                <div class="col-lg-3 col-md-4 col-sm-6">
                    <div class="feature-wrap">
                        <div><i class="ion ion-ios-timer-outline"></i></div>
                        <a href="#">Multi-file Package</a>
                        <p>You can use multiple file with single entry. at front-end those files will be downloaded as a zip</p>
                    </div>
                </div>
            </div>
        </div>
    </section>

    <!--=== call to action ===-->
    <section class="call-to-action">
        <div class="container-fluid">
            <div class="row">
                <div class="col-12">
                    <div class="call-to-action-wrap">
                        <div class="call-to-action-title">
                            <h3>没有通过高校认证？联系我们，马上获取</h3>
                            <div class=" call-btn-wrap text-center">
                                <a href="#" class="btn btn-primary main-btn">获取认证</a>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </section>

    <!--=== about us ===-->
    <section id="about" class="about-us">
        <div class="container-fluid">
            <div class="row">
                <div class="col-lg-6 align-self-center">
                    <div class="about-wrap">
                        <div class="section-title"><h2>团队介绍</h2></div>
                        <p>
                            本团队暂时没有太多的成员，长期招募各种程序员，以及前台客服，漂亮小姐姐以及喜欢编程的朋友优先，PS：我老板很漂亮滴。
                        </p>
                    </div>
                </div>
                <div class="col-lg-6 align-self-center">
                    <div class="about-image text-center">
                        <div><img class="img-fluid" src="static/assets/images/svg/undraw_hello_aeia.svg" alt="About Us"></div>
                    </div>
                </div>
            </div>
        </div>
    </section>

    <!--=== testimonial & clients ===-->
    <section id="testimonial" class="testimonial">
        <div class="container-fluid">
            <div class="row">
                <div class="col-12">
                    <div class="section-title-wrap text-center">
                        <div class="section-tag">我们的优势</div>
                        <div class="section-title"><h2>评论和用户</h2></div>
                    </div>
                </div>
                <div class="col-lg-8 col-md-10 col-sm-12 mx-auto">
                    <div id="testimonial-slider" class="testimonial-slider">
                        <div class="slider-item">
                            <div class="testimonial-wrap mx-auto">
                                <div class="testimon-detail">
                                    <div class="testimon-icon"><i class="ion ion-quote"></i></div>
                                    <strong>好用的插件</strong>
                                    <p>大量的视图插件，更好的查看使用信息，更好的用户体验</p>
                                </div>
                                <div class="testimon-img-wrap">
                                    <div class="testimon-img"><img src="static/assets/images/team_3.jpg" alt="Profile Image"></div>
                                    <div class="testimon-name">Ricost</div>
                                    <div class="testimon-tag">ricost.com</div>
                                </div>
                            </div>
                        </div>
                        <div class="slider-item">
                            <div class="testimonial-wrap mx-auto">
                                <div class="testimon-detail">
                                    <div class="testimon-icon"><i class="ion ion-quote"></i></div>
                                    <strong>信息安全</strong>
                                    <p>加密算法，使得你的个人信息更加安全</p>
                                </div>
                                <div class="testimon-img-wrap">
                                    <div class="testimon-img"><img src="static/assets/images/team_2.jpg" alt="Profile Image"></div>
                                    <div class="testimon-name">Select</div>
                                    <div class="testimon-tag">Select.com</div>
                                </div>
                            </div>
                        </div>
                        <div class="slider-item">
                            <div class="testimonial-wrap mx-auto">
                                <div class="testimon-detail">
                                    <div class="testimon-icon"><i class="ion ion-quote"></i></div>
                                    <strong>既时创建</strong>
                                    <p>可以随时创建想要使用的集体和任务，方便作业的收集上传</p>
                                </div>
                                <div class="testimon-img-wrap">
                                    <div class="testimon-img"><img src="static/assets/images/team_1.jpg" alt="Profile Image"></div>
                                    <div class="testimon-name">Rob Vens</div>
                                    <div class="testimon-tag">Reflektis.com</div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </section>

    <jsp:include page="../includes/footer.jsp"/>

    <jsp:include page="../includes/copyright.jsp"/>
</body>
</html>
