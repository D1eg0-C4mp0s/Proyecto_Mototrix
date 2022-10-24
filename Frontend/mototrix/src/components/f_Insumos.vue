<template>
  <div class="form-registro">
    <h4> INSUMOS </h4>
    <form action="">
      <input class="input" type="text" id="codigo_insumo" name="codigoinsumo" placeholder="Codigo de insumo">
      <input class="input" type="text" id="Item_insumo" name="iteminsumo" placeholder="Item">
      <input class="input" type="number" id="Unidad" name="unidad" placeholder="Unidades">
      <input class="input" type="text" id="Precio_compra" name="preciocompra" placeholder="Precio de compra">
      <input class="input" type="text" id="Precio_venta" name="precioventa" placeholder="Precio de venta">
      <input class="button" type="submit" value="Registrar">
      <input class="button" type="reset" value="Limpiar" />
    </form>
  </div>
</template>

<script>
export default {
  name: 'f_Insumos',
  data: function () {
    return {
      insumo: {
        codigo: "",
        item: "",
        unidades: "",
        precioCompra: "",
        precioVenta: "",
      },
    };
  },
};
</script>
