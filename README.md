# Batista e Moraes

## Questão 1:

a) Falso - Valor acima do limite aceitado pelo Byte.

b) Verdadeiro

c) Falso - Número com ponto flutuante invés de inteiro

d) Verdadeiro

e) Falso - Foi atribuido um número invés de um caracter

f) Falso - O operador = foi utilizado invés de ==

g) Falso - Foi atribuída uma string invés de um char

h) Falso - Faltou o ;

i) Falso - Faltou o f

j) Falso - Foi atribuído um boolean invés de um inteiro



## Questão 4:

Ao tentar somar o long com int, foi obtido um erro. Isso acontece pois na soma seria necessária a conversão de long para int, e o compilador não permitiu isso para evitar perda de informação.

```bash
BMExercicio4.java:7: error: incompatible types: possible lossy conversion from long to int
        int2 = long1 + int1;
                     ^
1 error

```

Uma possível solução seria a declaração  dos valores de int1 e int2 em long
