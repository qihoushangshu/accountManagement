$('#ulmenu > li').click(function(e){
	var element = $(this);
	var child = element.children();
	var showid = element.attr("id")
	if("selectid" === showid){
		$("#select").css("display","block");
		$("#save").css("display","none");
	}else if("saveid" === showid){
		$("#save").css("display","block");
		$("#select").css("display","none");
	}
	element.addClass("active").siblings().removeClass("active");
});
