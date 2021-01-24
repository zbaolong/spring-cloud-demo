# spring-cloud-demo
# @Time : 2021.1.24
# @Author : zhangbaolong
# @Email : 292022420@qq.com
# @Project : springcloud_demo
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
导入运行！

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
