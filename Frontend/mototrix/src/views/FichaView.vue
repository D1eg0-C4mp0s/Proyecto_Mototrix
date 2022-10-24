<template>
  <div class="ficha">
    <f_Ficha/>
    <Tbl_ficha/>
  </div>
</template>

<script>
import f_Ficha from '@/components/f_Ficha.vue'
import Tbl_ficha from '../components/tbl_ficha.vue'

export default {
  name: 'Ficha-View',
  components: {
    f_Ficha,Tbl_ficha,
},
};
</script>