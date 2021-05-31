package br.com.moviecourotines

import designPatternsKotlin.creational.Singleton
import designPatternsKotlin.structural.*
import org.junit.Test

import org.junit.Assert.*

class AdapterTest {
    @Test
    fun tesAdapter() {
        println("Start")
        val generator = DatabaseDataGenerate()
        val generatedData: List<DatabaseData> = generator.generateData()
        val adapter = DataDisplayAdapter(DataDisplay())
        val convertData: List<DisplayDataType> = adapter.convertData(generatedData)
        assertTrue(convertData.size == 3)
    }
}