package service;

import java.util.List;
import model.Prontuario;

public interface ProntuarioService {
    void adicionarProntuario(Prontuario prontuario);
    void removerProntuario(Prontuario prontuario);
    List<Prontuario> listarProntuarios();
    Prontuario buscarProntuario(Long id);
}
