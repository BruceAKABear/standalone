package pro.dengyi.standalone.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pro.dengyi.standalone.dao.UserDao;
import pro.dengyi.standalone.model.SysUserEntity;
import pro.dengyi.standalone.model.UserExt;
import pro.dengyi.standalone.service.UserService;

import java.util.List;

/**
 * service接口实现类
 *
 * @author bear
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    @Transactional
    public void save(SysUserEntity userEntity) {
        userDao.insert(userEntity);
    }

    @Override
    public List<UserExt> getexts(String uid) {
        return userDao.getexts(uid);
    }

}
