package com.muhammet.bootstrap.repository.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Table(name = "tblmusteri")
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class Musteri {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    Long id;
    String ad;
    String soyad;
    String adres;
}
