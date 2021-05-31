package designPatternsKotlin.creational

/**
 *  LAZY INITIALIZTION
 *  Initialize a resource when it's needed, not when declared
 *  cannot use var, just VAL ->  [val]  box by lazy { AlertBox() }
 *  if u wanna use val: lateinit var box: AlertBox()
 */
class LazyWithByLazy {
    val box by lazy { AlertBox() }
    fun showMessage(message: String){
        box.message = message
        box.show()

    }
}
class LazyWithLateInit {
    lateinit var box: AlertBox
    fun showMessage(message: String){
        box = AlertBox()
        box.message = message
        box.show()

    }
}
class AlertBox(){
    var message: String? = null
    fun show(){}
}