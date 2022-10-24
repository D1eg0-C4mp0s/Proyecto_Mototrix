<template>
  <div class="form-registro">
    <form action="">
      <h4>FICHA DE SERVICIOS</h4>
      <input class="input" type="date" id="Fecha_revision" name="Fecha_revision" min="DD/MM/AAAA"><br><br>
      <select class="selector-mecanico" name="mecanico" id="Mecanico" required>
        <option value="mecánico a cargo">Seleccionar mecánico a cargo</option>
        <option value="Mecanico1">Mecanico x</option>
        <option value="Mecanico2">Mecanico y</option>
        <option value="Mecanico3">Mecanico z</option>
      </select>
      <select class="selector-cliente" name="Cliente" id="Cliente" required>
        <option value="Cliente">Seleccionar cliente</option>
        <option value="Cliente1">Cliente x</option>
        <option value="Cliente2">Cliente y</option>
        <option value="Cliente3">Cliente z</option>
      </select>
      <select class="selector-vehículo" name="Vehículo" id="Vehículo" required>
        <option value="Vehículo">Seleccionar Vehículo</option>
        <option value="Vehículo">Vehículo x</option>
        <option value="Vehículo">Vehículo y</option>
        <option value="Vehículo">Vehículo z</option>
      </select>
      <div style="text-align:center;">
        <select class="selector-estadof" name="Estado de Ficha" id="EstadoF" required>
          <option value="seleccione">Estado</option>
          <option value="ingreso">Ingresado</option>
          <option value="diagnostico">En Diagnostico</option>
          <option value="espera">En Espera</option>
          <option value="reparacion">En Reparacion</option>
          <option value="finalizado">Finalizado</option>
        </select>
      </div>
    </form>
  </div>
</template>

<script>
export default {
  name: 'f_Ficha',
  data: function () {
    return {
      ficha: {
        fechaRevision: "",
        mecanico: "",
        cliente: "",
        vehiculo: "",
        estado: "",
      },
    };
  },
};
</script>
