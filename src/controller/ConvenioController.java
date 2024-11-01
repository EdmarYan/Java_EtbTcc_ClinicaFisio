package controller;

import java.util.List;

public class ConvenioController {
    private ConvenioService convenioService;

    public ConvenioController(ConvenioService convenioService) {
        this.convenioService = convenioService;
    }

    public void adicionarConvenio(Convenio convenio) {
        convenioService.adicionarConvenio(convenio);
    }

    public void removerConvenio(Convenio convenio) {
        convenioService.removerConvenio(convenio);
    }

    public List<Convenio> listarConvenios() {
        return convenioService.listarConvenios();
    }

    public Convenio buscarConvenio(Long id) {
        return convenioService.buscarConvenio(id);
    }
}