package cn.unicom.scala.course06

/**
  * Created by zhangjiujun on 2019/8/29.
  */
object ExceptionApp extends App{

  // IO
  val file = "test.txt"




  try{
    val i = 10/0
    println(i)
  } catch {
    case e:ArithmeticException => println("除数不能为0...")
    case e:Exception => println(e.getMessage)
  } finally {

    // 释放资源，一定能执行: close file

  }

}
