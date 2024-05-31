package com.clientapi.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import lombok.Data;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDate;

@MappedSuperclass
@Data
public class Audit {

    @CreatedDate
    @Column( name = "created_at", nullable = false, length = 35 )
    private LocalDate createdAt;

    /** The created by. */
    @CreatedBy
    @Column( name = "created_by", nullable = false, length = 100 )
    private String createdBy;

    @LastModifiedDate
    @Column( name = "updated_at", nullable = false, length = 35 )
    private LocalDate updatedAt;

    @LastModifiedBy
    @Column( name = "updated_by", nullable = false, length = 100 )
    private String updatedBy;

    @Column( name = "deleted_at", length = 35 )
    private LocalDate deletedAt;

    @Column( name = "deleted_by", length = 100 )
    private String deletedBy;

}
