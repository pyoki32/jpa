package sideprj.sidejpa.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import sideprj.sidejpa.domain.item.Delivery;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "orders")
@Getter @Setter
public class Order {

    @Id
    @GeneratedValue
    @Column(name = "order_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "member_id")
    private  Member member;

    @OneToMany(mappedBy = "order")
    private List<OrderItem> orderItems = new ArrayList<>();

    @OneToOne
    @JoinColumn(name ="deliver_id")
    private Delivery delivery;

    private LocalDateTime orderDate; //주문 시간

    @Enumerated(EnumType.ORDINAL)
    private  OrderStatus status; // 주문상태 [ORDER , CANCEL]
}
