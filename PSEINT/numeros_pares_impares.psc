Algoritmo sin_titulo
	Escribir "Numeros pares"
	Para n<-1 Hasta 100 Con Paso 1 Hacer
		resu<- n mod 2
		Si resu == 0 Entonces
			Escribir n
		Fin Si
	Fin Para
	Escribir "Numeros impares"
	Para n<-1 Hasta 100 Con Paso 1 Hacer
		resu<- n mod 2
		Si resu > 0 Entonces
			Escribir n
		Fin Si
	Fin Para
FinAlgoritmo
