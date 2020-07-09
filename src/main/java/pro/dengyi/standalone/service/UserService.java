package pro.dengyi.standalone.service;

import pro.dengyi.standalone.model.SysUserEntity;
import pro.dengyi.standalone.model.UserExt;

import java.util.List;

/**
 * service 接口
 *
 * @author bear
 */
public interface UserService {
    /**
     * 保存用户
     *
     * @param userEntity 用户实体
     */
    void save(SysUserEntity userEntity);


    List<UserExt> getexts(String uid);
}
