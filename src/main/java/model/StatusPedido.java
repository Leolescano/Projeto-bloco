package model;

public enum StatusPedido {
    PAGAMENTO_PENDENTE("Aguardando Pagamento"),
    PAGAMENTO_CONFIRMADO("Pagamento Confirmado"),
    PREPARANDO_ENVIO("Preparando para Envio"),
    POSTADO("Objeto Postado"),
    EM_TRANSITO("Em Trânsito"),
    SAIU_PARA_ENTREGA("Saiu para Entrega"),
    ENTREGUE("Entregue"),
    ENTREGA_FALHADA("Tentativa de Entrega Falhada"),
    CANCELADO("Cancelado");

    private final String descricao;

    StatusPedido(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
