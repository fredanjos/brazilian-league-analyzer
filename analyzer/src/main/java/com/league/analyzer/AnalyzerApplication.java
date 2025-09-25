package com.league.analyzer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.league.analyzer.model.Card;
import com.league.analyzer.model.Goal;
import com.league.analyzer.model.Match;
import com.league.analyzer.service.AnalysisService;
import com.league.analyzer.service.CsvReaderService;

@SpringBootApplication
public class AnalyzerApplication implements CommandLineRunner {

    @Autowired
    private CsvReaderService csvReaderService;

    @Autowired
    private AnalysisService analysisService;

    public static void main(String[] args) {
        SpringApplication.run(AnalyzerApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Application started. Reading data from CSV files...");

        List<Match> allMatches = csvReaderService.readMatches();

        if (!allMatches.isEmpty()) {
            System.out.println("Successfully loaded " + allMatches.size() + " matches.");
            analysisService.findTopWinnerOf2008(allMatches);
            analysisService.findStateWithFewestMatches(allMatches);
            analysisService.findMatchWithMostGoals(allMatches);
        } else {
            System.out.println("Could not load match data. Please check the logs.");
        }

        List<Goal> allGoals = csvReaderService.readGoals();

        if (!allGoals.isEmpty()) {
            System.out.println("Successfully loaded " + allGoals.size() + " goals.");
            analysisService.findTopScorer(allGoals);
            analysisService.findTopPenaltyScorer(allGoals);
            analysisService.findTopOwnGoalScorer(allGoals);
        } else {
            System.out.println("Could not load goal data.");
        }

        List<Card> allCards = csvReaderService.readCards();

        if (!allCards.isEmpty()) {
            System.out.println("Successfully loaded " + allCards.size() + " cards.");
            analysisService.findPlayerWithMostYellowCards(allCards);
            analysisService.findPlayerWithMostRedCards(allCards);
        } else {
            System.out.println("Could not load card data.");
        }
    }
}
