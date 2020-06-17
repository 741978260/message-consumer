package com.mumu.channel.listener;

import com.mumu.channel.TestChannel;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

/**
 * <p>
 * </p>
 *
 * @author cailin
 * @since 2020/6/17
 */
@Component
public class TestListener {
    @StreamListener(value = TestChannel.TEST_INPUT)
    public void process(Message<String> message) {
        String payload = message.getPayload();
        System.out.println(payload);
    }
}
