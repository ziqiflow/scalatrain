package cn.unicom.scala.course09

import scala.io.Source

/**
  * Created by zhangjiujun on 2019/8/30.
  */
object FileApp {

  def main(args: Array[String]): Unit = {
    var file = Source.fromFile("D:\\test.txt")(scala.io.Codec.ISO8859)

    def readLine(): Unit ={
      for(line <- file.getLines()){
        println(line)
      }
    }

//    readLine()

    def readChar(): Unit ={
      for(ele <- file){
        println(ele)
      }
    }

//    readChar()

    def readNet(): Unit ={
      var file = Source.fromURL("http://www.baidu.com")
      for(line <- file.getLines()){
        println(line)
      }
    }

    readNet()


  }

}
