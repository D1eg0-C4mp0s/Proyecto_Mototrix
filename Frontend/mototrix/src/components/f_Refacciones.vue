<template>
  <div class="form-registro">
    <form action="">
      <h4> REFACCIONES </h4>
      <input class="input" type="text" id="codigo_refaccion" name="codigorefaccion" placeholder="Codigo de refacción">
      <input class="input" type="text" id="Item_refaccion" name="itemrefaccion" placeholder="Item">
      <input class="input" type="number" id="Unidad" name="unidad" placeholder="Unidades">
      <input class="input" type="text" id="Precio_comprar" name="preciocomprar" placeholder="Precio de compra">
      <input class="input" type="text" id="Precio_ventar" name="precioventar" placeholder="Precio de venta">
      <input class="button" type="submit" value="Registrar">
      <input class="button" type="reset" value="Limpiar" />
    </form>
  </div>
</template>

<script>
export default {
  name: 'f_Refacciones',
  data: function () {
    return {
      refaccion: {
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