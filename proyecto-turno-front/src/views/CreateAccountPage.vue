<template>
    <ion-page>
      <ion-header :translucent="true">
        <ion-toolbar>
          <ion-title class="cart-title">¡Crea tu cuenta!</ion-title>
        </ion-toolbar>
      </ion-header>
  
      <div id="create-account-container">
        <div id="create-account-form" class="create-account-form">
          <strong>¡Bienvenido al Turnero!</strong>
          <p>Por favor, completa tus datos para crear una cuenta</p>
          <InputComponent v-model="cedula" id="cedula" name="cedula" label="Cédula: " placeholder="Introduce tu cédula" />
          <InputComponent v-model="nombre" id="nombre" name="nombre" label="Nombre: " placeholder="Introduce tu nombre" />
          <InputComponent v-model="email" id="email" name="email" label="Correo: " placeholder="Introduce tu correo" />
          <InputComponent v-model="password" type="password" id="password" name="password" label="Contraseña: " placeholder="Introduce tu contraseña" />
        </div>
        <div class="create-account-button">
          <ButtonComponent id="createAccount" value="Crear Cuenta" expand="full" @click="createAccount" />
        </div>
      </div>
    </ion-page>
  </template>
  
  <script setup lang="ts">
  import { ref } from 'vue';
  import { IonHeader, IonPage, IonTitle, IonToolbar } from '@ionic/vue';
  import ButtonComponent from '@/components/ButtonComponent.vue';
  import InputComponent from '@/components/InputComponent.vue';
  
  const cedula = ref('');
  const nombre = ref('');
  const email = ref('');
  const password = ref('');
  
  const createAccount = () => {
    const ced = cedula.value;
    const name = nombre.value;
    const gmail = email.value;
    const pass = password.value;
  
    // Aquí puedes realizar la lógica para crear la cuenta con los datos proporcionados
    console.log('Cédula:', ced);
    console.log('Nombre:', name);
    console.log('Correo:', gmail);
    console.log('Contraseña:', pass);
  
    // Por ahora, redireccionaremos a la página de inicio de sesión
    window.location.href = "/login";
  };
  </script>
  <style scoped src="../theme/createaccount.css"></style>

  