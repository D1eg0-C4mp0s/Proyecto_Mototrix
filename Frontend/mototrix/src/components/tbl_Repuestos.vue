<template>
  <div class="form-table">
    <h4>REFACCIONES A USAR</h4>

    <table style="width:100%">

      <tr>
        <th>Item</th>
        <th>Descripción</th>
        <th>Unidad</th>
        <th>Cantidad</th>
        <th>Precio</th>
      </tr>

      <tr>

        <th><input class="input" type="text" id="item1" name="item1"></th>
        <th><textarea class="input" id="comment" name="obsevacion" cols="45" rows="8" maxlength="10000" required=""
            style="width: 150px; height: 70px;"></textarea></th>
        <th><input class="input" type="number" id="und1" name="und1"></th>
        <th><input class="input" type="number" id="cant1" name="cant1"></th>
        <th><input class="input" type="number" id="precio1" name="precio1"></th>

      </tr>
      <tr>

        <th><input class="input" type="text" id="item2" name="item2"></th>
        <th><textarea class="input" id="comment" name="obsevacion" cols="45" rows="8" maxlength="10000" required=""
            style="width: 150px; height: 70px;"></textarea></th>
        <th><input class="input" type="number" id="und2" name="und2"></th>
        <th><input class="input" type="number" id="cant2" name="cant2"></th>
        <th><input class="input" type="number" id="precio2" name="precio2"></th>

      </tr>
      <tr>

        <th><input class="input" type="text" id="item3" name="item3"></th>
        <th><textarea class="input" id="comment" name="obsevacion" cols="45" rows="8" maxlength="10000" required=""
            style="width: 150px; height: 70px;"></textarea></th>
        <th><input class="input" type="number" id="und3" name="und3"></th>
        <th><input class="input" type="number" id="cant3" name="cant3"></th>
        <th><input class="input" type="number" id="precio3" name="precio3"></th>

      </tr>
      <tr>

        <th><input class="input" type="text" id="item4" name="item4"></th>
        <th><textarea class="input" id="comment" name="obsevacion" cols="45" rows="8" maxlength="10000" required=""
            style="width: 150px; height: 70px;"></textarea></th>
        <th><input class="input" type="number" id="und4" name="und4"></th>
        <th><input class="input" type="number" id="cant4" name="cant4"></th>
        <th><input class="input" type="number" id="precio4" name="precio4"></th>

      </tr>

    </table>
    <div class="centrar">
      <input class="button" type="reset" value="Limpiar" />
    </div>

  </div>
</template>

<script>
</script>