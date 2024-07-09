<script setup lang="ts">
  import CafeCard from '../components/CafeCard.vue'
  const cafes = [
    { nome: 'Pingado', preco: 2.0 },
    { nome: 'Expresso', preco: 5.0 },
    { nome: 'Capuccino', preco: 10.0 },
    { nome: 'Submarino', preco: 10.0 },
  ];
</script>

<template>
  <div class="sobre">
    <h1>Nossos cafés</h1>
    <p>
      Nós servimos cafés de alta qualidade.
    </p>
    <div class="cafe-container">
      <div class="cafe-card" v-for="c in cafes">
        <CafeCard :cafe="c"></CafeCard>
      </div>
    </div>
  </div>
</template>

<style>
div.cafe-container {
  margin-top: 2vh;
}

div.cafe-container div.cafe-card {
  width: 10vw;
  background-color: var(--vt-c-indigo);
  border-radius: 20px;
  padding: 1vw;
  margin: 0.5vw;
  display: inline-block;
  vertical-align: top;
}

div.cafe-container div.cafe-card h3 {
  font-weight: bold;
}
</style>
