package com.da.du_an.democode.enity.base;

import com.da.du_an.democode.infrastructure.listener.CreatePrimaryEntityListener;
import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@MappedSuperclass
@EntityListeners(CreatePrimaryEntityListener.class)

public abstract class PrimaryEntity extends AuditEntity implements IsIdentified {

    @Id
    @Column(length = 50, updatable = false)
    private String id;

}
