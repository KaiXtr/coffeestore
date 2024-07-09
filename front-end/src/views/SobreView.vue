<template>
  <div class="sobre">
    <h1>Quem somos</h1>
    <p>
      Nós somos um empreendimento dedicado a fornecer uma boa experiência em cibercafé.
    </p>
    <div class="sobre-mvv-container">
      <div class="sobre-mvv-card">
        <h3>Missão</h3>
        <p>
          Nossa missão é criar um espaço confortável para estudantes e trabalhadores, um espaço seguro e de qualidade onde boas conversas e conhecimentos podem ser compartilhados.
        </p>
      </div>
      <div class="sobre-mvv-card">
        <h3>Visão</h3>
        <p>
          Nossa visão é trazer os nossos cibercafés para locais acessíveis ao público e, através de nosso modelo de negócios, incorporar o cofeestore à empreendimentos locais e o mercado regional.
        </p>
      </div>
      <div class="sobre-mvv-card">
        <h3>Valores</h3>
        <p>
          Nós valorizamos a troca de conhecimento, a interação social e as experiências.
        </p>
      </div>
    </div>
  </div>
</template>

<style>
div.sobre p {
  display: block;
}

div.sobre-mvv-container {
  margin-top: 2vh;
}

div.sobre-mvv-container div.sobre-mvv-card {
  width: 10vw;
  margin: 0px 1vw 0px 1vw;
  display: inline-block;
  vertical-align: top;
}

div.sobre-mvv-container div.sobre-mvv-card h3 {
  font-weight: bold;
}

/*
@media (min-width: 1024px) {
  .sobre {
    min-height: 100vh;
    display: flex;
    align-items: center;
  }
}*/
</style>
