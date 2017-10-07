package com.ifpb.dac.entidades;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

/**
 *
 * @author rodrigobento
 */
@Entity
@SequenceGenerator(name = "minha_seq_aula",
        sequenceName = "seq_aula",
        initialValue = 1439,
        allocationSize = 1)
public class Aula implements Serializable {
    
    @Id
    @GeneratedValue(generator = "minha_seq_aula", strategy = GenerationType.SEQUENCE)
    private int cod_aula;
    @Column(name = "dia", length = 15, nullable = false)
    private String dia;
    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "codigo_curso")
    private Curso curso;
    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "codigo_disc")
    private Disciplina disciplina;
    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "codigo_hora")
    private Horario horario;
    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "codigo_prof")
    private Professor professor;
    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "codigo_sala")
    private Sala sala;
    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "codigo_lab")
    private Laboratorio laboratorio;
    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "codigo_turma")
    private Turma turma;

    public Aula(String dia, Curso curso, Disciplina disciplina, Horario horario, Professor professor, Sala sala, Laboratorio laboratorio, Turma turma) {
        this.dia = dia;
        this.curso = curso;
        this.disciplina = disciplina;
        this.horario = horario;
        this.professor = professor;
        this.sala = sala;
        this.laboratorio = laboratorio;
        this.turma = turma;
    }

    public Aula() {
    }

    public int getCod_Aula() {
        return cod_aula;
    }

    public void setCod_Aula(int id) {
        this.cod_aula = id;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public Horario getHorario() {
        return horario;
    }

    public void setHorario(Horario horario) {
        this.horario = horario;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public Laboratorio getLaboratorio() {
        return laboratorio;
    }

    public void setLaboratorio(Laboratorio laboratorio) {
        this.laboratorio = laboratorio;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }
    
}
