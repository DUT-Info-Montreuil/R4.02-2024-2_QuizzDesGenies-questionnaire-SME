package org.univ_paris8.iut.montreuil.qdev.tp2024.gr2.QuizzDesGenies.util;


import org.junit.*;

import org.univ_paris8.iut.montreuil.qdev.tp2024.gr2.QuizzDesGenies.entities.dto.QuestionnaireDTO;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr2.QuizzDesGenies.service.impl.QuestionnaireImplMock;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr2.QuizzDesGenies.services.interfaces.IQuestionnaire;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr2.QuizzDesGenies.utiles.exceptions.FichierNonTrouverException;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class TestQuestion {


    @Test
    public void testChargerQuestionnaireCSV() throws FichierNonTrouverException {
        //IQuestionnaire questionnaire = new QuestionnaireImpl();
        IQuestionnaire questionnaire = new QuestionnaireImplMock();

        String chemin = "/home/etudiants/info/angatchou/Bureau/Semetre3/Dev Efficace/R4.02-2024-2_QuizzDesGenies-questionnaire-SME/src/main/java/org/univ_paris8/iut/montreuil/qdev/tp2024/gr2/QuizzDesGenies/ressources/questionsQuizz_V1.1.csv";

        QuestionnaireDTO questions = questionnaire.chargerQuestionnaireCSV(chemin);
        assertNotNull("La méthode chargerQuestionnaireCSV ne doit pas renvoyer null", questions);
    }

}
