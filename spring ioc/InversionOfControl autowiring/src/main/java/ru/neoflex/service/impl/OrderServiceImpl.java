package ru.neoflex.service.impl;

import lombok.*;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;
import ru.neoflex.model.Order;
import ru.neoflex.repository.OrderRepository;
import ru.neoflex.service.OrderService;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * OrderServiceImpl.
 *
 * @author nanikeev
 */
@Log
@RequiredArgsConstructor
@Service
@PropertySource("classpath:application.properties")
public class OrderServiceImpl implements OrderService {
    @Autowired
    private final OrderRepository orderRepository;

    @Setter
    @Value("${default.price}")
    private Double standardSum;

    @Override
    public void createNew(Long customerId) {
        Order order = new Order()
                .setOrderDate(LocalDateTime.now())
                .setPayed(false)
                .setSum(BigDecimal.valueOf(standardSum))
                .setCustomerId(customerId);
        orderRepository.save(order);
        log.info(String.format("created new order: %s", order));
    }
}
