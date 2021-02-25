Algoritmo mayor_2_y_3_numeros
	Escribir "Programa que determina el mayor de 3 números"
	Escribir "Ingrese el primer número"
	Leer num1
	Escribir "Ingrese el segundo número"
	Leer num2
	Escribir "Ingrese el tercer número"
	Leer num3
	
	Si num1>num2 Entonces
		Si num1>num3 Entonces
			Escribir "El mayor es: ", num1
		SiNo
			Escribir "El mayor es: ", num3
		FinSi
	SiNo
		Si num2>num3 Entonces
			Escribir "El mayor es: ", num2
		SiNo
			Escribir "El mayor es: ", num3
		FinSi
	Fin Si
FinAlgoritmo

