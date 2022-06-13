package ru.neoflex;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.neoflex.service.OrderService;

/**
 * InversionOfControl.
 *
 * @author nanikeev
 */
public class InversionOfControl {

    public static void main(String... args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Configuration.class);
        OrderService orderService = context.getBean(OrderService.class);
        orderService.createNew(1L);
    }
}
