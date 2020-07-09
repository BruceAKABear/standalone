package pro.dengyi.standalone.exception;


import pro.dengyi.standalone.model.response.ResponseCode;

/**
 * 业务异常类
 *
 * @author dengy
 */
public class BusinessException extends RuntimeException {

    private Integer code;

    public BusinessException(String message, Integer code) {
        super(message);
        this.code = code;
    }

    /**
     * 业务异常构造，response
     *
     * @param responseCode 状态响应
     */
    public BusinessException(ResponseCode responseCode) {
        super(responseCode.getMessage());
        this.code = responseCode.getCode();
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
