package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author <a herf="chenhy@itek-china.com">陈海越</a>
 * @version 1.0
 * @since 新标准版5.0
 *
 * <pre>
 * 历史：
 *      建立: 2019/7/12 陈海越
 *        </pre>
 */
@Controller
@RequestMapping("/s1")
public class MainController {

    @RequestMapping("/test1")
    public void start() {
        System.out.println("service1 start");
    }

    @RequestMapping("/test2")
    public String test2() {
        if (true) {
            throw new RuntimeException("a exception occured");
        }
        return "Hello World2";
    }

    @RequestMapping("test3")
    public String test3() throws InterruptedException {
        Thread.sleep(10000);
        return "Hello World3";
    }


}
