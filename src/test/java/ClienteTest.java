import Service.Cliente;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class ClienteTest {
    public static void main(String[] args) {


        Cliente cliente1 = new Cliente("João", "1111111", LocalDate.of(1993, Month.DECEMBER, 5), 10);
        Cliente cliente2 = new Cliente("Maria", "2222222", LocalDate.of(1994, Month.AUGUST, 6), 5);
        Cliente cliente3 = new Cliente("José", "3333333", LocalDate.of(1995, Month.APRIL, 8), 9);
        Cliente cliente4 = new Cliente("Abrão", "4444444", LocalDate.of(1996, Month.FEBRUARY, 21), 7);
        Cliente cliente5 = new Cliente("Eva", "5555555", LocalDate.of(1997, Month.JANUARY, 30), 8);


        List<Cliente> clientes = new ArrayList<>();
        clientes.add(cliente1);
        clientes.add(cliente2);
        clientes.add(cliente3);
        clientes.add(cliente4);
        clientes.add(cliente5);

        clientes.stream().filter(c -> c.getNome() != "João")
                .forEach(c -> System.out.println(c.getNome()));

        int sum = clientes.stream().filter(c -> c.getNumeroDeFamiliar() > 5)
                .mapToInt(c -> c.getNumeroDeFamiliar()).sum();

        System.out.println(sum);

    }

}
