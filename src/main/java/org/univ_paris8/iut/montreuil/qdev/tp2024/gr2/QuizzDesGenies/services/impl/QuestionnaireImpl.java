package org.univ_paris8.iut.montreuil.qdev.tp2024.gr2.QuizzDesGenies.services.impl;

import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.exceptions.CsvException;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr2.QuizzDesGenies.entities.bo.QuestionBO;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr2.QuizzDesGenies.entities.dto.QuestionDTO;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr2.QuizzDesGenies.entities.dto.QuestionnaireDTO;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr2.QuizzDesGenies.entities.mapper.QuestionBoVersQuestionDTOMapper;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr2.QuizzDesGenies.services.interfaces.IQuestionnaire;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr2.QuizzDesGenies.utiles.exceptions.FichierNonTrouverException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class QuestionnaireImpl implements IQuestionnaire {

    @Override
    public QuestionnaireDTO chargerQuestionnaireCSV(String path) throws FichierNonTrouverException {
        ArrayList<QuestionBO> newQuestionnaireBo = new ArrayList<>();
        QuestionnaireDTO questionnaireDTO = new QuestionnaireDTO();
        try {
            FileReader filereader = new FileReader(path);
            CSVParser parser = new CSVParserBuilder().withSeparator(';').build();
            CSVReader csvReader = new CSVReaderBuilder(filereader).withCSVParser(parser).build();
            List<String[]> allData = csvReader.readAll();

            for (String[] row : allData) {
                String id_questionnaire = row[0];
                String num_question = row[1];
                String langue = row[2];
                String libelle_question = row[3];
                String reponse = row[4];
                String difficulte = row[5];
                String explication = row[6];
                String reference = row[7];

                newQuestionnaireBo.add(new QuestionBO(id_questionnaire, num_question, langue, libelle_question, reponse, difficulte, explication, reference));
            }

            for(QuestionBO q : newQuestionnaireBo) {
                QuestionDTO question = new QuestionBoVersQuestionDTOMapper().convetir(q);
                questionnaireDTO.addQuestion(question);
            }

            csvReader.close();
        } catch (FileNotFoundException | CsvException e) {
            throw new FichierNonTrouverException("Le fichier n'a pas été trouvé sur le chemin suivant : " + path);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return questionnaireDTO;
    }
}