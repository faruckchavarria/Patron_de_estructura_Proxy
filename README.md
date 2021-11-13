# Patron_de_estructura_Proxy
## para la elaboracion de el patron Proxy necesitamos la creacion de una estructura en la cual se nos va a prensentar un sistema tipo servidor para subir, bajar y listar archivos o ficheros que se creen al estar iniciado el programa.

### La primera clase creada es la clase fecha la cual estara conectada y servira para nosotros poder observar todas las horas o tiempo necesario para colocarlo en la creacion, listado de los ficheros.
<img src="capturas\1.PNG"/>

### En la clase de Fecha creamos con sus atributos  y sus contructores para que seran usados para pasarle los datos necesarios para cada uno.
<img src="capturas\2.PNG"/>

### Creamos la instancia de fecha que obtendra los valores de la fecha, el año y del mes.
<img src="capturas\3.PNG"/>

### Se hace una llamado los metodos en donde se realiza el retorno de cada uno de los valores de fecha y de eta forma ser presentado en la clase tipo cliente.
<img src="capturas\4.PNG"/>

### El mismo proceso se crearia para el mes y año, se realizan los gets y stes de caa uno de ellos.
<img src="capturas\5.PNG"/>

### Creamos la clase de tipo fichero la cual es capaz de obtener las variables que seran usadas para la obtencion de informacion de los datos en esta clase y la clase de tipo cliente
<img src="capturas\6.PNG"/>

### Utilizamos un contador inicializamos en cero para tener claro que se comienza a contar desde cero, y un constructor que tendra la instancia de tipo nombre para tener el jombre del fichero.
<img src="capturas\7.PNG"/>

### Se crea la clase de los metodos los cuales nos permitiran poder obtener y retornar los valores necesarios osea sus gets y set
<img src="capturas\8.PNG"/>

### Creamos la clase de Proxy donde implementa metodos de la clase servidor que aun no se crea, pero si podremos notar datos que son necesarios pára poder implementarlos en esta clase, donde declaramos la variable de Servidor y esta podra pasar valores en un constructor
<img src="capturas\9.PNG"/>

### Luego se extraen los set o parte de los metodos que seran usados ene sta clase
<img src="capturas\10.PNG"/>

### luego obtenemos los valores que seran fundamentales para poder subir, bajar o listar los ficheros creados en ese patron
<img src="capturas\11.PNG"/>

### Luego creamos una clase de tipo interface para poder utilizar todas la funciones anteriores de subir, bajar y listar los ficheros
<img src="capturas\12.PNG"/>

### Se crea la clase de Servidor de ficheros donde esta nos permitira retornar todos lo valores de listado creamos en base a los ficheros existentes en el programa.
<img src="capturas\13.PNG"/>

### Verificamos el metodo de subir el cual creara un nuevo fichero y lo almacenara atraves de un codigo de identificacion, con un mensaje de confirmacion sin validacion.
<img src="capturas\14.PNG"/>

### Para bajar le fihcero solo se hara el llamado de el id del fichero y de esta forma se mostrara
<img src="capturas\15.PNG"/>

### Luego cremoa el metodo del listado de los ficheros que estan ingresados, que hara un iterador donde se nos permitira poder listar cada uno de los ficheros con un ID que se le ha asignado. y retornara la lista.
<img src="capturas\16.PNG"/>

### Se crea la clase de cliente que nos permitira poder usar el servidor de proxy para crear la liksta de ficheros, bajarlos y listarlos, este conformado de muchas condisionales, que nos daran una iteracion de salir, o seleccinar en todas y cada una de las opciones que tiene el servidor.
<img src="capturas\17.PNG"/>