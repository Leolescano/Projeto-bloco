package model;

import lombok.*;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Cliente extends Usuario {
    private Long id;
    private String nome;
    private String email;
    private String telefone;
    private String endereco;
    private LocalDateTime dataRegistro;
    private Boolean ativo;

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", ativo=" + ativo +
                '}';
    }
}
