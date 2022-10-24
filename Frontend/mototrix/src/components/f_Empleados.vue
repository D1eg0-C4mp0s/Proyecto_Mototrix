<template>
  <div class="form-registro">
    <form action="">
      <h4>Registro de empleados</h4>
      <input class="input" type="text" name="idEmpleado" id="idEmpleado" placeholder="Ingrese el ID" required>
      <input class="input" type="text" name="nombres" id="nombres" placeholder="Ingrese su nombre" required>
      <input class="input" type="text" name="telefono" id="telefono" placeholder="Ingrese su Telefono" required>
      <select class="selector-cargo" name="cargo" id="cargo" required>
        <option value="seleccionar">Selecciona un cargo</option>
        <option value="administrador">Administrador</option>
        <option value="cajero">Cajero</option>
        <option value="mecanico">Mecanico</option>
      </select>
      <input class="input" type="text" name="salario" id="salario" placeholder="Ingrese el salario" required>
      <input class="button" type="submit" value="Registrar">
    </form>
  </div>
</template>

<script>
export default {
  name: 'f_Empleados',
  data: function () {
    return {
      empleado: {
        idEmpleado: "",
        nombre: "",
        telefono: "",
        cargo: "",
        salario: "",
      },
    };
  },
};
</script>

<style>

</style>