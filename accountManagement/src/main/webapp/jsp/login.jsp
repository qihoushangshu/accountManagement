<!DOCTYPE html>
<html lang="zh-CN">
  <head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="bootstrap-3.3.7/docs/favicon.ico">
    <title>登录页面</title>
    <link href="bootstrap-3.3.7/dist/css/bootstrap.min.css" rel="stylesheet">
    <link href="bootstrap-3.3.7/docs/assets/css/ie10-viewport-bug-workaround.css" rel="stylesheet">
    <link href="bootstrap-3.3.7/dist/css/signin.css" rel="stylesheet">
    <script src="bootstrap-3.3.7/docs/assets/js/ie-emulation-modes-warning.js"></script>
  </head>
  <body>
    <script src="bootstrap-3.3.7/dist/js/jquery-1.8.0.min.js"></script>
    <script src="bootstrap-3.3.7/dist/js/bootstrap.min.js"></script>
     <div class="container">
      <form class="form-signin">
        <h3 class="form-signin-heading">登录&nbsp;<a href="register" >注册一个账号</a></h3>
        <label for="inputEmail" class="sr-only">账 号</label>
        <input type="email" id="inputEmail" class="form-control" placeholder="账 号" required autofocus><br>
        <label for="inputPassword" class="sr-only">密 码</label>
        <input type="password" id="inputPassword" class="form-control" placeholder="密 码" required>
        <div class="checkbox">
          <label>
            <input type="checkbox" value="remember-me"> 记住我
          </label>
        </div>
        <button class="btn btn-lg btn-primary btn-block" type="submit">登 录</button>
      </form>
    </div> <!-- /container -->
    <script src="bootstrap-3.3.7/docs/assets/js/ie10-viewport-bug-workaround.js"></script>
  </body>
</html>