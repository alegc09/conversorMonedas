<h1 align="center"> Conversor de monedas </h1>
<p align="center">
<img src="https://img.shields.io/badge/STATUS-TERMINADO- blue">
<img src="https://img.shields.io/badge/TECNOLOGÍA-JAVA- green">
</p>
Challenge No. 2 Conversor de monedas es un programa que utiliza la API de EXCHANGERATE para poder hacer las conversiones con las divisas actualizadas en tiempo real, para fines de entrega del Challenge solo tiene 6 conversiones de moneda:
<ul>
  <li>Peso Mexicano a Yen Japones</li>
  <li>Yen Japones a Peso Mexicano</li>
  <li>Peso Mexicano a Dólar Estadounidense</li>
  <li>Dólar Estadounidense a Peso Mexicano</li>
  <li>Peso Mexicano a Euro</li>
  <li>Euro a Peso Mexicano</li>
</ul>
<h2 align="center"> Cómo funciona </h2>
Creamos la función Conversion que tendrá como atributos: base_code (String), target_code(String) conversion_result(double) monto(float) para poder crear un método que imprima de manera correcta los datos que recibirá de la API, estos datos están en formato JSON por lo que ocupamos un Record para poder recibir estos datos.<img width="1097" height="563" alt="Captura de pantalla 2025-11-22 001209" src="https://github.com/user-attachments/assets/83359a0c-e6ea-4662-a0ea-c5fca5eeada9" />
En la función principal (Main) hacemos uso de un while y un switch para elegir la opción deseada y dependiendo de ella creamos el objeto pidiendo que el usuario solo ingrese el monto a convertir. <img width="1834" height="981" alt="Captura de pantalla 2025-11-22 000612" src="https://github.com/user-attachments/assets/763d9d7c-0a62-445d-b85a-7736ce30b056" />
Creamos una clase del tipo Record que nos servira solamente para transportar los datos del JSON a la clase Conversion para poder imprimir correctamente esos datos.<img width="969" height="231" alt="Captura de pantalla 2025-11-22 000808" src="https://github.com/user-attachments/assets/58412bdd-7611-4005-86b2-e7ae8cdfe886" />
En la clase ConsultaApi creamos la conexión con la API de EXCHANGERATE pasando como parametros la divisa base, la divisa objetivo y el monto que deseamos convertir. <img width="1267" height="796" alt="Captura de pantalla 2025-11-22 001039" src="https://github.com/user-attachments/assets/9ba6bf12-ef3f-46f3-af26-423fd3281a83" />
