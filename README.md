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
挨个导入项目运行！

项目测试：
1. http://localhost:8888 是注册中心地址
https://image.baidu.com/search/detail?ct=503316480&z=undefined&tn=baiduimagedetail&ipn=d&word=eureka%E9%A6%96%E9%A1%B5&step_word=&ie=utf-8&in=&cl=2&lm=-1&st=undefined&hd=undefined&latest=undefined&copyright=undefined&cs=4265758912,2221725898&os=1843439516,1820939280&simid=3175381038,3891753844&pn=0&rn=1&di=148390&ln=1340&fr=&fmq=1611466657918_R&fm=&ic=undefined&s=undefined&se=&sme=&tab=0&width=undefined&height=undefined&face=undefined&is=0,0&istype=0&ist=&jit=&bdtype=0&spn=0&pi=0&gsm=0&objurl=https%3A%2F%2Fgimg2.baidu.com%2Fimage_search%2Fsrc%3Dhttp%253A%252F%252Fimage.mamicode.com%252Finfo%252F201807%252F20180717152346938372.png%26refer%3Dhttp%253A%252F%252Fimage.mamicode.com%26app%3D2002%26size%3Df9999%2C10000%26q%3Da80%26n%3D0%26g%3D0n%26fmt%3Djpeg%3Fsec%3D1614058658%26t%3D4e866a642659a9d93ff15d827aedfaad&rpstart=0&rpnum=0&adpicid=0&force=undefined

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
