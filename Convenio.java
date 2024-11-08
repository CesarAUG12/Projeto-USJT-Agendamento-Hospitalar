
package com.mycompany.agendamentohospitalar;

/**
 *
 * @author icuro
 */
public class Convenio {
    private int id;
    private String nome_convenio;
    private String plano_saude;
     private int agendamentoId;

    public int getAgendamentoId() {
        return agendamentoId;
    }

    public void setAgendamentoId(int agendamentoId) {
        this.agendamentoId = agendamentoId;
    }
     
    public Convenio(int id, int agendamentoId) {
        this.id = id;
        this.agendamentoId = agendamentoId;
    }         

    public Convenio(int id, String nome_convenio, String plano_saude, int agendamentoId) {
        this.id = id;
        this.nome_convenio = nome_convenio;
        this.plano_saude = plano_saude;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome_convenio() {
        return nome_convenio;
    }

    public void setNome_convenio(String nome_convenio) {
        this.nome_convenio = nome_convenio;
    }

    public String getPlano_saude() {
        return plano_saude;
    }

    public void setPlano_saude(String plano_saude) {
        this.plano_saude = plano_saude;
    }
    
    
}
