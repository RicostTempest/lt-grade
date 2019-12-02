<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html lang="en">
<head>

    <!-- Custom Styles -->
    <link rel="stylesheet" type="text/css" href="/static/assets/css/usercommit.css">
    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">

    <title>登录 - 风叶</title>

</head>
<body>

<!-- Backgrounds -->

<div id="login-bg" class="container-fluid">

    <div class="bg-login"></div>
    <div class="bg-color"></div>
</div>

<!-- End Backgrounds -->

<div class="container" id="login">
    <div class="row justify-content-center">
        <div class="col-lg-8">
            <div class="login">

                <h1>Login</h1>

                <!-- Loging form -->
                <form>
                    <div class="form-group">
                        <input type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter email">

                    </div>
                    <div class="form-group">
                        <input type="password" class="form-control" id="exampleInputPassword1" placeholder="Password">
                    </div>

                    <div class="form-check">

                        <label class="switch">
                            <input type="checkbox">
                            <span class="slider round"></span>
                        </label>
                        <label class="form-check-label">Remember me</label>

                        <label class="forgot-password"><a href="#">Forgot Password?</a></label>

                    </div>

                    <br>
                    <button type="submit" class="btn btn-lg btn-block btn-success">Sign in</button>
                </form>
                <!-- End Loging form -->
                <hr>
                <div class="text-center">
                    <a class="small" href="#">没有账号？注册</a>
                </div>
            </div>More Templates
        </div>
    </div>
</div>


</body>
</html>
