# 🚗 Sistema de Gestão de Frota

Sistema desenvolvido em **Java** com o objetivo de praticar conceitos de **Programação Orientada a Objetos (POO)** por meio do gerenciamento de veículos de uma frota.

O projeto permite cadastrar, remover, consultar e listar veículos, além de realizar alterações no valor da diária e pesquisas por categoria.

## 🎯 Objetivo

Desenvolver um sistema simples para gerenciamento de uma frota de veículos, aplicando conceitos fundamentais da programação orientada a objetos, como:

* Classes e objetos
* Herança
* Abstração
* Encapsulamento
* Polimorfismo
* Interface
* Enum
* `ArrayList`
* Métodos estáticos
* Sobrescrita de métodos

## 🚘 Veículos

O sistema possui uma classe abstrata `Veiculo`, que serve como base para os diferentes tipos de veículos.

Atualmente, o projeto possui:

* 🚗 **Carro**
* 🚚 **Caminhão**

Cada veículo possui informações como:

* ID
* Modelo
* Marca
* Cor
* Valor da diária
* Estado
* Categoria

Além disso, cada tipo de veículo possui características específicas.

### 🚗 Carro

Possui:

* Capacidade do porta-malas
* Tipo de combustível

### 🚚 Caminhão

Possui:

* Capacidade de carga
* Número de eixos

## 📂 Estrutura do projeto

```text
src/
├── Caminhao.java
├── Carro.java
├── Categoria.java
├── EstadoVeiculo.java
├── GestaoFrota.java
├── OperacaoGestaoFrota.java
├── Principal.java
└── Veiculo.java
```

## 🧩 Principais classes

### `Veiculo`

Classe abs
