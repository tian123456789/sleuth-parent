http://localhost:9411     ->zipkin-server# sleuth-parent

rabbitMQ安装常用命令:https://www.cnblogs.com/ericli-ericli/p/5902270.html
	我的用户密码	root root
	port:	5672
	管理界面	:http://localhost:15672/
	重启命令:
		window:	net stop RabbitMQ && net start RabbitMQ

c.r.c.impl.ForgivingExceptionHandler    [0;39m [2m:[0;39m An unexpected connection driver error occured
java.net.SocketException: socket closed
设置root用户远程登录权限	
D:\javaTool\rabbitmq\rabbitmq_server-3.7.9\sbin> rabbitmqctl set_permissions -p / root .* .* .*
