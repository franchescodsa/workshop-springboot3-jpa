package com.franchesco.Projetospring.entites.pk;

import java.io.Serializable;
import java.util.Objects;

import com.franchesco.Projetospring.entites.Order;
import com.franchesco.Projetospring.entites.Product;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Embeddable
public class OrderItemPk implements Serializable {
    
    private static final long serialVersionUID = 1L;

    @ManyToOne // Relaciomento muitos pra um
    @JoinColumn(name = "order_id")
    private Order order;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public int hashCode() {
        return Objects.hash(order, product);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        OrderItemPk that = (OrderItemPk) obj;
        return Objects.equals(order, that.order) && Objects.equals(product, that.product);
    }
}