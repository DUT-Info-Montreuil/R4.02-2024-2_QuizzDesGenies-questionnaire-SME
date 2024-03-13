package org.univ_paris8.iut.montreuil.qdev.tp2024.gr2.QuizzDesGenies.entities.dto;

import java.util.ArrayList;

public class QuestionnairesDTO {

    private ArrayList<QuestionnaireDTO> liste_questionnaire;

    public QuestionnairesDTO(ArrayList<QuestionnaireDTO> liste_questionnaire) {
        this.liste_questionnaire = liste_questionnaire;
    }

    public ArrayList<QuestionnaireDTO> getListe_questionnaire() {
        return liste_questionnaire;
    }

    public void setListe_questionnaire(ArrayList<QuestionnaireDTO> liste_questionnaire) {
        this.liste_questionnaire = liste_questionnaire;
    }

    @Override
    public String toString() {
        return "QuestionnairesDTO{" +
                "liste_questionnaire=" + liste_questionnaire +
                '}';
    }
}
