package org.univ_paris8.iut.montreuil.qdev.tp2024.gr2.QuizzDesGenies.entities.bo;

public class QuestionBO {

    private String id_question;
    private String num_question;
    private String langue;
    private String libelle_question;
    private String reponse;
    private String difficulte;
    private String explication;
    private String reference;

    public QuestionBO(String id_question, String num_question, String langue, String libelle_question, String reponse, String difficulte, String explication, String reference) {
        this.id_question = id_question;
        this.num_question = num_question;
        this.langue = langue;
        this.libelle_question = libelle_question;
        this.reponse = reponse;
        this.difficulte = difficulte;
        this.explication = explication;
        this.reference = reference;
    }

    public String getId_question() {
        return id_question;
    }

    public void setId_question(String id_question) {
        this.id_question = id_question;
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

    @Override
    public String toString() {
        return "QuestionBO{" +
                "id_question='" + id_question + '\'' +
                ", num_question='" + num_question + '\'' +
                ", langue='" + langue + '\'' +
                ", libelle_question='" + libelle_question + '\'' +
                ", reponse='" + reponse + '\'' +
                ", difficulte='" + difficulte + '\'' +
                ", explication='" + explication + '\'' +
                ", reference='" + reference + '\'' +
                '}';
    }
}
