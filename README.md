# Todo List Project

## Overview

This is a simple Todo List project with a backend built using Spring Boot. The project is designed to be run in a Docker environment.

## Prerequisites

- Java
- Git
- Docker

## Running the Project

1. Clone the repository:
    ```bash
    git clone https://github.com/xucaiwang/todo-list-backend.git
    cd todo-list-backend
    ```

2. Build and run the Docker containers:
    ```bash
    docker build -t todo-list-backend:latest .
    docker run -d -p 8080:8080 --name todo-list-backend-container todo-list-backend:latest
    ```