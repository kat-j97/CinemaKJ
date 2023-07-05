
drop schema if exists CinemaKJ;

drop user if exists usuario_KJ;

CREATE SCHEMA CinemaKJ ;

create user 'usuario_KJ'@'%' identified by 'ClaveKJ123';

grant all privileges on CinemaKJ.* to 'usuario_KJ'@'%';

flush privileges;

 
create table cinemaKJ.cliente (

  id_cliente INT NOT NULL AUTO_INCREMENT,

  nombre_Usuario VARCHAR(30) NOT NULL,

  nombre VARCHAR(30) NOT NULL,
  
  apellidos VARCHAR(30) NOT NULL,

  edad INT NOT NULL,

  contrasena BLOB NOT NULL,

  PRIMARY KEY (id_cliente));


create table cinemaKJ.administrador (

  id_admin INT NOT NULL AUTO_INCREMENT,

  nombre_Usuario VARCHAR(30) NOT NULL,

  nombre VARCHAR(30) NOT NULL,
  
  apellidos VARCHAR(30) NOT NULL,
  
  edad INT NOT NULL,

  contrasena BLOB NOT NULL,

  PRIMARY KEY (id_admin));


create table cinemaKJ.empleado (

  id_empleado INT NOT NULL AUTO_INCREMENT,

  nombre VARCHAR(30) NOT NULL,

  apellidos VARCHAR(30) NOT NULL,

  edad INT NOT NULL,

  puesto VARCHAR(30) NOT NULL,

  contrasena BLOB NOT NULL,

  PRIMARY KEY (id_empleado));
  
********************************************
  create table cinemaKJ.comida (

  id_comida INT NOT NULL AUTO_INCREMENT,

  tipo_Comida VARCHAR(30) NOT NULL,

  precio DOUBLE NOT NULL,

  PRIMARY KEY (id_comida));
  

create table cinemaKJ.entrada (

  id_entrada INT NOT NULL AUTO_INCREMENT,

  precio DOUBLE NOT NULL,

  tipo VARCHAR(30) NOT NULL,

  PRIMARY KEY (id_entrada));

  *********************************************
  
create table cinemaKJ.pelicula (

  id_pelicula INT NOT NULL AUTO_INCREMENT,
  
  nombre_Pelicula VARCHAR(400) NOT NULL,

  descripcion VARCHAR(400) NOT NULL,

  calificacion VARCHAR(30) NOT NULL,
  
  ano INT ,

  PRIMARY KEY (id_pelicula));
  
create table cinemaKJ.tanda (

  id_tanda INT NOT NULL AUTO_INCREMENT,
  
  fecha int NOT NULL,

  hora int NOT NULL,
  
  PRIMARY KEY (id_tanda));


create table cinemaKJ.sala (

  id_sala INT NOT NULL AUTO_INCREMENT,

  estado VARCHAR(400) NOT NULL,

  id_pelicula VARCHAR(30),

  id_tanda VARCHAR(30),
  
  FOREIGN KEY (id_pelicula) REFERENCES  cinemaKJ.pelicula (id_pelicula),
  FOREIGN KEY (id_tanda) REFERENCES  cinemaKJ.tanda (id_tanda),
  PRIMARY KEY (id_sala));

*********************************************

  create table cinemaKJ.reserva (

  id_reserva INT NOT NULL AUTO_INCREMENT,

  id_cliente  INT NOT NULL,
  
  id_sala  INT NOT NULL,   /*Solo se llama al id sala, porque ese tiene el id pelicula y el id tanda asignada*/

  id_comida INT NOT NULL,
  
  id_entrada INT NOT NULL,
  
  posicion_asiento VARCHAR(30) NOT NULL,
  
  FOREIGN KEY (id_sala) REFERENCES  cinemaKJ.sala (id_sala),
  FOREIGN KEY (id_cliente) REFERENCES  cinemaKJ.cliente (id_cliente),
  FOREIGN KEY (id_entrada) REFERENCES  cinemaKJ.entrada (id_entrada),
  FOREIGN KEY (id_comida) REFERENCES  cinemaKJ.comida (id_comida),
  PRIMARY KEY (id_reserva))
  ;
  
  
  