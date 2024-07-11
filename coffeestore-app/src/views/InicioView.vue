<script setup lang="ts">
  import axios from 'axios';
  import { ref } from 'vue';

  let pingText = ref("Vamo ver!");

  function getPing() {
    axios.get("http://localhost:8080/produtos/ping")
      .then(response => (
        console.log(response.data),
        pingText.value = response.data
      ))
      .catch(error => console.error(error))
  }
</script>

<template>
  <main>
    <h1>Seja bem vindo ao Coffeestore!</h1>
    <p>
        Bem vindo ao melhor cibercafé do distrito federal!
    </p>
    <h2>Encontre um estabelecimento próximo!</h2>
    <p>
        Nós estamos por todos os lugares!
    </p>
    <button type="button" @click="getPing()">Ping!</button>
    <p>
      {{ pingText }}
    </p>
  </main>
</template>
