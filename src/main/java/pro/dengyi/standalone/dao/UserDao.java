package pro.dengyi.standalone.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;
import pro.dengyi.standalone.model.SysUserEntity;
import pro.dengyi.standalone.model.UserExt;

import java.util.List;

/**
 * dao
 *
 * @author bear
 */
@Repository
public interface UserDao extends BaseMapper<SysUserEntity> {

    List<UserExt> getexts(String uid);
}
