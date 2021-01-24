# spring-cloud-demo
# @Time : 2021.1.24
# @Author : zhangbaolong
# @Email : 292022420@qq.com
# @Project : springcloud_demo

使用：
IntelliJ IDEA 2020.3.1
导入运行！

echo  "# text" >>README.md
git init
git add README.md
git commit -m "first commit"
git remote add origin https://github.com/CrazyDony/text.git
git push -u origin master

error: failed to push some refs to 'https://github.com/CrazyDony/text.git'

hint: Updates were rejected because the remote contains work that you do
hint: not have locally. This is usually caused by another repository pushing
hint: to the same ref. You may want to first integrate the remote changes
hint: (e.g., 'git pull ...') before pushing again.
hint: See the 'Note about fast-forwards' in 'git push --help' for details.
出现错误的主要原因是github中的README.md文件不在本地代码目录中,
命令行中输入:

git pull--rebase origin master

git push -u origin master
