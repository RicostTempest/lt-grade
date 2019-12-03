<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html lang="en">
<head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">

    <!-- Loding font -->
    <link href="https://fonts.googleapis.com/css?family=Montserrat:300,700" rel="stylesheet">

    <!-- Custom Styles -->
    <link rel="stylesheet" type="text/css" href="/static/assets/css/usercommit.css">
    <title>注册 - 风叶</title>
</head>
<body>

<!-- Backgrounds -->

<div id="login-bg" class="container-fluid">

    <div class="bg-register"></div>
    <div class="bg-color"></div>
</div>

<!-- End Backgrounds -->

<div class="container" id="login">
    <div class="row justify-content-center">
        <div class="col-lg-8">
            <div class="login">

                <h1>Register</h1>

                <!-- register form -->
                <form action="/register" method="post">
                    <div class="form-group">
                        <input type="email" class="form-control" id="exampleInputEmail1" name="email" aria-describedby="emailHelp" placeholder="Enter email">
                    </div>
                    <div class="form-row">
                        <div class="form-group col-md-6">
                            <input type="password" class="form-control" id="inputPassword" name="password" placeholder="Password">
                        </div>
                        <div class="form-group col-md-6">
                            <input type="password" class="form-control" id="inputPassword2" name="rePassword" placeholder="Repate Password">
                        </div>
                    </div>

                    <br>

                    <button type="submit" class="btn btn-lg btn-block btn-success">Sign up</button>
                </form>
                <!-- End register form -->
                <hr>
                <div class="text-center">
                    <a class="small" href="/login">Already have an account? Login!</a>
                </div>

            </div>More Templates
        </div>
    </div>
</div>


</body>
</html>
