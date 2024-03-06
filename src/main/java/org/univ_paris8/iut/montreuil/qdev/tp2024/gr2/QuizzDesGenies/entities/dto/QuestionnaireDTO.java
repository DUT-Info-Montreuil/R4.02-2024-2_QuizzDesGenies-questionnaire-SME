package org.univ_paris8.iut.montreuil.qdev.tp2024.gr2.QuizzDesGenies.entities.dto;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class QuestionnaireDTO {

    private String nom_questionnaire;
    private ArrayList<QuestionDTO> questionnaire;

    public QuestionnaireDTO(String nom_questionnaire, ArrayList<QuestionDTO> questionnaire) {
        this.nom_questionnaire = nom_questionnaire;
        this.questionnaire = questionnaire;
    }

    public QuestionnaireDTO(String nom_questionnaire) {
        this.nom_questionnaire = nom_questionnaire;
        this.questionnaire = new ArrayList<>();
    }

    public String getNom_questionnaire() {
        return nom_questionnaire;
    }

    public void setNom_questionnaire(String nom_questionnaire) {
        this.nom_questionnaire = nom_questionnaire;
    }

    public ArrayList<QuestionDTO> getQuestionnaire() {
        return questionnaire;
    }

    public void setQuestionnaire(ArrayList<QuestionDTO> questionnaire) {
        this.questionnaire = questionnaire;
    }
}