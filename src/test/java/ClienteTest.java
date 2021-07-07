import Service.Cliente;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class ClienteTest {
    public static void main(String[] args) {


        Cliente cliente1 = Cliente.builder()
                .nome("João").cpf("111222333")
                .dataNascimeto(LocalDate.of(1999,Month.DECEMBER,5))
                .quantidadeDePessoas(10).build();

        Cliente cliente2 = Cliente.builder()
                .nome("Paulo").cpf("222233333")
                .dataNascimeto(LocalDate.of(1986,Month.JUNE,22))
                .quantidadeDePessoas(5).build();


        List<Cliente> clientes = new ArrayList<>();
        clientes.add(cliente1);
        clientes.add(cliente2);


        clientes.stream().filter(c -> c.getNome() != "João")
                .forEach(c -> System.out.println(c.getNome()));

        int sum = clientes.stream().filter(c -> c.getQuantidadeDePessoas() > 5)
                .mapToInt(c -> c.getQuantidadeDePessoas()).sum();

        System.out.println(sum);

    }

}
