package Service;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;


@Builder
@AllArgsConstructor
@Data
public class Cliente {

    private String nome;
    private String cpf;
    private LocalDate dataNascimeto;
    private int quantidadeDePessoas;




}
