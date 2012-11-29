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

var FILE_PATTERN = "image/pic($).jpg";
var TOTAL_PERSON = 3;
var ANIMI_LENGTH = 300;
var SLOW_ANIMI_LENGTH = 1000;

function init() {
	var array = new Array();
	for (var i = 0; i < TOTAL_PERSON; i++) {
		var filePath = FILE_PATTERN.replace("$", i);
		array[i] = filePath;
	};
	return array;
};

function onStepFinished() {
	var items = $(".photo-item");
	var bottomItem = items.last();
	bottomItem.remove();
	$("#image-bar").css("bottom", "0px");	bottomItem.prependTo($("#image-bar"));
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
	for (var i = 0; i < 3; i++) {
		moveOneStepSlow(SLOW_ANIMI_LENGTH + i * 500);
	};
};
