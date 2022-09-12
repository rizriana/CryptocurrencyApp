package com.secondlab.cryptocurrencyapp.domain.repository

import com.secondlab.cryptocurrencyapp.data.remote.dto.CoinDetailDto
import com.secondlab.cryptocurrencyapp.data.remote.dto.CoinDto

interface CoinRepository {

    suspend fun getCoins(): List<CoinDto>
    suspend fun getCoinById(coinId: String): CoinDetailDto
}