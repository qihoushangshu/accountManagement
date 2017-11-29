<!DOCTYPE html>
<html lang="zh-CN">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Bootstrap 101 Template</title>
    <!-- Bootstrap -->
    <link href="bootstrap-3.3.7/dist/css/bootstrap.min.css" rel="stylesheet">
	<link href="bootstrap-3.3.7/dist/css/register.css" rel="stylesheet">
  </head>
  <body>
    <script src="bootstrap-3.3.7/dist/js/jquery-3.1.1.min.js"></script>
    <script src="bootstrap-3.3.7/dist/js/bootstrap.min.js"></script>
    <script src="js/register.js"></script>
     <div class="container">
  <form class="form-register" id="form_register" method="post">
        <h3 class="form-register-heading">注  册</h3>
        <div class="form-group">
        <label for="account" class="sr-only">账 号</label>
        <input type="text" id="account" name="account" class="form-control" placeholder="账   号" required autofocus>
        </div>
        <div class="form-group">
        <label for="password" class="sr-only">密 码</label>
        <input type="password" id="password" name="password" class="form-control" placeholder="密   码" required>
        </div>
        <div class="form-group">
        <label for="password" class="sr-only">密 码确认</label>
        <input type="password" id="passwordConfirm" name="passwordConfirm" class="form-control" placeholder="密码确认" required>
        </div>
        <div class="form-group">
        <label for="mail" class="sr-only">邮  箱</label>
        <input type="text" id="email" name="email" class="form-control" placeholder="邮  箱" required>
        </div>
        <button class="btn btn-lg btn-primary btn-block" id="register" type="submit">注  册</button>
      </form>
      
        </div>
         
      
   <!-- /container -->
  </body>
</html>