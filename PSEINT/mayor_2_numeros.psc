Algoritmo mayor_2_y_3_numeros
	num1<-6
	num2<-8
	num3<-10
	
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
