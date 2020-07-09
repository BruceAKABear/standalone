package pro.dengyi.standalone.model.response;

/**
 * 响应编码接口
 *
 * @author dengy
 */
public interface ResponseCode {
    /**
     * 获取状态信息
     *
     * @return true/false
     */
    Boolean getStatus();

    /**
     * 获取状态码
     *
     * @return
     */
    Integer getCode();

    /**
     * 获取消息
     *
     * @return
     */
    String getMessage();


}
