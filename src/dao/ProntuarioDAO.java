package dao;

import java.util.List;
import model.Prontuario;

public interface ProntuarioDAO {
    void adicionarProntuario(Prontuario prontuario);
    void removerProntuario(Prontuario prontuario);
    List<Prontuario> listarProntuarios();
    Prontuario buscarProntuario(Long id);
}
