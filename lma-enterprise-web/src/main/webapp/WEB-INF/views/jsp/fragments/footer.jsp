<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<hr />
<footer class="container-fluid footer">
	Copyright &copy; 2014 <a href="http://freakpixels.com/" target="_blank">FreakPixels</a>
	<a href="#" class="pull-right scrollToTop"><i
		class="fa fa-chevron-up"></i></a>
</footer>

<spring:url value="/resources/js/jquery/jquery-1.9.1.min.js"
	var="jquery-1.9.1.min" />
<script src="${jquery-1.9.1.min}" type="text/javascript"></script>

<spring:url value="/resources/js/plugins/underscore/underscore-min.js"
	var="underscore-min.js" />
<script src="${underscore-min.js}"></script>

<!-- Bootstrap -->
<spring:url value="/resources/js/bootstrap.min.js" var="bootstrapJs" />
<script src="${bootstrapJs}"></script>

<!-- Globalize -->
<spring:url value="/resources/js/globalize/globalize.min.js"
	var="globalizeJs" />
<script src="${globalizeJs}"></script>

<!-- NanoScroll -->
<spring:url
	value="/resources/js/plugins/nicescroll/jquery.nicescroll.min.js"
	var="nanoScrollJs" />
<script src="${nanoScrollJs}"></script>

<!-- Chart JS -->
<spring:url
	value="/resources/js/plugins/DevExpressChartJS/dx.chartjs.js"
	var="chartsJs" />
<spring:url value="/resources/js/plugins/DevExpressChartJS/world.js"
	var="worldJs" />
<script src="${chartJs}"></script>
<script src="${worldJs}"></script>

<!-- For Demo Charts -->
<spring:url
	value="/resources/js/plugins/DevExpressChartJS/demo-charts.js"
	var="demoChartsJs" />
<spring:url
	value="/resources/js/plugins/DevExpressChartJS/demo-vectorMap.js"
	var="vectorMapJs" />
<script src="${demoChartsJs}"></script>
<script src="${vectorMapJs}"></script>

<!-- Sparkline JS -->
<spring:url
	value="/resources/js/plugins/sparkline/jquery.sparkline.min.js"
	var="sparklineJs" />
<script src="${sparklineJs}"></script>

<!-- For Demo Sparkline -->
<spring:url
	value="/resources/js/plugins/sparkline/jquery.sparkline.demo.js"
	var="demoSparklineJs" />
<script src="${demoSparklineJs}"></script>

<!-- Angular JS -->
<script
	src="https://ajax.googleapis.com/ajax/libs/angularjs/1.3.0-beta.14/angular.min.js"></script>
<!-- ToDo List Plugin -->
<spring:url value="/resources/js/angular/todo.js" var="todoJs" />
<script src="${todoJs}"></script>


<!-- Calendar JS -->
<spring:url value="/resources/js/plugins/calendar/calendar.js"
	var="calendarJs" />
<script src="${calendarJs}"></script>
<!-- Calendar Conf -->
<spring:url value="/resources/js/plugins/calendar/calendar-conf.js"
	var="calendarConfJs" />
<script src="${calendarConfJs}"></script>

<!-- Custom JQuery -->
<spring:url value="/resources/js/app/custom.js" var="customJqueryJs" />
<script src="${customJqueryJs}" type="text/javascript"></script>