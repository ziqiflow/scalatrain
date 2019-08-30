package cn.unicom.scala.course08

import java.io.File

//import ImplicitAspect._

/**
  * Created by zhangjiujun on 2019/8/29.
  */
object ImplicitApp{

  // 定义隐式转换函数即可
//  implicit def man2superman(man:Man):Superman = new Superman(man.name)
//  import ImplicitAspect.man2superman
//  val man = new Man("PK")
//  man.fly()

//  implicit def file2RichFile(file:File):RichFile = new RichFile(file)
//  var file = new File("D:\\test.txt")
//  val txt = file.read()
//  println(txt)

  implicit val test = "test"

  def main(args: Array[String]): Unit = {
    def testParam(implicit name:String): Unit ={
      println(name + "~~~~~~~~~~~~")
    }

    testParam
  }


//  testParam("zhangsan")

//  implicit val name = "implicit_name"
//  testParam
//  testParam("PK")

//  implicit val s1 = "s1"
//  implicit val s2 = "s2"
//  testParam

}


class Man(val name:String) {

  def eat(): Unit ={
    println(s"superman[ $name ] eat ....." )
  }

}

class Superman(val name:String) {

  def fly(): Unit ={
      println(s"superman[ $name ] fly ....." )
  }

}


class RichFile(val file:File){

  def read() ={
    scala.io.Source.fromFile(file.getPath).mkString
  }

}


