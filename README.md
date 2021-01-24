# spring-cloud-demo
# Author : zhangbaolong
# Email : 292022420@qq.com
# Project : springcloud_demo

项目介绍：

config-center   配置中心git本地配置文件 

springcloud-config-server 配置中心服务

springcloud-eureka-server 注册中心服务

springcloud-eureka-server-zuul 网关服务

springcloud-service-consumer 消费者服务resttemplate方式的服务

springcloud-service-feign 消费者-feign方式的服务

springcloud-service-provider01 提供者服务1

springcloud-service-provider02 提供者服务2


使用：
IntelliJ IDEA 2020.3.1
挨个导入项目运行！

项目测试：
1. http://localhost:8888 是注册中心地址

2. http://localhost:7777/web/hello 消费者调用提供者数据测试
返回：hello, spring cloud,我是服务提供者2！！！

3. http://localhost:9999/api-h3c/web/hello 用zuul网关来访问提供者数据
返回：hello, spring cloud,我是服务提供者2！！！

本地上传到git：

git init

git add README.md

git commit -m "first commit"

git remote add origin https://github.com/zbaolong/spring-cloud-demo.git

git push -u origin master

error: failed to push some refs to 'https://github.com/zbaolong/spring-cloud-demo.git'

hint: Updates were rejected because the remote contains work that you do
hint: not have locally. This is usually caused by another repository pushing
hint: to the same ref. You may want to first integrate the remote changes
hint: (e.g., 'git pull ...') before pushing again.
hint: See the 'Note about fast-forwards' in 'git push --help' for details.
出现错误的主要原因是github中的README.md文件不在本地代码目录中,
命令行中输入:

git pull--rebase origin master

git push -u origin master
