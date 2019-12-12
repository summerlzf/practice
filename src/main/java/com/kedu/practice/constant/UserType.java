package com.kedu.practice.constant;

import lombok.Getter;

/**
 * @author Jef
 */
@Getter
public enum UserType {

    /** 普通用户 */
    NORMAL(0, "普通用户"),
    /** 会员用户 */
    MEMBER(1, "会员用户"),
    /** 超级会员 */
    VIP(2, "超级会员");

    private int code;
    private String name;

    UserType(int code, String name) {
        this.code = code;
        this.name = name;
    }
}
