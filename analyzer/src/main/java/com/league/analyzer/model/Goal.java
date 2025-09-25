package com.league.analyzer.model;

import com.opencsv.bean.CsvBindByName;

import lombok.Data;

@Data
public class Goal {

    @CsvBindByName(column = "partida_id")
    private int matchId;

    @CsvBindByName(column = "rodata")
    private int round;

    @CsvBindByName(column = "clube")
    private String club;

    @CsvBindByName(column = "atleta")
    private String player;

    @CsvBindByName(column = "minuto")
    private String minute;

    @CsvBindByName(column = "tipo_de_gol")
    private String goalType;
}
