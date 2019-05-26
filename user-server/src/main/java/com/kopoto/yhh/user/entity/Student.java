package com.kopoto.yhh.user.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class Student implements Serializable {
    private int id;

    private String name;
}
