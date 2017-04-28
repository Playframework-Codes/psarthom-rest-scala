package models

import play.api.libs.json.Json

/**
  * Created by chhaichivon on 4/28/2017.
  */
class User( id:Int, username:String , email:String , password:String )

object User{
  implicit val userFormat = Json.format[User]
}
