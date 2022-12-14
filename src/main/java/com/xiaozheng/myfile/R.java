package com.xiaozheng.myfile;


import com.xiaozheng.myfile.utils.Constant;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;

@ApiModel("api通用返回数据")
@Data
@AllArgsConstructor
public class R<T> {

    /**
     * 标识代码，0表示成功，非0表示出错
     */
    @ApiModelProperty("标识代码,0表示成功，非0表示出错")
    private Integer code;

    /**
     * 提示信息，通常供报错时使用
     */
    @ApiModelProperty("提示信息,供报错时使用")
    private String message;

    /**
     * 正常返回时返回的数据
     */
    @ApiModelProperty("返回的数据")
    private T data;

    public R() {
    }

    public R(int code, String message, T data) {
        setCode(code);
        setMessage(message);
        setData(data);
    }

    public static <T> R<T>  error() {
        R<T> r = new R<>();
        r.setCode(Constant.ERROR);
        r.setMessage("未知异常，请联系管理员");
        return r;
    }

    public static <T> R<T>  error(T data) {
        R<T> r = new R<>();
        r.setData(data);
        r.setCode(Constant.ERROR);
        r.setMessage("未知异常，请联系管理员");
        return r;
    }

    public static <T> R<T>  error(String message) {
        R<T> r = error();
        r.setMessage(message);
        return r;
    }

    public static <T> R<T> error(int code, String message) {
        R<T> r = error();
        r.setCode(code);
        r.setMessage(message);
        return r;
    }

    public static <T> R<T> error(int code, String message,T data) {
        R<T> r = error();
        r.setData(data);
        r.setCode(code);
        r.setMessage(message);
        return r;
    }

    public static <T> R<T>  error(CodeEnum codeEnum) {
        R<T> r = error();
        r.setCode(codeEnum.getCode());
        r.setMessage(codeEnum.getMsg());
        return r;
    }

    public static <T> R<T> ok() {
        R<T> r = new R<>();
        r.setCode(Constant.SUCCESS);
        r.setMessage("操作成功！");
        return r;
    }

    public static <T> R<T> ok(T data) {
        R<T> r = new R<>();
        r.setData(data);
        r.setCode(Constant.SUCCESS);
        r.setMessage("操作成功！");
        return r;
    }

    public static <T> R<T>  ok(String message) {
        R<T> r = ok();
        r.setMessage(message);
        return r;
    }

    public static <T> R<T>  ok(int code, String message) {
        R<T> r = ok();
        r.setCode(code);
        r.setMessage(message);
        return r;
    }

    public static <T> R<T>  ok(int code, String message,T data) {
        R<T> r = ok();
        r.setData(data);
        r.setCode(code);
        r.setMessage(message);
        return r;
    }

    public static <T> R<T>  ok(CodeEnum codeEnum) {
        R<T> r = ok();
        r.setCode(codeEnum.getCode());
        r.setMessage(codeEnum.getMsg());
        return r;
    }

    public static <T> R<T> fail() {
        R<T> r = new R<>();
        r.setCode(Constant.FAIL);
        r.setMessage("操作失败");
        return r;
    }

    public static <T> R<T> fail(T data) {
        R<T> r = new R<>();
        r.setData(data);
        r.setCode(Constant.FAIL);
        r.setMessage("操作失败");
        return r;
    }

    public static <T> R<T> fail(String message) {
        R<T> r = fail();
        r.setMessage(message);
        return r;
    }

    public static <T> R<T> fail(int code, String message) {
        R<T> r = fail();
        r.setCode(code);
        r.setMessage(message);
        return r;
    }

    public static <T> R<T> fail(int code, String message,T data) {
        R<T> r = fail();
        r.setData(data);
        r.setCode(code);
        r.setMessage(message);
        return r;
    }

    public static <T> R<T> fail(CodeEnum codeEnum) {
        R<T> r = fail();
        r.setCode(codeEnum.getCode());
        r.setMessage(codeEnum.getMsg());
        return r;
    }
}