package controller;

import java.util.List;

public class FuncionarioController {
    private FuncionarioService funcionarioService;

    public FuncionarioController(FuncionarioService funcionarioService) {
        this.funcionarioService = funcionarioService;
    }

    public void adicionarFuncionario(Funcionario funcionario) {
        funcionarioService.adicionarFuncionario(funcionario);
    }

    public void removerFuncionario(Funcionario funcionario) {
        funcionarioService.removerFuncionario(funcionario);
    }

    public List<Funcionario> listarFuncionarios() {
        return funcionarioService.listarFuncionarios();
    }

    public Funcionario buscarFuncionario(Long id) {
        return funcionarioService.buscarFuncionario(id);
    }
}