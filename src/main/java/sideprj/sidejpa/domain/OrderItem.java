package sideprj.sidejpa.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import sideprj.sidejpa.domain.item.Item;

@Entity
@Getter
@Setter
public class OrderItem {

    @Id @GeneratedValue
    @Column(name = "order_item_id")
    private Long id;

    @ManyToMany
    @JoinColumn(name = "item_id")
    private Item item;

    @ManyToMany
    @JoinColumn(name = "order_id")
    private Order order;

    private int orderPrice; //주문 가격
    private int count; // 주문 수량

}
