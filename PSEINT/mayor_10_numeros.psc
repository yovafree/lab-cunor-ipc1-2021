Algoritmo sin_titulo
	Escribir "El mayor de 10 números"
	Escribir "Ingrese el número: 1"
	Leer num1
	Para n<-2 Hasta 10 Con Paso 1 Hacer
		Escribir "Ingrese el número: ",n
		Leer num2
		Si num2>num1 Entonces
			num1<-num2
		FinSi
	Fin Para
	
	Escribir "El mayor es: ",num1
FinAlgoritmo
