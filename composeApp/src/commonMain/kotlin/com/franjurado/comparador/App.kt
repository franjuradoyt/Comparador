package com.franjurado.comparador

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import comparador.composeapp.generated.resources.Res
import comparador.composeapp.generated.resources.images
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App(){
    Scaffold(
        topBar = {
            CenteredTopAppBar("COMPARADOR")
        }
    ){
        paddingValues ->
        LazyColumn(
            contentPadding = paddingValues,
            modifier = Modifier.fillMaxSize().padding(16.dp)
        ){
            items(getItems()) { item ->
                Text(text = item, style = MaterialTheme.typography.h6, modifier = Modifier.padding(8.dp))
                MyCard(item)
            }
        }
    }
}

//enum class HomeScreen() {
 //   Start,
  //  OnClick
//}

@Composable
fun MyCard(Items: String){
    Card(
        elevation = 8.dp,
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
            .height(340.dp)
            .clickable { TODO() }
    ){
        Column(modifier = Modifier.padding(16.dp)) {
            
            
            Spacer(modifier = Modifier.height(8.dp))
            
            Image(
                painter = painterResource(Res.drawable.images),
                contentDescription = "Imagen de un teslaRojo magenta",
                contentScale = ContentScale.FillBounds,
                modifier = Modifier.fillMaxSize())
               
                
            
           // Spacer(modifier = Modifier.height(8.dp))
            
            
            //Text(text="StartRate", style = MaterialTheme.typography.h6)
            
        }
    }
}

fun getItems(): List<String>{
    return listOf("MODEL3", "MODELY", "EX30", "CLASE A", "BYD DOLPHYN","FIAT e500")
}

@Composable
fun CenteredTopAppBar(title: String) {
    TopAppBar(
        backgroundColor = Color.Red,
        elevation = 4.dp,
        modifier = Modifier.fillMaxWidth()
    ) {
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier.fillMaxSize()
        ) {
            Text(
                text = title,
                style = MaterialTheme.typography.h6,
                color = MaterialTheme.colors.onPrimary
            )
        }
    }
}