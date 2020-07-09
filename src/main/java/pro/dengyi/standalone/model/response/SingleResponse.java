package pro.dengyi.standalone.model.response;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 基础响应类
 *
 * @author dengy
 */

@Data
@AllArgsConstructor
public class SingleResponse<T> implements Response {
    private Boolean status;
    private Integer code;
    private String message;
    private T data;


    public SingleResponse(ResponseCode responseCode, T data) {
        this.status = responseCode.getStatus();
        this.code = responseCode.getCode();
        this.message = responseCode.getMessage();
        this.data = data;
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
