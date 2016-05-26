# Kafka Stream Processor Consumer

# Installing and Testing Apache Kafka

1 - Download the [Kafka Project](https://www.apache.org/dyn/closer.cgi?path=/kafka/0.10.0.0/kafka_2.11-0.10.0.0.tgz)

2 - Start the Kafka Zookeeper and Kafka Server using the following command

```bash
$ bin/zookeeper-server-start.sh config/zookeeper.properties
```

```bash
$ bin/kafka-server-start.sh config/server.properties
```

3 - Creating a topic named **test**

```bash
$ bin/kafka-topics.sh --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --topic test
```

4 - Retrievin all topics from Kafka

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

1 - Download the project from [JSON Data Generator page](https://github.com/acesinc/json-data-generator/releases)

2 - Start Apache Zookeeper and Apache Kakfa as we have seen before

3 - Create a new topic named **jackieChanCommand**

```bash
$ bin/kafka-topics.sh --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --topic jackieChanCommand
```

4 - Listing all the topics from Kafka. You may see the **jackieChanCommand** topic

```bash
$ bin/kafka-topics.sh --list --zookeeper localhost:2181
```


 

