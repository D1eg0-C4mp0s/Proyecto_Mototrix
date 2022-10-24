<template>
  <div class="repuestos">
    <f_Repuestos />
    <Tbl_Repuestos/>
  </div>
</template>

<script>
import f_Repuestos from '@/components/f_Repuestos.vue'
import Tbl_Repuestos from '../components/tbl_Repuestos.vue'

export default {
  name: 'Repuestos-View',
  components: {
    f_Repuestos,Tbl_Repuestos,
},
};
</script>

<style>

</style>