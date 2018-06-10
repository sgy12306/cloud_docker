package consumerapp.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: Hao
 * @Date: 2018/6/10/010 23:29
 */
@RestController
public class ConsumerController {
    @Autowired
    RestTemplate restTemplate;

    @RequestMapping("/consumer")
    public String consumer() {
        return restTemplate.getForEntity("http://EUREKA-CLIENT-PROVIDER/hello", String.class).getBody();
    }

    @RequestMapping("/consumerHello")
    public String hello() {
        return "hello consumer";
    }
}
