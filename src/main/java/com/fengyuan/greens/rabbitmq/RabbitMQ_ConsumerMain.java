package com.fengyuan.greens.rabbitmq;

import com.rabbitmq.client.*;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

/**
 * @author: fengyuan
 * @Description: 该类的功能描述
 * @date: 2019/4/1 14:45
 */
public class RabbitMQ_ConsumerMain {
    public static void main(String[] args) throws IOException, TimeoutException {
        //创建连接工厂
        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost("39.105.189.141");
        factory.setPort(5672);
        //        factory.setUsername("guest);
//        factory.setPassword("guest);
        //2、获取连接对象
        Connection connection = factory.newConnection();
        //3、创建通道对象
        Channel channel = connection.createChannel();
        //4、定义消息队列
        /*
        * 参数说明
        * 1、队列名称
        * 2、是否持久化
        * 3、是否排外 1、如果是私有 2、关闭连接是否自动删除
        * 4、是否自动删除 没有修奥飞着的时候，删除内容
        * 5、消息的存活时间
        * */
        channel.queueDeclare("冯源",false,false, false ,null);
        //5、接受信息
        /*
        * 参数说明
        * 1、交换机名称 如果为空使用匿名交换机
        * 2、队列名称
        * 3、内容属性
        * 4、发布的消息内容
        * */
        //5、创建消息者对象
        Consumer consumer = new DefaultConsumer(channel){
            @Override
            public void handleDelivery(String consumerTag, Envelope envelope, AMQP.BasicProperties properties, byte[] body) throws IOException {
                String msg = new String(body);
                System.out.println("消费者："+msg);
            }
        };
        //6、监听消息 参数说明 1、消息队列 2、是否自动应答(接受信息之后，自动告知服务器消息已经消费)3、消费者 阻塞消息监听
        channel.basicConsume("冯源" ,true,consumer);
        //channel.basicConsume()//消费消息
    }
}
