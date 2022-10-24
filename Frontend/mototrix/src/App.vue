<template>
  <div id="app">
    <div class="row">
      <div class="col-3">
        <div class="container">
          <h1>Opciones</h1>
          <ul>
            <li><router-link to="/">Home</router-link></li>
            <li><router-link to="/vehiculo">Vehiculos</router-link></li>
            <li><router-link to="/cliente">Clientes</router-link></li>
            <li><router-link to="/empleado">Empleados</router-link></li>
            <li><router-link to="/repuestos">Solicitud de Materiales</router-link></li>
            <li><router-link to="/refacciones-insumos">Registro de Materiales</router-link></li>
            <li><router-link to="/ficha">Ficha de Servicios</router-link></li>
          </ul>
        </div>
      </div>
      <div class="col-9">

      <router-view/>
      </div>
    </div>
    
  </div>
</template>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  color: #2c3e50;
}



nav a {
  font-weight: bold;
  color: #2c3e50;
}

nav a.router-link-exact-active {
  color: #42b983;
}
</style>
