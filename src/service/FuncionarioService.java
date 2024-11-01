package service;

import java.util.List;

public interface FuncionarioService {
    public void adicionarFuncionario(Funcionario funcionario);
    public void removerFuncionario(Funcionario funcionario);
    public List<Funcionario> listarFuncionarios();
    public Funcionario buscarFuncionario(Long id);
}