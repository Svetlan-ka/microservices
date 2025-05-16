package ru.netology;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class OrderItems {
    private String productName;
    private int quantity;
    private double price;
}
