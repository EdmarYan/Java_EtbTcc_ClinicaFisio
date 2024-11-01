package model;

public class Status {
public enum StatusConsulta {
    AGENDADA,
    CONFIRMADA,
    CANCELADA,
    REALIZADA,
    REMARCADA
}

public enum StatusPagamento {
    PENDENTE,
    PAGO,
    ATRASADO,
    CANCELADO
}
}
