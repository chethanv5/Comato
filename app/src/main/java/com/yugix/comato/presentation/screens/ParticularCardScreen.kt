package com.yugix.comato.presentation.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.yugix.comato.R
import com.yugix.comato.presentation.utils.BottomSheetToAddProduct

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ParticularCardScreen(navController: NavController) {

    val showBottomSheet = remember { mutableStateOf(false) }


    var firstName by remember { mutableStateOf("Romanus Pizza") }
    var lastName by remember { mutableStateOf("Burger") }
    var rating by remember { mutableStateOf("4.2") }
    var time by remember { mutableStateOf("37 mins") }
    var distance by remember { mutableStateOf("2.6 km") }
    var address by remember { mutableStateOf("Crossing Republic") }
    var uniqueness by remember { mutableStateOf("On time Preparation") }
    var discount by remember { mutableStateOf("Flat Rs50 OFF on above Rs 249") }
    var offers by remember { mutableStateOf("2 offers") }
    var price by remember { mutableStateOf("₹249") }
    var productName by remember { mutableStateOf("Peri Peri Burger") }


    val scrollBehaviour = TopAppBarDefaults.exitUntilCollapsedScrollBehavior()
    Scaffold(
        containerColor = Color.Gray,
        topBar = {
            TopAppBar(
                colors = TopAppBarDefaults.topAppBarColors(containerColor = Color.White),
                title = { },
                navigationIcon = {
                    IconButton(onClick = {
                        navController.popBackStack()
                    }) {
                        Icon(
                            painter = painterResource(R.drawable.arrowback),
                            contentDescription = "Back",
                            tint = Color.Black,
                            modifier = Modifier.size(28.dp)
                        )
                    }
                },
                actions = {
                    IconButton(onClick = {}) {
                        Icon(
                            painter = painterResource(R.drawable.outline_group_add_24),
                            tint = Color.Black,
                            contentDescription = "Add",
                            modifier = Modifier.size(28.dp)
                        )
                    }
                    IconButton(onClick = {}) {
                        Icon(
                            painter = painterResource(R.drawable.outline_bookmark_24),
                            tint = Color.Black,
                            contentDescription = "Save or fav",
                            modifier = Modifier.size(28.dp)
                        )
                    }
                    IconButton(onClick = {}) {
                        Icon(
                            painter = painterResource(R.drawable.outline_more_vert_24),
                            tint = Color.Black,
                            contentDescription = "More Menu",
                            modifier = Modifier.size(28.dp)
                        )
                    }
                },
                scrollBehavior = scrollBehaviour
            )
        }
    ) { innerPadding ->
        LazyColumn(modifier = Modifier
            .fillMaxSize()
            .nestedScroll(scrollBehaviour.nestedScrollConnection)
            .padding(innerPadding)
        ) {
            item {
                Column(modifier = Modifier
                    .fillMaxWidth()
                    .background(color = Color.White)
                    .height(190.dp)) {
                    Row(modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 8.dp, vertical = 8.dp),
                        horizontalArrangement = Arrangement.SpaceBetween) {
                        Column {
                            Text(
                                text = firstName,
                                color = Color.Black
                            )
                            Text(
                                text = lastName,
                                color = Color.Black,
                                fontWeight = FontWeight.Bold,
                                fontSize = 25.sp
                            )
                            Row(verticalAlignment =Alignment.CenterVertically) {
                                Text(
                                    text = lastName,
                                    color = Color.Black,
                                    fontWeight = FontWeight.Bold,
                                    fontSize = 25.sp
                                )
                                Spacer(modifier = Modifier.width(4.dp))
                                Icon(
                                    painter = painterResource(R.drawable.outline_info_24),
                                    contentDescription = "Information",
                                    tint = Color.Gray
                                )
                            }
                        }
                        Column{
                            Card(
                                modifier = Modifier.size(width = 55.dp, height = 30.dp),
                                shape = RoundedCornerShape(6.dp),
                                colors = CardDefaults.cardColors(Color.Green)
                            ) {
                                Row(
                                    modifier = Modifier.fillMaxWidth(),
                                    verticalAlignment = Alignment.CenterVertically,
                                    horizontalArrangement = Arrangement.SpaceEvenly
                                ) {
                                    Text(
                                        text = rating,
                                        color = Color.White,
                                        fontWeight = FontWeight.SemiBold,
                                        fontSize = 18.sp,
                                        modifier = Modifier.padding(start = 4.dp, top = 4.dp)
                                    )
                                    Icon(
                                        painter = painterResource(R.drawable.star),
                                        modifier = Modifier
                                            .padding(
                                                start = 5.dp,
                                                top = 2.dp,
                                                end = 4.dp
                                            )
                                            .size(18.dp),
                                        contentDescription = "Star",
                                        tint = Color.White
                                    )
                                }
                            }
                        }
                    }
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 8.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Icon(
                            painter = painterResource(R.drawable.timer),
                            contentDescription = "Time",
                            tint = Color.Green,
                            modifier = Modifier.size(17.dp)
                        )
                        Text(
                            text = time,
                            color = Color.DarkGray,
                            fontSize = 14.sp,
                            modifier = Modifier.padding(start = 4.dp)
                        )
                        Icon(
                            painter = painterResource(R.drawable.dot),
                            contentDescription = "Dot",
                            tint = Color.Green,
                            modifier = Modifier.size(16.dp)
                        )
                        Text(
                            text = distance,
                            color = Color.DarkGray,
                            fontSize = 14.sp
                        )
                        Icon(
                            painter = painterResource(R.drawable.dot),
                            contentDescription = "Dot",
                            modifier = Modifier.size(16.dp)
                        )
                        Text(
                            text = address,
                            color = Color.DarkGray,
                            fontSize = 14.sp
                        )
                        Icon(
                            painter = painterResource(R.drawable.down_arrow),
                            contentDescription = "Down Arrow",
                            tint = Color.DarkGray,
                            modifier = Modifier
                                .padding(start = 2.dp)
                                .size(17.dp)
                        )
                    }
                    Card(
                        modifier = Modifier
                            .padding(start = 8.dp, 8.dp)
                            .width(165.dp)
                            .height(22.dp),
                        colors = CardDefaults.cardColors(Color.Gray.copy(alpha = 0.1f)),
                        shape = RoundedCornerShape(12.dp)
                    ) {
                        Row(
                            modifier = Modifier.fillMaxWidth()) {
                            Icon(painterResource(R.drawable.check),
                                modifier = Modifier
                                    .padding(start = 8.dp, top = 6.dp)
                                    .size(12.dp),
                                tint = Color.Green,
                                contentDescription = null)

                            Spacer(modifier = Modifier.width(4.dp))
                            Text(text = uniqueness,color = Color.Gray, fontSize = 14.sp)
                        }
                    }
                    HorizontalDivider(modifier = Modifier.padding(start = 8.dp, end = 8.dp, top = 16.dp),
                        color = Color.Gray,
                        thickness = 1.dp
                    )
                    Row(modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 10.dp)) {
                        Icon(painterResource(R.drawable.discount),
                            modifier = Modifier
                                .padding(start = 16.dp, top = 3.dp)
                                .size(16.dp),
                            tint = Color.Blue,
                            contentDescription = null
                        )
                        Spacer(modifier = Modifier.width(4.dp))
                        Text(
                            text = discount,
                            color = Color.Black,
                            fontWeight = FontWeight.SemiBold,
                            fontSize = 14.sp,
                            modifier = Modifier.padding(start = 4.dp)
                        )
                        Spacer(modifier = Modifier.weight(1f))
                        Text(
                            text = offers,
                            color = Color.Gray,
                            fontWeight = FontWeight.SemiBold,
                            fontSize = 14.sp
                        )
                        Icon(
                            painter = painterResource(R.drawable.down_arrow),
                            contentDescription = "View",
                            tint = Color.Gray,
                            modifier = Modifier
                                .padding(top = 4.dp, start = 4.dp, end = 8.dp)
                                .size(16.dp)
                        )
                    }
                }
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 8.dp)
                        .background(Color.White)
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 8.dp)
                            .padding(top = 16.dp),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Text(
                            text = "Recommended for you",
                            color = Color.Black,
                            fontWeight = FontWeight.Bold,
                            fontSize = 18.sp
                        )
                        Icon(
                            painterResource(R.drawable.arrowup),
                            contentDescription = "Up Arrow",
                            tint = Color.DarkGray,
                            modifier = Modifier.size(16.dp)
                        )
                    }
                    ItemsList(productName = productName,rating= rating,price= price,onAddClick = {showBottomSheet.value = true })
                    HorizontalDivider(modifier = Modifier.padding(horizontal = 8.dp, vertical = 14.dp),
                        thickness = 1.dp,
                        color = Color.Gray
                    )
                    ItemsList(productName = productName,rating= rating,price= price,onAddClick = {showBottomSheet.value = true })
                    HorizontalDivider(modifier = Modifier.padding(horizontal = 8.dp, vertical = 14.dp),
                        thickness = 1.dp,
                        color = Color.Gray
                    )
                    ItemsList(productName = productName,rating= rating,price= price,onAddClick = {showBottomSheet.value = true })
                    HorizontalDivider(modifier = Modifier.padding(horizontal = 8.dp, vertical = 14.dp),
                        thickness = 1.dp,
                        color = Color.Gray
                    )
                }
                if (showBottomSheet.value){
                    BottomSheetToAddProduct(
                        onDismiss = { showBottomSheet.value = false },
                        navController = navController
                    )
                }
            }
        }
    }
}

@Composable
fun ItemsList(
    productName: String,
    rating: String,
    price: String,
    onAddClick: () -> Unit
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 5.dp, horizontal = 8.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Column(modifier = Modifier.width(200.dp)) {
            Row(
                modifier = Modifier.wrapContentSize().padding(start = 2.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    painter = painterResource(R.drawable.veg_icon),
                    contentDescription = null,
                    tint = Color.Green,
                    modifier = Modifier.size(17.dp)
                )
                Card(
                    modifier = Modifier.padding(start = 8.dp),
                    shape = RoundedCornerShape(5.dp),
                    colors = CardDefaults.cardColors(Color.Magenta.copy(alpha = 0.1f))
                ) {
                    Text(
                        text = "BestSeller",
                        color = Color.Magenta,
                        fontSize = 11.sp,
                        modifier = Modifier.padding(horizontal = 3.dp)
                    )
                }
            }
            Text(
                text = productName,
                color = Color.Black,
                fontWeight = FontWeight.SemiBold,
                fontSize = 18.sp,
                modifier = Modifier.padding(horizontal = 1.dp, vertical = 8.dp
                )
            )
            Card(
                modifier = Modifier.size(width = 50.dp, height = 22.dp),
                    shape = RoundedCornerShape(6.dp),
                    colors = CardDefaults.cardColors(Color.Green)
                ) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {
                    Text(
                    text = rating,
                    modifier = Modifier.padding(start = 3.dp, top = 2.dp),
                    fontSize = 14.sp,
                    fontWeight = FontWeight.SemiBold,
                    color = Color.White
                )
                    Icon(
                        painter = painterResource(R.drawable.star),
                        contentDescription = "Star",
                        tint = Color.White,
                        modifier = Modifier.padding(
                            start = 3.dp,
                            top = 2.dp,
                            end = 3.dp
                        ).size(12.dp)
                    )
                }
            }
            Text(
                text = price,
                color = Color.Black,
                fontWeight = FontWeight.SemiBold,
                fontSize = 16.sp,
                modifier = Modifier.padding(horizontal = 1.dp, vertical = 8.dp)
            )
        }
        Box(
            modifier = Modifier
                .size(160.dp),
            contentAlignment = Alignment.Center
        ){
            Image(
                painterResource(R.drawable.burger3),
                contentDescription = null,
                modifier = Modifier.size(130.dp).clip(shape = RoundedCornerShape(15.dp)),
                alignment = Alignment.Center
            )
            Card(
                onClick = {
                    onAddClick()
                },
                modifier = Modifier.padding(horizontal = 20.dp)
                    .padding(top = 120.dp).size(width = 100.dp, height = 36.dp),
                shape = RoundedCornerShape(5.dp),
                colors = CardDefaults.cardColors(Color.Magenta),
                border = BorderStroke(1.dp, Color.Red)
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(
                        text = "Add",
                        modifier = Modifier.padding(start = 30.dp, top = 6.dp),
                        color = Color.Red,
                        fontWeight = FontWeight.SemiBold,
                        fontSize = 20.sp,
                        textAlign = TextAlign.Center
                    )
                    Icon(
                        painterResource(R.drawable.baseline_add_24),
                        contentDescription = "Add Item",
                        tint = Color.Red,
                        modifier = Modifier.padding(3.dp).size(14.dp)
                    )
                }
            }
        }
    }
}