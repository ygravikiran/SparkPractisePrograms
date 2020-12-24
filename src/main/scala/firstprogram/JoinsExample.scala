package firstprogram

import org.apache.spark.SparkContext
import org.apache.spark.SparkConf
import org.apache.spark.SparkContext
import org.apache.spark.SparkConf
 
object JoinsExample  {
    def main(args: Array[String]) {
 
        /* configure spark application */
        val conf = new SparkConf().setAppName("Spark Scala WordCount Example").setMaster("local[1]")
 
        /* spark context*/
        val sc = new SparkContext(conf)
 
        
        var emp = sc.textFile("./src/main/resources/emp/emp.txt").distinct()
        emp.map(f=> println("======================="+f))
         
        emp.take(5)
 
        sc.stop()
    }
}
 