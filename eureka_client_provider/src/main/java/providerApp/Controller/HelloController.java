package providerApp.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Hao
 * @Date: 2018/6/10/010 23:22
 */
@RestController
public class HelloController {
    //private DiscoveryClient client;

    @RequestMapping("/hello")
    public String hello() {
        return "hello cloud";
    }
}
