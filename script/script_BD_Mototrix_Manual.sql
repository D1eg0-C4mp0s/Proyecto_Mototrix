create table TallerMototrix;
use TallerMototrix;

CREATE TABLE Cliente(
idCliente INT NOT NULL,
nombre VARCHAR(45) NOT NULL,
telefono VARCHAR(45) NOT NULL,
correo VARCHAR(45) NOT NULL,
PRIMARY KEY (idCliente)
);
CREATE TABLE Vehiculos (
  idVehiculos INT NOT NULL,
  marca VARCHAR(45) NOT NULL,
  referencia VARCHAR(45) NOT NULL,
  modelo INT NOT NULL,
  estado VARCHAR(45) NOT NULL,
  kilometros_rec INT NOT NULL,
  PRIMARY KEY (idVehiculos)
  );
  CREATE TABLE Empleado (
  idEmpleado INT NOT NULL,
  nombre VARCHAR(45) NOT NULL,
  telefono VARCHAR(45) NOT NULL,
  tipo VARCHAR(45) NOT NULL,
  salario DOUBLE NOT NULL,
  PRIMARY KEY (idEmpleado)
  );
  CREATE TABLE Servicios (
  idServicios INT NOT NULL,
  nombre_serv VARCHAR(45) NOT NULL,
  precio DOUBLE NOT NULL,
  tiene_insumos TINYINT NOT NULL,
  tiene_refacciones TINYINT NOT NULL,
  PRIMARY KEY (idServicios)
  );
  CREATE TABLE Proveedor (
  idProveedor INT NOT NULL,
  nombre VARCHAR(45) NOT NULL,
  correo VARCHAR(45) NOT NULL,
  telefono VARCHAR(45) NOT NULL,
  PRIMARY KEY (idProveedor)
  );
  CREATE TABLE Refacciones (
  idRefacciones INT NOT NULL,
  nombre VARCHAR(45) NOT NULL,
  cantidad INT NOT NULL,
  precio_c DOUBLE NOT NULL,
  precio_v DOUBLE NOT NULL,
  PRIMARY KEY (idRefacciones)
  );
  CREATE TABLE Insumos (
  idInsumos INT NOT NULL,
  nombre VARCHAR(45) NOT NULL,
  cantidad INT NOT NULL,
  precio_c DOUBLE NOT NULL,
  precio_v DOUBLE NOT NULL,
  PRIMARY KEY (idInsumos)
  );
  CREATE TABLE Vinculo_Cliente (
  idCliente INT NOT NULL,
  idVehiculo INT NOT NULL,
  PRIMARY KEY (idCliente),
  CONSTRAINT VinculoC_Cliente_fk FOREIGN KEY (idCliente) REFERENCES Cliente (idCliente),
  CONSTRAINT VinculoC_Vehiculo_fk FOREIGN KEY (idVehiculo) REFERENCES Vehiculos (idVehiculos)
);
CREATE TABLE Compra (
  idCompra INT NOT NULL,
  idProveedor INT NOT NULL,
  PRIMARY KEY (idCompra),
  CONSTRAINT Compra_Proveedor_fk FOREIGN KEY (idProveedor) REFERENCES Proveedor (idProveedor)
  );
  CREATE TABLE Vinculo_Compra (
  idCompra INT NOT NULL,
  idRefaccion INT NOT NULL,
  PRIMARY KEY (idCompra),
  CONSTRAINT VinculoC_Compra_fk FOREIGN KEY (idCompra) REFERENCES Compra (idCompra),
  CONSTRAINT VinculoC_Refaccion_fk FOREIGN KEY (idRefaccion) REFERENCES Refacciones (idRefacciones)
  );
  CREATE TABLE Vinculo_Refaccion (
  idServicio INT NOT NULL,
  idRefaccion INT NOT NULL,
  PRIMARY KEY (idServicio),
  CONSTRAINT VinculoR_Servicio_fk FOREIGN KEY (idServicio) REFERENCES Servicios (idServicios),
  CONSTRAINT VinculoR_Refaccion_fk FOREIGN KEY (idRefaccion) REFERENCES Refacciones (idRefacciones)
  );
  CREATE TABLE Vinculo_Insumo (
  idServicio INT NOT NULL,
  idInsumo INT NOT NULL,
  PRIMARY KEY (idServicio),
  CONSTRAINT VinculoI_Servicios_fk FOREIGN KEY (idServicio) REFERENCES Servicios (idServicios),
  CONSTRAINT VinculoI_Insumos_fk FOREIGN KEY (idInsumo) REFERENCES Insumos (idInsumos)
  );
  CREATE TABLE ficha_de_servicio (
  idficha_servicios INT NOT NULL AUTO_INCREMENT,
  idCliente INT NOT NULL,
  idEmpleado INT NOT NULL,
  idVehiculo INT NOT NULL,
  fecha_servicio DATETIME NOT NULL,
  costo DOUBLE NOT NULL,
  PRIMARY KEY (idficha_servicios),
  CONSTRAINT Ficha_Cliente_fk FOREIGN KEY (idCliente) REFERENCES Cliente (idCliente),
  CONSTRAINT Ficha_Empleado_fk FOREIGN KEY (idEmpleado) REFERENCES Empleado (idEmpleado),
  CONSTRAINT Ficha_Vehiculo_fk FOREIGN KEY (idVehiculo) REFERENCES Vehiculos (idVehiculos)
  );
  CREATE TABLE Vinculo_Servicio (
  idFicha_Servicios INT NOT NULL,
  idServicios INT NOT NULL,
  PRIMARY KEY (idFicha_Servicios),
  CONSTRAINT VinculoS_Ficha_fk FOREIGN KEY (idFicha_Servicios) REFERENCES ficha_de_servicio (idficha_servicios),
  CONSTRAINT VinculoS_Servicio_fk FOREIGN KEY (idServicios) REFERENCES Servicios (idServicios)
  );