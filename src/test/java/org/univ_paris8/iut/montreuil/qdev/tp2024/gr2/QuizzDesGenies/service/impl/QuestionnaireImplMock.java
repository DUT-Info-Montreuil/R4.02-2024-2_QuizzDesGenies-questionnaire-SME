package org.univ_paris8.iut.montreuil.qdev.tp2024.gr2.QuizzDesGenies.service.impl;

import org.univ_paris8.iut.montreuil.qdev.tp2024.gr2.QuizzDesGenies.entities.dto.QuestionDTO;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr2.QuizzDesGenies.entities.dto.QuestionnaireDTO;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr2.QuizzDesGenies.entities.dto.QuestionnairesDTO;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr2.QuizzDesGenies.services.interfaces.IQuestionnaire;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr2.QuizzDesGenies.utiles.enums.Langue;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr2.QuizzDesGenies.utiles.exceptions.FichierNonTrouverException;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class QuestionnaireImplMock implements IQuestionnaire {


    @Override
    public QuestionnaireDTO chargerQuestionnaireCSV(String path) throws FichierNonTrouverException {

        //1;1;fr;De quel petit objet se munit le golfeur pour surélever sa balle avant de la frapper ?;Tee;1;Le joueur peut poser sa balle sur une cheville de bois ou de plastique qui ne peut pas être utilisée en dehors des départs.;https://fr.wikipedia.org/wiki/Matériel_de_golf

        if (path == null){
            throw new FichierNonTrouverException("Message pas trouver");
        }

        QuestionDTO test = new QuestionDTO(1,1,Langue.fr,"De quel petit objet se munit le golfeur pour surélever sa balle avant de la frapper ?","Tee",1);
        QuestionnaireDTO demTest = new QuestionnaireDTO();

        demTest.addQuestion(test);

        return demTest;
    }

    /*@Override
    public QuestionnaireDTO chargerQuestionnaireCSV(String path) {
        ArrayList<QuestionDTO> listeQuestionnaire = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String ligne;
            while ((ligne = br.readLine()) != null) {
                String[] champs = ligne.split(";");
                if (champs.length >= 5) { // Vérifier si la ligne a suffisamment de champs
                    int idQuestion = Integer.parseInt(champs[0]);
                    int numQuestion = Integer.parseInt(champs[2]);
                    Langue langue = Langue.valueOf(champs[3].toUpperCase());
                    String libelleQuestion = champs[4];
                    String reponse = champs[5];
                    int difficulte = Integer.parseInt(champs[6]);

                    QuestionDTO question = new QuestionDTO(idQuestion, numQuestion, langue, libelleQuestion, reponse, difficulte);
                    listeQuestionnaire.add(question);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Contenu de la liste listeQuestionnaire : " + listeQuestionnaire);
        QuestionnaireDTO questionnaireDTO = new QuestionnaireDTO(listeQuestionnaire);

        return questionnaireDTO;
    }*/
}
