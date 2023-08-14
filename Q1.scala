import scala.io.StdIn.readDouble

object Q1 {
  def main(args: Array[String]): Unit = {


      val interestRate:Double =>Double= depositAmount => depositAmount match {
        case amount if depositAmount <=20000 => 2/100 * amount
        case amount if depositAmount <=200000 => 4/100 * amount
        case amount if depositAmount <=2000000 => 3.5/100 * amount
        case amount => 6.5/100 * amount
    }

    println("Enter the deposit amount :")
    var depositAmount=readDouble()
    println("Interest Paid at Maturity : "+BigDecimal(interestRate(depositAmount)).setScale(2,BigDecimal.RoundingMode.HALF_UP))
  }
}
