package co.vision;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TestController {

    @GetMapping(value = "/hi")
    public String sayHi(){
        return "Hello";
    }

}
