package com.example.orderhanddle.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class Good implements Serializable {
    private static final long serialVersionUID = -3486413003967431764L;
    private String name;
    private String price;
    private Integer number;
}
