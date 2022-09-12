package com.secondlab.cryptocurrencyapp.data.mapper

import com.secondlab.cryptocurrencyapp.data.remote.dto.CoinDetailDto
import com.secondlab.cryptocurrencyapp.data.remote.dto.CoinDto
import com.secondlab.cryptocurrencyapp.domain.model.Coin
import com.secondlab.cryptocurrencyapp.domain.model.CoinDetail

fun CoinDto.toCoin(): Coin {
    return Coin(
        id = id,
        isActive = isActive,
        name = name,
        rank = rank,
        symbol = symbol
    )
}

fun CoinDetailDto.toCoinDetail(): CoinDetail {
    return CoinDetail(
        coinId = id,
        name = name,
        description = description,
        symbol = symbol,
        rank = rank,
        isActive = isActive,
        tags = tags.map { it.name },
        team = team
    )
}