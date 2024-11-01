package service;

import java.util.List;

public interface ConsultaService {
    public void adicionarConsulta(Consulta consulta);
    public void removerConsulta(Consulta consulta);
    public List<Consulta> listarConsultas();
    public Consulta buscarConsulta(Long id);
}