package cn.unicom.scala.course05

import scala.collection.mutable

/**
  * Created by zhangjiujun on 2019/8/29.
  */
object MapApp extends App {

  val a = Map("PK" -> 18, "zhangsan" -> 30)
  println(a)

  val b = mutable.Map("PK" -> 18, "zhangsan" -> 30)
  println(b)

//  for((key, value) <- b){
//    println(key + " : " + value)
//  }

//  for(key <- b.keySet){
//    println(key + " : " + b.getOrElse(key, 9))
//  }

//  for(value <- b.values){
//    println(value)
//  }

//    for((key, _) <- b){
//      println(key + " : " + b.getOrElse(key, 9))
//    }

//  val c = mutable.HashMap[String, Int]()
//
//
//  b.get("PK").get
//  b.getOrElse("PK", 9)    //通过key获取，没有返回默认值
//
//  b("list") = 40
//  b += ("wangwu" -> 4,"zhaoliu" -> 5)
//
//  b -= "wangwu"
}

