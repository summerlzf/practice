package com.kedu.practice.base;

import lombok.Data;

/**
 * @author Jef
 */
@Data
public class Result<T> {

    private T data;

    private int code;

    private String message;

    /** =================== 以下是静态方法 ==================== */

    public static <T> Result success(T data) {
        Result<T> r = new Result<>();
        r.setCode(0);
        r.setData(data);
        r.setMessage("操作成功");
        return r;
    }

    public static Result success() {
        return success(null);
    }

    public static Result fail(int code, String message) {
        Result r = new Result();
        r.setCode(code);
        r.setMessage(message);
        return r;
    }

    public static Result fail(int code) {
        return fail(code, "操作失败");
    }

    public static Result fail(String message) {
        return fail(-1, message);
    }
}
