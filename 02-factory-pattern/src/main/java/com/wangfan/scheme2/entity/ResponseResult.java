package com.wangfan.scheme2.entity;

import lombok.Data;

/**
 * 响应结果封装
 */
@Data
public class ResponseResult {
    private String status; // 状态码
    private String message; // 信息
    private Object data;   //数据

    public ResponseResult(String number, String s) {
        this.status = number;
        this.message = s;
    }

    public ResponseResult(String number, String s, Object data) {
        this.status = number;
        this.message = s;
        this.data = data;
    }
}
