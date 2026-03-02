# OBJECT-ORIENTED PROGRAMMING

#  Sobre o Projeto

Este projeto foi desenvolvido para aplicar os conceitos de Programação Orientada a Objetos.

A classe criada foi `Notebook`, que representa um notebook do mundo real.
-----------------------------------------------------------------------------------

##  O que o objeto representa?

O objeto `Notebook` representa um computador portátil que possui:

- Marca
- Cor
- Nível de bateria

Assim como na vida real, ele pode ser carregado e utilizado, consumindo bateria.

-----------------------------------------------------------------------------------

##  Funcionamento da Classe

A classe possui atributos que armazenam as informações do notebook e métodos que definem seus comportamentos.

###  Método `carregarBateria(int valor)`

Esse método aumenta o nível da bateria.

Regras:
- Não permite valores menores ou iguais a zero.
- Não permite que a bateria ultrapasse 100%.

Exemplo de uso:

```java
notebook.carregarBateria(30);
