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
          <InputComponent v-model="Id_Usuario" id="Id_Usuario" name="id" type="hidden"/>
          <InputComponent v-model="Id_Cedula_Usuario" id="Id_Cedula_Usuario" name="cedula" label="Cédula: " placeholder="Introduce tu cédula" />
          <InputComponent v-model="Nombre" id="Nombre" name="nombre" label="Nombre: " placeholder="Introduce tu nombre" />
          <InputComponent v-model="Email" id="Email" name="email" label="Correo: " placeholder="Introduce tu correo" />
          <InputComponent v-model="Contraseña" id="Contraseña" type="password"  name="password" label="Contraseña: " placeholder="Introduce tu contraseña" />
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
  import axios from 'axios';
  
  const baseURL = 'http://localhost:9000/shopping_car/api/producto';

  /* const Id_Usuario = ref ('');
  const Id_Cedula_Usuario = ref('');
  const Nombre = ref('');
  const Email = ref('');
  const Contraseña = ref('');
  
 const createAccount = () => {
    const id = Id_Usuario.value;
    const ced = Id_Cedula_Usuario.value;
    const name = Nombre.value;
    const gmail = Email.value;
    const pass = Contraseña.value;

        // Aquí puedes realizar la lógica para crear la cuenta con los datos proporcionados
        console.log('Id:', Id_Usuario);
    console.log('Cédula:', Id_Cedula_Usuario);
    console.log('Nombre:', Nombre);
    console.log('Correo:', Email);
    console.log('Contraseña:', Contraseña);
  
    // Por ahora, redireccionaremos a la página de inicio de sesión
    window.location.href = "/login";

  }
*/
const Id_Usuario = ref ('');
  const Id_Cedula_Usuario = ref('');
  const Nombre = ref('');
  const Email = ref('');
  const Contraseña = ref('');

 async function createAccount() {
  const data = {
    Id_Usuario: Id_Usuario.value,
    Id_Cedula_Usuario: Id_Cedula_Usuario.value,
    Nombre: Nombre.value,
    Email: Email.value,
    Contraseña: Contraseña.value
  }; 

  try {
    const response = await axios.post(baseURL, data);
    console.log('Registro creado exitosamente:', response.data);
  } catch (error) {
    console.error('Error al crear el registro:', error);
  }
  window.location.href = "/login";
}


  

   
  </script>
  <style scoped src="../theme/createaccount.css"></style>

  