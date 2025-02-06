package ru.t1.dto;

import lombok.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TransactionAcceptDto {
    String clientId;
    String accountId;
    String transactionId;
    LocalDateTime createdAt;
    BigDecimal transactionAmount;
    BigDecimal accountBalance;
}
