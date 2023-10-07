package com.example.double_blackjack2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.double_blackjack2.ui.theme.Double_blackjack2Theme

class MainActivity : ComponentActivity() {
    // Declare ViewModel to manage game logic and state
    private val viewModel = BlackjackViewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Double_blackjack2Theme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Column {
                        Text(
                            text = "Player Score: ${viewModel.playerScore}",
                            modifier = Modifier.padding(16.dp)
                        )

                        Text(
                            text = "Dealer Score: ${viewModel.dealerScore}",
                            modifier = Modifier.padding(16.dp)
                        )

                        Row {
                            Button(
                                onClick = {
                                    viewModel.handleHitButtonClick()
                                },
                                modifier = Modifier.padding(16.dp)
                            ) {
                                Text(text = "Hit")
                            }

                            Button(
                                onClick = {
                                    viewModel.handleStandButtonClick()
                                },
                                modifier = Modifier.padding(16.dp)
                            ) {
                                Text(text = "Stand")
                            }

                            Button(
                                onClick = {
                                    viewModel.handlePlayAgainButtonClick()
                                },
                                modifier = Modifier.padding(16.dp)
                            ) {
                                Text(text = "Play Again")
                            }
                        }
                    }
                }
            }
        }
    }

    // Rest of the MainActivity class
}

// ViewModel class to manage game logic and state
class BlackjackViewModel {
    var playerScore by mutableStateOf(0)
    var dealerScore by mutableStateOf(0)
    var playerHand = mutableListOf<Card>()
    var dealerHand = mutableListOf<Card>()
    var deck = Deck()

    fun handleHitButtonClick() {
        val card = deck.dealCard()
        if (card != null) {
            playerHand.add(card)
            playerScore += card.value
        }
        // Implement logic to handle player's turn, including blackjack and bust checks
    }

    fun handleStandButtonClick() {
        // Implement logic to handle dealer's turn and determine the winner
    }

    fun handlePlayAgainButtonClick() {
        // Implement logic to start a new game
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Double_blackjack2Theme {
        Greeting("Android")
    }
}
