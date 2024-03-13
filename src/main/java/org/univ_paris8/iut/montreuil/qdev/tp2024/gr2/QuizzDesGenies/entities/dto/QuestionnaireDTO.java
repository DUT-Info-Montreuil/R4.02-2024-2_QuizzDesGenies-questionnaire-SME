package org.univ_paris8.iut.montreuil.qdev.tp2024.gr2.QuizzDesGenies.entities.dto;

import java.util.ArrayList;

public class QuestionnaireDTO {

    private ArrayList<QuestionDTO> questionnaire;

    public QuestionnaireDTO(ArrayList<QuestionDTO> questionnaire) {
        this.questionnaire = questionnaire;
    }

    public QuestionnaireDTO() {
        this.questionnaire = new ArrayList<>();
    }

    public ArrayList<QuestionDTO> getQuestionnaire() {
        return questionnaire;
    }

    public void setQuestionnaire(ArrayList<QuestionDTO> questionnaire) {
        this.questionnaire = questionnaire;
    }

    public void addQuestion(QuestionDTO question) {
        questionnaire.add(question);
    }

    public void deleteQuestion(QuestionDTO question) {
        questionnaire.remove(question);
    }

    @Override
    public String toString() {
        return "QuestionnaireDTO{" +
                "questionnaire=" + questionnaire +
                '}';
    }
}
