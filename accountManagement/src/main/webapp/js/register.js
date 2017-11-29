$(document).ready(function(){
    $('#register').click(function () {
      var account = $('#account').val();
      var password=$('#password').val();
      var passwordConfirm=$('#passwordConfirm').val();
      if(password === passwordConfirm){
      var email=$('#email').val();
      $('#form_register').attr('action', 'addUser');  
      $( '#form_register').submit();
      	
      }else{
		alert("密码不一致，请重新输入！！！")      	
      }
    });
});