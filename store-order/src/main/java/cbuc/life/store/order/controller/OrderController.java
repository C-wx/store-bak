package cbuc.life.store.order.controller;

import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: cbuc
 * @date: 2021-06-09 23:25
 * @description: 订单服务控制器
 */
@RestController
@RequestMapping("order")
public class OrderController {

    @GetMapping("/{id:.+}")
    public String detail(@PathVariable String id) {
        return StringUtils.join("获取到了ID为", id, "的商品");
    }
}
