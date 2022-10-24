<template>

<div class="tblCliente">
    <fieldset>
    <div class="header-tools">
      <div class="tools">
        <ul>
            <li><span><input type="checkbox"></span></li>
            <li>
                <button>
                    <i class="material-icons">add_circle</i>
                </button>
            </li>
            <li>
                <button>
                    <i class="material-icons">edit</i>
                </button>
            </li>
            <li>
                <button>
                    <i class="material-icons">delete</i>
                </button>
            </li>
            <li>
                <button>
                    <i class="material-icons">share</i>
                </button>
            </li>
        </ul>
      </div>
      <div class="search">
        <input type="text" class="search-input">
      </div>
    </div>

    <div class="datatable">
        <table>
            <thead>
                <tr>
                    <th>Id</th>
                    <th>Nombre</th>
                    <th>Telefono</th>
                    <th>Correo</th>
                </tr>
            </thead>

            <tbody>
                <tr v-for="cliente in clientes" :key="cliente.id_Cliente">
                    <td class="table-checkbox"><input type="checkbox" name="" id=""></td>
                    <td>{{ cliente.id_Cliente }}</td>
                    <td>{{ cliente.n_ombre }}</td>
                    <td>{{ cliente.t_elefono }}</td>
                    <td>{{ cliente.c_orreo }}</td>
                </tr>
            </tbody>
        </table>
    </div>

    <div class="footer-tools">
        <div class="list-items">
            show
            <select name="n-entries" id="n-entries" class="n-entries">
                <option value="5">5</option>
                <option value="10" selected>10</option>
                <option value="15">15</option>
            </select>
            entries
        </div>

        <div class="pages">
            <ul>
                <li><span class="active">1</span></li>
                <li><button>2</button></li>
                <li><button>3</button></li>
                <li><button>4</button></li>
                <li><button>...</button></li>
                <li><button>9</button></li>
                <li><button>10</button></li>
            </ul>
        </div>
    </div>
    </fieldset>
    <router-view />
</div>
</template>
  
  <script>
  export default {
    name: "tablaClientes",
    props: {
      clientes: {
        type: Array,
      }
    },
    methods: {},
  };
  </script>
  
<style>
:root{
    --primary-color: white;
    --secondary-color: rgb(61,68,73);
    --highlight-color: #3282b8;

    --dt-padding: 12px;
    --dt-padding-s: 6px;
    --dt-padding-xs: 2px;

    --dt-border-radius: 3px;

    --dt-background-color-container: #2a3338;
    --dt-border-color: var(--secondary-color);
    --dt-bg-color: var(--highlight-color);
    --dt-text-color: var(--primary-color);
    --dt-bg-active-button: var(--highlight-color);
    --dt-text-color-button: var(--primary-color);
    --dt-text-color-active-button: var(--primary-color);
    --dt-hover-cell-color: var(--highlight-color);
    --dt-even-row-color: var(--secondary-color);
    --dt-focus-color: var(--highlight-color);
    --dt-input-backgound-color: var(--secondary-color);
    --dt-input-color: var(--primary-color);
    
}

.material-icons{
    font-size: 16px;
}

.tblCliente{
    font-family: 'Noto Sans', sans-serif;
    background-color: var(--dt-background-color-container);
    border-radius: var(--dt-border-radius);
    color: var(--dt-text-color);
    width: 600px;
    margin: 0 auto;
    font-size: 12px;
}

.tblCliente .header-tools{
    border-bottom: solid 1px var(--dt-border-color);
    padding: var(--dt-padding);
    display: flex;
    align-items: baseline;
}

.tblCliente .header-tools .search{
    width: 30%;
}

.tblCliente .header-tools .search .search-input{
    width: 100%;
    background-color: var(--dt-input-backgound-color);
    display: block;
    box-sizing: border-box;
    border-radius: var(--dt-border-radius);
    border: solid 1px var(--dt-border-color);
    color: var(--dt-input-color);
}

.tblCliente .header-tools .tools{
    width: 70%;
}

.tblCliente .header-tools .tools ul{
    margin: 0;
    padding: 0;
    display: flex;
    justify-content: start;
    align-items: baseline;
}

.tblCliente .header-tools .tools ul li{
    display: inline-block;
    margin: 0 var(--dt-padding-xs);
    align-items: baseline;
}

.tblCliente .footer-tools{
    padding: var(--dt-padding);
    display: flex;
    align-items: baseline;
}

.tblCliente .footer-tools .list-items{
    width: 50%;
}

.tblCliente .footer-tools .pages{
    margin-left: auto;
    margin-right: 0;
    width: 50%;
}

.tblCliente .footer-tools .pages ul{
    margin: 0;
    padding: 0;
    display: flex;
    align-items: baseline;
    justify-content: flex-end;
}

.tblCliente .footer-tools .pages ul li{
    display: inline-block;
    margin: 0 var(--dt-padding-xs);
}

.tblCliente .footer-tools .pages ul li button,
.tblCliente .header-tools .tools ul li button{
    color: var(--dt-text-color-button);
    width: 100%;
    box-sizing: border-box;
    border: 0;
    border-radius: var(--dt-border-radius);
    background: transparent;
    cursor: pointer;
}

.tblCliente .footer-tools .pages ul li button:hover,
.tblCliente .header-tools .tools ul li button:hover{
    background: var(--dt-bg-active-button);
    color: var(--dt-text-color-active-button);
}

.tblCliente .footer-tools .pages ul li span.active{
    background-color: var(--dt-bg-color);
    border-radius: var(--dt-border-radius);
}

.tblCliente .footer-tools .pages ul li button,
.tblCliente .footer-tools .pages ul li span,
.tblCliente .header-tools .tools ul li button{
    padding: var(--dt-padding-s) var(--dt-padding);
}

.tblCliente .datatable{
    border-collapse: collapse;
    width: 100%;
}

.tblCliente .datatable,
.tblCliente .datatable th,
.tblCliente .datatable td,
.tblCliente .datatable tr{
    padding: var(--dt-padding) var(--dt-padding);
}

.tblCliente .datatable th{
    font-weight: bolder;
    text-align: left;
    border-bottom: solid 1px var(--dt-border-color);
}

.tblCliente .datatable td{
    border-bottom: solid 1px var(--dt-border-color);
}

.tblCliente .datatable tbody tr:nth-child(even){
    background-color: var(--dt-even-row-color);

}

</style>