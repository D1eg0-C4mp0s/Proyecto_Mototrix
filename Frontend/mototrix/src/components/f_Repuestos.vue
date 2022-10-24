<template>
  <div class="form-registro">
    <form action="">
      <h4> REFACCIONES E INSUMOS</h4>
      <input class="input" type="text" id="Nsolicitud" name="nsolicitud" placeholder="Solicitud N°">
      <input class="input" type="date" id="Fecha_solicitud" name="Fechasolicitud" min="AAAA/MM/DD">
      <select class="selector-cargo" name="mecanico" id="Mecanico" required>
        <option value="seleccionar mecanico">Seleccionar mecanico</option>
        <option value="Mecanico1">Mecanico 01</option>
        <option value="Mecanico2">Mecanico 02</option>
        <option value="Mecanico3">Mecanico 03</option>
      </select>
      <input class="button" type="submit" value="Registrar">
      <input class="button" type="reset" value="Limpiar" />
    </form>
  </div>
</template>

<script>
export default {
  name: 'f_Repuestos',
  data: function () {
    return {
      repuestos: {
        Nsolicitud: "",
        fechaSolicitud: "",
        mecanico: "",
      },
    };
  },
};
</script>
