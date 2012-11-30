$().ready(function() {
	var startBtn = $("#start");
	startBtn.hover(function() {
		startBtn.addClass("btn-hover");
	}, function() {
		startBtn.removeClass("btn-hover");
	});

	var list = init();

	
	var timer;

	startBtn.toggle(startLoop, stopLoop);
});

var ANIMI_LENGTH = 300;
var SLOW_ANIMI_LENGTH = 1000;

function init() {
	var array = new Array();
	array = [ "image/badge/Alice-01.png", "image/badge/ART-01.png",
			"image/badge/BYF-01.png", "image/badge/Candy-01.png",
			"image/badge/Eric-01.png", "image/badge/Figo-01.png",
			"image/badge/Grace-01.png", "image/badge/Jasmin-01.png",
			"image/badge/Jenny-01.png", "image/badge/Jerin-01.png",
			"image/badge/JOJO-01.png", "image/badge/LISA-01.png",
			"image/badge/L大人-01.png", "image/badge/Mason-01.png",
			"image/badge/NIKA-01.png", "image/badge/Q大人-01.png",
			"image/badge/Sabrina-01.png", "image/badge/Thomas-01.png",
			"image/badge/Tina-01.png", "image/badge/TOTO-01.png",
			"image/badge/丁丁-01-01.png", "image/badge/任思捷-01.png",
			"image/badge/佳佳-01.png", "image/badge/冬冬-01.png",
			"image/badge/刷哥-01.png", "image/badge/卡卡-01.png",
			"image/badge/周亮-01.png", "image/badge/唐-01.png",
			"image/badge/囡囡-01.png", "image/badge/大嫂-01.png",
			"image/badge/天哥-01.png", "image/badge/奥特曼-01.png",
			"image/badge/娥-01.png", "image/badge/婷-01.png",
			"image/badge/寒露-01.png", "image/badge/小S-01.png",
			"image/badge/小丁姐姐-01.png", "image/badge/小孩-01.png",
			"image/badge/小明哥-01.png", "image/badge/小林子-01.png",
			"image/badge/小歇-01.png", "image/badge/小派-01.png",
			"image/badge/小玥-01.png", "image/badge/小翠-01.png",
			"image/badge/小雁-01.png", "image/badge/尹宇飞-01.png",
			"image/badge/岛主-01.png", "image/badge/帅帅的鱼-01.png",
			"image/badge/应晓晨-01.png", "image/badge/康康-01.png",
			"image/badge/张运-01.png", "image/badge/文武贝-01.png",
			"image/badge/易水-01.png", "image/badge/李一-01.png",
			"image/badge/栋哥-01.png", "image/badge/殷老师-01.png",
			"image/badge/爱得蒙-01.png", "image/badge/猫猫-01.png",
			"image/badge/王总-01.png", "image/badge/琼-01.png",
			"image/badge/生煎-01.png", "image/badge/盖达-01.png",
			"image/badge/石头-01.png", "image/badge/老大-01.png",
			"image/badge/老太-01.png", "image/badge/老衲-01.png",
			"image/badge/胡骏-01.png", "image/badge/花-01.png",
			"image/badge/芸小默-01.png", "image/badge/苍穹-01.png",
			"image/badge/苏苏-01.png", "image/badge/苗苗-01.png",
			"image/badge/财长-01.png", "image/badge/路易斯-01.png",
			"image/badge/阳婴-01.png", "image/badge/阿汤哥-01.png",
			"image/badge/陆狗-01.png" ];
	return array;
};

function onStepFinished() {
	var items = $(".photo-item");
	var bottomItem = items.last();
	bottomItem.remove();
	$("#image-bar").css("bottom", "0px");
	bottomItem.prependTo($("#image-bar"));
};

function startLoop() {
	timer = setInterval("moveOneStep()", ANIMI_LENGTH);

};

function moveOneStep() {
	var itemHeight = $(".photo-item").css("height");
	$("#image-bar").animate({
		"bottom" : "-" + itemHeight
	}, ANIMI_LENGTH, "linear", onStepFinished);
};

function moveOneStepSlow(timeLength) {
	var itemHeight = $(".photo-item").css("height");
	$("#image-bar").animate({
		"bottom" : "-" + itemHeight
	}, timeLength, "linear", onStepFinished);
};

function stopLoop() {
	clearInterval(timer);
	for ( var i = 0; i < 3; i++) {
		moveOneStepSlow(SLOW_ANIMI_LENGTH + i * 500);
	}
	;
};
