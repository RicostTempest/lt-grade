<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html lang="en">
<head>

    <!-- Custom Styles -->
    <link rel="stylesheet" type="text/css" href="/static/assets/css/usercommit.css">
    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">

    <title>注册 - 风叶</title>

</head>
<body>

<!-- Backgrounds -->

<div id="login-bg" class="container-fluid">

    <div class="bg-forgot"></div>
    <div class="bg-color"></div>
</div>

<!-- End Backgrounds -->

<div class="container" id="login">
    <div class="row justify-content-center">
        <div class="col-lg-8">
            <div class="login">

                <h1>忘记密码</h1>

                <!-- Loging form -->
                <form>
                    <div class="form-group">
                        <input type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="输入邮箱">
                    </div>

                    <br>
                    <br>
                    <button type="submit" class="btn btn-lg btn-block btn-success">验证信息</button>
                </form>
                <!-- End Loging form -->

                <hr>
                <div class="text-center">
                    <a class="small" href="/login">以及拥有帐号？立即登录</a>
                </div>
                <div class="text-center">
                    <a class="small" href="/register">没有账号？注册一个</a>
                </div>

            </div>More Templates
        </div>
    </div>
</div>


</body>
</html>
