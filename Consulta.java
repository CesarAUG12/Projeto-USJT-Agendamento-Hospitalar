/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.agendamentohospitalar;

import java.time.LocalDateTime;

/**
 *
 * @author icuro
 */
public class Consulta {

/**
 *
 * @author icuro
 */

    private int id;
    private String data_hora;
    private int id_paciente;
    private int id_medico;
    private int id_hospital;
    private int id_convenio;
    private int id_especialidade;
    private int id_plano_saude;

    
    public Consulta(int id) {
        this.id = id;
    }

    public int getId_especialidade() {
        return id_especialidade;
    }

    public void setId_especialidade(int id_especialidade) {
        this.id_especialidade = id_especialidade;
    }

    public int getId_plano_saude() {
        return id_plano_saude;
    }

    public void setId_plano_saude(int id_plano_saude) {
        this.id_plano_saude = id_plano_saude;
    }

    public Consulta(String data_hora) {
        this.data_hora = data_hora;
    }

    public int getId_convenio() {
        return id_convenio;
    }

    public void setId_convenio(int id_convenio) {
        this.id_convenio = id_convenio;
    }

    public Consulta(int id,String data_hora, int id_paciente,int id_hospital, int id_medico, int id_especialidade,  int id_convenio, int id_plano_saude) {
        this.id = id;
        this.data_hora = data_hora;
        this.id_paciente = id_paciente;
        this.id_medico = id_medico;
        this.id_hospital = id_hospital;
        this.id_convenio = id_convenio;
        this.id_especialidade = id_especialidade;
        this.id_plano_saude = id_plano_saude;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getData_hora() {
        return data_hora;
    }

    public void setData_hora(String data_hora) {
        this.data_hora = data_hora;
    }

    public int getId_paciente() {
        return id_paciente;
    }

    public void setId_paciente(int id_paciente) {
        this.id_paciente = id_paciente;
    }

    public int getId_medico() {
        return id_medico;
    }

    public void setId_medico(int id_medico) {
        this.id_medico = id_medico;
    }

    public int getId_hospital() {
        return id_hospital;
    }

    public void setId_hospital(int id_hospital) {
        this.id_hospital = id_hospital;
    }

}


