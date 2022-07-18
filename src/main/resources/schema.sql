DROP TABLE CLIENTE IF EXISTS;
create table cliente
(
dni int not null primary key,
nombre varchar (150) not null,
apellido varchar (150) not null,
edad int not null,
sexo varchar (50) not null
);

DROP TABLE PRODUCTO IF EXISTS;
create table producto
(
id_producto int not null auto_increment,
nombreProducto varchar (150) not null,
precio int not null,
primary key (id_producto)
);

DROP TABLE VENTA IF EXISTS;
create table venta
(
id_venta INT not null auto_increment,
fecha_venta DATE not null,
cantidad_productos INT not null,
precio_unidad INT not null,
total_venta INT not null,
primary key(id_venta)
);

