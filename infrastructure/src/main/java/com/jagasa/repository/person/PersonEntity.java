package com.jagasa.repository.person;

import com.jagasa.repository.address.AddressEntity;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "PERSON")
public class PersonEntity {

    @Id
    @Column(name = "PERSON_ID")
    private Integer personId;

    @Column(name = "NAME")
    private String name;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "ADDRESS", nullable = false)
    private AddressEntity address;

    @Column(name = "PHONE_NUMBER")
    private Integer phoneNumber;

}
