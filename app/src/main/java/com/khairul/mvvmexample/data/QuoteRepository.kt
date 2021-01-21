package com.khairul.mvvmexample.data

class QuoteRepository private constructor(private val quoteDao: FakeQuoteDao) {

    fun addQuote(quote: Quote){
        quoteDao.addQuote(quote)
    }

    fun getQuptes() = quoteDao.getQuotes()

    companion object{
        @Volatile private var instance: QuoteRepository? = null

        fun getInstance(quotedao: FakeQuoteDao) =
                instance ?: synchronized(this) {
                    instance ?: QuoteRepository(quotedao).also { instance = it }
                }
    }

}