$(document).ready(function() {
	$('#saveData').click(function() {
		alert('#saveData')
		// var menuId = $( "ul.nav" ).first().attr( "id" );
		var clothes = $("#clothes").val();
		var eat = $("#eat").val();
		var traffic = $("#traffic").val();
		var propertyCosts = $("#propertyCosts").val();
		var waterSoOn = $("#waterSoOn").val();
		var outEat = $("#outEat").val();
		var drug = $("#drug").val();
		var book = $("#book").val();
		var sick = $("#sick").val();
		var other = $("#other").val();
		$.ajax({
					type : "POST",
					//contentType : "application/json;charset=utf-8",
					url : "/saveData",
					//data : JSON.stringify(search),
					 data : {
					 clothes : clothes,
					 eat : eat,
					 traffic : traffic,
					 propertyCosts : propertyCosts,
					 waterSoOn : waterSoOn,
					 outEat : outEat,
					 drug : drug,
					 book : book,
					 sick : sick,
					 other : other
					 },
					//dataType : 'json',
					//cache : false,
					//timeout : 600000,
					success : function(data) {
debugger;
						var json = "<h4>Ajax Response</h4><pre>"
								+ JSON.stringify(data, null, 4) + "</pre>";
						$('#msg').html(json);

						//console.log("SUCCESS : ", data);
						//$("#btn-search").prop("disabled", false);

					},
					error : function(e) {
debugger;
						var json = "<h4>Ajax Response</h4><pre>"
								+ e.responseText + "</pre>";
						$('#msg').html(json);

//						console.log("ERROR : ", e);
//						$("#btn-search").prop("disabled", false);

					}
				});

			// var request = $.ajax({
			// url : "saveData",
			// contentType: "application/json",
			// method : "POST",
			// data : {
			// clothes : clothes,
			// eat : eat,
			// traffic : traffic,
			// propertyCosts : propertyCosts,
			// waterSoOn : waterSoOn,
			// outEat : outEat,
			// drug : drug,
			// book : book,
			// sick : sick,
			// other : other
			// },
			// dataType : "json"
			// });
			//
			// request.done(function(msg) {
			// alert("11111111111:"+msg);
			// //$("#msg").html(msg);
			// });
			//
			// request.fail(function(jqXHR, textStatus) {
			// //alert("Request failed: " + textStatus);
			//							alert("22222222222:"+textStatus);
			//								});

	});
});