package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.OrderService;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MemberController {

    @Autowired
    OrderService orderService;

    @RequestMapping("/getMember")
    public List<String> getMember() {
        List<String> list = new ArrayList<String>();
        list.add("zhangsan");
        list.add("zhangsan1");
        list.add("zhangsan2");
        list.add("zhangsan3");
        return list;
    }

    @RequestMapping("/getAllUsers")
    public List<String> getAllUsers() {
        return orderService.getAllUser();
    }
}