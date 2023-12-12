package com.da.du_an.democode.infrastructure.listener;

import com.da.du_an.democode.enity.base.PrimaryEntity;
import jakarta.persistence.PrePersist;

import java.util.UUID;

public class CreatePrimaryEntityListener {

    @PrePersist
    private void onCreate(PrimaryEntity entity){
        entity.setId(UUID.randomUUID().toString());
    }

}
