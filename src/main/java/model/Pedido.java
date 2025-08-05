package model;

import com.opencsv.bean.CsvDate;
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
@NoArgsConstructor
public class Pedido {
    private Long id;
    private String numeroPedido;
    private String codigoRastreio;
    private StatusPedido statusAtual;
    @CsvDate("yyyy-MM-dd'T'HH:mm:ss.SSSSSSSSS")
    private LocalDateTime dataCompra;
    @CsvDate("yyyy-MM-dd")
    private LocalDate previsaoEntrega;
    @CsvDate("yyyy-MM-dd'T'HH:mm:ss.SSSSSSSSS")
    private LocalDateTime dataEntrega;
    private BigDecimal valorTotal;
    private Boolean pagamentoConfirmado;
    private Long clienteId;

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
