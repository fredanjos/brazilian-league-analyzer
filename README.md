# brazilian-league-analyzer
Project to analyze data from the Brazilian Football Championship.

Análise dos Dados do Campeonato Brasileiro (2003-2022)
Aqui estão os insights extraídos dos conjuntos de dados:

Time que mais venceu jogos no ano 2008: Grêmio com 21 vitorias

Estado que teve menos jogos no período 2003 e 2022: Alagoas (AL) com 19 jogos

Jogador que mais fez gols: Gabriel Barbosa com 92 gols

Jogador que mais fez gols de pênaltis: Fábio Santos com 22 gols

Jogador que mais fez gols contras: Paulo Marcos de Jesus Ribeiro com 3 gols

Jogador que mais recebeu cartões amarelos: Thiago Heleno com 61 cartões amarelos

Jogador que mais recebeu cartões vermelhos: David Braz cartões vermelhos

Placar da partida com mais gols: Bahia 4 x 7 Santos com 11 gols

README para o Projeto em Java
Abaixo está um exemplo de um arquivo README.md bem estruturado para o seu projeto em Java.

Análise de Dados do Campeonato Brasileiro (2003-2022)
📖 Sobre
Este projeto em Java realiza uma análise detalhada de dados históricos do Campeonato Brasileiro de Futebol, abrangendo o período de 2003 a 2022. O objetivo é extrair estatísticas e insights relevantes a partir de um conjunto de arquivos CSV, demonstrando a manipulação e processamento de dados em Java.

📊 Análises Realizadas
O programa foi desenvolvido para extrair as seguintes informações:

🏆 Time com mais vitórias em 2008: Identifica o clube que acumulou o maior número de vitórias na temporada de 2008.

📉 Estado com menos jogos: Aponta o estado da federação que sediou o menor número de partidas no período completo (2003-2022).

⚽ Maior artilheiro: Revela o jogador que marcou o maior número de gols em toda a série histórica.

🎯 Maior artilheiro de pênaltis: Mostra o jogador com mais gols marcados de pênalti.

🥅 Jogador com mais gols contras: Identifica o jogador que mais marcou gols contra.

🟨 Jogador com mais cartões amarelos: Apresenta o atleta que recebeu o maior número de cartões amarelos.

🟥 Jogador com mais cartões vermelhos: Lista o jogador que foi expulso mais vezes.

💥 Placar da partida com mais gols: Exibe o resultado da partida que teve o maior somatório de gols.

📈 Resultados da Análise
Após a execução do programa, os seguintes dados foram apurados:

Categoria	Resultado
Time que mais venceu jogos no ano 2008: Grêmio com 21 vitorias
Estado que teve menos jogos no período 2003 e 2022: Alagoas (AL) com 19 jogos
Jogador que mais fez gols: Gabriel Barbosa com 92 gols
Jogador que mais fez gols de pênaltis: Fábio Santos com 22 gols
Jogador que mais fez gols contras: Paulo Marcos de Jesus Ribeiro com 3 gols
Jogador que mais recebeu cartões amarelos: Thiago Heleno com 61 cartões amarelos
Jogador que mais recebeu cartões vermelhos: David Braz cartões vermelhos
Placar da partida com mais gols: Bahia 4 x 7 Santos com 11 gols

Exportar para as Planilhas
📁 Fonte dos Dados
Os dados utilizados neste projeto foram obtidos do repositório adaoduque/Brasileirao_Dataset no GitHub. Os seguintes arquivos foram utilizados:

campeonato-brasileiro-full.csv

campeonato-brasileiro-estatisticas-full.csv

campeonato-brasileiro-gols.csv

campeonato-brasileiro-cartoes.csv

🛠️ Como Executar o Projeto
Para executar este projeto, você precisará ter o Java e o Maven instalados em sua máquina.

Clone o repositório:

Bash

git clone https://github.com/seu-usuario/seu-repositorio-java.git
cd seu-repositorio-java
Compile o projeto com o Maven:

Bash

mvn clean install
Execute o arquivo JAR gerado:

Bash

java -jar target/analise-brasileirao-1.0-SNAPSHOT.jar
Ao executar, o programa irá ler os arquivos CSV da pasta src/main/resources, processar os dados e exibir os resultados no console.

📝 Licença
Este projeto está sob a licença MIT. Veja o arquivo LICENSE para mais detalhes.