<template>
    <ion-page>
      <ion-header :translucent="true">
        <ion-toolbar>
          <ion-title class="forgot-password-title">Restablecer Contraseña</ion-title>
        </ion-toolbar>
      </ion-header>
  
      <div id="forgot-password-container">
        <div id="forgot-password-form" class="forgot-password-form">
          <strong>¿Olvidaste tu contraseña?</strong>
          <p>Introduce tu cédula para restablecer tu contraseña</p>
          <InputComponent v-model="Id_Cedula_Usuario" id="Id_Cedula_Usuario" name="cedula" label="Cédula: " placeholder="Introduce tu cédula" />
          <div v-if="isCedulaValid">
            <InputComponent v-model="newPassword" id="newPassword" name="newPassword" type="password" label="Nueva Contraseña: " placeholder="Introduce tu nueva contraseña" />
          </div>
        </div>
        <div class="forgot-password-button">
          <ButtonComponent v-if="!isCedulaValid" id="validateCedula" value="Validar Cédula" expand="full" @click="validateCedula" />
          <ButtonComponent v-if="isCedulaValid" id="resetPassword" value="Restablecer Contraseña" expand="full" @click="resetPassword" />
        </div>
      </div>
    </ion-page>
  </template>
  
  <script setup lang="ts">
  import { ref } from 'vue';
  import { IonHeader, IonPage, IonTitle, IonToolbar } from '@ionic/vue';
  import ButtonComponent from '@/components/ButtonComponent.vue';
  import InputComponent from '@/components/InputComponent.vue';
  import axios from 'axios';
    
  const baseURL = 'http://localhost:9000/shopping_car/api/producto';
  
  const Id_Cedula_Usuario = ref('');
  const newPassword = ref('');
  const isCedulaValid = ref(false);
  
  const validateCedula = async () => {
    try {
      const response = await axios.post(baseURL, {
        Id_Cedula_Usuario: Id_Cedula_Usuario.value
      });
      if (response.data.valid) {
        isCedulaValid.value = true;
      } else {
        alert('Cédula no válida');
      }
    } catch (error) {
      console.error('Error al validar la cédula:', error);
    }
  };
  
  const resetPassword = async () => {
    try {
      const response = await axios.post(baseURL, {
        Id_Cedula_Usuario: Id_Cedula_Usuario.value,
        newPassword: newPassword.value
      });
      console.log('Contraseña restablecida con éxito:', response.data);
      // Aquí puedes agregar lógica adicional, como mostrar un mensaje al usuario
    } catch (error) {
      console.error('Error al restablecer la contraseña:', error);
      // Aquí puedes manejar errores, como mostrar un mensaje al usuario
    }
  };
  </script>
  
  <style scoped>
  #forgot-password-container {
    display: flex;
    flex-direction: column;
    justify-content: center;
    align-items: center;
    height: 100%;
  }
  
  #forgot-password-form {
    width: 80%;
    max-width: 400px;
  }
  
  .forgot-password-button {
    margin-top: 20px;
  }
  </style>
  