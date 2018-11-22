J360-boot-kafka 系统counter计数方案, 可定制计数器, (PV、赞数、评论数、发帖数等)

## 计数系统数据流

1. 写计数

A:
```
|app| -> |log| -> |td/flume| -> |kafka/rocketmq| -> |redis/mongo|

```

B:
```
|app| -> |kafka/rocketmq| -> |redis/mongo|

```

2. 读计数

```
|app| <- |redis| <- |mongo|
```

## 计数系统数据定义




## 计数接口



## UV接口(接入Spark)

