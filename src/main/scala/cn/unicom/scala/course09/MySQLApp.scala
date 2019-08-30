package cn.unicom.scala.course09

import java.sql.{Connection, DriverManager}

/**
  * Created by zhangjiujun on 2019/8/30.
  */
object MySQLApp {

  def main(args: Array[String]): Unit = {

    val driver = "com.mysql.jdbc.Driver"
    val url = "jdbc:mysql://localhost:3306/mysql"
    val username = "root"
    val password = "admin"

    var connection:Connection = null
    try {
      // make the connection
      // 不加classOf也可以，但在分布式mysql下会报错，所以还是要加上
      classOf[com.mysql.jdbc.Driver]
      connection = DriverManager.getConnection(url, username, password)

      // create the statement, and run the select query
      val statement = connection.createStatement()
      val resultSet = statement.executeQuery("select host,user from user")
      while (resultSet.next()) {
        val host = resultSet.getString("host")
        val user = resultSet.getString("user")
        println(s"$host, $user")
      }
    } catch {
      case e:Exception => e.printStackTrace()
    }finally {
      if(connection != null) {
        connection.close()
      }
    }

  }


}
