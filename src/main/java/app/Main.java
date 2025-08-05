package app;

import model.Cliente;
import model.Pedido;
import model.StatusPedido;
import service.CsvService;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        CsvService csvService = new CsvService();

        List<Cliente> clientesParaEscrever = Arrays.asList(
                new Cliente(1L, "Ana Silva", "ana.silva@email.com", "11987654321", "Rua das Flores, 123", LocalDateTime.now(), true),
                new Cliente(2L, "Bruno Costa", "bruno.costa@email.com", "21912345678", "Avenida Principal, 456", LocalDateTime.now(), true)
        );

        String clientesCsvPath = "clientes.csv";
        csvService.writeToCsv(clientesParaEscrever, clientesCsvPath);

        List<Cliente> clientesLidos = csvService.readFromCsv(clientesCsvPath, Cliente.class);

        System.out.println("\n--- Clientes lidos do CSV ---");
        clientesLidos.forEach(System.out::println);

        System.out.println("\n===================================\n");

        List<Pedido> pedidosParaEscrever = Arrays.asList(
                new Pedido(101L, "PED-001", "BR123456789", StatusPedido.ENTREGUE, LocalDateTime.now().minusDays(5), LocalDate.now().minusDays(2), LocalDateTime.now().minusDays(1), new BigDecimal("199.90"), true, 1L),
                new Pedido(102L, "PED-002", "BR987654321", StatusPedido.EM_TRANSITO, LocalDateTime.now().minusDays(2), LocalDate.now().plusDays(3), null, new BigDecimal("49.50"), true, 2L)
        );


        String pedidosCsvPath = "pedidos.csv";
        csvService.writeToCsv(pedidosParaEscrever, pedidosCsvPath);

        List<Pedido> pedidosLidos = csvService.readFromCsv(pedidosCsvPath, Pedido.class);

        System.out.println("\n--- Pedidos lidos do CSV ---");
        pedidosLidos.forEach(System.out::println);
    }
}
