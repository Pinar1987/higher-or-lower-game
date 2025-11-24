package com.example.spelapp

data class Card(val suit: Suit, val value: Int)

enum class Suit {
    HEARTS, DIAMONDS, CLUBS, SPADES
}