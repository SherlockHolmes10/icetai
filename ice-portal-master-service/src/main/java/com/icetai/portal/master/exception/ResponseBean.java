package com.icetai.portal.master.exception;

import lombok.Data;

@Data
public class ResponseBean<T> {

    private T data;
    private int code;
    private String msg;

    public ResponseBean(){}

    public ResponseBean( T data) {
        super();
        this.data = data;
    }

    @Override
    public String toString() {
        return "ResponseBean{" +
                
                ", data=" + data +
                ", code='" + code + '\'' +
                ", msg='" + msg + '\'' +
                '}';
    }

    public ResponseBean( T data, int code, String msg) {
        super();
     
        this.data = data;
        this.code = code;
        this.msg = msg;
    }

    public ResponseBean( int code, String msg) {

        this.code = code;
        this.msg = msg;
    }
    public ResponseBean(UnicomResponseEnums enums){
        
        this.code=enums.getCode();
        this.msg=enums.getMsg();
    }
    public ResponseBean(T data,UnicomResponseEnums enums){
       
        this.data=data;
        this.code=enums.getCode();
        this.msg=enums.getMsg();
    }
   

}
