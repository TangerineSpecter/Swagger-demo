package tangerinespecter.swagger.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;
import tangerinespecter.swagger.model.User;
import tangerinespecter.swagger.request.UserUpdateParam;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * 用户接口
 */
@Api(tags = "用户管理")
@RestController
@RequestMapping("/user")
public class UserController {

    private static List<User> list = new ArrayList<>();

    static {
        list.add(User.builder().userId(1L).name("张三")
                .age(18).sex(0).build());
        list.add(User.builder().userId(2L).name("小红")
                .age(12).sex(1).build());
    }

    @ApiOperation(value = "用户列表")
    @GetMapping("list")
    public List<User> userList() {
        return list;
    }

    @ApiOperation(value = "用户信息更新")
    @PutMapping("/update")
    public List<User> updateInfo(UserUpdateParam param) {
        list.forEach(user -> {
            if (user.getUserId().equals(param.getId())) {
                user.setName(param.getName());
                if (param.getSex() != null) {
                    user.setSex(param.getSex());
                }
            }
        });
        return list;
    }

    @ApiOperation(value = "用户信息查询")
    @PutMapping("/get")
    public User queryUserInfo(@ApiParam(value = "用户ID", required = true) @RequestParam("id") Long id) {
        Optional<User> first = list.stream().filter(user -> user.getUserId().equals(id))
                .findFirst();
        return first.orElse(User.builder().build());
    }

}
