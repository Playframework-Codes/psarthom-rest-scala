name := """psarthom-rest-scala"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  jdbc,
  cache,
  ws,
  "org.reactivemongo"            %% "play2-reactivemongo"          % "0.12.0",
  "io.swagger"                   %% "swagger-play2"                % "1.5.1",
  "org.webjars"                  % "swagger-ui"                    % "2.1.8-M1",

  "org.slf4j"                    % "slf4j-nop"                     % "1.6.4",
  "joda-time"                    % "joda-time"                     % "2.9.4",
  "org.joda"                     % "joda-convert"                  % "1.8.1",

  "org.scalatest"                %% "scalatest"                    % "3.0.0"                      % "test",
  "com.typesafe.play"            % "play-mailer_2.11"              % "5.0.0",
  "org.mindrot"                  % "jbcrypt"                       % "0.3m",
  "com.twilio.sdk"               % "twilio"                        % "7.4.0"
)

