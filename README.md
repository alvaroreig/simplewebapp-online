# Simple Web App - ONLINE

## Context

Simple web app with springboot and Mysql. It has only one controller and two posible actions: list every user and add a new user.

It was coded to be used in technical inteviews. It is not intended to be used in production.

## Create database



```sh
create database db_example;
create user 'springuser'@'%' identified by 'ThePassword';
grant all on db_example.* to 'springuser'@'%';
```