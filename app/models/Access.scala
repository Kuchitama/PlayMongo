package models

//import com.novus.salat._
//import com.novus.salat.global._
import com.mongodb.casbah.Imports._

object Access {
    val collection = MongoConnection()("fluent")("access")

    def save(mongoObject : MongoDBObject) = {
        if (mongoObject != null)
            collection += mongoObject
    }

    def findById(id :Int) = {
        collection.findOne(MongoDBObject("id"->id)).get
    }

    def findAll = {
        collection.find()
    }
}

