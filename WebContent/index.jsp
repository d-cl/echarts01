<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<script type="text/javascript" src="js/echarts.min.js"></script>
<script type="text/javascript" src="js/jquery-1.11.3.min.js"></script>
	<div id='d1' style="width:600px;height:400px"></div>
</body>
<script type="text/javascript">
	var mycharts = echarts.init(document.getElementById('d1'));
	//配置图表的数据项
	var option = {
		title : {
			text : 'ECharts柱状图：新闻数据访问量'
		},
		//提示信息
		tooltip : {
			trigger : 'axis', //显示该列下所有坐标轴所对应的数据
			axisPointer : { // 坐标轴指示器，坐标轴触发有效
				//鼠标滑过显示效果 'line'直线 | 'shadow'阴影(默认)
				type : 'line'
			}
		},
		//X轴数据
		xAxis : {
			data : [  ]
		},
		//Y轴数据
		yAxis : {
	
		},
		//系列列表
		series : [ {
			name : '访问量',//鼠标滑过数字前面的内容，“访问量：450”
			type : 'line',//统计图类型（柱状图、饼状图、折线图）
			//样式定制，可以自定义字体颜色，大小等属性，本例中使用默认样式
			label : {    
				normal : {
					show : true
				}
			},
			data : [  ] //每一列的数据
		} ]
	}
	
	mycharts.setOption(option);
	mycharts.showLoading();
	var x=[];
	var y=[];
	 /* $.ajax({
		type:'post',
		url:'aa',
		dataType:'json',
		success:function(data){
			for(var i = 0 ; i < data.length ; i++){
				x.push(data[i].name);
				y.push(data[i].count);
			}
			
			//停止动画
			mycharts.hideLoading();
			mycharts.setOption({
				xAxis : {
					data : x
				},
				series : [ {
					name : '数量',//鼠标滑过数字前面的内容，“数量：450”
					type : 'bar',//统计图类型（柱状图、饼状图、折线图）
					//样式定制，可以自定义字体颜色，大小等属性，本例中使用默认样式
					label : {    
						normal : {
							show : true
						}
					},
					data : y //每一列的数据
				} ]
			});
			
		},
		error:function(){
			alert('柱状图加载失败')
		}
	});  */
	
	  $.post(
		"aa",
		{},
		function(msg){
			console.log(msg);
			 for(var i=0;i<msg.length;i++){
				x.push(msg[i].name);
				y.push(msg[i].count);
			}
			mycharts.hideLoading();
			mycharts.setOption({
				xAxis : {
					data : x
				},
				series : [ {
					name : '数量',//鼠标滑过数字前面的内容，“数量：450”
					type : 'line',//统 ;计图类型（柱状图、饼状图、折线图）
					step:'start',
					//样式定制，可以自定义字体颜色，大小等属性，本例中使用默认样式
					label : {   
						normal : {
							show : true
						}
					},
					data : y //每一列的数据
				} ]
			}); 
		},
		"json"
	);  
</script>
</html>