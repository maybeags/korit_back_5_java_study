package com.study.ch19;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@ToString
@Builder
@Data
public class Member {
    private String name;
    private String phone;
}
