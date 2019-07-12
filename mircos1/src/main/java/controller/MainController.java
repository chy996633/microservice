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

    @RequestMapping("/start")
    public void start() {
        System.out.println("service1 start");
    }

}
