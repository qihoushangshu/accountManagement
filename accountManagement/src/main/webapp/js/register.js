$(document).ready(function(){
    $('#register').click(function () {
      var account = $('#account').val();
      var password=$('#password').val();
      var passwordConfirm=$('#passwordConfirm').val();
      var email=$('#email').val();
      $('#form_register').attr('action', 'addUser');  
      $( '#form_register').submit();
    });
});