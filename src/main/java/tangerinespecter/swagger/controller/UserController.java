package tangerinespecter.swagger.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tangerinespecter.swagger.model.User;

import java.util.ArrayList;
import java.util.List;

/**
 * 用户接口
 */
@Api(tags = "用户管理")
@RestController
@RequestMapping("/user")
public class UserController {

    @ApiOperation(value = "用户列表")
    @GetMapping("list")
    public List<User> userList() {
        List<User> list = new ArrayList<>();
        list.add(User.builder().userId(1L).name("张三")
                .age(18).sex(0).build());
        list.add(User.builder().userId(2L).name("小红")
                .age(12).sex(1).build());
        return list;
    }
}
