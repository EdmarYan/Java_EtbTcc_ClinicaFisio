package service;

import java.util.List;

public interface ConvenioService {
    public void adicionarConvenio(Convenio convenio);
    public void removerConvenio(Convenio convenio);
    public List<Convenio> listarConvenios();
    public Convenio buscarConvenio(Long id);
}