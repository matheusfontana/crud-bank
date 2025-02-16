package br.com.sicredi.canaisdigitais.avaliacaotecnicacanais.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.Data;

import javax.annotation.Nullable;

@Data
public class EnderecoDTO {

    @NotBlank
    private String logradouro;

    @Positive
    private int numero;

    @NotBlank
    private String cidade;

    @NotBlank
    private String bairro;

    @NotBlank
    private String estado;

    //@JsonIgnore - FIX OPCAO 3, em conjunto com o FIX OPCAO 2
    //@Nullable //FIX OPCAO 2
    //private String cep; //FIX OPCAO 2
}
