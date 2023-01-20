create table libro(
id int primary key,
nombre varchar(150) not null,
cat varchar(150) not null,
año int not null,
editorial varchar(150) not null,
pag int not null,
precio double not null
);

insert into libro values(1, 'Las Mil y Una Noches', 'Ficcion Clasica', 2014, 'Pluton Ediciones', 320, 20.00);
insert into libro values(2, 'El Principito', 'Cuentos', 1943, 'Origo',14,30.00);
insert into libro values(3, 'Despertando al gigante interior', 'Motivacion',2020,'Debolsillo',160,47.20);
insert into libro values(4, 'Despues de diciembre', 'Novela', 2022, 'Penguin Random House',426,60.60);
insert into libro values(5, 'After. Antes de ella', 'Ficcion', 2019, 'Booket', 480, 85.00);

create table categoria(
id int primary key,
nombre varchar(100) not null
);

insert into categoria values (1, 'Ficcion Clasica');
insert into categoria values (2, 'Cuentos');
insert into categoria values (3, 'Motivacion');
insert into categoria values (4, 'Novela');
insert into categoria values (5, 'Ficcion Moderna');