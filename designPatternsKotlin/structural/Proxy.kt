package designPatternsKotlin.structural
//prove alguma funcionalidade antes e/ou depois de chamar um obj (similar ao facade)

interface Image {
    fun display()
}

class RealImage(private val fileName: String) : Image {
    override fun display() {
        println("RealImage: Displaying $fileName")
    }

    private fun loadFromDisk(fileName: String) {
        println("RealImage: loading $fileName")
    }

    init {
        loadFromDisk(fileName)
    }
}

class ProxyImage(private val filename: String) : Image {
    private var realImage: RealImage? = null
    override fun display() {
        println("RealImage: Displaying $filename")
        if(realImage == null){
            realImage = RealImage(filename)
        }

        realImage!!.display()
    }
}
