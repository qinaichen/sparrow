package io.sparrow.oauth.vo;

import lombok.Data;

@Data
public class Result {

    private int code;

    private String msg;

    private long count;

    private Object data;

    public static Result success(long count,Object data){
        Result result = new Result();
        result.setCode(0);
        result.setCount(count);
        result.setData(data);
        return result;
    }
}
