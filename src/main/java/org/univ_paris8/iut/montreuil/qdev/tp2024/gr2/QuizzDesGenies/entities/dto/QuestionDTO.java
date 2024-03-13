package org.univ_paris8.iut.montreuil.qdev.tp2024.gr2.QuizzDesGenies.entities.dto;

import org.univ_paris8.iut.montreuil.qdev.tp2024.gr2.QuizzDesGenies.utils.enums.Langue;

public class QuestionDTO {

    private int id_question;
    private String num_question;
    private Langue langue;
    private String libelle_question;
    private String reponse;
    private int difficulte;

    public int getId_question() {
        return id_question;
    }

    public void setId_question(int id_question) {
        this.id_question = id_question;
    }

    public String getNum_question() {
        return num_question;
    }

    public void setNum_question(String num_question) {
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
}