package Service;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class Cardapio   {
    String prato;
    String sucos;
    String sobremesas;

    public Cardapio(String prato, String sucos, String sobremesas) {
        this.prato = prato;
        this.sucos = sucos;
        this.sobremesas = sobremesas;
    }
}
