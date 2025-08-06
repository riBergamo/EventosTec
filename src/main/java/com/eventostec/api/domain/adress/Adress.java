package com.eventostec.api.domain.adress;

import com.eventostec.api.domain.event.Event;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Table(name = "adress")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Adress {

    @Id
    @GeneratedValue
    private UUID id;

    private String uf;//estado
    private String city;

    @ManyToOne
    @JoinColumn(name = "event_id")
    private Event event;
}
