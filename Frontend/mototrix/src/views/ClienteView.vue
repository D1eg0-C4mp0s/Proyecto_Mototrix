<template>
  <div class="cliente">
    <f_cliente @refresh="refrescar"/>
    <tablaClientes :clientes="clientes"/>
  </div>
</template>

<script>
import f_cliente from "@/components/f_Cliente.vue";
import tablaClientes from "@/components/tbl_Cliente.vue";
import axios from "axios";


export default {
  name: 'Cliente-View',
  components: {
    f_cliente,
    tablaClientes,
  },
  data: () => ({
    clientes: [],
  }),
  mounted() {
    this.getClientes();
  },
  methods: {
    refrescar() {
      this.getClientes();
    },
    getClientes() {
      axios
        .get("http://localhost:9090/api/cliente/listar")
        .then((response) => {
          this.clientes = response.data;
        });
    },
  },
};
</script>

