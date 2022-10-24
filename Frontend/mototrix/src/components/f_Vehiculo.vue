<template>
  <div class="form-registro">
    <form action="">
      <h4>Registrar Vehiculo</h4>
      <input class="input" type="text" placeholder="Placa" required>
      <input class="input" type="text" placeholder="Marca" required>
      <input class="input" type="text" placeholder="Modelo" required>
      <input class="input" type="text" placeholder="Referencia" required>
      <input class="input" type="text" placeholder="Kilometraje" required>
      <select class="selector-cargo" name="Estado" id="Estado" required>
        <option value="seleccionar">Selecciona un estado fisico</option>
        <option value="bueno">Bueno</option>
        <option value="regular">Regular</option>
        <option value="malo">Malo</option>
      </select>
      <input class="button" type="submit" value="Registrar">
    </form>
  </div>
</template>

<script>
export default {
  name: 'f_Vehiculo',
  data: function(){
    return{
      vehiculo:{
        placa:"",
        marca:"",
        modelo:"",
        referencia:"",
        kilometraje:"",
        estado:"",

      },
    };
  },
};
</script>
