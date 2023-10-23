package net.weg.api.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@IdClass(SeguroIdClass.class)
public class Seguro {
//Geração de id de forma padrão
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Integer id;

// Geração de Id para Chave primaria composta.
//    @EmbeddedId
//    private SeguroId id;


// Geração de Id para Chave primaria composta com IDCLASS(classeId.class)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer seguroId;
    @Id
    private Integer seguradoraId;

    private Double valor;
    private String descricao;
    private Double valorFranquia;
    @ManyToOne
//    @MapsId("seguradoraId")
    @JoinColumn(name = "seguradoraId")
    private Seguradora seguradora;
    @OneToOne
//    @MapsId("carroId")
    private Carro veiculo;
    @ManyToOne
    private Cliente cliente;
}
