package sideprj.sidejpa.domain.item;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import sideprj.sidejpa.domain.Address;
import sideprj.sidejpa.domain.Order;

@Entity
@Getter @Setter
public class Delivery {

    @Id @GeneratedValue
    @Column(name = "delivery_id")
    private Long id;

    @OneToOne
    @JoinColumn(name = "order_id")
    private Order order;

    @Embedded
    private Address address;

    @Enumerated(EnumType.ORDINAL)
    private DeliveryStatus status; //READY, COMP
}
