## 编译构建项目

1. 步骤
   - `git clone https://github.com/bgzyy/JavaTest4.git`	           # 克隆项目到本地
   - `./build.sh`                                                                             # 编译项目以及 Docker 镜像
   - `./start.sh`                                                                             # 执行 docker-compose 启动镜像
2. 发送请求
   - 等待 SpringBoot 项目完全启动之后执行 `./curl.sh`
3. 结束请求
   - 等待 `curl.sh` 脚本执行完毕，执行 `./stop.sh` 查看 SpringBoot 项目日志，以及停止容器