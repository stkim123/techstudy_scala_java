package kr.ac.jbnu.ssel.java

import org.junit.After
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class CustomerScalaTest {

  @Before
  def setUp: Unit = {}

  @After
  def tearDown: Unit = {}

  @Test
  def testGetCustomerId = {
    System.out.println("GetCustomerID")
    val instance = new Customer()
    val expResult: Integer = 0
    val result:Integer = instance.getCustomerId()
    assert(expResult == result)
  }
}