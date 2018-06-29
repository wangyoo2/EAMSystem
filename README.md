# 简介
这是一个简单的教务系统，用于完成课设任务。

# 使用技术
# 使用技术
IOC容器：Spring

Web框架：SpringMVC

ORM框架：Mybatis

安全框架：Shiro

数据源：C3P0

日志：log4j

前端框架：Bootstrap

### 1、运行环境和所需工具
* 编译器：IntelliJ IDEA
* 项目构建工具：Maven
* 数据库：Mysql
* JDK版本：jdk1.8
* Tomcat版本：Tomcat8.x
### 2、初始化项目
* 在你的Mysql中，创建一个数据库名称为 EAMSystem 的数据库，并导入项目中提供的 .sql 文件,
* 进入src/main/resources修改mysql.properties配置文件,把数据库登录名和密码，改为你本地的
* 使用 IntelliJ IDEA 导入项目，选择Maven项目选项，一路点击next就行，导入项目后，如果src目录等，都没显示出来，别急先使用Maven构建该项目
* 在 IntelliJ IDEA 中，配置我们的 Tomcat， 然后把使用Maven构建好的项目添加到Tomcat中
* 运行

* 登录账户
  * 管理员账户：admin
  * 密码均为：123