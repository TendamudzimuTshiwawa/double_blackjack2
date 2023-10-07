# double_blackjack2
# Card Game Java Code README

## Overview

This Java code implements a simple card game, possibly Blackjack, with a user interface (UI) for Android. The game involves drawing cards for a player and a dealer, calculating scores, and determining the game winner. Below is a summary of what the code includes and what you've implemented:

## Key Features

1. **Initialization**: UI elements and game variables are initialized in the `onCreate` method of the activity.

2. **Game Reset**: A `resetGame` method is implemented to initialize the deck, shuffle it, deal initial cards, and set up the initial UI.

3. **Player Actions**: You've defined methods for player actions, including hitting (`playerHit`), standing (`playerStand`), and ending the player's turn (`endPlayerTurn`).

4. **Dealer's Turn**: The `dealerTurn` method handles the dealer's turn logic, including drawing cards until the dealer's hand value is 17 or higher.

5. **Determining the Winner**: The `determineWinner` method calculates scores and determines the game winner based on player and dealer scores.

6. **UI Handling**: You've created helper methods to display hands and update scores in the UI.

7. **Button State Management**: During the dealer's turn, you've disabled Hit and Stand buttons and enabled the "Play Again" button after determining the winner.

8. **Player Actions Handling**: You've implemented player actions (Hit and Stand) in the `handlePlayerTurn` method, including checks for Blackjack and bust.

9. **Button Listeners**: Click listeners for the Hit and Stand buttons are added in the `handlePlayerTurn` method.

10. **Displaying Player's Hand**: The player's hand is displayed in the UI.

11. **Dealer's Turn (In Progress)**: You've started implementing the `dealerTurn` method to handle the dealer's actions.

12. **Determining the Winner (In Progress)**: A `determineWinner` method is defined to decide the game outcome based on player and dealer scores.

## Code Structure

The code structure seems well-organized, and it follows a logical flow of the game. You've successfully implemented several key components of the game logic, but there are some parts still in progress. Continue working on these parts to complete your card game.

## How to Use

To use the card game, you can integrate this code into your Android project. Make sure to customize the UI elements and graphics, as well as completing the remaining logic for the dealer's actions and determining the winner.

## Issues and Questions

If you encounter any specific issues or have further questions about specific parts of the code, please feel free to send an email. 

Declaration: I used Chatgpt for some of the code, especialy the MainActivity file and the xml file. 
