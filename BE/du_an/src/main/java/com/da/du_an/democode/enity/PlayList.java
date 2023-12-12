package com.da.du_an.democode.enity;

import com.da.du_an.democode.enity.base.PrimaryEntity;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "play_list")
@Getter
@Setter

public class PlayList extends PrimaryEntity {

    private String playlistName;

    private int favoriteOrder;

    @JsonBackReference
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

}
