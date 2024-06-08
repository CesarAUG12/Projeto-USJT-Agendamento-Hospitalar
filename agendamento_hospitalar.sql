CREATE DATABASE agendamento_hospitalar;
USE agendamento_hospitalar;

-- Criação das tabelas
CREATE TABLE Usuario (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100),
    senha VARCHAR(25)
);

CREATE TABLE Convenio (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome_convenio VARCHAR(100) NOT NULL
);

CREATE TABLE Plano_saude (
    id INT AUTO_INCREMENT PRIMARY KEY,
    plano_de_saude VARCHAR(45)
);

CREATE TABLE Especialidade(
id INT AUTO_INCREMENT PRIMARY KEY,
nome_especialidade VARCHAR(45)
);

CREATE TABLE Paciente (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    data_nascimento DATE,
    cpf VARCHAR(11) UNIQUE NOT NULL,
    id_convenio INT,
    FOREIGN KEY (id_convenio) REFERENCES Convenio(id)
);

CREATE TABLE Hospital (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome_hospital VARCHAR(100) NOT NULL,
    endereco VARCHAR(100),
    telefone VARCHAR(15)
);

CREATE TABLE Medico (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome_medico VARCHAR(100)
   
);



CREATE TABLE Agendamento (
    id INT AUTO_INCREMENT PRIMARY KEY,
    data_hora varchar(45), 
    id_paciente INT,
    id_medico INT,
    id_hospital INT,
    id_convenio INT,
    id_plano_de_saude INT,
    id_especialidade INT,
    FOREIGN KEY (id_paciente) REFERENCES Paciente(id),
    FOREIGN KEY (id_hospital) REFERENCES Hospital(id),
    FOREIGN KEY (id_medico) REFERENCES Medico(id),
    FOREIGN KEY (id_convenio) REFERENCES Convenio(id),
    FOREIGN KEY (id_plano_de_saude) REFERENCES Plano_saude(id),
    FOREIGN KEY (id_especialidade) REFERENCES Especialidade(id)
);

-- Inserção de dados
INSERT INTO Usuario (nome, senha) VALUES ("admin", "1234");

INSERT INTO Convenio (nome_convenio) VALUES ("SUS"), ("Bradesco Saúde"), ("Unimed");

INSERT INTO Plano_saude (plano_de_saude) VALUES ("Atendimento Público"), ("Premium"), ("Fama");

INSERT INTO Paciente (nome, data_nascimento, cpf, id_convenio) VALUES 
    ("Ícaro", "2005-02-10", "43692339855", 1),
    ("César", "2004-08-12", "4369555523", 2),
    ("Andrey", "2005-05-15", "4369558883", 3);

INSERT INTO Medico (nome_medico) VALUES 
	("Tulio"),
    ("Fábio" ),
    ("Fernando");
    
   INSERT INTO Especialidade (nome_especialidade) VALUES
   ("Ortopedista"),
   ("Clínico Geral"),
   ("Neurologista");

INSERT INTO Hospital (nome_hospital, endereco, telefone) VALUES 
    ("Hospital de Diadema", "Rua A, 202", "232323"),
    ("Hospital Municipal", "Rua B, 404", "11832432"),
    ("Hospital Santa Casa", "Rua C, 505", "1189348");

-- Consulta para verificar os dados inseridos
SELECT * FROM Convenio;
SELECT * FROM Plano_saude;
SELECT * FROM Paciente;
SELECT * FROM Medico;
SELECT * FROM Hospital;
SELECT * FROM Agendamento;
SELECT * FROM Especialidade;

-- Consulta para verificar os agendamentos
SELECT ag.id, data_hora, hos.nome_hospital AS HOSPITAL, pac.nome AS NOME_PACIENTE, med.nome_medico AS NOME_MEDICO, con.nome_convenio AS CONVENIO, plan.plano_de_saude AS PLANO, esp.nome_especialidade AS ESPECIALIDADE
FROM agendamento ag
JOIN medico med ON ag.id_medico = med.id
JOIN paciente pac ON ag.id_paciente = pac.id
JOIN hospital hos ON ag.id_hospital = hos.id
JOIN convenio con ON ag.id_convenio = con.id
JOIN plano_saude plan ON ag.id_plano_de_saude = plan.id
JOIN especialidade esp ON ag.id_especialidade = esp.id;
