package DIO.LabsPadroesProjetos.Model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
public class Cliente {
    @Id
    @GeneratedValue(strategy =  GenerationType.AUTO)
    private Long id;
    @NotBlank(message = "O nome do cliente não pode estar em branco")
    @Size(max = 100, message = "O nome do cliente deve ter no máximo 100 caracteres")
    private String nome;

    @ManyToOne
    private Endereco endereco;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
