package cn.unicom.scala.course06

import scala.util.Random

/**
  * Created by zhangjiujun on 2019/8/29.
  */
object MatchApp extends App{

//  val names = Array("Akiho Yoshizawa", "YuiHatano", "Aoi Sola")
//  val name = names(Random.nextInt(names.length))
//
//  name match {
//    case "Akiho Yoshizawa" => println("吉老师...")
//    case "YuiHatano" => println("波老师...")
//    case _ => println("真不知道你们再说什么...")
//  }
//
//
//  def judgeGrade(grade:String): Unit ={
//    grade match {
//      case "A" => println("Excellent...")
//      case "B" => println("Good...")
//      case "C" => println("Just so so...")
//      case _ => println("You need work harder...")
//    }
//  }
//
//  judgeGrade("A")
//  judgeGrade("C")
//  judgeGrade("D")


//  def judgeGrade(name:String, grade:String): Unit ={
//      grade match {
//        case "A" => println("Excellent...")
//        case "B" => println("Good...")
//        case "C" => println("Just so so...")
//        case _ if(name == "lisi")=> println(name + ",you are a good boy,but...")
//        case _ => println("You need work harder...")
//      }
//  }
//
//  judgeGrade("zhangsan", "D")
//  judgeGrade("lisi", "D")

  // Array匹配
//  def greeting(array:Array[String]): Unit ={
//      array match {
//        case Array("zhangsan") => println("Hi:zhangsan")
//        case Array(x,y) => println("Hi:" + x + " , " + y)
//        case Array("zhangsan", _*) => println("Hi:zhangsan and other friends...")
//        case _ => println("Hi:everybody...")
//      }
//  }
//
//  greeting(Array("zhangsan"))
//  greeting(Array("lisi","wangwu"))
//  greeting(Array("zhangsan","lisi","wangwu"))
//  greeting(Array("lisi","zhangsan","wangwu"))


  // List匹配
//  def greeting(list:List[String]): Unit ={
//      list match {
//        case "zhangsan" :: Nil => println("Hi:zhangsan")
//        case x :: y :: Nil => println("Hi:" + x + " , " + y)
//        case "zhangsan" :: tail => println("Hi:zhangsan and other friends...")
//        case _ => println("Hi:everybody...")
//      }
//  }
//
//  greeting(List("zhangsan"))
//  greeting(List("lisi","zhangsan"))
//  greeting(List("zhangsan","lisi","wangwu"))
//  greeting(List("PK","zhangsan","lisi"))


  // 类匹配
//  def matchType(obj:Any): Unit ={
//    obj match {
//      case x:Int => println("Int")
//      case s:String => println("String")
//      case m:Map[_,_] => m.foreach(println)
//      case _ => println("other type")
//    }
//  }
//
//  matchType(1)
//  matchType("1")
//  matchType(1f)
//  matchType(Map("name" -> "PK"))


  // case class匹配

//  class Person
//  case class CTO(name:String, floor:String) extends Person
//  case class Employee(name:String, floor:String) extends Person
//  case class Other(name:String) extends Person
//
//
//  def caseclassMatch(person:Person): Unit ={
//      person match {
//        case CTO(name, fllor) => println("CTO name is: " + name + " , floor is: " + fllor )
//        case Employee(name, fllor) => println("Employee name is: " + name + " , floor is: " + fllor )
//        case _ => println("other")
//      }
//  }
//
//  caseclassMatch(CTO("PK","22"))
//  caseclassMatch(Employee("zhangsan","2"))
//  caseclassMatch(Other("other"))



  // Some&None模式匹配

  val grades = Map("PK" -> "A", "zhangsan" -> "C")

  def getGrade(name:String): Unit ={
      val grade = grades.get(name)
      grade match {
        case Some(grade) => println(name + ": your grade is : " + grade)
        case None => println("Sorry...")
      }
  }

  getGrade("zhangsan")
  getGrade("PK")
  getGrade("lisi")


}
