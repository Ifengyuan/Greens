package com.fengyuan.greens.rabbitmq;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

/**
 * @author: fengyuan
 * @Description: 该类的功能描述
 * @date: 2019/4/1 15:15
 */
public class RabbitMQ_ProducerMain {
    public static void main(String[] args) throws IOException, TimeoutException {
        ConnectionFactory factory=new ConnectionFactory();
        factory.setHost("39.105.189.141");
        factory.setPort(5672);
//        factory.setUsername("guest);
//        factory.setPassword("guest);
        //2、获取连接对象
        Connection connection=factory.newConnection();
        //3、创建通道对象
        Channel channel=connection.createChannel();
        //4、定义消息队列
        /*参数说明：
         * 1、队列名称
         * 2、是否持久化
         * 3、是否排外 1、如果是私有  2、关闭连接是否自动删除
         * 4、是否自动删除 没有消费者的时候，删除内容
         * 5、消息的存活时间
         *
         * */
        channel.queueDeclare("冯源",false,false,false,null);
        //5、创建信息
        String msg = "彩票中了一千万";
        //6、发送消息
        /*
         * 参数说明：
         * 1、交换机名称  如果为空则使用匿名交换机
         * 2、队列名称
         * 3、内容属性
         * 4、发布的消息内容
         * */
        channel.basicPublish("","冯源",null,msg.getBytes());
        //channel.basicConsume() //消费消息
        //7、关闭
       /* channel.close();
        connection.close();*/
    }
}
