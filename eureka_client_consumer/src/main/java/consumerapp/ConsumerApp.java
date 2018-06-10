package consumerapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: Hao
 * @Date: 2018/6/10/010 23:18
 */
@SpringBootApplication
//@EnableDiscoveryClient
public class ConsumerApp {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerApp.class,args);
    }

    /**
     * @Author: Hao
     * @Date: 2018/6/10/010 23:48
     */
    @RestController
    public static class Controller {
        //@Autowired
        //RestTemplate restTemplate1;
        @Bean
        RestTemplate restTemplate(){
            return  new RestTemplate();
        }
        @RequestMapping("/test")
        public String test(){
            return "test";
        }
    }
}
