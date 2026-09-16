package me.andresgomez.tallergitgithubapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import me.andresgomez.tallergitgithubapp.ui.theme.TallerGitGithubAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {

        }
    }
}


@Preview(showBackground = true)
@Composable
fun TarjetaPresentacion() {
    Card {
        Column(
            modifier = Modifier
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            val painter = painterResource(id = R.drawable.andres)
            val contentDescription = "Imagen Andrés"

            Image(
                painter = painter,
                contentDescription = contentDescription,
                modifier = Modifier
                    .padding(
                        top = 24.dp
                    )
                    .clip(CircleShape)
                    .size(120.dp)
                    .border(
                        width = 3.dp,
                        color = Color(0xFF3B89D8),
                        shape = CircleShape
                    )
            )

            Text(
                text = "Andrés Gómez",
                fontWeight = FontWeight.Bold,
                fontSize = 24.sp,
                modifier = Modifier.padding(
                    top = 24.dp
                )
            )

            Text(
                text = "Desarrollador Móvil Jr.",
                fontSize = 18.sp,
                color = Color(0xFF3B89D8),
                modifier = Modifier.padding(
                    top = 8.dp,
                    bottom = 8.dp
                )
            )

            HorizontalDivider(
                modifier = Modifier.padding(
                    vertical = 24.dp,
                    horizontal = 24.dp
                ),
                thickness = 1.dp
            )

            Column(
                horizontalAlignment = Alignment.Start,
                modifier = Modifier.fillMaxWidth()
                    .padding(horizontal = 24.dp)
            ) {
                Text(
                    text = "EDAD",
                    fontSize = 10.sp,
                    color = Color.Gray,
                    modifier = Modifier.padding(
                        bottom = 8.dp
                    )
                )

                Text(
                    text = "18 años",
                    fontSize = 18.sp,
                    modifier = Modifier.padding(
                        bottom = 8.dp
                    )
                )

                Text(
                    text = "CORREO",
                    fontSize = 10.sp,
                    color = Color.Gray,
                    modifier = Modifier.padding(
                        bottom = 8.dp
                    )
                )

                Text(
                    text = "andresfgomezc1@gmail.com",
                    fontSize = 18.sp,
                    modifier = Modifier.padding(
                        bottom = 8.dp
                    )
                )

                Text(
                    text = "CIUDAD",
                    fontSize = 10.sp,
                    color = Color.Gray,
                    modifier = Modifier.padding(
                        bottom = 8.dp
                    )
                )

                Text(
                    text = "Bucaramanga, Colombia",
                    fontSize = 18.sp,
                    modifier = Modifier.padding(
                        bottom = 8.dp
                    )
                )
            }

            HorizontalDivider(
                modifier = Modifier.padding(
                    vertical = 24.dp,
                    horizontal = 24.dp
                ),
                thickness = 1.dp
            )

            Column(
                verticalArrangement = Arrangement.Bottom,
                modifier = Modifier.fillMaxHeight()
                    .padding(all = 18.dp)
            ) {
                Button(
                    onClick = { },
                    shape = RoundedCornerShape(12.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF3B89D8)),
                    modifier = Modifier.fillMaxWidth()
                        .height(60.dp)
                ) {
                    Text(
                        text = "Contactar conmigo",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold
                    )
                }
            }
        }
    }
}