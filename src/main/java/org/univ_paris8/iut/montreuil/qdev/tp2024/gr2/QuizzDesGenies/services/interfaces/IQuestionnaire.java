package org.univ_paris8.iut.montreuil.qdev.tp2024.gr2.QuizzDesGenies.services.interfaces;

import org.univ_paris8.iut.montreuil.qdev.tp2024.gr2.QuizzDesGenies.entities.bo.QuestionBO;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr2.QuizzDesGenies.utiles.exceptions.FichierNonTrouverException;

import java.util.ArrayList;

public interface IQuestionnaire {

    public ArrayList<QuestionBO> chargerQuestionnaireCSV(String path) throws FichierNonTrouverException;

}
