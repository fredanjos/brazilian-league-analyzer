package com.league.analyzer.model;

import com.opencsv.bean.CsvBindByName;

import lombok.Data;

@Data
public class Card {

    @CsvBindByName(column = "partida_id")
    private int matchId;

    @CsvBindByName(column = "clube")
    private String club;

    @CsvBindByName(column = "cartao")
    private String cardType;

    @CsvBindByName(column = "atleta")
    private String player;
}
