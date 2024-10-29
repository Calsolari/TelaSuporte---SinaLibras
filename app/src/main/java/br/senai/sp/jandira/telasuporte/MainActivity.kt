package br.senai.sp.jandira.telasuporte

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import br.senai.sp.jandira.telasuporte.ui.theme.TelaSuporteTheme
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Switch
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TelaSuporteTheme {
                Suporte()
                }
            }
        }
    }


@Composable
fun Suporte() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFD0E7FF))
            .padding(16.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                imageVector = Icons.Default.ArrowBack,
                contentDescription = "Back"
            )
            Text(
                text = "Suporte/ Denúncias",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold
            )
            Icon(
                imageVector = Icons.Default.ArrowForward,
                contentDescription = "Forward"
            )
        }

        Spacer(modifier = Modifier.height(32.dp))

        Icon(
            painter = painterResource(id = R.drawable.cabeca),
            contentDescription = "Novo Chamado",
            modifier = Modifier
                .size(60.dp)
                .align(Alignment.CenterHorizontally)
        )
        Text(
            text = "Novo Chamado",
            fontSize = 16.sp,
            modifier = Modifier.align(Alignment.CenterHorizontally)
        )

        Spacer(modifier = Modifier.height(32.dp))

        OutlinedTextField(
            value = "Abracadabra Souza",
            onValueChange = {},
            label = { Text("Nome") },
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(16.dp))


        OutlinedTextField(
            value = "abracadabraSouza@gmail.com",
            onValueChange = {},
            label = { Text("Email") },
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(16.dp))

        OutlinedTextField(
            value = "Não consigo entrar na minha antiga conta\n\nAlguém invadiu minha conta",
            onValueChange = {},
            label = { Text("Assunto") },
            modifier = Modifier
                .fillMaxWidth()
                .height(150.dp)
        )

        Spacer(modifier = Modifier.height(16.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(text = "Receber notificação por email")
            Spacer(modifier = Modifier.weight(1f))
            Switch(checked = false, onCheckedChange = {}) //botao do on e off
        }

        Spacer(modifier = Modifier.height(165.dp))


        Icon(
            painter = painterResource(id = R.drawable.logo),
            contentDescription = "Logo SinaLibras",
            modifier = Modifier
                .size(114.dp)
                .align(Alignment.CenterHorizontally)
        )
    }
}



@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    TelaSuporteTheme {
        Suporte()
    }
}