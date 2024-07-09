<script setup lang="ts">
import { RouterLink, RouterView } from 'vue-router'
import HelloWorld from './components/HelloWorld.vue'
</script>

<template>
  <header>
    <!--img alt="Vue logo" class="logo" src="@/assets/logo.svg" width="125" height="125" /-->
    <div class="wrapper">
      <h1>Coffeestore</h1>
      <nav>
        <RouterLink to="/">Home</RouterLink>
        <RouterLink to="/sobre">Quem somos</RouterLink>
        <RouterLink to="/cafes">Nossos cafés</RouterLink>
        <RouterLink to="/cadastrar">Cadastre-se</RouterLink>
      </nav>
    </div>
  </header>

  <RouterView />

  <footer>
    Ewerton Bramos - 2024
  </footer>
</template>
