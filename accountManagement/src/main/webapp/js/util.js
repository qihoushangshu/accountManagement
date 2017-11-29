$('#ulmenu > li').click(function(e){
	var element = $(this);
	var child = element.children();
//	child.html(" <span class=\"sr-only\">(current)</span>")
//	child.siblings().
	element.addClass("active").siblings().removeClass("active");
});
