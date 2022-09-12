package com.secondlab.cryptocurrencyapp.presentation.coin_detail

import com.secondlab.cryptocurrencyapp.domain.model.CoinDetail

data class CoinDetailState(
    val isLoading: Boolean = false,
    val coin: CoinDetail? = null,
    val error: String = "",
)
