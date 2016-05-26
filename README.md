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

5 - Great! Now we need to start **json data generator** using the following command

```bash
$ java -jar json-data-generator-1.2.1.jar jackieChanSimConfig.json
```

You may note that we must copy the **jackieChanSimConfig.json** file and **jackieChanWorkflow.json** file to the current directory to run the **.jar** application. Both files can be found in **config** folder

6 - After the above command, we will see a output similar to the follow

```bash
016-05-26 19:33:45,740 DEBUG n.a.d.j.g.l.KafkaLogger [Thread-2] Sending event to Kafka: [ {"timestamp":"2016-05-26T19:33:45.740Z","style":"WUSHU","action":"BLOCK","weapon":"STAFF","target":"LEGS","strength":5.4437} ]
```

7 - Now we are ready to consume all Kafka messages by using the following command:

```bash
$ bin/kafka-console-consumer.sh --zookeeper localhost:2181 --topic jackieChanCommand --from-beginning
```

 

