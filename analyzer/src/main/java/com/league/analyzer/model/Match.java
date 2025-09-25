package com.league.analyzer.model;

import com.opencsv.bean.CsvBindByName;

import lombok.Data;

@Data
public class Match {

    @CsvBindByName(column = "ID")
    private int id;

    @CsvBindByName(column = "rodata")
    private int round;

    @CsvBindByName(column = "data")
    private String date;

    @CsvBindByName(column = "mandante")
    private String homeTeam;

    @CsvBindByName(column = "visitante")
    private String awayTeam;

    @CsvBindByName(column = "vencedor")
    private String winner;

    @CsvBindByName(column = "mandante_placar")
    private int homeGoals;

    @CsvBindByName(column = "visitante_placar")
    private int awayGoals;

    @CsvBindByName(column = "mandante_estado")
    private String homeState;

    @CsvBindByName(column = "visitante_estado")
    private String awayState;
}
