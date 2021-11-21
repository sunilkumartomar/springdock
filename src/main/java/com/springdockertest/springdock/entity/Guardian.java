package com.springdockertest.springdock.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@AttributeOverrides({
        @AttributeOverride(
                name = "name",
                column = @Column(name = "guardina_name")
        ),
        @AttributeOverride(
                name = "email",
                column = @Column(name = "guardina_email")
        ),
        @AttributeOverride(
                name = "mobile",
                column = @Column(name = "guardina_mobile")
        )
})
public class Guardian {

    private String guardianName;
    private String guardianEmail;
    private String guardianMobile;

}
