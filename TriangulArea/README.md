
# 🧮 TriangulArea - Comparador de Áreas de Triângulos

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![Status](https://img.shields.io/badge/status-em%20desenvolvimento-blue?style=for-the-badge)
![License](https://img.shields.io/badge/license-MIT-green?style=for-the-badge)

Projeto Java com interface gráfica que recebe os lados de dois triângulos, calcula suas áreas usando a fórmula de Heron, e compara para exibir qual triângulo possui a maior área.

---

## 📌 Funcionalidades

- ✅ Receber dados dos lados dos triângulos via `JOptionPane`
- 🧠 Calcular áreas com base na **fórmula de Heron**
- 📊 Comparar e indicar qual triângulo tem a maior área
- 💬 Apresentar o resultado via interface gráfica

---

## 💻 Tecnologias utilizadas

- Java SE 17+ (pode funcionar com versões anteriores)
- `javax.swing.JOptionPane` (interface gráfica)
- IDE recomendada: NetBeans, IntelliJ IDEA ou Eclipse

---

## 🚀 Como executar

### 1. Clone o repositório
```bash
git clone https://github.com/seu-usuario/TriangulArea.git
cd TriangulArea
```

### 2. Abra o projeto em sua IDE Java favorita

> Certifique-se de que a pasta `src/main/java` esteja marcada como *source folder* (pasta de código fonte).

### 3. Execute a classe `principal.java`

Ela está localizada em:

```
src/main/java/com/mystical/figtrigom/principal.java
```

---

## 📁 Estrutura do Projeto

```
TriangulArea/
├── src/
│   └── main/java/
│       └── com/
│           └── mystical/
│               ├── figtrigom/
│               │   ├── FigTrigom.java       # Classe padrão (Hello World)
│               │   └── principal.java       # Código principal com lógica de cálculo
│               ├── triangulo.java           # Classe modelo do triângulo
│               └── Triangulo.java           # (Possivelmente redundante)
```

---

## 📚 Fórmula de Heron

Para calcular a área de um triângulo dados os lados `a`, `b` e `c`:
```
s = (a + b + c) / 2
área = √[s(s-a)(s-b)(s-c)]
```

---

## 🧠 Autor

**Vinicius Silva Lima**  
Estudante de Análise e Desenvolvimento de Sistemas – Universidade Cruzeiro do Sul

---

## 📝 Licença

Este projeto está licenciado sob a Licença MIT.
