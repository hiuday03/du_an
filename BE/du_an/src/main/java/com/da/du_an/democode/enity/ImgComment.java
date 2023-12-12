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
@Table(name = "img_comment")
@Getter
@Setter

public class ImgComment extends PrimaryEntity {

    @ManyToOne
    @JoinColumn(name = "comment_id")
    @JsonBackReference
    private Comment comment;

    @Nationalized
    private String imgUrl;

}
