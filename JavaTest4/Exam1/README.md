## Exam1

1. 本项目是一个基于 SpringBoot + MyBatis + SpringMVC 的项目
2. 拉入项目到本地之后，将 `JavaTest4\docker\mysql` 下的脚本导入本地数据库
3. 编辑 `JavaTest4\Exam1\src\main\resources\application.yml`  配置文件，修改数据库连接信息
4. 将该项目导入本地 IDE ，执行 `com.hand.exam.Exam4Application` SpringBoot 主程序，等待项目启动
5. 项目启动完毕之后，使用 PostMan 发送请求或者使用 curl 命令发送请求
   - `http://localhost:18080/user/add?userName=smzyy&password=123456&email=sm@123.com` - POST
     - 发送一个添加用户的请求
   - `http://localhost:18080/user/login?userName=RENE&password=MCALISTER` - GET
     - 发送一个登陆的请求
   - `http://localhost:18080/user/update/{id}` - PUT
     - 发送一个根据 id 更新用户信息的请求
   - `localhost:18080/user/delete/7012` - DELETE
     - 发送一个根据 id 删除用户的请求
   - `localhost:18080/film/list?page=1&pageSize=12&sort=ASC` - GET
     - 发送一个根据请求信息进行分页的请求