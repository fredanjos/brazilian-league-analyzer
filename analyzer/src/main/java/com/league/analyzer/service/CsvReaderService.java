package com.league.analyzer.service;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Service;

import com.league.analyzer.model.Card;
import com.league.analyzer.model.Goal;
import com.league.analyzer.model.Match;
import com.opencsv.bean.CsvToBeanBuilder;

@Service
public class CsvReaderService {

    public List<Match> readMatches() {
        String fileName = "src/main/resources/data/campeonato-brasileiro-full.csv";

        try {
            List<Match> matches = new CsvToBeanBuilder<Match>(new FileReader(fileName))
                    .withType(Match.class)
                    .withIgnoreLeadingWhiteSpace(true)
                    .build()
                    .parse();

            return matches;

        } catch (FileNotFoundException e) {
            System.err.println("Error: The file was not found at " + fileName);
            e.printStackTrace();
            return Collections.emptyList();
        }
    }

    public List<Goal> readGoals() {
        String fileName = "src/main/resources/data/campeonato-brasileiro-gols.csv";

        try {
            List<Goal> goals = new CsvToBeanBuilder<Goal>(new FileReader(fileName))
                    .withType(Goal.class)
                    .withIgnoreLeadingWhiteSpace(true)
                    .build()
                    .parse();
            return goals;
        } catch (FileNotFoundException e) {
            System.err.println("Error: The file was not found at " + fileName);
            e.printStackTrace();
            return Collections.emptyList();
        }
    }

    public List<Card> readCards() {
        String fileName = "src/main/resources/data/campeonato-brasileiro-cartoes.csv";

        try {
            List<Card> cards = new CsvToBeanBuilder<Card>(new FileReader(fileName))
                    .withType(Card.class)
                    .withIgnoreLeadingWhiteSpace(true)
                    .build()
                    .parse();
            return cards;
        } catch (FileNotFoundException e) {
            System.err.println("Error: The file was not found at " + fileName);
            e.printStackTrace();
            return Collections.emptyList();
        }
    }
}
