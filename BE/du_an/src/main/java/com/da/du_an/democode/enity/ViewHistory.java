package com.da.du_an.democode.enity;

import com.da.du_an.democode.enity.base.PrimaryEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "view_history")
@Getter
@Setter

public class ViewHistory extends PrimaryEntity {

    @ManyToOne
    @JoinColumn(name = "detail_movie_id")
    private DetailMovie detailMovie;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    private Long date;

}
