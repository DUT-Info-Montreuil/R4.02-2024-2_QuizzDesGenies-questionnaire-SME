package org.univ_paris8.iut.montreuil.qdev.tp2024.gr2.QuizzDesGenies.services.interfaces;

import org.univ_paris8.iut.montreuil.qdev.tp2024.gr2.QuizzDesGenies.entities.dto.QuestionnaireDTO;

import java.util.ArrayList;

public interface IQuestionnaire {

    public ArrayList<QuestionnaireDTO> fournirListeQuestionnaires();

    public QuestionnaireDTO fournirUnQuestionnaire(int numQuestionnaire);

    public void majStatQuestions();

    public void fournirStatsQuestions();

}
