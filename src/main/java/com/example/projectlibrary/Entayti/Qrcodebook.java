package com.example.projectlibrary.Entayti;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Qrcodebook {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String nomi;

    @Column(nullable = false)
    private String muallif;

    @Column(nullable = false)
    private String janri;

    @Column(nullable = false)
    private String yil;

    @Column(nullable = false)
    private String katagoriya;

    @OneToOne(fetch = FetchType.LAZY)
    QrcodebookSourse qrcodebookSourse;
}
