package ru.t1.dto;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TransactionResultDto {
    private String accountId;
    private String transactionId;
    private String transactionStatus;
}
