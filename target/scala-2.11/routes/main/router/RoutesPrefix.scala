
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/siddharthkala/marry-app/conf/routes
// @DATE:Sat Jan 16 11:48:34 IST 2016


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
