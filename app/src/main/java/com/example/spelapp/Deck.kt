package com.example.spelapp

class Deck {
    private val cards = mutableListOf<Card>()

    init {
        for (suit in Suit.values()) {
            for (value in 1..13) {
                cards.add(Card(suit, value))
            }
        }
    }

    fun shuffle() {
        cards.shuffle()
    }

    fun drawCard(): Card {
        return cards.removeAt(0)
    }
}