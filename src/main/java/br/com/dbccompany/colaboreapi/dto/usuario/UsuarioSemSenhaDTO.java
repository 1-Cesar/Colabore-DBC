package br.com.dbccompany.colaboreapi.dto.usuario;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
public class UsuarioSemSenhaDTO {

    @Schema(description = "Nome do usuário")
    private String nome;

    private String email;

    private String foto;
}
