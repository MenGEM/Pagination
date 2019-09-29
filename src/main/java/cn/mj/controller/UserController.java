package cn.mj.controller;

import cn.mj.pojo.PageRequest;
import cn.mj.service.UserService;
import cn.mj.util.HttpResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/excel")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/findPage")
    public HttpResult findPage(@RequestBody PageRequest pageRequest){
        return HttpResult.ok(userService.findPage(pageRequest));
    }

}
