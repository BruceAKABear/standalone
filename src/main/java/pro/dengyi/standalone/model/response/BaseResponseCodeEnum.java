package pro.dengyi.standalone.model.response;

/**
 * 响应编码枚举类
 *
 * @author dengy
 */

public enum BaseResponseCodeEnum implements ResponseCode {
    /**
     * 操作成功
     */
    SUCCESS(true, 10000, "操作成功"),
    /**
     * 操作失败
     */
    FAIL(false, 11111, "操作失败");

    private Boolean status;
    private Integer code;
    private String message;


    BaseResponseCodeEnum(Boolean status, Integer code, String message) {
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
