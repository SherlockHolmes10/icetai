package com.icetai.portal.master.exception;

public enum UnicomResponseEnums {
    //系统异常
    SYSTEM_ERROR(10001,"system_error"),
    //错误的请求参数
    BAD_REQUEST(10002,"bad_request"),
    //找不到请求路径
    NOT_FOUND(10003,"not_found"),
    //网络连接请求失败
    CONNECTION_ERROR(10004,"connection_error"),
    //不合法的请求方式
    METHOD_NOT_ALLOWED(10005,"method_not_allowed"),
    //数据库异常
    DATABASE_ERROR(10006,"database_error"),
    //找不到方法
    BOUND_STATEMENT_NOT_FOUNT(10007,"bound_statement_not_fount"),
    //重复注册
    REPEAT_REGISTER(10008,"repeat_register"),
    //用户不存在
    NO_USER_EXIST(10009,"no_user_exist"),
    //密码错误
    INVALID_PASSWORD(10010,"invalid_password"),
    //非法请求
    NO_PERMISSION(10011,"no_permission"),
    //操作成功
    SUCCESS_OPTION(10012,"success_option"),
    //用户名和密码不匹配
    NOT_MATCH(10013,"not_match"),
    //获取信息失败
    FAIL_GETDATA(10014,"fail_getdata"),
    //错误的请求类型
    BAD_REQUEST_TYPE(10015,"bad_request_type"),
    //无效的手机号码
    INVALID_MOBILE(10016,"invalid_mobile"),
    //无效的邮箱
    INVALID_EMAIL(10017,"invalid_email"),
    //无效的性别
    INVALID_GENDER(1018,"invalid_gender"),
    //已存在此手机号
    REPEAT_MOBILE(10019,"repeat_mobile"),
    //已存在此邮箱地址
    REPEAT_EMAIL(10020,"repeat_email"),
    //没有查到相关记录
    NO_RECORD(10021,"no_record"),
    //
    LOGIN_SUCCESS(10022,"login_success"),
    //已退出登录
    LOGOUT_SUCCESS(10023,"logout_success"),
    //邮件已发送，请注意查收
    SENDMAIL_SUCCESS(10024,"sendmail_success"),
    //修改密码成功
    EDITPWD_SUCCESS(10025,"editpwd_success"),
    //未选择文件
    No_FileSELECT(10026,"no_fileselect"),
    //上传成功
    FILEUPLOAD_SUCCESS(10027,"fileupload_success"),
    //未登陆
    NOLOGIN(10028,"nologin"),
    //参数不合法
    ILLEGAL_ARGUMENT(10029,"illegal_argument"),
    //验证码不正确
    ERROR_IDCODE(10030,"error_idcode"),
    //课程添加失败
    ADDITION_FAILED(10031,"addition_failed");

    private int code;
    private String msg;
    private UnicomResponseEnums(int code, String msg) {

        this.code = code;
        this.msg = msg;
    }
    public int getCode() {
        return code;
    }
    public void setCode(int code) {
        this.code = code;
    }
    public String getMsg() {
        return msg;
    }
    public void setMsg(String msg) {
        this.msg = msg;
    }


}
