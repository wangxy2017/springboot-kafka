## kafka 常用操作

启动 zookeeper:
nohup bin/zookeeper-server-start.sh config/zookeeper.properties >> zookeeper.log &

启动 kafka：
nohup bin/kafka-server-start.sh config/server.properties >> kafka.log &


创建topic:
bin/kafka-topics.sh --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --topic test

查看创建的topic:
bin/kafka-topics.sh --list --zookeeper localhost:2181

发送消息：
bin/kafka-console-producer.sh --broker-list localhost:9092 --topic test

消费消息：
bin/kafka-console-consumer.sh --bootstrap-server localhost:9092 --topic test --from-beginning

集群：
1.为每个broker创建一个配置文件：cp config/server.properties config/server-1.properties
2.编辑配置文件，设置以下属性：
config/server-1.properties: 
    broker.id=1 
    listeners=PLAINTEXT://:9093 
    log.dir=/tmp/kafka-logs-1
3.启动节点：bin/kafka-server-start.sh config/server-1.properties &

查看集群信息：bin/kafka-topics.sh --describe --zookeeper localhost:2181 --topic test

kafka默认端口：9092
zookeeper默认端口：2181
