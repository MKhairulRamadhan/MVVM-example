package com.khairul.mvvmexample.ui.quotes

import androidx.lifecycle.ViewModel
import com.khairul.mvvmexample.data.Quote
import com.khairul.mvvmexample.data.QuoteRepository

class QuotesViewModel(private val quoteRepository: QuoteRepository)
    : ViewModel(){

    fun getQuotes() = quoteRepository.getQuptes()

    fun addQuote(quote: Quote) = quoteRepository.addQuote(quote)
}