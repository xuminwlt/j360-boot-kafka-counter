J360-boot-kafka 系统counter计数方案

## 计数系统数据流

1. 写计数
```
|app| -> |log| -> |td/flume| -> |kafka/rocketmq| -> |redis/mongo|

```

2. 读计数
|app| <- |redis| <- |mongo|


## 计数系统数据定义




## 计数接口



