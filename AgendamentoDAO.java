package com.mycompany.agendamentohospitalar;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class AgendamentoDAO {

    public boolean existe(Usuario usuario)
            throws Exception {

        String sql = "SELECT * FROM "
                + "Usuario WHERE "
                + "nome = ? AND senha = ?";
        try (Connection conn
                = ConexaoBD.obtemConexao(); PreparedStatement ps
                = conn.prepareStatement(sql)) {
            ps.setString(1, usuario.getLogin());
            ps.setString(2, usuario.getSenha());
            try (ResultSet rs = ps.executeQuery()) {
                return rs.next();
            }
        }
    }

    public void agendar(Consulta consulta) throws Exception {
        String sql = "INSERT INTO Agendamento(data_hora, id_paciente, id_medico, id_hospital, id_convenio, id_plano_de_saude, id_especialidade) VALUES (?,?,?,?,?,?,?)";
        try (Connection conn = ConexaoBD.obtemConexao(); PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, consulta.getData_hora());
            ps.setInt(2, consulta.getId_paciente());
            ps.setInt(3, consulta.getId_medico());
            ps.setInt(4, consulta.getId_hospital());
            ps.setInt(5, consulta.getId_convenio());
            ps.setInt(6, consulta.getId_plano_saude());
            ps.setInt(7, consulta.getId_especialidade());
            ps.execute();
        }
    }

    public void atualizar(Consulta consulta) throws Exception {
        String sql = "UPDATE Agendamento SET data_hora = ?, id_paciente = ?, id_medico = ?, id_hospital = ?, id_convenio = ?, id_plano_de_saude = ? , id_especialidade = ?  WHERE id = ?";
        try (Connection conn = ConexaoBD.obtemConexao(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, consulta.getData_hora());
            ps.setInt(2, consulta.getId_paciente());
            ps.setInt(3, consulta.getId_medico());
            ps.setInt(4, consulta.getId_hospital());
            ps.setInt(5, consulta.getId_convenio());
            ps.setInt(6, consulta.getId_plano_saude());
            ps.setInt(7, consulta.getId_especialidade());
            ps.setInt(8, consulta.getId_plano_saude());
            ps.execute();
        }
    }

    public void atualizarConvenio(Convenio convenio) throws Exception {
        String sql = "UPDATE Agendamento SET id_convenio = ? WHERE id = ?";
        try (Connection conn = ConexaoBD.obtemConexao(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, convenio.getId());
            ps.setInt(2, convenio.getAgendamentoId());
            ps.execute();
        }
    }

    public void atualizarHospital(Hospital hospital) throws Exception {
        String sql = "UPDATE Agendamento SET id_hospital = ? WHERE id = ?";
        try (Connection conn = ConexaoBD.obtemConexao(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, hospital.getId());
            ps.setInt(2, hospital.getAgendamentoId());
            ps.execute();
        }
    }

    public void atualizarPlano(PlanoSaude plano) throws Exception {
        String sql = "UPDATE Agendamento SET id_plano_de_saude = ? WHERE id = ?";
        try (Connection conn = ConexaoBD.obtemConexao(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, plano.getId());
            ps.setInt(2, plano.getAgendamentoId());
            ps.execute();
        }
    }
    
    public void atualizarData(Data data) throws Exception {
        String sql = "UPDATE Agendamento SET data_hora = ? WHERE id = ?";
        try (Connection conn = ConexaoBD.obtemConexao(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, data.getData_hora());
            ps.setInt(2, data.getAgendamentoId());
            ps.execute();
        }
    }


    public void excluir(Consulta consulta) throws Exception {

        String sql = "DELETE FROM Agendamento Where id = ?";

        try (Connection conn = ConexaoBD.obtemConexao(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, consulta.getId());
            ps.execute();
        }
    }
}
