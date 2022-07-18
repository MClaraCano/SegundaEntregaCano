insert into cliente
(dni, nombre, apellido, edad, sexo)
values
(34092760, 'Belén', 'Anauati', 21, 'femenino'),
(37154109, 'Agustín', 'Delgado', 39, 'masculino'),
(15209684, 'Francisco', 'Lucero', 40, 'masculino'),
(11991997, 'Miguel', 'Novo', 50, 'masculino');


insert into producto
(id_producto, nombreProducto, precio)
values
(1, 'Remera', 2500),
(2, 'Buzo', 5700),
(3, 'Jean', 6600),
(4, 'Zapatillas', 21000);


insert into venta
(id_venta, fecha_venta, cantidad_productos, precio_unidad, total_venta)
values
(1, '2022-05-19', 1, 5700, 5700),
(2, '2021-09-19', 2, 5700, 11400),
(3, '2022-01-10', 1, 21000, 21000),
(4, '2022-06-30', 3, 2500, 7500);