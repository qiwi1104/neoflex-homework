package ru.neoflex.model;

import lombok.Data;
import lombok.experimental.Accessors;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * Order.
 *
 * @author nanikeev
 */
@Data
@Accessors(chain = true)
@Component
public class Order {
    private Long id;
    private BigDecimal sum;
    private LocalDateTime orderDate;
    private boolean payed;
    private Long customerId;
}
