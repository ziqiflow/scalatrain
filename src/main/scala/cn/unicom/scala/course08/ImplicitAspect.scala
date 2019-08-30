package cn.unicom.scala.course08

import java.io.File

/**
  * Created by zhangjiujun on 2019/8/29.
  */
object ImplicitAspect {

  implicit def man2superman(man:Man):Superman = new Superman(man.name)

  implicit def file2RichFile(file:File):RichFile = new RichFile(file)

}
