🃏 Higher or Lower – The Card Guessing Game

This project implements the mobile card game Higher or Lower, where the player must guess whether the next card drawn from a standard 52-card deck will have a higher or lower value than the card currently on display. The primary objective is to achieve the longest possible correct streak.

🎨 User Interface (UI) Design and Wireframes

The application is designed for a mobile-first experience, following a dark theme and clean aesthetic inspired by the provided Figma sketch. The UI consists of three primary screens:

1. The Three Main Screens

[Mobile App Wireframes based on Figma Sketch](assets/figma.png)

2. Screen Descriptions

Screen Name

Purpose

Key UI Elements

Menu

The entry point for the player.

"Start Game," "Highscore," and "Rules" buttons.

Game Screen

The core gameplay loop.

Large, centered Card Display, "HIGHER" and "LOWER" interactive buttons optimized for touch, and a Score/Streak counter.

Game Over

Displays results after an incorrect guess.

"GAME OVER" message, Final Score, Best Score, and options to "Play Again" or return to the "Menu."

Design Goals:

Mobile Adaptivity: The layout uses a compact, vertical interface optimized for responsiveness on Android-style dimensions.

Touch Targets: Interactive elements like the "Higher" and "Lower" buttons are generously sized for easy and reliable tapping.

Aesthetics: A dark theme is used to enhance contrast and focus attention on the central card and critical game information.

♠️ Game Logic and Mechanics

The game is built around a single, standard 52-card deck.

1. Card Value Definition

Values: Cards are assigned numerical values from 1 to 13.

Ace (A) = 1 (Lowest value)

2 through 10 = Face value

Jack (J) = 11

Queen (Q) = 12

King (K) = 13 (Highest value)

Suits: Suits (Hearts, Diamonds, Clubs, Spades) have no bearing on the value comparison, only on the visual representation.

2. Core Gameplay Loop

Initial Draw: The game shuffles the deck and draws the first card, displaying it to the player.

Player Guess: The player must press either the HIGHER or LOWER button, making a prediction about the value of the next card in the deck.

Comparison: The next card is drawn and compared to the previous card.

Correct Guess: The Streak counter increments by 1. The newly drawn card becomes the current card.

Incorrect Guess: The game ends immediately, and the player is taken to the Game Over screen.

Tie/Draw (Same Value): If the next card has the same value as the current card, this is defined as an Incorrect Guess (a loss) to increase the game's difficulty and stakes.

3. Scoring

Streak: The score is defined by the number of consecutive correct guesses.

Highscore: The player's highest streak will be stored and displayed.

🛠 Technical Implementation Plan

Deck and Shuffle Module: Implement robust logic for generating and randomizing the 52-card deck array.

State Management: Handle the transitions between the three UI screens (Menu, Game, Game Over) and manage the current card, score, and deck state.

Persistence: Use Firebase Firestore to save and retrieve the player's Best Score (Highscore).

UI/UX: Build the mobile-responsive interface using a modern framework (like React) and CSS utilities (like Tailwind CSS) to ensure smooth transitions and high responsiveness.