package cn.unicom.scala.course05

/**
  * Created by zhangjiujun on 2019/8/29.
  */
object ListApp extends App {

  val l = List(1,2,3,4,5)

  val l2 = 1 :: Nil

  val l5 = scala.collection.mutable.ListBuffer[Int]()

//  l5 += 2
//  l5 += (3,4,5)
//  l5 ++= List(6,7,8,9)
//
//  l5 -= 2
//  l5 -= 3
//  l5 -= (1, 4)
//
//  l5 --= List(5,6,7,8)
//
//  l5.toList
//  l5.toArray
//
//  println(l5)
//
//  l5.isEmpty
//  l5.head
//  l5.tail


  def sum(nums:Int*):Int = {
    if(nums.length == 0){
      0
    }else{
      nums.head + sum(nums.tail:_*)
    }
  }

  println(sum())
  println(sum(1,2,3,4))


  val set = scala.collection.mutable.Set[Int]()
  set += 1


}
