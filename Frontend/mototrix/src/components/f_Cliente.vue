<template>
  <div class="f_cliente">
    <fieldset>
      <legend>Formulario Registro clientes</legend>
      <form @submit.prevent="guardar">
        <label for="id_Cliente">id cuidador</label><br />
        <input
          type="number"
          name="id_Cliente"
          id="id_Cliente"
          v-model="cliente.id_Cliente"
        /><br />

        <label for="n_ombre">nombre</label><br />
        <input
          type="text"
          name="n_ombre"
          id="n_ombre"
          v-model="cliente.n_ombre"
        /><br />

        <label for="t_elefono">nombre</label><br />
        <input
          type="text"
          name="t_elefono"
          id="t_elefono"
          v-model="cliente.t_elefono"
        /><br />

        <label for="c_orreo">nombre</label><br />
        <input
          type="text"
          name="c_orreo"
          id="c_orreo"
          v-model="cliente.c_orreo"
        /><br />
        

        <button type="submit">Guardar</button>
        <button type="button" @click="eliminar(cliente.id_Cliente)">
          Eliminar
        </button>
      </form>
    </fieldset>
    <router-view />
  </div>
</template>

<script>
import axios from "axios";

export default {
  name: "f_Cliente",
  data: function () {
    return {
      cliente: {
        id_Cliente: "",
        n_ombre: "",
        t_elefono: "",
        c_orreo: "",
      },
    };
  },
  methods: {
    guardar() {
      axios
        .post("http://localhost:9090/api/cliente", this.cliente)
        .then((data) => {
          console.log("response", data);
          this.$emit("refresh");
        });
    },

    eliminar(id) {
      axios
        .delete("http://localhost:9090/api/cliente/" + id)
        .then((data) => {
          console.log("response", data);
          this.cliente.id_Cliente = null;
          this.$emit("refresh");
        })
        .catch(() => {
          alert("El cliente seleccionado no existe");
        });

      console.log(id);
    },
  },
  
};
</script>



<style scoped>
.cuidador {
  text-align: center;
  padding: 5%;
  font-family: inherit;
}
</style>



<style scoped>
.cliente {
  text-align: center;
  padding: 5%;
  font-family: inherit;
}
</style>