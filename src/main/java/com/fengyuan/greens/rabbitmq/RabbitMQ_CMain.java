package com.fengyuan.greens.rabbitmq;

import com.rabbitmq.client.*;

import java.io.IOException;

/**
 * @author: fengyuan
 * @Description: 该类的功能描述
 * @date: 2019/4/1 15:20
 */
public class RabbitMQ_CMain {
    public static void main(String[] args) throws Exception {
        //1、创建连接工厂
        ConnectionFactory factory=new ConnectionFactory();
        factory.setHost("39.105.189.141");
        factory.setPort(5672);
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
        //4、定义交换机 并指定消息模式
        channel.exchangeDeclare("爱的魔力转圈圈", BuiltinExchangeType.FANOUT);
        //5、交换机绑定队列
        String qname=channel.queueDeclare().getQueue();
        channel.queueBind(qname,"爱的魔力转圈圈","");
        Consumer consumer=new DefaultConsumer(channel){
            @Override
            public void handleDelivery(String consumerTag, Envelope envelope, AMQP.BasicProperties properties, byte[] body) throws IOException {
                System.out.println("消费者2："+new String(body));
            }
        };
        channel.basicConsume(qname,true,consumer);

    }
}
