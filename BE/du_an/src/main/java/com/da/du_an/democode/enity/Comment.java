package com.da.du_an.democode.enity;

import com.da.du_an.democode.enity.base.PrimaryEntity;
import com.da.du_an.democode.infrastructure.contain.EntityProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Nationalized;

import java.util.List;

@Entity
@Table(name = "comment")
@Getter
@Setter

public class Comment extends PrimaryEntity {

    @Column(length = EntityProperties.LENGTH_NOTE)
    @Nationalized
    private String comment;

    @OneToMany(mappedBy = "comment", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonManagedReference
    private List<ImgComment> images;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "detail_movie_id")
    private DetailMovie detailMovie;

}
