<template>
  <div class="empleado">
    <f_Empleados/>
  </div>
</template>


<script>
import f_Empleados from '@/components/f_Empleados.vue'

export default {
  name: 'Empleado-View',
  components: {
    f_Empleados,
  },
};
</script>
