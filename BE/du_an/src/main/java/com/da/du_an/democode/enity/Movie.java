package com.da.du_an.democode.enity;

import com.da.du_an.democode.enity.base.PrimaryEntity;
import com.da.du_an.democode.infrastructure.contain.EntityProperties;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Nationalized;

@Entity
@Table(name = "movie")
@Getter
@Setter

public class Movie extends PrimaryEntity {

    @Column(length = EntityProperties.LENGTH_NAME)
    @Nationalized
    private String name;

    @Nationalized
    private String anotherName;

    private Integer broadcastTime;

    private Integer EndTime;

    @Nationalized
    private String author;

    private String image;

}
