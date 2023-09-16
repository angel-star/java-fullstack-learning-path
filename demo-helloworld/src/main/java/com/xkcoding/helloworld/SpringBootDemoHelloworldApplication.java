package com.xkcoding.helloworld;

import cn.hutool.core.util.StrUtil;
import io.swagger.annotations.ApiOperation;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 * SpringBoot启动类
 * </p>
 *
 * @author yangkai.shen
 * @date Created in 2018-09-28 14:49
 */
@SpringBootApplication
@RestController
public class SpringBootDemoHelloworldApplication {

    public static void main(String[] args) {

      SpringApplication.run(SpringBootDemoHelloworldApplication.class, args);
    }

    /**
     * Hello，World
     *
     * @param who 参数，非必须
     * @return Hello, ${who}
     */
    @GetMapping("/hello")
    public String sayHello(@RequestParam(required = false, name = "who") String who) {
        if (StrUtil.isBlank(who)) {
            who = "World";
        }
        return StrUtil.format("Hello，测试专用, {}!", who);
    }
    // 处理 POST 请求，例如创建一个新的“问候”
    @ApiOperation(value = "创建一个新的“问候”", notes = "利用@RequestBody 创建一个新的“问候”")
    @PostMapping("/post")
    public String createGreeting(@RequestBody String greeting) {
        // 此处可以将新的问候保存到数据库或其他数据存储中
        return "RequestBody" + greeting;
    }
    // 处理 POST 请求，RequestParam
    @ApiOperation(value = "创建一个新的“问候”", notes = "利用@RequestParam 创建一个新的“问候”")
    @PostMapping("/post2")
    public String createGreeting_2(@RequestParam("post21") String greeting) {
        // 此处可以将新的问候保存到数据库或其他数据存储中
        return "RequestParam" + greeting;
    }
    //用@RequestParam 模拟一个post请求


    // 处理 PUT 请求，例如更新一个现有的“问候”
    @PutMapping("/{id}")
    public String updateGreeting(@PathVariable int id, @RequestBody String newGreeting) {
        // 根据ID查找现有的问候并进行更新
        return "Greeting with ID " + id + " updated to: " + newGreeting;
    }

    // 处理 DELETE 请求，例如删除一个“问候”
    @DeleteMapping("/{id}")
    public String deleteGreeting(@PathVariable int id) {
        // 根据ID删除问候
        return "Greeting with ID " + id + " deleted.";
    }
}
