package com.ndogga.portfolio;


import java.util.UUID;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;

@Getter
@Entity
public class DummyEntity {

    @Id
    private UUID id;
}
