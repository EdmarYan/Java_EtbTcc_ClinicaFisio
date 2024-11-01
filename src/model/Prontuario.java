package model;

import java.util.List;

public class Prontuario {
    private Long id;
    private Paciente paciente;
    private List<RegistroAtendimento> historico;
    private List<Prescricao> prescricoes;
    private List<Exame> exames;

    public Prontuario(Long id, Paciente paciente, List<RegistroAtendimento> historico, List<Prescricao> prescricoes, List<Exame> exames) {
        this.id = id;
        this.paciente = paciente;
        this.historico = historico;
        this.prescricoes = prescricoes;
        this.exames = exames;
    }

    public void adicionarRegistro(RegistroAtendimento registro) {
        // Implementar lógica para adicionar registro
        historico.add(registro);
    }

    public void atualizarHistorico(List<RegistroAtendimento> novoHistorico) {
        // Implementar lógica para atualizar histórico
        this.historico = novoHistorico;
    }

    public void anexarExames(List<Exame> novosExames) {
        // Implementar lógica para anexar exames
        this.exames.addAll(novosExames);
    }

    // Getters e Setters
}
