# 🧟‍♂️ Desafio Java: Sobrevivência em Resident Evil

## 🎮 Sobre o Projeto
Este projeto simula uma batalha entre sobreviventes e zumbis inspirada na franquia **Resident Evil**, utilizando conceitos de **Orientação a Objetos** e **ArrayList** em Java. Ideal para quem está começando e quer praticar herança, encapsulamento e lógica de combate.

---

## 📚 Requisitos do Desafio

### 🔹 Classe `Personagem` (superclasse)
- `nome` (String)
- `vida` (int)
- Métodos:
  - `receberDano(int dano)`
  - `estaVivo()` → retorna `true` se vida > 0

### 🔹 Classe `Sobrevivente` (subclasse de `Personagem`)
- `arma` (String)
- `danoArma` (int)
- Método:
  - `atacar(Zumbi zumbi)` → reduz a vida do zumbi

### 🔹 Classe `Zumbi` (subclasse de `Personagem`)
- `tipo` (String) → Ex: "Walker", "Crawler", "Nemesis"
- `danoAtaque` (int)
- Método:
  - `atacar(Sobrevivente s)` → reduz a vida do sobrevivente

### 🔹 Classe `Simulacao`
- `ArrayList<Sobrevivente> sobreviventes`
- `ArrayList<Zumbi> zumbis`
- Métodos:
  - `adicionarSobrevivente(Sobrevivente s)`
  - `adicionarZumbi(Zumbi z)`
  - `simularBatalha()` → cada sobrevivente ataca um zumbi aleatório e vice-versa

---

## 🧪 Exemplo de Uso

```java
Simulacao jogo = new Simulacao();

jogo.adicionarSobrevivente(new Sobrevivente("Jill", 100, "Pistola", 25));
jogo.adicionarSobrevivente(new Sobrevivente("Leon", 120, "Escopeta", 40));

jogo.adicionarZumbi(new Zumbi("Walker", 80, 10));
jogo.adicionarZumbi(new Zumbi("Nemesis", 150, 30));

jogo.simularBatalha();
