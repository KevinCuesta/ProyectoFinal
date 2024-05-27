<template>
  <ion-page>
    <ion-header :translucent="true">
      <ion-toolbar>
        <ion-title>Turnero</ion-title>
      </ion-toolbar>
    </ion-header>

    <ion-content :fullscreen="true">
      <ion-header collapse="condense">
        <ion-toolbar>
          <ion-title size="large">Turnero</ion-title>
        </ion-toolbar>
      </ion-header>

      <div id="container">
        <img src="../components/img/TurnoBlanco.png" alt="Logo del Turnero" style="margin-bottom: 20px;">
        <h1>Bienvenido al Turnero</h1>
        <p>Por favor, inicia sesión para continuar.</p>
        <a href="/login">Iniciar sesión</a>
      </div>
    </ion-content>
  </ion-page>
</template>

<script setup lang="ts">
import { IonContent, IonHeader, IonPage, IonTitle, IonToolbar } from '@ionic/vue';
</script>

<style scoped>
#container {
  text-align: center;
  padding: 20px;
  
}

#container h1 {
  font-size: 24px;
  margin-bottom: 10px;
}

#container p {
  font-size: 16px;
  color: #8c8c8c;
  margin-bottom: 20px;
}

#container img {
  width: 150px;
  height: 150px;
  border-radius: 50%;
}
</style>
