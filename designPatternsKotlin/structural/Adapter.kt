package designPatternsKotlin.structural

data class DisplayDataType(val index: Float, val data: String)
class DataDisplay {
    fun displayData(data: DisplayDataType) {
        println("Data is displayed: ${data.index} - ${data.data}")
    }
}

data class DatabaseData(val position: Int, val amount: Int)
class DatabaseDataGenerate {
    fun generateData(): List<DatabaseData> {
        val list: ArrayList<DatabaseData> = arrayListOf<DatabaseData>()
        list.add(DatabaseData(2, 2))
        list.add(DatabaseData(6, 4))
        list.add(DatabaseData(12, 8))
        return list
    }
}

interface DatabaseDataConverter {
    fun convertData(Data: List<DatabaseData>): List<DisplayDataType>
}

class DataDisplayAdapter(val display: DataDisplay) : DatabaseDataConverter {
    override fun convertData(data: List<DatabaseData>): List<DisplayDataType> {
        val returnList: ArrayList<DisplayDataType> = arrayListOf<DisplayDataType>()
        for (datum: DatabaseData in data) {
            val ddt = DisplayDataType(datum.position.toFloat(), datum.amount.toString())
            display.displayData(ddt)
            returnList.add(ddt)
        }
        return returnList
    }
}

//other
interface UsbTypeC
interface UsbMini
interface EUPlug
interface USPlug

fun main() {
    fun powerOutlet(): USPlug {
        return object : USPlug {}
    }

    fun cellPhone(chargeCable: UsbTypeC) {
    }

    fun charger(plug: EUPlug): UsbMini {
        return object : UsbMini {}
    }

    //We could adopt the US plug to work with the EU plug by using the following extension function:
    fun USPlug.toEUPlug(): EUPlug {
        return object : EUPlug {
            // Do something to convert
        }
    }

    //We can create a USB Adapter between mini USB and type-C USB in a similar way:
    fun UsbMini.toUsbTypeC(): UsbTypeC {
        return object : UsbTypeC {
            // Do something to convert
        }
    }
    //And finally, we get back online by combining all those adapters together:
    cellPhone(
        charger(
            powerOutlet().toEUPlug()
        ).toUsbTypeC()
    )
    /*
    * Did you ever plug a 110v US appliance into a 220v
    * EU socket through an Adapter, and fry it totally?
That's something that may also happen to your code, if you're
* not careful. The following example, which uses another Adapter,
* compiles well:*/

    fun <T> collectionProcessing(c: Collection<T>) {
        for (e in c) {
            println(e)
        }
    }

  //  val s = Stream.generate { 42 }
  //  collectionProcessing(s.toList())

    //But it never completes, because Stream.generate() produces an infinite list of integers. So, be careful, and adapt this pattern wisely.
}