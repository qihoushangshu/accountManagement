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
    <script src="bootstrap-3.3.7/dist/js/jquery-3.2.1.js"></script>
    <script src="bootstrap-3.3.7/dist/js/bootstrap.min.js"></script>
     <div class="container">
      <form class="form-register" role="form">
        <h3 class="form-register-heading">注  册</h3>
        
        <div class="location">
	        <div class="form-group">
		        <div class="textdiv">
			        <label for="name">账 号</label>
			        <input type="text"  id="name"  class="form-control"  placeholder="请输入账号" required autofocus><br>
		        </div>
	        </div>
	        <div class="form-group">
		        <div class="textdiv">
			        <label for="password">密 码</label>
			        <input type="password"  id="password" class="form-control" placeholder="请输入密码" required>
		        </div>
	        </div>
	        <div class="form-group">
		        <div class="textdiv">
			        <label for="password">密 码确认</label>
			        <input type="password"  id="passwordConfirm" class="form-control" placeholder="请输入再输入一遍密码" required>
		        </div>
	        </div>
	        <div class="form-group">
		        <div class="textdiv">
			        <label for="email">邮 箱</label>
			        <input type="email"  id="email" class="form-control" placeholder="请输入邮箱" required>
		        </div>
	        </div>
        </div>
        <button class="btn btn-lg btn-primary btn-block" type="submit">注&nbsp;&nbsp;册</button>
        </form>
        </div>
         
      
   <!-- /container -->
  </body>
</html>