package example

import reactivemongo.api.{MongoConnection, MongoDriver}

object Main extends App {

  val mongoUri = "mongodb://localhost:27017,localhost:27018/mydb"

  val driver = MongoDriver()
  val parsedUri = MongoConnection.parseURI(mongoUri)
  val connection = parsedUri.map(driver.connection(_))

  Thread.sleep(60 * 60 * 1000)

}
