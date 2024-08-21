package Store.Order_Service.DTO;

import java.util.List;

public class OrderRequest {
    private List<OrderLineItemsDao> orderLineItemsDao;

    public OrderRequest() {
    }
    public OrderRequest(List<OrderLineItemsDao> orderLineItemsDao) {
        this.orderLineItemsDao = orderLineItemsDao;
    }

    public List<OrderLineItemsDao> getOrderLineItemsDao() {
        return orderLineItemsDao;
    }

    public void setOrderLineItemsDao(List<OrderLineItemsDao> orderLineItemsDao) {
        this.orderLineItemsDao = orderLineItemsDao;
    }
}
