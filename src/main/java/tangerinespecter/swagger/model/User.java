package tangerinespecter.swagger.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
@ApiModel("用户信息实体类")
public class User {

    @ApiModelProperty("用户ID")
    private Long userId;
    @ApiModelProperty("用户名")
    private String name;
    @ApiModelProperty("用户年龄")
    private Integer age;
    @ApiModelProperty("性别：0：男；1：女")
    private Integer sex;
}
