package services

import java.util.concurrent.Future

import com.google.inject.{ImplementedBy, Inject}
import play.api.libs.json.JsObject
import play.modules.reactivemongo.ReactiveMongoApi

/**
  * Created by chhaichivon on 4/28/2017.
  */
@ImplementedBy(classOf[UserService])
trait IUserService {
  def getUser(page: Int, limit:Int) : Future[List[JsObject]]
}
class UserService @Inject() (mongoApi: ReactiveMongoApi) extends IUserService{
  override def getUser(page: Int, limit: Int): Future[List[JsObject]] = ???
}