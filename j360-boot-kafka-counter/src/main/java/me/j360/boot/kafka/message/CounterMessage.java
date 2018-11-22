package me.j360.boot.kafka.message;

import lombok.Data;

/**
 * @author: min_xu
 * @date: 2018/11/22 3:21 PM
 * 说明：
 */

@Data
public class CounterMessage {

    private String index;
    private String type;
    private Long key;
    private int count;

}
