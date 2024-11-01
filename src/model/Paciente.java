package model;

public class Paciente extends Usuario {
    private String historico;
    private String convenio; // Simplificado para String
    private String prontuario; // Simplificado para String

    public void agendarConsulta() {
        // Implementar lógica para agendar consulta
    }

    public void cancelarConsulta() {
        // Implementar lógica para cancelar consulta
    }

    public void visualizarHistorico() {
        // Implementar lógica para visualizar histórico
    }

    public void avaliarAtendimento() {
        // Implementar lógica para avaliar atendimento
    }

    // Getters e Setters
    public String getHistorico() {
        return historico;
    }

    public void setHistorico(String historico) {
        this.historico = historico;
    }

    public String getConvenio() {
        return convenio;
    }

    public void setConvenio(String convenio) {
        this.convenio = convenio;
    }

    public String getProntuario() {
        return prontuario;
    }

    public void setProntuario(String prontuario) {
        this.prontuario = prontuario;
    }
}