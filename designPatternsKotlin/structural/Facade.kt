package designPatternsKotlin.structural
 class ComplexSystemStore(private val filePath: String){
      private val cache: HashMap<String, String> = HashMap()

     init{
         println("Reading data from the file $filePath")
    }
    fun store(key: String, value: String){
        cache[key] = value
    }
    fun read(key: String) = cache[key] ?: ""
    fun commit() = println("Storing cached data to file $filePath")
}
data class User(val login: String)
class UserRepository{
    private val systemPreferences = ComplexSystemStore("/data/default.prefs")
    fun save(user: User){
        systemPreferences.store("USER_KEY", user.login)
        systemPreferences.commit()
    }
    fun findFirst(): User = User(systemPreferences.read("USER_KEY"))
}