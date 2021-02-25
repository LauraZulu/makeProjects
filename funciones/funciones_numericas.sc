
val areaTrianguloRectangulo = (a:Int, b:Int) => { (a*b)/ 2}

val areaDeUnCirculo = new Function1[Double,Double]{

  def apply(r: Double) = { Math.PI*r*r}}

val calSalario = (devengado:Double, deducciones:Double) => {devengado - deducciones}

val calSalarioBono = (devengado:Double, deducciones:Double) => {(devengado*1.10) - deducciones}

def compSalario(f:(Double,Double) => Double, devengado:Double, deducciones:Double) = f(devengado,deducciones)

compSalario(calSalario, 1000000, 200000)
compSalario(calSalarioBono, 1000000, 200000)

def genCalSalarioBono(bono:Double):(Double, Double) => Double = {(devengado:Double, deducciones:Double) => {(devengado*bono) - deducciones} }

val calSalario5 = genCalSalarioBono(1.05)
val calSalario20 = genCalSalarioBono(1.2)

val bono = 1.2
val calSalarioBonoClausura = (devengado:Double,deducciones:Double) => {(devengado*bono) - deducciones }

compSalario(calSalarioBonoClausura,200000,10000)

def calSalario15():(Double,Double)=>Double = {genCalSalarioBono(0.15)}
def calSalario100():(Double,Double)=>Double = {genCalSalarioBono(2.0)}

def factorial(n:Int):Int = { if (n == 0) 1 else if (n == 1) 1 else n*factorial(n-1)}

def f(n:Int):Int = { if (n == 0) 0 else if (n == 1) 1 else f(n-1)+f(n-2)}

def factorialTail(n:Int, acum:Int):Int = {if(n == 0) acum else if(n == 1) acum else factorialTail(n-1, acum*n)}