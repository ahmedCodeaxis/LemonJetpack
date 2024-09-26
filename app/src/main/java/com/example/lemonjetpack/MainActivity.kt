package com.example.lemonjetpack

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.collection.mutableScatterSetOf
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.lemonjetpack.ui.theme.LemonJetpackTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            Column (

                modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center

                ){

                Mytext("Hello 4 Sim 4 ")
                mytextfield()
            }

        }
    }
}

@Composable
fun Mytext(text:String){
    Text(
    text=text,
        color = Color.Red,
        fontSize = 50.sp,
        fontWeight=FontWeight(100)

    )
}


@Composable
fun mytextfield(){
    TextField(
        value = "",
        onValueChange = {

        },
        placeholder = {
            Text(text = "4SIM 4")
        }



    )
}
@Composable
fun Myoutlinefield(){




}
@Composable
fun ScrollableContent(modifier: Modifier = Modifier) {
    // Remember the scroll state
    val scrollState = rememberScrollState()

    Column(
        modifier = modifier
            .fillMaxSize()
            .verticalScroll(scrollState) // Enable vertical scroll
            .padding(16.dp)
    ) {
        // Add content that will be scrollable
        for (i in 1..5) {
            Text(text = "Item #$i", modifier = Modifier.padding(8.dp))
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ScrollableContentPreview() {
    LemonJetpackTheme {
        ScrollableContent()
        Mytext("Hello")
        mytextfield()
        Greeting("Hello")

    }
}

@Composable
fun Greeting(name: String, modifier: Modifier=Modifier){
  Column(modifier=Modifier.fillMaxSize(),verticalArrangement =Arrangement.Center , horizontalAlignment =Alignment.CenterHorizontally ) {
Image(painter = painterResource(id=R.drawable.ic_android_black_24dp) , contentDescription ="" )

Row(verticalAlignment =Alignment.CenterVertically , horizontalArrangement =Arrangement.Center) {

    Image(painter = painterResource(id=R.drawable.ic_android_black_24dp) , contentDescription ="" )
    Image(modifier = Modifier.padding(start=5.dp,end =5.dp), painter = painterResource(id=R.drawable.ic_android_black_24dp) , contentDescription ="" )
    Image(painter = painterResource(id=R.drawable.ic_android_black_24dp) , contentDescription ="" )

}
Row{
    Image(painter = painterResource(id=R.drawable.ic_android_black_24dp) , contentDescription ="" )
    Image(painter = painterResource(id=R.drawable.ic_android_black_24dp) , contentDescription ="" )

}


  }
}
