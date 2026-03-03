# FiapRide - Sistema Notebook

Projeto desenvolvido para prática de Programação Orientada a Objetos em Java.

## OBJETIVO

Aplicar os conceitos de:

- Encapsulamento
- Atributos privados
- Métodos getters e setters
- Regra de validação dentro do setter
- Organização básica de classes

## Estrutura do Projeto

- Notebook.java → Classe que representa o objeto Notebook.
- SistemaPrincipal.java → Classe responsável por executar e testar o sistema.

## Funcionalidades

- Criar notebooks com marca e cor.
- Carregar bateria.
- Utilizar notebook consumindo bateria.
- Validação para impedir bateria menor que 0% ou maior que 100%.

## Regra de Negócio

O atributo bateria possui validação no método setBateria():
- Não permite valores menores que 0.
- Não permite valores maiores que 100.

## Como Executar

1. Abrir o projeto no Eclipse.
2. Executar a classe SistemaPrincipal.
3. Acompanhar as saídas no console.

Projeto acadêmico para fins de aprendizado.
