package me.j360.boot.kafka.manager;

import me.j360.boot.kafka.message.CounterMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author: min_xu
 * @date: 2018/11/22 3:20 PM
 * 说明：
 */

@Component
public class CounterManager {

    private Map<String, List<String>> counterMap;

    @PostConstruct
    public void init() {
        counterMap = new HashMap<>();
        InputStream stream = this.getClass().getResourceAsStream("counter.model.json");

    }

    @Autowired
    private MongoTemplate mongoTemplate;
    @Autowired
    private RedisTemplate redisTemplate;

    public void count(CounterMessage message) {

    }

}
