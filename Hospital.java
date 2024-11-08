/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.agendamentohospitalar;

/**
 *
 * @author icuro
 */
public class Hospital {
    private int id;
    private int agendamentoId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAgendamentoId() {
        return agendamentoId;
    }

    public void setAgendamentoId(int agendamentoId) {
        this.agendamentoId = agendamentoId;
    }

    public Hospital(int id, int agendamentoId) {
        this.id = id;
        this.agendamentoId = agendamentoId;
    }
    
    
}
