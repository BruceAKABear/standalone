package pro.dengyi.standalone.model.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 基础响应类
 *
 * @author dengy
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BaseResponse implements Response {
    private Boolean status;
    private Integer code;
    private String message;


    /**
     * 构造
     *
     * @param responseCodeEnum 响应code枚举
     */
    public BaseResponse(BaseResponseCodeEnum responseCodeEnum) {
        this.status = responseCodeEnum.getStatus();
        this.code = responseCodeEnum.getCode();
        this.message = responseCodeEnum.getMessage();
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
