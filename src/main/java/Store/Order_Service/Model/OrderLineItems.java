package Store.Order_Service.Model;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "order_line_item")
public class OrderLineItems {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String skucode;

    private BigDecimal price;

    private Integer quantity;

    public OrderLineItems() {
    }

    public OrderLineItems(Long id, String skucode, BigDecimal price, Integer quantity) {
        this.id = id;
        this.skucode = skucode;
        this.price = price;
        this.quantity = quantity;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSkucode() {
        return skucode;
    }

    public void setSkucode(String skucode) {
        this.skucode = skucode;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
