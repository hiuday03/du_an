package com.da.du_an.democode.enity;

import com.da.du_an.democode.enity.base.PrimaryEntity;
import com.da.du_an.democode.infrastructure.contain.EntityProperties;
import com.da.du_an.democode.infrastructure.contain.MovieRank;
import com.da.du_an.democode.infrastructure.contain.StatusMovie;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Nationalized;

import java.util.List;

@Entity
@Table(name = "detail_movie")
@Getter
@Setter

public class DetailMovie extends PrimaryEntity {

    @ManyToOne
    @JoinColumn(name = "movie_id")
    private Movie movie;

    private Double point;

    private Double price;

    @ManyToOne
    @JoinColumn(name = "country_id")
    private Country country;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;


    @OneToMany(mappedBy = "movie", cascade = CascadeType.ALL)
    @JsonManagedReference
    private List<Video> videos;

    private MovieRank movieType;

    @Column(length = EntityProperties.LENGTH_NOTE, name = "[desc]")
    @Nationalized
    private String desc;

    private StatusMovie status;

}
