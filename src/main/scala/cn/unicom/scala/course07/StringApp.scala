package cn.unicom.scala.course07

/**
  * Created by zhangjiujun on 2019/8/29.
  */
object StringApp extends App{

  val s = "Hello:"
  val name = "PK"
  println(s + name)

  print(s"Hello:$name")
  val team = "AC Milan"

  println(s"Hello:$name,Welcome to $team")

  val b =
    """
      |这是一个多行字符串
      |hello
      |world||
      |PK
    """.stripMargin

  println(b)
}
