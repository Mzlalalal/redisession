package mzlalal.redisession.redisessioncosumer.controller;

import lombok.extern.slf4j.Slf4j;
import mzlalal.redisession.entity.AjaxJson;
import mzlalal.redisession.entity.user.AuthUserDTO;
import mzlalal.redisession.redisessioncosumer.feign.LoginFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description: FeignClient 测试类
 * @author: Mzlalal
 * @date: 2019/10/15 17:50
 * @version: 1.0
 */
@Slf4j
@RestController
public class FeignController {

    @Autowired
    LoginFeignService loginFeignService;

    @RequestMapping("testFeign")
    public AuthUserDTO testFeign(){
        return loginFeignService.findAuthUser();
    }
}
