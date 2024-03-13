package org.univ_paris8.iut.montreuil.qdev.tp2024.gr2.QuizzDesGenies.entities.bo;

public class QuestionBO {

    private String id_questionnaire;
    private String num_question;
    private String langue;
    private String libelle_question;
    private String reponse;
    private String difficulte;
    private String explication;
    private String reference;

    public QuestionBO(String id_questionnaire, String num_question, String langue, String libelle_question, String reponse, String difficulte, String explication, String reference) {
        this.id_questionnaire = id_questionnaire;
        this.num_question = num_question;
        this.langue = langue;
        this.libelle_question = libelle_question;
        this.reponse = reponse;
        this.difficulte = difficulte;
        this.explication = explication;
        this.reference = reference;
    }

    public String getId_questionnaire() {
        return id_questionnaire;
    }

    public void setId_questionnaire(String id_questionnaire) {
        this.id_questionnaire = id_questionnaire;
    }

    public String getNum_question() {
        return num_question;
    }

    public void setNum_question(String num_question) {
        this.num_question = num_question;
    }

    public String getLangue() {
        return langue;
    }

    public void setLangue(String langue) {
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

    public String getDifficulte() {
        return difficulte;
    }

    public void setDifficulte(String difficulte) {
        this.difficulte = difficulte;
    }

    public String getExplication() {
        return explication;
    }

    public void setExplication(String explication) {
        this.explication = explication;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }


}
