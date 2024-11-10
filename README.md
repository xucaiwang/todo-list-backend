# Todo List 项目

## 项目介绍

这是一个简单的TodoList应用程序，旨在帮助用户管理和跟踪他们的待办事项。该项目使用了springboot来构建后端。
用户可以通过该应用程序添加、删除和标记待办事项为已完成.

## 项目结构

- README.md：本项目的说明文件
- application.properties：项目配置文件
- src/：源代码目录。
   - TodoController.java：待办事项管理控制层
   - TodoService.java：待办事项管理服务层
   - TodoService.java：待办事项管理服务层
   - TodoRepository.java：待办事项管理数据操作层
   - Todo.java：待办事项实体类
   - TodolistApplication.java：应用程序主入口

## 依赖项
要运行此项目，你需要安装以下依赖项：
- JDK17
- Git
- Docker

## 如何运行

1. 克隆项目仓库到本地:
    ```bash
    git clone git@github.com:xucaiwang/todo-list-backend.git
    cd todo-list-backend
    ```

2. 构建Docker镜像和启动容器:
    ```bash
    docker build -t todo-list-backend:latest .
    docker run -d -p 8080:8080 --name todo-list-backend-container todo-list-backend:latest
    ```