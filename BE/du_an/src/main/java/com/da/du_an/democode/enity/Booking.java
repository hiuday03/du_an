package com.da.du_an.democode.enity;

import com.da.du_an.democode.enity.base.PrimaryEntity;
import com.da.du_an.democode.infrastructure.contain.EntityProperties;
import com.da.du_an.democode.infrastructure.contain.StatusBooking;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Nationalized;

import java.math.BigDecimal;

@Entity
@Table(name = "booking")
@Getter
@Setter
public class Booking extends PrimaryEntity {

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    private StatusBooking status;

    private BigDecimal totalPrice;

    private Long startDate;

    private Long endDate;

    @Nationalized
    private String name;

    @Column(length = EntityProperties.LENGTH_EMAIL)
    @Nationalized
    private String email;

    @Column(length = EntityProperties.LENGTH_PHONE)
    @Nationalized
    private String phoneNumber;

    @Nationalized
    private String note;
}
