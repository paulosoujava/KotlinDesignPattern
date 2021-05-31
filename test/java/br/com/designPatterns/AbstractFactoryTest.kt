package br.com.moviecourotines

import designPatternsKotlin.creational.*
import org.hamcrest.core.Is
import org.junit.Assert
import org.junit.Test

class AbstractFactoryTest {
    @Test
    fun afTest(){
        val datasourceFactory :DataSourceFactory = DataSourceFactory.createFactory<DatabaseDataSource>()
        val datasource = datasourceFactory.makeDataSource()
        println("Created datasource $datasource")
    }
}