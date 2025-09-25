package com.league.analyzer.service;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.league.analyzer.model.Card;
import com.league.analyzer.model.Goal;
import com.league.analyzer.model.Match;

@Service
public class AnalysisService {

    public void findTopWinnerOf2008(List<Match> allMatches) {
        System.out.println("\n--- Analysis: Team with most wins in 2008 ---");

        Map<String, Long> winsByTeam = allMatches.stream()
                .filter(match -> match.getDate().contains("2008"))
                .filter(match -> !match.getWinner().equals("-"))
                .collect(Collectors.groupingBy(Match::getWinner, Collectors.counting()));

        var topWinnerEntry = winsByTeam.entrySet().stream()
                .max(Map.Entry.comparingByValue());

        if (topWinnerEntry.isPresent()) {
            System.out.println("Result -> The team with the most wins in 2008 is: "
                    + topWinnerEntry.get().getKey()
                    + " with " + topWinnerEntry.get().getValue() + " wins.");
        } else {
            System.out.println("Result -> Could not determine the top winner for 2008.");
        }
    }

    public void findStateWithFewestMatches(List<Match> allMatches) {
        System.out.println("\n--- Analysis: State with the fewest matches (2003-2022) ---");

        Map<String, Long> matchesByState = allMatches.stream()
                .filter(match -> match.getHomeState() != null && !match.getHomeState().isBlank())
                .collect(Collectors.groupingBy(Match::getHomeState, Collectors.counting()));

        var fewestMatchesEntry = matchesByState.entrySet().stream()
                .min(Map.Entry.comparingByValue());

        if (fewestMatchesEntry.isPresent()) {
            System.out.println("Result -> The state with the fewest matches is: "
                    + fewestMatchesEntry.get().getKey()
                    + " with " + fewestMatchesEntry.get().getValue() + " matches.");
        } else {
            System.out.println("Result -> Could not determine the state with the fewest matches.");
        }
    }

    public void findTopScorer(List<Goal> allGoals) {
        System.out.println("\n--- Analysis: Player with the most goals ---");

        Map<String, Long> goalsByPlayer = allGoals.stream()
                .filter(goal -> !"Gol Contra".equals(goal.getGoalType()))
                .collect(Collectors.groupingBy(Goal::getPlayer, Collectors.counting()));

        var topScorerEntry = goalsByPlayer.entrySet().stream()
                .max(Map.Entry.comparingByValue());

        if (topScorerEntry.isPresent()) {
            System.out.println("Result -> The top scorer is: "
                    + topScorerEntry.get().getKey()
                    + " with " + topScorerEntry.get().getValue() + " goals.");
        } else {
            System.out.println("Result -> Could not determine the top scorer.");
        }
    }

    public void findTopPenaltyScorer(List<Goal> allGoals) {
        System.out.println("\n--- Analysis: Player with the most penalty goals ---");

        Map<String, Long> penaltyGoalsByPlayer = allGoals.stream()
                .filter(goal -> "Penalty".equals(goal.getGoalType()))
                .collect(Collectors.groupingBy(Goal::getPlayer, Collectors.counting()));

        var topPenaltyScorerEntry = penaltyGoalsByPlayer.entrySet().stream()
                .max(Map.Entry.comparingByValue());

        if (topPenaltyScorerEntry.isPresent()) {
            System.out.println("Result -> The top penalty scorer is: "
                    + topPenaltyScorerEntry.get().getKey()
                    + " with " + topPenaltyScorerEntry.get().getValue() + " penalty goals.");
        } else {
            System.out.println("Result -> Could not determine the top penalty scorer.");
        }
    }

    public void findTopOwnGoalScorer(List<Goal> allGoals) {
        System.out.println("\n--- Analysis: Player with the most own goals ---");

        Map<String, Long> ownGoalsByPlayer = allGoals.stream()
                .filter(goal -> "Gol Contra".equals(goal.getGoalType()))
                .collect(Collectors.groupingBy(Goal::getPlayer, Collectors.counting()));

        var topOwnGoalScorerEntry = ownGoalsByPlayer.entrySet().stream()
                .max(Map.Entry.comparingByValue());

        if (topOwnGoalScorerEntry.isPresent()) {
            System.out.println("Result -> The player with the most own goals is: "
                    + topOwnGoalScorerEntry.get().getKey()
                    + " with " + topOwnGoalScorerEntry.get().getValue() + " own goals.");
        } else {
            System.out.println("Result -> Could not determine the player with the most own goals.");
        }
    }

    public void findPlayerWithMostYellowCards(List<Card> allCards) {
        System.out.println("\n--- Analysis: Player with the most yellow cards ---");

        Map<String, Long> yellowCardsByPlayer = allCards.stream()
                .filter(card -> "Amarelo".equals(card.getCardType()))
                .collect(Collectors.groupingBy(Card::getPlayer, Collectors.counting()));

        var topPlayerEntry = yellowCardsByPlayer.entrySet().stream()
                .max(Map.Entry.comparingByValue());

        if (topPlayerEntry.isPresent()) {
            System.out.println("Result -> The player with the most yellow cards is: "
                    + topPlayerEntry.get().getKey()
                    + " with " + topPlayerEntry.get().getValue() + " yellow cards.");
        } else {
            System.out.println("Result -> Could not determine the player with the most yellow cards.");
        }
    }

    public void findPlayerWithMostRedCards(List<Card> allCards) {
        System.out.println("\n--- Analysis: Player with the most red cards ---");

        Map<String, Long> redCardsByPlayer = allCards.stream()
                .filter(card -> "Vermelho".equals(card.getCardType()))
                .collect(Collectors.groupingBy(Card::getPlayer, Collectors.counting()));

        var topPlayerEntry = redCardsByPlayer.entrySet().stream()
                .max(Map.Entry.comparingByValue());

        if (topPlayerEntry.isPresent()) {
            System.out.println("Result -> The player with the most red cards is: "
                    + topPlayerEntry.get().getKey()
                    + " with " + topPlayerEntry.get().getValue() + " red cards.");
        } else {
            System.out.println("Result -> Could not determine the player with the most red cards.");
        }
    }

    public void findMatchWithMostGoals(List<Match> allMatches) {
        System.out.println("\n--- Analysis: Match with the most goals ---");

        Optional<Match> matchWithMostGoals = allMatches.stream()
                .max(Comparator.comparingInt(match -> match.getHomeGoals() + match.getAwayGoals()));

        if (matchWithMostGoals.isPresent()) {
            Match topMatch = matchWithMostGoals.get();
            int totalGoals = topMatch.getHomeGoals() + topMatch.getAwayGoals();

            System.out.println("Result -> The match with the most goals was: "
                    + topMatch.getHomeTeam() + " "
                    + topMatch.getHomeGoals() + " x "
                    + topMatch.getAwayGoals() + " "
                    + topMatch.getAwayTeam()
                    + ", with a total of " + totalGoals + " goals.");
        } else {
            System.out.println("Result -> Could not determine the match with the most goals.");
        }
    }
}
