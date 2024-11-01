package controller;

import java.util.List;

public class PacienteController {
    private PacienteService pacienteService;

    public PacienteController(PacienteService pacienteService) {
        this.pacienteService = pacienteService;
    }

    public void adicionarPaciente(Paciente paciente) {
        pacienteService.adicionarPaciente(paciente);
    }

    public void removerPaciente(Paciente paciente) {
        pacienteService.removerPaciente(paciente);
    }

    public List<Paciente> listarPacientes() {
        return pacienteService.listarPacientes();
    }

    public Paciente buscarPaciente(Long id) {
        return pacienteService.buscarPaciente(id);
    }
}