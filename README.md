# Projeto POO - Conta Bancária

## Sobre o projeto

Este projeto foi desenvolvido para praticar conceitos de Programação Orientada a Objetos (POO).

A classe `ContaBancaria` representa uma conta bancária do mundo real. O objeto possui um titular e um saldo, que podem ser consultados e alterados por meio de métodos.

## Classe

A classe principal do projeto é:

`ContaBancaria`

## Atributos

A classe possui dois atributos:

- `titular`: armazena o nome do titular da conta.
- `saldo`: armazena o valor disponível na conta.

Os atributos são `private` para proteger o estado interno do objeto.

## Métodos

### depositar(double valor)

O método `depositar()` adiciona um valor ao saldo da conta.

Existe uma regra de negócio para impedir depósitos inválidos. O valor precisa ser maior que zero.

Exemplo:

```java
conta.depositar(200.00);
