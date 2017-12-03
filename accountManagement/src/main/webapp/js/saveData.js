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
						var request = $.ajax({
									url : "saveData",
									method : "POST",
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
									dataType : "json"
								});

						request.done(function(msg) {
									$("#msg").html(msg);
								});

						request.fail(function(jqXHR, textStatus) {
									alert("Request failed: " + textStatus);
								});

					});
		});