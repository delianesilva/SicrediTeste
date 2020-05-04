# Teste para QA da Plataforma Digital Sicredi
 

## Qual o objetivo?
**Negócio**

- Analise a história e defina os testes de aceitação.
- Exponha o planejamento para execução dos testes.
- Informe e justifique as técnicas de testes escolhidas.

**Técnico**

- Desenvolver projeto de testes automatizados para testes de UI e Serviços.
- Escolha a tecnologia e o framework de automação de testes de sua preferência.
- Limite a quantidade de testes automatizados e foque na qualidade da solução.

## História
Com o propósito de Simular um Investimento na Poupança
como um Associado,
eu gostaria de preencher o formulário de simulação
e ver a tabela de resultado com Mês e Valor.

**Critério de aceitação:**

1. O associado preencher todos os campos corretamente e visualizar o formulário de simulação
2. O associado preencher o valor inferior a “R$ 20.00” e receber a mensagem de orientação “Valor mínimo de R$ 20.00”.

**URL:**(https://www.sicredi.com.br/html/ferramenta/simulador-investimento-poupanca/). 

**GET:**(http://5b847b30db24a100142dce1b.mockapi.io/api/v1/simulador). 

**Response:**

```
{
    "id": 1,
    "meses": ["112", "124", "136", "148"],
    "valor": ["2.802", "3.174", "3.564", "3.971"]
}
```
## PLANO DE TESTE

- Planejamento dos testes que serão realizados na funcionalidade Simulador de Investimento Poupança. [Clique Aqui](./Plano_de_Teste/Plano_de_Teste_Sicredi_Deliane.pdf)

## TECNOLOGIAS UTILIZADAS

[Java](https://www.java.com/pt_BR/download/faq/whatis_java.xml)

Java é uma linguagem de programação e plataforma computacional lançada pela primeira vez pela Sun Microsystems em 1995. O Java é rápido, seguro e confiável.

[Maven](https://maven.apache.org/what-is-maven.html)

Apache Maven, ou Maven, é uma ferramenta de automação de compilação utilizada primariamente em projetos Java.

[GSON](https://github.com/google/gson)

Gson é uma biblioteca Java de código aberto para serializar e desserializar objetos Java para JSON.

[JUnit](https://junit.org/junit4/)

JUnit é um framework open-source, criado por Eric Gamma e Kent Beck, com suporte à criação de testes automatizados na linguagem de programação Java.

[Selenium](https://www.selenium.dev/)

Selenium é uma estrutura portátil para testar aplicativos da web . 

[REST Assured](http://rest-assured.io/)

Rest-Assured é um framework open-source que possui suporte para automatizar os métodos GET, POST, PUT, DELETE, HEAD, OPTIONS e TRACE de uma API e permitir fazer validações no header, body e schema da resposta.

[Hamcrest](http://hamcrest.org/)

O Hamcrest é uma estrutura que ajuda a escrever testes de software na linguagem de programação Java. 

[Git](https://github.com/)

Controle de versão.

## Instalação Local

**Passo 1:** Clonar o projeto  

```
git clone https://github.com/deliwonder/SicrediTeste.git

```
**Passo 2:** Baixar as depedências 

```
mvn install

```

**Passo 3:** Rodar os testes

```
mvn test
mvn clean test
mvn clean compile test
```