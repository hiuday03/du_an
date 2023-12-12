package com.da.du_an.democode.enity;

import com.da.du_an.democode.enity.base.PrimaryEntity;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Nationalized;

@Entity
@Table(name = "video")
@Getter
@Setter

public class Video extends PrimaryEntity {

    @ManyToOne
    @JoinColumn(name = "detail_movie_id")
    @JsonBackReference
    private DetailMovie detailMovie;

    @Nationalized
    private String videoUrl;

}
