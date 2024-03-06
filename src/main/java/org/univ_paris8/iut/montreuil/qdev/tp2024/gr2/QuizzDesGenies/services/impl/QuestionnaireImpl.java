package org.univ_paris8.iut.montreuil.qdev.tp2024.gr2.QuizzDesGenies.services.impl;

import org.univ_paris8.iut.montreuil.qdev.tp2024.gr2.QuizzDesGenies.entities.dto.QuestionnaireDTO;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr2.QuizzDesGenies.services.interfaces.IQuestionnaire;

import java.util.ArrayList;
import java.util.Set;

public class QuestionnaireImpl implements IQuestionnaire {

    private ArrayList<QuestionnaireDTO> liste_questionnaires;

    public QuestionnaireImpl(ArrayList<QuestionnaireDTO> liste_questionnaires) {
        this.liste_questionnaires = liste_questionnaires;
    }

    @Override
    public ArrayList<QuestionnaireDTO> fournirListeQuestionnaires() {
        return liste_questionnaires;
    }

    @Override
    public QuestionnaireDTO fournirUnQuestionnaire(int numQuestionnaire) {
        return liste_questionnaires.get(numQuestionnaire);
    }

    @Override
    public void majStatQuestions() {

    }

    @Override
    public void fournirStatsQuestions() {

    }
}
