<script setup lang="ts">
  defineProps<{
    cafe: string
  }>()
</script>

<template>
  <div>
    <h3>{{ cafe.nome }}</h3>
    <span>{{ cafe.preco }}</span>
  </div>
</template>