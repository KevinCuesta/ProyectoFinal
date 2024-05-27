<template>
    <ion-page>
      <ion-header :translucent="true">
        <ion-toolbar>
          <ion-title>Menu</ion-title>
        </ion-toolbar>
      </ion-header>
  
      <ion-content>
        <br>
        <div id="container">
          <strong><a href="/generarturno">Ir a Generar Turno</a></strong>
          <br>
          <strong><a href="/verturnos">Ir a Ver Turnos</a></strong>
  
        </div>
  
      </ion-content>
    </ion-page>
  </template>
  
  <script setup lang="ts">
  import { IonContent, IonHeader, IonPage, IonTitle, IonToolbar } from '@ionic/vue';
  </script>
  
  <style scoped></style>
  