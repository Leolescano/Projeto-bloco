package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@AllArgsConstructor
@Getter
@Setter
public class Pedido {
    private Long id;
    private String numeroPedido;
    private String codigoRastreio;
    private StatusPedido statusAtual;
    private LocalDateTime dataCompra;
    private LocalDate previsaoEntrega;
    private LocalDateTime dataEntrega;
    private BigDecimal valorTotal;
    private Boolean pagamentoConfirmado;
    private Long clienteId;

    public Pedido() {}

    public Pedido(Long id, String numeroPedido, String codigoRastreio, StatusPedido statusAtual, LocalDateTime dataCompra, LocalDate previsaoEntrega, BigDecimal valorTotal, Boolean pagamentoConfirmado, Long clienteId) {
        this.id = id;
        this.numeroPedido = numeroPedido;
        this.codigoRastreio = codigoRastreio;
        this.statusAtual = statusAtual;
        this.dataCompra = dataCompra;
        this.previsaoEntrega = previsaoEntrega;
        this.valorTotal = valorTotal;
        this.pagamentoConfirmado = pagamentoConfirmado;
        this.clienteId = clienteId;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "id=" + id +
                ", numeroPedido='" + numeroPedido + '\'' +
                ", statusAtual=" + statusAtual +
                ", valorTotal=" + valorTotal +
                ", clienteId=" + clienteId +
                '}';
    }
}
