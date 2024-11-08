/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.agendamentohospitalar;

/**
 *
 * @author icuro
 */
public class Data {
    private String data_hora;
    private int agendamentoId;

    public int getAgendamentoId() {
        return agendamentoId;
    }
    public Data(String data_hora, int agendamentoId) {
        this.data_hora = data_hora;
        this.agendamentoId = agendamentoId;
    }

    public String getData_hora() {
        return data_hora;
    }

    public void setData_hora(String data_hora) {
        this.data_hora = data_hora;
    }
    
}
