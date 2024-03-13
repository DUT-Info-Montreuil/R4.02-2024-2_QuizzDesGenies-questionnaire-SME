package org.univ_paris8.iut.montreuil.qdev.tp2024.gr2.QuizzDesGenies.entities.mapper;

import org.univ_paris8.iut.montreuil.qdev.tp2024.gr2.QuizzDesGenies.entities.bo.QuestionBO;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr2.QuizzDesGenies.entities.dto.QuestionDTO;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr2.QuizzDesGenies.utils.enums.Langue;

public class QuestionBoVersQuestionDTOMapper {

    public QuestionDTO convetir(QuestionBO questionBO) {
        int num_question = Integer.parseInt(questionBO.getNum_question());
        int id_question = Integer.parseInt(questionBO.getId_question());
        Langue langue = Langue.valueOf(questionBO.getLangue());
        String libelle_question = questionBO.getLibelle_question();
        String explication = questionBO.getExplication();
        int difficulte = Integer.parseInt(questionBO.getDifficulte());
        return new QuestionDTO(num_question,id_question,langue,libelle_question,explication,difficulte);
    }
}