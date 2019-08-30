package cn.unicom.scala.course09

import java.io.{FileInputStream, InputStreamReader}

import scala.xml.XML

/**
  * Created by zhangjiujun on 2019/8/30.
  */
object XMLApp {


  def main(args: Array[String]): Unit = {
//    loadXML()
    readXMLAttr()

  }

  def readXMLAttr(): Unit ={
    val xml = XML.load(this.getClass.getClassLoader.getResource("pk.xml"))
//    println(xml)

    // header/field
//    val headerField = xml \ "header" \ "field"
//    println(headerField)

    // all/field
//    val fields = xml \\ "field"
//    for(field <- fields){
//      println(field)
//    }

    // header/field/name
//    val fieldAttributes = (xml \ "header" \ "field").map(_ \ "@name")
//    val fieldAttributes = (xml \ "header" \ "field" \\ "@name")
//    for(fieldAttribute <- fieldAttributes){
//      println(fieldAttribute)
//    }

    //  name="Logon" message
//    val filters = (xml \\ "message")
////      .filter(_.attribute("name").exists(_.text.equals("Logon")))
//      .filter(x => ((x \ "@name").text).equals("ResendRequest"))
//    for(filter <- filters){
//      println(filter)
//    }

    // header/field content
    (xml \ "header" \ "field")
      .map(x => (x \ "@name", x.text, x \ "@required"))
      .foreach(println)



  }




  def loadXML(): Unit ={
//    val xml = XML.load(this.getClass.getClassLoader.getResource("test.xml"))
//    println(xml)

//    val xml = XML.load(new FileInputStream("D:\\Scala\\workspace\\scalatrain\\src\\main\\resources\\test.xml"))
//    println(xml)

//    val xml = XML.load(
//        new InputStreamReader(
//          new FileInputStream("D:\\Scala\\workspace\\scalatrain\\src\\main\\resources\\test.xml")))
//    println(xml)
  }


}
