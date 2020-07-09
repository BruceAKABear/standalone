package pro.dengyi.standalone.model;

import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * 用户实体
 *
 * @author bear
 */
@Data
@ApiModel
@TableName("t_user")
public class SysUserEntity {
    @ApiModelProperty(value = "主键")
    private String id;
    @ApiModelProperty(value = "用户名")
    @NotBlank
    private String username;
    @ApiModelProperty(value = "密码")
    @NotBlank
    private String password;

}
