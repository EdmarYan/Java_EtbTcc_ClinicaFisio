package dao;

import java.util.List;

public interface PacienteDAO {
    public void adicionarPaciente(Paciente paciente);
    public void removerPaciente(Paciente paciente);
    public List<Paciente> listarPacientes();
    public Paciente buscarPaciente(Long id);
}