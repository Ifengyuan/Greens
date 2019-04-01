package com.fengyuan.greens.redis;

import com.fengyuan.greens.sysconst.SystemCon;
import com.fengyuan.greens.sysconst.SystemConst;
import redis.clients.jedis.Jedis;

/**
 * @author: fengyuan
 * @Description: 该类的功能描述
 * @date: 2019/3/27 21:08
 */
public class Jedis_Main {
    public static void main(String[] args){
        //1、创建对象、
        Jedis jedis = new Jedis(SystemConst.RHOST,SystemConst.RPOST);
        //2、认证
        jedis.auth("123456");
        //3、操作
        jedis.set("s1807","睡觉睡觉");
        System.out.println(jedis.get("s1807"));
        //list
        jedis.lpush("123","wwww","dddd","ffff","yyyy");
        System.out.println(jedis.lrange("2123",0,jedis.llen("123123")));
        //4、关闭
        jedis.close();
    }
}
