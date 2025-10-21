package com.example.programachamada.telas

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun TelaNavegacaoProvisoria(controladorDeNavegacao: NavController) {
    Surface(modifier = Modifier.fillMaxSize()) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(24.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = "Painel provisório",
                style = MaterialTheme.typography.headlineSmall,
                textAlign = TextAlign.Center
            )
            Spacer(modifier = Modifier.height(8.dp))


            Button(
                onClick = { controladorDeNavegacao.navigate("tela_login") },
                modifier = Modifier.fillMaxWidth()
            ) {
                Text("Tela de login")
            }
            Spacer(modifier = Modifier.height(16.dp))
            Button(
                onClick = { controladorDeNavegacao.navigate("tela_professor") },
                modifier = Modifier.fillMaxWidth()
            ) {
                Text("Tela professor")
            }
            Spacer(modifier = Modifier.height(16.dp))
            Button(
                onClick = { controladorDeNavegacao.navigate("tela_aluno") },
                modifier = Modifier.fillMaxWidth()
            ) {
                Text("Tela aluno")
            }
        }
    }
}