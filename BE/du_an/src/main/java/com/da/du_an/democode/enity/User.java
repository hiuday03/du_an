package com.da.du_an.democode.enity;


import com.da.du_an.democode.enity.base.PrimaryEntity;
import com.da.du_an.democode.infrastructure.contain.EntityProperties;
import com.da.du_an.democode.infrastructure.contain.Role;
import com.da.du_an.democode.infrastructure.contain.StatusUser;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Nationalized;

import java.util.List;

@Entity
@Table(name = "[user]")
@Getter
@Setter

public class User extends PrimaryEntity {

    @Column(length = EntityProperties.LENGTH_CODE)
    @Nationalized
    private String code;

    @Column(length = EntityProperties.LENGTH_NAME)
    @Nationalized
    private String name;

    private Long birthday;

    private Boolean gender;

    @Nationalized
    private String address;

    @Column(length = EntityProperties.LENGTH_PHONE)
    @Nationalized
    private String phoneNumber;

    @Column(length = EntityProperties.LENGTH_EMAIL)
    @Nationalized
    private String email;

    @Nationalized
    private String username;

    @Nationalized
    private String password;

    @Nationalized
    private String avatarUrl;

    private StatusUser status;

    private Role role;

    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
    private List<PlayList> playLists;

}
