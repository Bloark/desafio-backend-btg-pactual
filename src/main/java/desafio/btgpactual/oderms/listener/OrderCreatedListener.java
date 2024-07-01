package desafio.btgpactual.oderms.listener;



import desafio.btgpactual.oderms.listener.dto.OrderCreatedEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

import static desafio.btgpactual.oderms.config.RabbitMqConfig.ORDER_CREATED_QUEUE;

@Component
public class OrderCreatedListener {

    private final Logger logger = LoggerFactory.getLogger(OrderCreatedEvent.class);

    @RabbitListener(queues = ORDER_CREATED_QUEUE)
    public void listen(Message<OrderCreatedEvent> message){
                    logger.info("Message consumed: {}", message);
    }


}
