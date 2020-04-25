package com.ontheroad.otrbackend.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class User {
    private int uid;
    private String phonenumber;
    private String password;
}
