fun main(args: Array<String>) {

    var options = ""
    var operator = ""
    print("Ingrese donde quiere acceder: \n 1.Operadores \n2.Condicionales \n3. Ciclos")
    options = readln()
    when (options) {
        "1" -> {
            println("Operadores: \n Ingrese el ejercicio que desea realizar:\n1.Ejercicio 1 \n 2.Ejercicio 2 \n 3.Ejercicio 3 \n 4.Ejercicio 4 \n 5.Ejercicio 5 \n 6.Ejercicio 6 \n 7.Ejercicio 7 \n 8.Ejercicio 8")
            var operator = readln().toInt()
            if (operator == 1) {
                triangleArea()
            }
            else if(operator==2){
                sumNumbers()
            }
            else if(operator==3){
                numberSquare()
            }
            else if(operator==4){
                convertDolar()
            }
            else if(operator==5){
                operationSquare()
            }
            else if(operator==6){
                calculateAreaVolume()
            }
            else if (operator==7){
                computeCircumference()
            }
            else if (operator==8){
                calculateAverage()
            }



        }
        "2" -> {
            println("Condicionales: \n Ingrese el ejercicio que desea realizar:\n1.Ejercicio 1 \n 2.Ejercicio2 \n 3.Ejercicio 3 \n 4.Ejercicio 4 \n 5.Ejercicio 5 \n 6.Ejercicio 6 \n 7.Ejercicio 7")
            var operator = readln().toInt()
            if (operator == 1) {
                determinePositiveNegative()
            }
            else if(operator==2){
                determineMajorMinor()
            }
            else if(operator==3){
                determineMayorMinorThree()
            }
            else if(operator==4){
                addSubtract()
            }
            else if(operator==5){
                calculateQuotient()
            }
            else if(operator==6){
                addMultiply()
            }
            else if (operator==7){
                determineBisiesto()
            }

        }
        "3" -> {
            println("Ciclos: \n Ingrese el ejercicio que desea realizar:\n1.Ejercicio 1 \n 2.Ejercicio2 \n 3.Ejercicio 3 \n 4.Ejercicio 4 \n 5.Ejercicio 5 \n 6.Ejercicio 6 \n 7.Ejercicio 7")
            var operator = readln().toInt()
            if (operator == 1) {
                MultiPar()
            }
            else if(operator==2){
                NumbreImpar()
            }
            else if(operator==3){
                impress()
            }
            else if(operator==4){
                ImpressTow()
            }
            else if(operator==5){
                sumSquares()
            }
            else if(operator==6){
                showNumbers()
            }
            else if (operator==7){
                addNumbers()
            }

        }
    }
}
//-------------------------------------------------//Operadores//---------------------------------------------------

//Exercise 1//
//Calcular el área de un triángulo.
fun triangleArea(){
    println("Ingrese la base del triangulo")
    val triangleBase = readln().toInt()
    println("Ingrese la altura del triangulo")
    val triangleHeight = readln().toInt()
    val triangleArea = (triangleBase*triangleHeight)/2

    println("$triangleArea")

}

//Exercise 2//

//Ingresar dos números por teclado y sumarlos.
fun sumNumbers(): Double {
    println("Ingresa el primer número:")
    val num1 = readLine()!!.toDouble()
    println("Ingresa el segundo número:")
    val num2 = readLine()!!.toDouble()
    return num1 + num2
}

//Exercise 3//

//Ingresar un número y visualizar el número elevado al cuadrado.
fun numberSquare(): Double {
    println("Ingresa un numero")
    val number = readLine()!!.toDouble()
    return number * number
}

//Exercise 4//

//Ingresar un número y visualizar el número elevado al cuadrado.
fun convertDolar(){
    println("Ingrese la cantidad de euros: ")
    var eures = readln().toInt()
    println("Ingrese el valor del dolar")
    var dolar = readln().toInt()
    println("Ingrese la cantidad de dolares")
    var dolars = readln().toInt()
    var wheel = eures/dolar
    println(" euro:$eures \n el precio del Dolar es: $dolar la coversion es $wheel")
}

//Exercise 5//

//Escribir un algoritmo que pida el lado de un cuadrado y muestre el valor del área y del
//perímetro
fun operationSquare(){
    println("Por favor ingrese el lado del cuadrado")
    val lade = readln().toInt()
    val area=lade*lade
    val perimeter=lade*4
    println("El area del cuadrado es: $area \n El perimetro del cuadrado es: $perimeter")
}


//Exercise 6//

//Escribir un algoritmo que determine el área y el volúmen de un cilindro.

fun main() {
    val (area, volume) = calculateAreaVolume()
    println("Área del cilindro: $area")
    println("Volumen del cilindro: $volume")
}

fun calculateAreaVolume(): Pair<Double, Double> {
    println("Ingresa el radio del cilindro:")
    val radio = readLine()?.toDouble() ?: 0.0
    println("Ingresa la altura del cilindro:")
    val altura = readLine()?.toDouble() ?: 0.0

    val area = 2 * PI * radio * (radio + altura)
    val volume = PI * radio * radio * altura

    return area to volume
}


//Exercise 7//

//Realizar un algoritmo que lea el radio de una circunferencia y escriba la longitud de la misma y
//el área (pi*r)^2 del círculo inscrito.

fun computeCircumference() {
    println("Ingresa el radio de la circunferencia:")
    val radio = readLine()?.toDouble() ?: 0.0

    val circunferencia = 2 * PI * radio
    val areaCirculoInscrito = PI * radio * radio

    println("Longitud de la circunferencia: $circunferencia")
    println("Área del círculo inscrito: $areaCirculoInscrito")
}


//Exercise 8//

//Calcular el promedio de tres (3) números ingresados por teclado
fun calculateAverage(): Double {
    println("Ingresa el primer número:")
    val num1 = readLine()!!.toDouble()
    println("Ingresa el segundo número:")
    val num2 = readLine()!!.toDouble()
    println("Ingresa el tercer número:")
    val num3 = readLine()!!.toDouble()

    return (num1 + num2 + num3) / 3
}


//---------------------------------------------//Condicionales//----------------------------------------------------

//Exercise 1//

//This program prompts the user to enter a number and then determines if it is positive or negative.
// If the number is greater than zero, it is considered positive and a corresponding message is printed.
// If the number is less than zero, it is considered negative and a corresponding message is printed.
// If the number is equal to zero, it is considered neutral and a corresponding message is printed.//

fun determinePositiveNegative() {
    print("Enter a number: ")
    val nums = readLine()?.toDouble()

    if (nums ?: 0.0 > 0) {
        println("The number is positive")
    } else if (nums ?: 0.0 < 0) {
        println("The number is negative")
    } else {
        println("The number is neutral")
    }
}

//Exercise 2//

//This program prompts the user to enter two numbers and then determines which one is the greater
// and which one is the smaller. If the first number is greater than the second number,
// the program prints the corresponding messages. If the first number is smaller than the second number,
// the program prints the corresponding messages. If the two numbers are equal, the program prints a message
// indicating that they are equal.//

fun determineMajorMinor() {
    print("Enter the first number: ")
    val numsr1 = readLine()?.toDouble()

    print("Enter the second number: ")
    val numsr2 = readLine()?.toDouble()

    if (numsr1 ?: 0.0 > numsr2 ?: 0.0) {
        println("The largest number is: ${numsr1 ?: 0.0}")
        println("The smallest number is: ${numsr2 ?: 0.0}")
    } else if (numsr1 ?: 0.0 < numsr2 ?: 0.0) {
        println("The greatest number is: ${numsr2 ?: 0.0}")
        println("The smallest number is: ${numsr1 ?: 0.0}")
    } else {
        println("The two numbers are equal")
    }
}

//Exercise 3//

//This program prompts the user to enter three numbers and then determines which one is the greater and
// which one is the smaller.
// If the first number is greater than the second and third numbers, the program
// prints the corresponding messages.
// If the second number is greater than the first and third numbers,
// the program prints the corresponding messages.
// If the third number is greater than the first and second numbers, the program prints the corresponding messages.
// If all three numbers are equal, the program prints
// a message indicating that they are equal.//

fun determineMayorMinorThree() {
    print("Enter the first number: ")
    val numsx1 = readLine()?.toDouble()

    print("Enter the second number: ")
    val numsx2 = readLine()?.toDouble()

    print("Enter the third number: ")
    val num3 = readLine()?.toDouble()

    val major = if (numsx1 ?: 0.0 > numsx2 ?: 0.0 && numsx1 ?: 0.0 > num3 ?: 0.0) {
        numsx1 ?: 0.0
    } else if (numsx2 ?: 0.0 > numsx1 ?: 0.0 && numsx2 ?: 0.0 > num3 ?: 0.0) {
        numsx2 ?: 0.0
    } else {
        num3 ?: 0.0
    }

    val minor = if (numsx1 ?: 0.0 < numsx2 ?: 0.0 && numsx1 ?: 0.0 < num3 ?: 0.0) {
        numsx1 ?: 0.0
    } else if (numsx2 ?: 0.0 < numsx1 ?: 0.0 && numsx2 ?: 0.0 < num3 ?: 0.0) {
        numsx2 ?: 0.0
    } else {
        num3 ?: 0.0
    }

    println("The largest number is: $major")
    println("The smallest number is: $minor")
}

//Exercise 4//

//This program prompts the user to enter two numbers and then determines whether to add or
// subtract them based on their relationship.
// If the first number is less than the second number,
// the program adds the two numbers and prints the result.
// If the first number is greater than or
// equal to the second number, the program subtracts the second number from the first number and prints
// the result.//

fun addSubtract() {
    print("Enter the first number: ")
    val numt1 = readLine()?.toDouble()

    print("Enter the second number: ")
    val numt2 = readLine()?.toDouble()

    if (numt1 ?: 0.0 < numt2 ?: 0.0) {
        val sum = numt1 ?: 0.0 + numt2 ?: 0.0
        println("The sum of the two numbers is: $sum")
    } else {
        val subtraction = numt1 ?: 0.0 - numt2 ?: 0.0
        println("The subtraction of the two numbers is: $subtract")
    }
}

//Exercise 5//

//This program prompts the user to enter two numbers and then calculates the quotient between them.
// If the second number is zero, the program prints a message indicating that division by zero is
// not possible. Otherwise, it divides the first number by the second number and prints the result.//

fun calculateQuotient() {
    print("Enter the first number: ")
    val numo1 = readLine()?.toDouble()

    print("Enter the second number: ")
    val numo2 = readLine()?.toDouble()

    if (numo2 ?: 0.0 == 0.0) {
        println("Division is not possible")
    } else {
        val quotient = numo1 ?: 0.0 / numo2 ?: 0.0
        println("The quotient between the two numbers is: $quotient")
    }
}

//Exercise 6//

//This program prompts the user to enter two numbers and then determines whether to add or multiply
// them based on their relationship. If at least one of the numbers is negative, the program adds the
// two numbers and prints the result. If both numbers are positive, the program multiplies the two numbers
// and prints the result.//

fun addMultiply() {
    print("Enter the first number: ")
    val numq1 = readLine()?.toDouble()

    print("Enter the second number: ")
    val numq2 = readLine()?.toDouble()

    if (numq1 ?: 0.0 < 0 || numq2 ?: 0.0 < 0) {
        val sum = numq1 ?: 0.0 + numq2 ?: 0.0
        println("The sum of the two numbers is: $sum")
    } else {
        val product = numq1 ?: 0.0 ?: 0.0 * numq2 ?: 0.0
        println("The product of the two numbers is: $product")
    }
}

//Exercise 7//

//This program prompts the user to enter a year and then determines whether it is a leap year or not.
// If the year is divisible by 4 but not by 100, or if it is divisible by 400, it is considered a leap
// year and a corresponding message is printed. Otherwise, it is not a leap year and a corresponding message
// is printed.//

fun determineBisiesto() {
    print("Enter a year: ")
    val year = readLine()?.toInt()

    if (year ?: 0 % 4 == 0 && year ?: 0 % 100 != 0 || year ?: 0 % 400 == 0) {
        println("The year is leap year")
    } else {
        println("The year is not a leap year")
    }
}

//-------------------------------------------------------//Ciclos//------------------------------------------------------




//Exercise 1//

fun MultiPar() {
    println("Múltiplos de 3 entre 1 y 100:")
    for (num in 1..100) {
        if (num % 3 == 0) {
            println(num)
        }
    }
}

//Exercise 2//

fun NumbreImpar() {
    println("Números impares entre 0 y 100:")
    for (num in 1..100 step 2) {
        println(num)
    }
}

//Exercise 3//

fun impress() {
    println("Números pares entre 1 y 100:")
    for (num in 2..100 step 2) {
        println(num)
    }
}

//Exercise 4//

fun ImpressTow() {
    println("Cuadrados de los números del 1 al 30:")
    for (num in 1..30) {
        val cuadrado = num * num
        println("$num al cuadrado es: $cuadrado")
    }
}

//Exercise 5//

fun sumSquares() {
    var suma = 0

    for (i in 1..100) {
        suma += i * i
    }

    println("The sum of the squares of the first hundred natural numbers is: $sum")
}

//Exercise 6//

fun showNumbers() {
    print("Enter the first number: ")
    val numm1 = readLine()?.toInt()

    print("Enter the second number: ")
    val numm2 = readLine()?.toInt()

    if (numm1 != null && numm2 != null && numm1 < numm2) {
        for (i in num1..num2) {
            println(i)
        }
    } else {
        println("The entered numbers are invalid")
    }
}

//Exercise 8//

fun addNumbers() {
    var sume = 0
    var nump: Int? = null

    while (nump != 0) {
        print("Enter a number (0 to exit): ")
        nump = readLine()?.toInt()
        sume += num ?: 0
    }

    println("The sum of the numbers entered is: $sume")
}