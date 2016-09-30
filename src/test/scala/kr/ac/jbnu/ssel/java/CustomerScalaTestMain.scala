package kr.ac.jbnu.ssel.java

object CustomerTestMain {
  def main(args: Array[String]): Unit = {
    val cst = new CustomerScalaTest()
    cst testGetCustomerId
  }
}