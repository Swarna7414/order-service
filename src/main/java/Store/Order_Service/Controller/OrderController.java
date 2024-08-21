package Store.Order_Service.Controller;

import Store.Order_Service.DTO.OrderRequest;
import Store.Order_Service.Service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public String placeholder(@RequestBody OrderRequest orderRequest){
        orderService.PlaceOder(orderRequest);
        return "Order Successfully placed";
    }

}
