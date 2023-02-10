package com.example.orderhanddle.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class User implements Serializable {
    private static final long serialVersionUID = -3486413003967431762L;
    private String name;
    private String address;
    private String phone;
}
