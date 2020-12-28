package firstprogram

import org.apache.spark.sql.SparkSession

object SparkSessionJsonExamples extends App {
  
  val sqlContext = SparkSession
      .builder()
      .master("local[1]")
      .appName("SparkByExample")
      .getOrCreate().sqlContext
  
  val dfs = sqlContext.read.json("./src/main/resources/json/employee.json")
  
  dfs.show()
  
  dfs.printSchema()
  
  dfs.registerTempTable("employee")
  
  val allrecords = sqlContext.sql("SELECT * FROM employee")
  
  allrecords.show()
  
  
  dfs.filter(dfs("age") > 23).show()
  
  dfs.groupBy("age").count().show()
  
  
}