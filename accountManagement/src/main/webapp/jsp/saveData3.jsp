
<form action="" method="post" class="form-horizontal" style="margin-top:5px;">
                    <input type="hidden" name="method" value="regist">
                    <div class="form-group">
                        <label for="username" class="col-sm-2 control-label">用户名</label>
                        <div class="col-sm-6">
                            <input type="text" class="form-control" id="username" name="username" placeholder="请输入用户名">
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="inputPassword3" class="col-sm-2 control-label">密码</label>
                        <div class="col-sm-6">
                            <input type="password" class="form-control" id="inputPassword3" name="password" placeholder="请输入密码">
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="confirmpwd" class="col-sm-2 control-label">确认密码</label>
                        <div class="col-sm-6">
                            <input type="password" class="form-control" id="confirmpwd" name="repassword" placeholder="请输入确认密码">
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="inputEmail3" class="col-sm-2 control-label">Email</label>
                        <div class="col-sm-6">
                            <input type="email" class="form-control" id="inputEmail3" name="email" placeholder="Email">
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="usercaption" class="col-sm-2 control-label">姓名</label>
                        <div class="col-sm-6">
                            <input type="text" class="form-control" id="usercaption" name="name" placeholder="请输入姓名">
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="telephone" class="col-sm-2 control-label">电话</label>
                        <div class="col-sm-6">
                            <input type="text" class="form-control" id="telephone" name="telephone" placeholder="请输入电话">
                        </div>
                    </div>
                    <div class="form-group opt">
                        <label for="inlineRadio1" class="col-sm-2 control-label">性别</label>
                        <div class="col-sm-6">
                            <label class="radio-inline">
                                <input type="radio" name="sex" id="inlineRadio1" value="男"> 男
                            </label>
                            <label class="radio-inline">
                                <input type="radio" name="sex" id="inlineRadio2" value="女"> 女
                            </label>
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="date" class="col-sm-2 control-label">出生日期</label>
                        <div class="col-sm-6">
                            <input type="text" name="birthday" class="form-control">
                        </div>
                    </div>

                    <div class="form-group">
                        <label for="date" class="col-sm-2 control-label">验证码</label>
                        <div class="col-sm-3">
                            <input type="text" class="form-control">

                        </div>
                        <div class="col-sm-2">
                            <img src="bootstrap/images/captcha.jhtml"/>
                        </div>

                    </div>
                    </div>
                </form>