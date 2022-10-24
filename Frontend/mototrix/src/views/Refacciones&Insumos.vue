<template>
  <div class="refacciones-insumos">
    <f_Refacciones/>
    <F_Insumos/>
  </div>
</template>

<script>
import f_Refacciones from '@/components/f_Refacciones.vue'
import F_Insumos from '@/components/f_Insumos.vue';

export default {
  name: 'ref&ins-View',
  components: {
    f_Refacciones, F_Insumos,
},
};
</script>
