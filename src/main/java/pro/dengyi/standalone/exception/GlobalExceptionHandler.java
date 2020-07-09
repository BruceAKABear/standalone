package pro.dengyi.standalone.exception;


import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import pro.dengyi.standalone.model.response.BusinessExceptionCodeEnum;

import java.util.HashMap;
import java.util.Map;

/**
 * 全局异常处理器
 *
 * @author dengy
 */
@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    public Map<String, Object> customException(Exception e) {
        log.error("框架异常，信息为{}", e.getMessage());
        Map<String, Object> returnmap = new HashMap<>(3);
        //执行状态
        returnmap.put("status", false);
        returnmap.put("code", 999999);
        returnmap.put("message", "服务器开小差了");
        return returnmap;
    }

    /**
     * 业务异常处理类
     *
     * @param be 业务异常类
     * @return
     */
    @ExceptionHandler(BusinessException.class)
    public Map<String, Object> businessException(BusinessException be) {
        log.error("业务异常，信息为{}", be.getMessage());
        Map<String, Object> returnmap = new HashMap<>(3);
        //执行状态
        returnmap.put("status", false);
        returnmap.put("code", be.getCode());
        returnmap.put("message", be.getMessage());

        return returnmap;
    }

    /**
     * 参数异常处理类
     *
     * @param me 参数异常类
     * @return
     */
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public Map<String, Object> parametersException(MethodArgumentNotValidException me) {
        log.error("请求参数异常，信息为{}", me.getMessage());
        Map<String, Object> returnmap = new HashMap<>(3);
        //执行状态
        returnmap.put("status", false);
        returnmap.put("code", BusinessExceptionCodeEnum.PARAM_ERROR.getCode());
        returnmap.put("message", BusinessExceptionCodeEnum.PARAM_ERROR.getMessage());

        return returnmap;
    }


}
