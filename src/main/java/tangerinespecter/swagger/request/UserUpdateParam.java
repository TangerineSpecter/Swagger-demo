package tangerinespecter.swagger.request;

import io.swagger.annotations.ApiParam;
import lombok.Data;

@Data
public class UserUpdateParam {

    @ApiParam(value = "用户ID", required = true)
    private Long id;
    @ApiParam(value = "用户名")
    private String name;
    @ApiParam(value = "性别；0：男；1：女")
    private Integer sex;
}
