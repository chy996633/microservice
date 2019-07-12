package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

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
@Service
public class OrderService {

    @Autowired
    private RestTemplate restTemplate;

    /**
     * http： 这里是写member-server里面的访问路径。 getMember是访问方法
     * @return
     */
    public List<String> getAllUser(){
        return restTemplate.getForObject("http://server-member/getMember", List.class);
    }

}