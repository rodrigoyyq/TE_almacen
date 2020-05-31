
-- Base de datos: `bd_almacen`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `productos`
--

CREATE TABLE `productos` (
  `id` int(11) NOT NULL,
  `descripcion` varchar(250) DEFAULT NULL,
  `stock` int(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `productos`
--

INSERT INTO `productos` (`id`, `descripcion`, `stock`) VALUES
(1, 'Celular Samsung J7 ', 105),
(2, 'Laptop 50*', 55),
(3, 'Ipad Pro 10 Sony', 30),
(4, 'Notebook mini A10', 45),
(11, 'auriculares Sony SN-28mv', 32);


--
-- Indices de la tabla `productos`
--
ALTER TABLE `productos`
  ADD PRIMARY KEY (`id`);


--
-- AUTO_INCREMENT de la tabla `productos`
--
ALTER TABLE `productos`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;



![Captura de pantalla (14)](https://user-images.githubusercontent.com/66080714/83359895-a86a4e00-a37d-11ea-9af0-892e29d367f7.png)
![Captura de pantalla (15)](https://user-images.githubusercontent.com/66080714/83359897-a902e480-a37d-11ea-972c-b5686de518e0.png)
