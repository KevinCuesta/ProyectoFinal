<template>
  <ion-page>
    <ion-header :translucent="true">
      <ion-toolbar>
        <ion-title class="cart-title">¡Bienvenido!</ion-title>
      </ion-toolbar>
    </ion-header>

    <div id="login-container">
      <div id="login-form" class="login-form">
        <strong>¡Bienvenido al Turnero!</strong>
        <p>Que bueno tenerte de regreso</p>
        <InputComponent v-model="email" id="email" name="email" label="Correo: " placeholder="Introduce tu Correo" />
        <InputComponent v-model="password" type="password" id="password" name="password" label="Contraseña: " placeholder="Introduce tu contraseña" />
      </div>
      <div class="login-button">
        <ButtonComponent id="login" value="Iniciar Sesión" expand="full" @click="login" />
        <ButtonComponent id="forgotPassword" value="Olvidé mi contraseña" expand="full" />
        <ButtonComponent id="CreateAccount" value="Crear una cuenta" expand="full" @click="CreateAccount" />
      </div>
    </div>
  </ion-page>
</template>

<script setup lang="ts">
import { ref } from 'vue';
import { IonHeader, IonPage, IonTitle, IonToolbar } from '@ionic/vue';
import ButtonComponent from '@/components/ButtonComponent.vue';
import InputComponent from '@/components/InputComponent.vue';

const email = ref('');
const password = ref('');

const login = () => {
  const gmail = email.value;
  const pass = password.value;

  if (gmail === 'abcd' && pass === 'abcd') {      
    window.location.href = "/dashboard";
  } else {
    console.log('Credenciales inválidas');
  }
};
const CreateAccount = () => {
  window.location.href = "/createaccount";
};
</script>

<style scoped src="../theme/login.css"></style>
