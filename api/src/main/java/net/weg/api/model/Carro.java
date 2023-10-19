package net.weg.api.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.ResultSet;
import java.sql.SQLException;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
//@Table(name = "tb_Clube")
public class Carro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //    @Column(name = "nome",length = 350)
    private Integer id;
    private String marca,cor,modelo;
    private Double preco;
    private Integer ano;
    @OneToOne(mappedBy = "veiculo")
    private Seguro seguro;
}
