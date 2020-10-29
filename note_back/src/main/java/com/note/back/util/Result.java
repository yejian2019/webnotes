package com.note.back.util;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Result {

    public static int SUCCESS_CODE = 666;
    public static int FAIL_CODE = 000;

    private int code;
    private String message;
    private Object data;

    public static Result success() {
        return new Result(SUCCESS_CODE,"success",null);
    }

    public static Result success(Object data) {
        return new Result(SUCCESS_CODE,"success",data);
    }

    public static Result fail(String message) {
        return new Result(FAIL_CODE,message,null);
    }

}

