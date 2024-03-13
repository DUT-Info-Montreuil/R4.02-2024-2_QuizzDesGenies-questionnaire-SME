package org.univ_paris8.iut.montreuil.qdev.tp2024.gr2.QuizzDesGenies.entities.dto;

import org.univ_paris8.iut.montreuil.qdev.tp2024.gr2.QuizzDesGenies.utiles.enums.Langue;

public class QuestionDTO {

    private int id_question;
    private int num_question;
    private Langue langue;
    private String libelle_question;
    private String reponse;
    private int difficulte;

    public QuestionDTO(int id_question, int num_question, Langue langue, String libelle_question, String reponse, int difficulte) {
        this.id_question = id_question;
        this.num_question = num_question;
        this.langue = langue;
        this.libelle_question = libelle_question;
        this.reponse = reponse;
        this.difficulte = difficulte;
    }

    public int getId_question() {
        return id_question;
    }

    public void setId_question(int id_question) {
        this.id_question = id_question;
    }

    public int getNum_question() {
        return num_question;
    }

    public void setNum_question(int num_question) {
        this.num_question = num_question;
    }

    public Langue getLangue() {
        return langue;
    }

    public void setLangue(Langue langue) {
        this.langue = langue;
    }

    public String getLibelle_question() {
        return libelle_question;
    }

    public void setLibelle_question(String libelle_question) {
        this.libelle_question = libelle_question;
    }

    public String getReponse() {
        return reponse;
    }

    public void setReponse(String reponse) {
        this.reponse = reponse;
    }

    public int getDifficulte() {
        return difficulte;
    }

    public void setDifficulte(int difficulte) {
        this.difficulte = difficulte;
    }

    @Override
    public String toString() {
        return "QuestionDTO{" +
                "id_question=" + id_question +
                ", num_question=" + num_question +
                ", langue=" + langue +
                ", libelle_question='" + libelle_question + '\'' +
                ", reponse='" + reponse + '\'' +
                ", difficulte=" + difficulte +
                '}';
    }
}