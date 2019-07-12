package controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MemberController {

    @RequestMapping("/getMember")
    public List<String> getMember() {
        List<String> list = new ArrayList<String>();
        list.add("zhangsan");
        list.add("zhangsan1");
        list.add("zhangsan2");
        list.add("zhangsan3");
        return list;
    }

    @RequestMapping("/hello")
    public String index(@RequestParam String name) {
        return "hello "+name+"，this is first messge";
    }
}