package model;

import java.time.DateTime;
import model.Status.StatusConsulta;

public class Consulta {
    private Long id;
    private DateTime data;
    private StatusConsulta Status;
    private Paciente paciente;
    private Fisioterapeuta fisioterapeuta;

    public void agendar() {
        // Implementar lógica para agendar consulta
    }

    public void cancelar() {
        // Implementar lógica para cancelar consulta
    }

    public void reagendar() {
        // Implementar lógica para reagendar consulta
    }

    public void confirmarPresenca() {
        // Implementar lógica para confirmar presença
    }

    // Getters e Setters
}