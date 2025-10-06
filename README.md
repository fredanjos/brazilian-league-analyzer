# Brazilian League Analyzer

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=java&logoColor=white)
![Maven](https://img.shields.io/badge/Maven-C71A36?style=for-the-badge&logo=apache-maven&logoColor=white)

Projeto para analisar dados históricos do Campeonato Brasileiro de Futebol, abrangendo o período de 2003 a 2022. O objetivo é extrair estatísticas e insights relevantes a partir de um conjunto de arquivos CSV, demonstrando a manipulação e processamento de dados em Java.

## 📊 Análises Realizadas

O programa foi desenvolvido para extrair as seguintes informações:

* 🏆 **Time com mais vitórias em 2008:** Identifica o clube que acumulou o maior número de vitórias na temporada de 2008.
* 📉 **Estado com menos jogos:** Aponta o estado da federação que sediou o menor número de partidas no período completo (2003-2022).
* ⚽ **Maior artilheiro:** Revela o jogador que marcou o maior número de gols em toda a série histórica.
* 🎯 **Maior artilheiro de pênaltis:** Mostra o jogador com mais gols marcados de pênalti.
* 🥅 **Jogador com mais gols contras:** Identifica o jogador que mais marcou gols contra.
* 🟨 **Jogador com mais cartões amarelos:** Apresenta o atleta que recebeu o maior número de cartões amarelos.
* 🟥 **Jogador com mais cartões vermelhos:** Lista o jogador que foi expulso mais vezes.
* 💥 **Placar da partida com mais gols:** Exibe o resultado da partida que teve o maior somatório de gols.

## 📈 Resultados da Análise

Após a execução do programa, os seguintes dados foram apurados:

| Categoria                                 | Resultado                                      |
| :---------------------------------------- | :--------------------------------------------- |
| **Time que mais venceu em 2008** | **Grêmio** (21 vitórias)                       |
| **Estado com menos jogos (2003-2022)** | **Alagoas (AL)** (19 jogos)                    |
| **Jogador que mais fez gols** | **Gabriel Barbosa** (92 gols)                  |
| **Jogador que mais fez gols de pênaltis** | **Fábio Santos** (22 gols)                     |
| **Jogador que mais fez gols contras** | **Paulo Marcos de Jesus Ribeiro** (3 gols)     |
| **Jogador com mais cartões amarelos** | **Thiago Heleno** (61 cartões)                 |
| **Jogador com mais cartões vermelhos** | **David Braz** |
| **Placar da partida com mais gols** | **Bahia 4 x 7 Santos** (11 gols)               |

## 📁 Fonte dos Dados

Os dados utilizados neste projeto foram obtidos do repositório [adaoduque/Brasileirao_Dataset](https://github.com/adaoduque/Brasileirao_Dataset) no GitHub. Os seguintes arquivos foram utilizados:

* `campeonato-brasileiro-full.csv`
* `campeonato-brasileiro-estatisticas-full.csv`
* `campeonato-brasileiro-gols.csv`
* `campeonato-brasileiro-cartoes.csv`

## 🛠️ Como Executar o Projeto

Para executar este projeto, você precisará ter o **Java** e o **Maven** instalados em sua máquina.

**1. Clone o repositório:**

```bash
git clone [https://github.com/seu-usuario/brazilian-league-analyzer.git](https://github.com/seu-usuario/brazilian-league-analyzer.git)
cd brazilian-league-analyzer
```

**2. Compile o projeto com o Maven:**
```bash
mvn clean install
```

**3. Execute o arquivo JAR gerado:**
```bash
java -jar target/analise-brasileirao-1.0-SNAPSHOT.jar
```

📝 Licença
Este projeto está sob a licença MIT. Veja o arquivo LICENSE para mais detalhes.