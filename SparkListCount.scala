import org.apache.log4j.{Level, Logger}
import org.apache.spark.{SparkConf, SparkContext}

object SparkListCount {
  def main(args: Array[String]): Unit = {
    Logger.getLogger("org").setLevel(Level.ERROR);
    val conf = new SparkConf().setAppName("wordCounts").setMaster("local[3]")
    val sc = new SparkContext(conf);
    val inputIntegers=List(5,2,1,4,3,2,5,6,5,1,3);
    val integerRdd=sc.parallelize(inputIntegers);
    val wordCount=integerRdd.countByValue();
    println(wordCount);
  }

}
