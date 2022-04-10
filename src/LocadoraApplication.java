import domain.Carro;
import domain.Cliente;
import domain.ClienteCarro;

import java.time.LocalDateTime;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;
import java.util.stream.Stream;

public class LocadoraApplication {
    public static void main(String[] args) {
        Carro[] frota = new Carro[5];
        frota[0] = new Carro("ABC-1234", "Toyota", "Cinza Chumbo", "SW", 964, true);
        frota[1] = new Carro("DEF-5678", "Fiat", "Branco", "Toro", 123, true);
        frota[2] = new Carro("GHI-9012", "GM", "Preto", "Corsa", 1096, true);
        frota[3] = new Carro("JKL-3456", "Volks", "Passat", "SW", 80, true);
        frota[4] = new Carro("MNO-7890", "Ford", "Verde", "Ranger", 333, true);

        Queue<Cliente> filaCliente = new ArrayDeque<>(5);
        Cliente cliente0 = new Cliente("Antônio", "1234-5678", "Rua das Acácias, n. 1");
        Cliente cliente1 = new Cliente("Bruno", "2345-6789", "Rua das Belezas, n. 2");
        Cliente cliente2 = new Cliente("Carlos", "3456-7890", "Rua das Cores, n. 3");
        Cliente cliente3 = new Cliente("Duarte", "4567-8901", "Rua das Dobras, n. 4");
        Cliente cliente4 = new Cliente("Everaldo", "5678-9012", "Rua das Emengardas, n. 5");
        
        filaCliente.add(cliente0);
        filaCliente.add(cliente1);
        filaCliente.add(cliente2);
        filaCliente.add(cliente3);
        filaCliente.add(cliente4);
        
        ClienteCarro clienteCarro0 = new ClienteCarro(filaCliente.poll(), frota[0], LocalDateTime.now() ,"EMPRESTADO");
        ClienteCarro clienteCarro1 = new ClienteCarro(filaCliente.poll(), frota[1], LocalDateTime.now() ,"DEVOLVIDO");
        ClienteCarro clienteCarro2 = new ClienteCarro(filaCliente.poll(), frota[2], LocalDateTime.now() ,"EMPRESTADO");
        ClienteCarro clienteCarro3 = new ClienteCarro(filaCliente.poll(), frota[3], LocalDateTime.now() ,"DEVOLVIDO");
        ClienteCarro clienteCarro4 = new ClienteCarro(filaCliente.poll(), frota[4], LocalDateTime.now() ,"EMPRESTADO");
        
        ClienteCarro[] movimento = new ClienteCarro[5];
        movimento[0] = clienteCarro0;
        movimento[1] = clienteCarro1;
        movimento[2] = clienteCarro2;
        movimento[3] = clienteCarro3;
        movimento[4] = clienteCarro4;
        
        imprimirMovimento(movimento);
    }

    public static void imprimirMovimento(ClienteCarro[] movimento) {
    	Stream<ClienteCarro> stream = Arrays.stream(movimento);       
        stream.forEach(x -> System.out.println(x.toString()));
    }
}