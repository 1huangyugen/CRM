package com.askj.crm.commons.domain;

/**
 * @author shkstart
 * @date 2023/3/21-20:27
 */
public class ReturnObject {
    private String code;//处理成功获取失败的标记1成功0失败
    private String message;//提示信息
    private Object retData;//其他数据

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getRetData() {
        return retData;
    }

    public void setRetData(Object retData) {
        this.retData = retData;
    }
}
