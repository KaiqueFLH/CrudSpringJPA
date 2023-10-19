package net.weg.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Seguradora {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Integer id;
    private Long cnpj;
    private String nome;
    @OneToOne(cascade = CascadeType.PERSIST)
    private Endereco endereco;
    @ManyToMany(cascade = CascadeType.PERSIST)
    @JsonIgnore
    private Set<Cliente> clientes;


}
