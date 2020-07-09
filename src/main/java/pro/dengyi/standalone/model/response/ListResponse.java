package pro.dengyi.standalone.model.response;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

/**
 * 基础响应类
 *
 * @author dengy
 */

@Data
@AllArgsConstructor
public class ListResponse<T> implements Response {
    private Boolean status;
    private Integer code;
    private String message;
    private List<T> data;


    /**
     * 集合响应构造
     *
     * @param responseCode 响应编码实体
     * @param data         集合对象
     */
    public ListResponse(ResponseCode responseCode, List<T> data) {
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
