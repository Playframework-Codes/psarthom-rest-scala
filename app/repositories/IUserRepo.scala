package repositories

import play.api.libs.json.JsObject
import reactivemongo.play.json.collection.JSONCollection
import com.google.inject.{ ImplementedBy, Inject }
import org.joda.time.DateTime
import play.api.libs.json.Json._
import play.api.libs.json.{ JsObject, JsString, Json }
import reactivemongo.api.commands.WriteResult
import reactivemongo.bson.{ BSONDocument, BSONObjectID }
import play.modules.reactivemongo.ReactiveMongoApi
import reactivemongo.play.json._
import reactivemongo.play.json.collection.JSONCollection


import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.{ Await, Future }
import scala.concurrent.duration._
import scala.util.{ Failure, Success }



/**
  * Created by chhaichivon on 4/28/2017.
  */
trait IUserRepo {
  def getUser(page:Int, limit:Int) : Future[List[JsObject]]
}
class UserRepo @Inject()(reactiveMongoApi: ReactiveMongoApi) extends IUserRepo{
  def userCollection = reactiveMongoApi.database.map(db => db.collection[JSONCollection]("user_tbl"))

  override def getUser(page: Int, limit: Int): Future[List[JsObject]] = {

  }
}

