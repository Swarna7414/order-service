package Store.Order_Service.Service;

import Store.Order_Service.DTO.OrderLineItemsDao;
import Store.Order_Service.DTO.OrderRequest;
import Store.Order_Service.Model.Order;
import Store.Order_Service.Model.OrderLineItems;
import Store.Order_Service.Repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public void PlaceOder(OrderRequest orderRequest){
        Order order= new Order();
        order.setOrdernumber(UUID.randomUUID().toString());

        List<OrderLineItems> orderLineItemsList=orderRequest.getOrderLineItemsDao().stream().map(orderLineItemsDao -> mapToOrderLineItems(orderLineItemsDao)).toList();
        order.setOrderLineItemsList(orderLineItemsList);
        orderRepository.save(order);
    }

    private OrderLineItems mapToOrderLineItems(OrderLineItemsDao orderLineItemsDao){
        OrderLineItems orderLineItems= new OrderLineItems();
        orderLineItems.setPrice(orderLineItemsDao.getPrice());
        orderLineItems.setQuantity(orderLineItemsDao.getQuantity());
        orderLineItems.setSkucode(orderLineItemsDao.getSkucode());
        return orderLineItems;
    }
}
