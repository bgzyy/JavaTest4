#!/bin/bash

# 用户登录
curl -XPOST http://localhost:18080/user/login?userName=RENE&password=MCALISTER

touch temp

# 添加用户，返回自增 id
curl -XPOST http://localhost:18080/user/add?userName=6899\&password=893489\&email=123 > temp

result=`awk '{print $1}' temp`

# 根据返回 id 更新用户信息
curl -XPUT http://localhost:18080/user/update/${result}

# 根据返回 id 删除新增用户
curl -XDELETE localhost:18080/user/delete/${result}

# 查询film 分页信息
localhost:18080/film/list?page=1&pageSize=12&sort=ASC