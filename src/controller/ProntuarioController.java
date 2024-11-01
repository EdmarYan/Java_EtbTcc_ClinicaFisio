package controller;

import java.util.List;
import model.Prontuario;
import service.ProntuarioService;

public class ProntuarioController {
    private ProntuarioService prontuarioService;

    public ProntuarioController(ProntuarioService prontuarioService) {
        this.prontuarioService = prontuarioService;
    }

    public void adicionarProntuario(Prontuario prontuario) {
        if (prontuario != null) {
            prontuarioService.adicionarProntuario(prontuario);
        } else {
            throw new IllegalArgumentException("Prontuário inválido.");
        }
    }

    public void removerProntuario(Prontuario prontuario) {
        if (prontuario != null) {
            prontuarioService.removerProntuario(prontuario);
        } else {
            throw new IllegalArgumentException("Prontuário inválido.");
        }
    }

    public List<Prontuario> listarProntuarios() {
        return prontuarioService.listarProntuarios();
    }

    public Prontuario buscarProntuario(Long id) {
        if (id != null) {
            return prontuarioService.buscarProntuario(id);
        } else {
            throw new IllegalArgumentException("ID inválido.");
        }
    }
}
