package cn.unicom.scala.course08

/**
  * Created by zhangjiujun on 2019/8/29.
  */
object ImplicitClassApp extends App{

  implicit class Calculator(x:Int) {
    def add(a:Int) = a + x
  }

  println(1.add(3))

}


