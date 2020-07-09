package pro.dengyi.standalone.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import pro.dengyi.standalone.model.SysUserEntity;
import pro.dengyi.standalone.model.UserExt;
import pro.dengyi.standalone.model.response.BaseResponse;
import pro.dengyi.standalone.model.response.BaseResponseCodeEnum;
import pro.dengyi.standalone.model.response.ListResponse;
import pro.dengyi.standalone.model.response.SingleResponse;
import pro.dengyi.standalone.service.UserService;

import java.util.List;

/**
 * 用户controller
 *
 * @author bear
 */
@RestController
@RequestMapping("/user")
@Api(description = "用户")
public class UserController {
    @Autowired
    private UserService userService;


    @ApiOperation(value = "用户退出")
    @GetMapping("/logout")
    public String logout() {
        return null;
    }

    @ApiOperation(value = "保存用户")
    @PostMapping("/save")
    public BaseResponse save(@RequestBody @Validated SysUserEntity userEntity) {
        userService.save(userEntity);
        return new BaseResponse(BaseResponseCodeEnum.SUCCESS);
    }

    @ApiOperation(value = "获取扩展数据")
    @GetMapping("/getext")
    public ListResponse<UserExt> getext(String uid) {
        List<UserExt> list =userService.getexts(uid);
        return new ListResponse<>(BaseResponseCodeEnum.SUCCESS, list);
    }


}
