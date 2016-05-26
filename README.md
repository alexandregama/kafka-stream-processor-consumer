# Kafka Stream Processor Consumer

# Installing and Testing Apache Kafka

1 - Download the [Kafka Project](https://www.apache.org/dyn/closer.cgi?path=/kafka/0.10.0.0/kafka_2.11-0.10.0.0.tgz)

2 - Start the Kafka Server using the following command

```bash
$ bin/zookeeper-server-start.sh config/zookeeper.properties
```

3 - Creating a topic named **test**

```bash
$ bin/kafka-topics.sh --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --topic test
```

4 - Retrievin a topic named **test**

```bash
$ bin/kafka-topics.sh --list --zookeeper localhost:2181
```

5 - Sending a new message to **test** topic

```bash
$ bin/kafka-console-producer.sh --broker-list localhost:9092 --topic test
```

We can type some message after run the command above

6 - Consuming all messages from **test** topic

```bash
$ bin/kafka-console-consumer.sh --zookeeper localhost:2181 --topic test --from-beginning
```

# Installing and Testing JSON Data Generator




 

