NOTAÇÃO DE GRAFO DE FLUXO

1 → 2

2 → 3

3 → 4

4 → 5

5 → 6

6 → 7 (se sim)

6 → 8 (se não)

7 → 10

8 → 10

4 → 9 (se exceção)

9 → 10



COMPLEXIDADE CICLOMÁTICA

M = E − N + 2PM = E − N + 2P	

M = 11 − 10 + 2 ∗ 1

M = 1 + 2 = 3

Valor Obtido - 3	

Caminhos Independentes - 3

Necessidade de Testes - 3 testes



CAMINHOS BÁSICOS

Caminho 1 (usuário encontrado) - 1 → 2 → 3 → 4 → 5 → 6 (SIM) → 7 → 10 (TRUE)

Caminho 2 (usuário não encontrado) - 1 → 2 → 3 → 4 → 5 → 6 (NÃO) → 8 → 10 (FALSE)

Caminho 3 (erro de execução) - 1 → 2 → 3 → 4 → (Catch) 9 → 10 (FALSE)

TESTE

O código foi executado na IDE Eclipse, coloquei os arquivos dentro da pasta uxui. O código foi testado e não foi encontrado nenhum usuário. No repositório está a imagem do resultado.
