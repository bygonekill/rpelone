package demo;

import org.junit.Test;
import org.junit.internal.runners.JUnit4ClassRunner;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring/applicationContext-redis.xml")
public class Demo {
    @Autowired
    private RedisTemplate redisTemplate;

    @Test
    public void test(){
        //存值
        List
        redisTemplate.boundValueOps("name").set("222");
        Map<String,String> map = new HashMap<>();
        map.put("name","战术上");
//        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
////
////        while (iterator.hasNext()){
////            Map.Entry<String, String> next = iterator.next();
////        }
        for (Map.Entry<String, String> stringStringEntry : map.entrySet()) {
            System.out.println(stringStringEntry.getValue());
        }

    }
    @Test
    public void getValue(){
        String name = (String) redisTemplate.boundValueOps("name").get();
    }
}
