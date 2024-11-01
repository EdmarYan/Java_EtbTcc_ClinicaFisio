package controller;

import java.util.List;

public class ConsultaController {
    private ConsultaService consultaService;

    public ConsultaController(ConsultaService consultaService) {
        this.consultaService = consultaService ;
    }

    public void adicionarConsulta(Consulta consulta) {
        consultaService.adicionarConsulta(consulta);
    }

    public void removerConsulta(Consulta consulta) {
        consultaService.removerConsulta(consulta);
    }

    public List<Consulta> listarConsultas() {
        return consultaService.listarConsultas();
    }

    public Consulta buscarConsulta(Long id) {
        return consultaService.buscarConsulta(id);
    }
    
}