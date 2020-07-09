package pro.dengyi.standalone.model.response;

/**
 * 响应编码枚举类
 *
 * @author dengy
 */

public enum BusinessExceptionCodeEnum implements ResponseCode {
    /**
     * 操作失败
     */
    PARAM_ERROR(false, 333333, "参数异常");

    private Boolean status;
    private Integer code;
    private String message;


    BusinessExceptionCodeEnum(Boolean status, Integer code, String message) {
        this.status = status;
        this.code = code;
        this.message = message;
    }

    @Override
    public Boolean getStatus() {
        return status;
    }


    @Override
    public Integer getCode() {
        return code;
    }


    @Override
    public String getMessage() {
        return message;
    }

}
