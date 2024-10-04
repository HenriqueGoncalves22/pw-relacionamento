package br.com.etechas.pw_relacionamento.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "tbl_telefone")
@Getter
@Setter
public class Telefone {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int ddd;
    private String numero;

    @ManyToOne
    @JoinColumn(name = "id_proprietario")
    private Proprietario proprietario;


}
