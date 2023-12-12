package com.da.du_an.democode.enity;

import com.da.du_an.democode.enity.base.PrimaryEntity;
import com.da.du_an.democode.infrastructure.contain.StatusBooking;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
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

    @ManyToOne
    @JoinColumn(name = "detail_movie_id")
    private DetailMovie detailMovie;

    private BigDecimal totalPrice;

    private Long startDate;

    private Long endDate;

    @Nationalized
    private String note;

    private StatusBooking status;

}
