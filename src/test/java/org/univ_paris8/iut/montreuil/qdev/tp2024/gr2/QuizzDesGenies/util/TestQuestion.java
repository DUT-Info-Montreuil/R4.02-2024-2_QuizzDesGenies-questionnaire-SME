package org.univ_paris8.iut.montreuil.qdev.tp2024.gr2.QuizzDesGenies.util;

import org.junit.Test;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr2.QuizzDesGenies.entities.dto.QuestionDTO;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr2.QuizzDesGenies.entities.dto.QuestionnaireDTO;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr2.QuizzDesGenies.service.impl.QuestionnaireImplMock;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr2.QuizzDesGenies.services.interfaces.IQuestionnaire;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr2.QuizzDesGenies.utiles.exceptions.FichierNonTrouverException;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import static org.junit.Assert.assertTrue;

public class TestQuestion {

    @Test
    public void testChargerQuestionnaireCSV() throws FichierNonTrouverException {
        // Initialisation
        IQuestionnaire questionnaire = new QuestionnaireImplMock();
        String chemin = "/home/etudiants/info/angatchou/Bureau/Semetre3/Dev Efficace/R4.02-2024-2_QuizzDesGenies-questionnaire-SME/src/main/java/org/univ_paris8/iut/montreuil/qdev/tp2024/gr2/QuizzDesGenies/ressources/questionsQuizz_V1.1.csv";

        // Exécution
        QuestionnaireDTO questions = questionnaire.chargerQuestionnaireCSV(chemin);

        // Vérification
        assertTrue("La méthode chargerQuestionnaireCSV doit retourner un questionnaire non vide", questions != null && !questions.getQuestionnaire().isEmpty());

        for (QuestionDTO question : questions.getQuestionnaire()) {
            assertTrue("L'ID de la question doit être supérieur à zéro", question.getId_question() > 0);
            assertTrue("Le numéro de la question doit être supérieur à zéro", question.getNum_question() > 0);
            assertTrue("La langue doit être définie", question.getLangue() != null);
            assertTrue("Le libellé de la question ne doit pas être vide", !question.getLibelle_question().isEmpty());
            assertTrue("La réponse de la question ne doit pas être vide", !question.getReponse().isEmpty());
            assertTrue("La difficulté de la question doit être supérieure ou égale à zéro", question.getDifficulte() >= 0);
        }

    }

    @Test
    public void testChargerQuestionnaireCSVFichierNonTrouve() throws FichierNonTrouverException {
        //IQuestionnaire questionnaire = new QuestionnaireImplMock();
        //String chemin = "src/test/java/org/univ_paris8/iut/montreuil/qdev/tp2024/gr2/QuizzDesGenies/service/impl/QuestionnaireImplMock.java";
          String chemin = " ";


        File file = new File(chemin);

        if (!file.exists()){
            throw  new FichierNonTrouverException("le fichier n'as pas été trouver");
        }
    }
}
