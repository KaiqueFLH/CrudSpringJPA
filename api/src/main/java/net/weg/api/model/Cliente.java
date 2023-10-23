package net.weg.api.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Cliente extends Usuario{
//    @Id @GeneratedValue(strategy = GenerationType.TABLE) private int id;
//    @Column(name = "nome",length = 350)

    @OneToMany(cascade = CascadeType.PERSIST)
    private Set<Carro> carro;
    @OneToOne(cascade = CascadeType.PERSIST)
    private Habilitacao habilitacao;
    @OneToMany(mappedBy = "cliente", cascade = CascadeType.PERSIST)
    private Set<Seguro> seguros;


//    public Jogador() {
//    }

//    @Override
//    public String toString() {
//        return "Jogador{" +
//                "id=" + id +
//                ", nome='" + nome + '\'' +
//                ", golsMarcados=" + golsMarcados +
//                ", clubeFutebol=" + clubeFutebol +
//                '}';
//    }
}












