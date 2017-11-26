$(document).ready(function(){
    $('#login').click(function () {
    	alert(123);
      var account = $('#account').val();
      var password=$('#password').val();
      $('#form_login').attr('action', 'getUser');  
      $( '#form_login').submit();
    });
});