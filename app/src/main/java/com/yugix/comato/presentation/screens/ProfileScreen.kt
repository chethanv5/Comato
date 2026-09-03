package com.yugix.comato.presentation.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.automirrored.filled.KeyboardArrowRight
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Switch
import androidx.compose.material3.SwitchDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.VerticalDivider
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.yugix.comato.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ProfileScreen(navController: NavController) {

    Scaffold(modifier = Modifier.fillMaxWidth(),
        topBar = {
            TopAppBar(
                modifier = Modifier.background(color = Color.White),
                title = {},
                navigationIcon = {
                    IconButton(onClick = {
                        navController.popBackStack()
                    }) {
                        Icon(imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                            contentDescription = "ArrowBack")
                    }
                }
            )
        }) { values ->
        Column(modifier = Modifier
            .fillMaxSize()
            .background(color = Color.Gray)
            .padding(values))
        {
            Spacer(modifier = Modifier.height(8.dp))
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(110.dp)
                    .padding(horizontal = 10.dp),
                shape = RoundedCornerShape(topStart = 12.dp, topEnd = 12.dp, bottomStart = 0.dp, bottomEnd = 0.dp),
                colors = CardDefaults.cardColors(Color.White)) {

                Row(modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 8.dp, vertical = 8.dp),
                    verticalAlignment = Alignment.CenterVertically) {
                    Icon(
                        modifier = Modifier
                            .size(80.dp)
                            .clip(CircleShape),
                        painter = painterResource(R.drawable.profielogo),
                        contentDescription = "Profile Image",
                        tint = Color.Unspecified
                    )
                    Spacer(modifier = Modifier.width(7.dp))
                    Column {
                        Text(
                            text = "Name",
                            color = Color.Black,
                            fontWeight = FontWeight.Bold,
                            fontSize = 23.sp
                        )
                        Text(
                            text = "velechatichethan@gmail.com",
                            color = Color.DarkGray,
                            fontSize = 12.sp
                        )
                        Row(verticalAlignment = Alignment.CenterVertically,
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(2.dp) ){
                            Text(
                                text = "View activity",
                                fontSize = 13.sp,
                                color = Color.Cyan
                            )
                            Icon(
                                imageVector = Icons.Default.PlayArrow,
                                tint = Color.DarkGray,
                                contentDescription = "Forward Arrow",
                                modifier = Modifier.size(16.dp)
                            )
                        }
                    }
                }
            }
            ZomatoGold()

            LazyColoumn()
        }
    }
}

@Composable
fun ZomatoGold() {

    Card(
        colors = CardDefaults.cardColors(containerColor = Color.Black),
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 10.dp)
            .height(65.dp),
        shape = RoundedCornerShape(bottomEnd = 12.dp, bottomStart = 12.dp, topEnd = 0.dp, topStart = 0.dp)
    ) {
        Row(modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 10.dp, vertical = 14.dp),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Icon(painter = painterResource(id = R.drawable.goldicon1),
                contentDescription = "Zomato Gold Image",
                tint = Color.Unspecified,
            )

            Spacer(modifier = Modifier.width(10.dp))
            Text(text = "Join Zomato Gold",
                fontWeight = FontWeight.Bold,
                color = Color.Yellow
            )
            Spacer(modifier = Modifier.weight(1f))
            Icon(
                imageVector = Icons.AutoMirrored.Filled.KeyboardArrowRight,
                contentDescription = "Arrow right",
                tint = Color.White
            )
        }
    }
}

@Composable
fun ColumnGrid(card: cardItem.ColumnGrid) {
    Row(modifier = Modifier
        .fillMaxWidth()
        .padding(horizontal = 8.dp, vertical = 8.dp),
        verticalAlignment = Alignment.CenterVertically) {
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f),
            colors = CardDefaults.cardColors(Color.White)
        ) {
            Column(modifier = Modifier.fillMaxSize()) {
                Icon(
                    painter = painterResource(R.drawable.outline_bookmark_24),
                    contentDescription = "Collection",
                    tint = Color.Gray,
                    modifier = Modifier
                        .padding(start = 20.dp, top = 15.dp, bottom = 5.dp)
                        .size(30.dp)
                )

                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 10.dp, vertical = 10.dp)
                ) {
                    Text(
                        text = "Collection",
                        color = Color.Black,
                        fontWeight = FontWeight.Bold,
                        fontSize = 15.sp
                    )
                }
            }
        }

        Spacer(modifier = Modifier.width(10.dp))
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f),
            colors = CardDefaults.cardColors(Color.White)
        ) {

            Column(modifier = Modifier.fillMaxSize()){
                Icon(
                    painter = painterResource(R.drawable.rupeesymbol),
                    contentDescription = "Money",
                    tint = Color.Gray,
                    modifier = Modifier
                        .padding(start = 20.dp, top = 15.dp, bottom = 5.dp)
                        .size(30.dp)
                )

                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 10.dp, vertical = 10.dp)
                ){
                    Text(
                        text = "Money",
                        color = Color.Black,
                        fontWeight = FontWeight.SemiBold,
                        fontSize = 15.sp
                    )
                    Spacer(modifier = Modifier.width(10.dp))
                    Row(

                        modifier = Modifier
                            .size(width = 30.dp, height = 20.dp)
                            .background(color = Color.Green),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.Center

                    ) {
                        Text(
                            text = "₹0",
                            color = Color.White,
                            fontSize = 14.sp
                        )
                    }
                }
            }
        }
    }
}

@Composable
fun LazyColoumn(modifier: Modifier = Modifier) {
    val cardList = listOf(
        cardItem.ColumnGrid(name = "Chethan") ,
        cardItem.FirstCard(profileName = "Your Profile", percentageText = "48% Completed"),
        cardItem.SecondCard(vegText = "Veg Mode"),
        cardItem.ThirdCard(appearance = "Appearance"),
        cardItem.FourthCard(rating = "Your Rating"),
        cardItem.FifthCard(foodOrder = "Food Orders"),
        cardItem.SixthCard(titleName = "Done"),
        cardItem.SeventhCard(title = "Done"),
        cardItem.EighthCard(title = "Done"),
        cardItem.NinthCard(title = "Done"),
        cardItem.TenthCard(title = "Done"),
        cardItem.EleventhCard(title = "EleventhDone")
    )

    LazyColumn(modifier = Modifier.fillMaxSize()) {
        items(cardList){ items->
            when(items) {
                is cardItem.ColumnGrid -> ColumnGrid(card = items)
                is cardItem.FirstCard -> ProfileCard(card = items)
                is cardItem.SecondCard -> VegModeCard(card = items)
                is cardItem.ThirdCard -> AppearanceCard(card = items)
                is cardItem.FourthCard -> RatingCard(card = items)
                is cardItem.FifthCard -> FoodOrderCard(card = items)
                is cardItem.SixthCard -> DiningCard(card = items)
                is cardItem.SeventhCard -> SeventhCard(card = items)
                is cardItem.EighthCard -> EighthCard(card = items)
                is cardItem.NinthCard -> NinthCard(card = items)
                is cardItem.TenthCard -> TenthCard(card = items)
                is cardItem.EleventhCard -> EleventhCard(card = items)
            }
        }
    }
}

@Composable
fun ProfileCard(card: cardItem.FirstCard) {
    Card(modifier = Modifier
        .fillMaxWidth()
        .padding(horizontal = 8.dp, vertical = 6.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White)
    ) {
        Row(modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 10.dp, vertical = 8.dp),
            verticalAlignment = Alignment.CenterVertically) {
            Icon(imageVector = Icons.Default.AccountCircle,
                contentDescription = "Your Profile Icon",
                modifier = Modifier.size(25.dp),
                tint = Color.LightGray)
            Spacer(modifier = Modifier.width(4.dp))
            Text(text = "Your Profile", color = Color.Black)
            Spacer(modifier = Modifier.weight(1f))
            Text(text = "48% Completed",
                modifier = Modifier
                    .clip(shape = RoundedCornerShape(12.dp))
                    .background(Color.Magenta),
                color = Color.LightGray, fontWeight = FontWeight.SemiBold, fontSize = 15.sp
                )
            Icon(imageVector = Icons.AutoMirrored.Filled.KeyboardArrowRight,
                contentDescription = "Arrow Right",
                modifier = Modifier.padding(start = 5.dp),
                tint = Color.DarkGray
            )
        }
    }
}

@Composable
fun VegModeCard(card: cardItem.SecondCard) {
    var switch1 by remember { mutableStateOf(false) }
    Card(modifier = Modifier
        .fillMaxWidth()
        .padding(horizontal = 8.dp, vertical = 6.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White)
    ) {

        Row(modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 10.dp, vertical = 8.dp),
            verticalAlignment = Alignment.CenterVertically) {
            Icon(
                painter = painterResource(R.drawable.veg_icon),
                contentDescription = "Veg Mode Icon",
                modifier = Modifier.size(22.dp),
                tint = Color.LightGray
            )
            Spacer(modifier = Modifier.width(6.dp))
            Text(text = "Veg Mode", color = Color.Black)
            Spacer(modifier = Modifier.weight(1f))

            Switch(checked = switch1,
                onCheckedChange = {switch1 = it},
                colors = SwitchDefaults.colors(checkedIconColor = Color.Green),
                modifier = Modifier.height(16.dp))

        }
    }
}

@Composable
fun AppearanceCard(card: cardItem.ThirdCard) {
    Card(modifier = Modifier
        .fillMaxWidth()
        .padding(horizontal = 8.dp, vertical = 6.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White)
    ) {
        Row(modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 10.dp, vertical = 8.dp),
            verticalAlignment = Alignment.CenterVertically) {
            Icon(painter = painterResource(R.drawable.paint),
                contentDescription = "Your Profile",
                modifier = Modifier.size(20.dp),
                tint = Color.LightGray)
            Spacer(modifier = Modifier.width(4.dp))
            Text(text = "Appearance", color = Color.Black)
            Spacer(modifier = Modifier.weight(1f))
            Text(text = "LIGHT",
                color = Color.Gray,
                fontWeight = FontWeight.Bold
            )
            Icon(imageVector = Icons.AutoMirrored.Filled.KeyboardArrowRight,
                contentDescription = "Arrow Right",
                tint = Color.Gray
            )
        }
    }
}

@Composable
fun RatingCard(card: cardItem.FourthCard) {

    Card(modifier = Modifier
        .fillMaxWidth()
        .padding(horizontal = 8.dp, vertical = 6.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White)
    ) {
        Row(modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 10.dp, vertical = 10.dp),
            verticalAlignment = Alignment.CenterVertically) {
            Icon(painter = painterResource(R.drawable.rating),
                contentDescription = "Rating Icon",
                modifier = Modifier.size(25.dp),
                tint = Color.LightGray)
            Spacer(modifier = Modifier.width(4.dp))
            Text(text = "Your Rating", color = Color.Black)
            Spacer(modifier = Modifier.weight(1f))
            Icon(painter = painterResource(R.drawable.startrating),
                contentDescription = "Arrow Right",
                tint = Color.Unspecified
            )
        }
    }
}

@Composable
fun FoodOrderCard(card: cardItem.FifthCard) {
    Card(modifier = Modifier
        .fillMaxWidth()
        .padding(horizontal = 8.dp, vertical = 10.dp)
        .fillMaxWidth()
        .height(400.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White)
    ) {
        Column {
            Row {
                VerticalDivider(
                    thickness = 3.dp,
                    modifier = Modifier
                        .height(34.dp)
                        .padding(top = 12.dp)
                        .clip(shape = RoundedCornerShape(10.dp)),
                    color = Color.Green
                )
                Text(
                    text = "Food Orders",
                    fontWeight = FontWeight.SemiBold,
                    color = Color.Black,
                    fontSize = 18.sp,
                    modifier = Modifier.padding(vertical = 10.dp, horizontal = 10.dp)
                )
            }

            Row(modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 10.dp, vertical = 4.dp),
                verticalAlignment = Alignment.CenterVertically) {
                Icon(painter = painterResource(R.drawable.order),
                    contentDescription = "Your Orders",
                    modifier = Modifier.size(25.dp),
                    tint = Color.LightGray)
                Spacer(modifier = Modifier.width(4.dp))
                Text(text = "Your Rating", color = Color.Black)
                Spacer(modifier = Modifier.weight(1f))
                Icon(imageVector = Icons.AutoMirrored.Filled.KeyboardArrowRight, contentDescription = "Forward Arrow",
                    tint = Color.Gray)
            }
            HorizontalDivider(thickness = 0.5.dp,
                modifier = Modifier
                    .padding(start = 53.dp, top = 10.dp)
                    .weight(0.2f),
                color = Color.LightGray.copy(alpha = 0.4f)
            )

            Row(modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 10.dp, vertical = 4.dp),
                verticalAlignment = Alignment.CenterVertically) {

                Icon(imageVector = Icons.Default.FavoriteBorder,
                    contentDescription = "Your Profile ",
                    modifier = Modifier.size(25.dp),
                    tint = Color.LightGray)
                Spacer(modifier = Modifier.width(4.dp))
                Text(text = "Your Rating", color = Color.Black)
                Spacer(modifier = Modifier.weight(1f))
                Icon(imageVector = Icons.AutoMirrored.Filled.KeyboardArrowRight,
                    contentDescription = "Forward Arrow",
                    tint = Color.Gray)
            }

            HorizontalDivider(thickness = 0.5.dp,
                modifier = Modifier
                    .padding(start = 53.dp, top = 10.dp)
                    .weight(0.2f),
                color = Color.LightGray.copy(alpha = 0.4f)
            )

            Row(modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 10.dp, vertical = 4.dp),
                verticalAlignment = Alignment.CenterVertically) {

                Icon(painter = painterResource(R.drawable.thumbs),
                    contentDescription = "Your Profile ",
                    modifier = Modifier.size(25.dp),
                    tint = Color.LightGray)
                Spacer(modifier = Modifier.width(4.dp))
                Text(text = "Your Rating", color = Color.Black)
                Spacer(modifier = Modifier.weight(1f))
                Icon(imageVector = Icons.AutoMirrored.Filled.KeyboardArrowRight,
                    contentDescription = "Forward Arrow",
                    tint = Color.Gray)
            }

            HorizontalDivider(thickness = 0.5.dp,
                modifier = Modifier
                    .padding(start = 53.dp, top = 10.dp)
                    .weight(0.2f),
                color = Color.LightGray.copy(alpha = 0.4f)
            )

            Row(modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 10.dp, vertical = 4.dp),
                verticalAlignment = Alignment.CenterVertically) {

                Icon(painter = painterResource(R.drawable.train),
                    contentDescription = "Your Profile ",
                    modifier = Modifier.size(25.dp),
                    tint = Color.LightGray)
                Spacer(modifier = Modifier.width(4.dp))
                Text(text = "Order on Train", color = Color.Black)
                Spacer(modifier = Modifier.weight(1f))
                Icon(imageVector = Icons.AutoMirrored.Filled.KeyboardArrowRight,
                    contentDescription = "Forward Arrow",
                    tint = Color.Gray)
            }

            HorizontalDivider(thickness = 0.5.dp,
                modifier = Modifier
                    .padding(start = 53.dp, top = 10.dp)
                    .weight(0.2f),
                color = Color.LightGray.copy(alpha = 0.4f)
            )

            Row(modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 10.dp, vertical = 4.dp),
                verticalAlignment = Alignment.CenterVertically) {

                Icon(painter = painterResource(R.drawable.addressbook),
                    contentDescription = "Your Profile ",
                    modifier = Modifier.size(25.dp),
                    tint = Color.LightGray)
                Spacer(modifier = Modifier.width(4.dp))
                Text(text = "Address Book", color = Color.Black)
                Spacer(modifier = Modifier.weight(1f))
                Icon(imageVector = Icons.AutoMirrored.Filled.KeyboardArrowRight,
                    contentDescription = "Forward Arrow",
                    tint = Color.Gray)
            }

            HorizontalDivider(thickness = 0.5.dp,
                modifier = Modifier
                    .padding(start = 53.dp, top = 10.dp)
                    .weight(0.2f),
                color = Color.LightGray.copy(alpha = 0.4f)
            )

            Row(modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 10.dp, vertical = 4.dp),
                verticalAlignment = Alignment.CenterVertically) {

                Icon(painter = painterResource(R.drawable.hiddden),
                    contentDescription = "Your Profile ",
                    modifier = Modifier.size(25.dp),
                    tint = Color.LightGray)
                Spacer(modifier = Modifier.width(4.dp))
                Text(text = "Address Book", color = Color.Black)
                Spacer(modifier = Modifier.weight(1f))
                Icon(imageVector = Icons.AutoMirrored.Filled.KeyboardArrowRight,
                    contentDescription = "Forward Arrow",
                    tint = Color.Gray)
            }

            HorizontalDivider(thickness = 0.5.dp,
                modifier = Modifier
                    .padding(start = 53.dp, top = 10.dp)
                    .weight(0.2f),
                color = Color.LightGray.copy(alpha = 0.4f)
            )

            Row(modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 10.dp, vertical = 4.dp),
                verticalAlignment = Alignment.CenterVertically) {

                Icon(painter = painterResource(R.drawable.message),
                    contentDescription = "Your Profile ",
                    modifier = Modifier.size(25.dp),
                    tint = Color.LightGray)
                Spacer(modifier = Modifier.width(4.dp))
                Text(text = "Address Book", color = Color.Black)
                Spacer(modifier = Modifier.weight(1f))
                Icon(imageVector = Icons.AutoMirrored.Filled.KeyboardArrowRight,
                    contentDescription = "Forward Arrow",
                    tint = Color.Gray)
            }
            Spacer(modifier = Modifier.width(4.dp))
        }
    }
}


@Composable
fun DiningCard(card: cardItem.SixthCard) {

    Card(modifier = Modifier
        .fillMaxWidth()
        .padding(horizontal = 8.dp, vertical = 10.dp)
        .fillMaxWidth()
        .height(350.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White)
    ) {
        Column {
            Row {
                VerticalDivider(
                    thickness = 3.dp,
                    modifier = Modifier
                        .height(34.dp)
                        .padding(top = 12.dp)
                        .clip(shape = RoundedCornerShape(10.dp)),
                    color = Color.Green
                )
                Text(
                    text = "Dining and Experiences",
                    fontWeight = FontWeight.SemiBold,
                    color = Color.Black,
                    fontSize = 18.sp,
                    modifier = Modifier.padding(vertical = 10.dp, horizontal = 10.dp)
                )
            }

            Row(modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 10.dp, vertical = 4.dp),
                verticalAlignment = Alignment.CenterVertically) {
                Icon(painter = painterResource(R.drawable.hiddden),
                    contentDescription = "Your Orders",
                    modifier = Modifier.size(25.dp),
                    tint = Color.LightGray)
                Spacer(modifier = Modifier.width(4.dp))
                Text(text = "Your Rating", color = Color.Black)
                Spacer(modifier = Modifier.weight(1f))
                Icon(imageVector = Icons.AutoMirrored.Filled.KeyboardArrowRight,
                    contentDescription = "Arrow Right",
                    tint = Color.Unspecified
                )
            }

            HorizontalDivider(thickness = 0.5.dp,
                modifier = Modifier
                    .padding(start = 53.dp, top = 10.dp)
                    .weight(0.2f),
                color = Color.LightGray.copy(alpha = 0.4f)
            )

            Row(modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 10.dp, vertical = 4.dp),
                verticalAlignment = Alignment.CenterVertically) {

                Icon(painter = painterResource(R.drawable.gift),
                    contentDescription = "Your Profile ",
                    modifier = Modifier.size(25.dp),
                    tint = Color.LightGray)
                Spacer(modifier = Modifier.width(4.dp))
                Text(text = "Address Book", color = Color.Black)
                Spacer(modifier = Modifier.weight(1f))
                Icon(imageVector = Icons.AutoMirrored.Filled.KeyboardArrowRight,
                    contentDescription = "Forward Arrow",
                    tint = Color.Gray)
            }

            HorizontalDivider(thickness = 0.5.dp,
                modifier = Modifier
                    .padding(start = 53.dp, top = 10.dp)
                    .weight(0.2f),
                color = Color.LightGray.copy(alpha = 0.4f)
            )

            Row(modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 10.dp, vertical = 4.dp),
                verticalAlignment = Alignment.CenterVertically) {

                Icon(painter = painterResource(R.drawable.dining),
                    contentDescription = "Your Profile ",
                    modifier = Modifier.size(25.dp),
                    tint = Color.LightGray)
                Spacer(modifier = Modifier.width(4.dp))
                Text(text = "Address Book", color = Color.Black)
                Spacer(modifier = Modifier.weight(1f))
                Icon(imageVector = Icons.AutoMirrored.Filled.KeyboardArrowRight,
                    contentDescription = "Forward Arrow",
                    tint = Color.Gray)
            }

            HorizontalDivider(thickness = 0.5.dp,
                modifier = Modifier
                    .padding(start = 53.dp, top = 10.dp)
                    .weight(0.2f),
                color = Color.LightGray.copy(alpha = 0.4f)
            )

            Row(modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 10.dp, vertical = 4.dp),
                verticalAlignment = Alignment.CenterVertically) {

                Icon(painter = painterResource(R.drawable.message),
                    contentDescription = "Your Profile ",
                    modifier = Modifier.size(25.dp),
                    tint = Color.LightGray)
                Spacer(modifier = Modifier.width(4.dp))
                Text(text = "Address Book", color = Color.Black)
                Spacer(modifier = Modifier.weight(1f))
                Icon(imageVector = Icons.AutoMirrored.Filled.KeyboardArrowRight,
                    contentDescription = "Forward Arrow",
                    tint = Color.Gray)
            }

            HorizontalDivider(thickness = 0.5.dp,
                modifier = Modifier
                    .padding(start = 53.dp, top = 10.dp)
                    .weight(0.2f),
                color = Color.LightGray.copy(alpha = 0.4f)
            )

            Row(modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 10.dp, vertical = 4.dp),
                verticalAlignment = Alignment.CenterVertically) {

                Icon(imageVector = Icons.Default.Settings,
                    contentDescription = "Your Profile ",
                    modifier = Modifier.size(25.dp),
                    tint = Color.LightGray)
                Spacer(modifier = Modifier.width(4.dp))
                Text(text = "Address Book", color = Color.Black)
                Spacer(modifier = Modifier.weight(1f))
                Icon(imageVector = Icons.AutoMirrored.Filled.KeyboardArrowRight,
                    contentDescription = "Forward Arrow",
                    tint = Color.Gray)
            }

            HorizontalDivider(thickness = 0.5.dp,
                modifier = Modifier
                    .padding(start = 53.dp, top = 10.dp)
                    .weight(0.2f),
                color = Color.LightGray.copy(alpha = 0.4f)
            )

            Row(modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 10.dp, vertical = 4.dp),
                verticalAlignment = Alignment.CenterVertically) {

                Icon(imageVector = Icons.Default.Info,
                    contentDescription = "Your Profile ",
                    modifier = Modifier.size(25.dp),
                    tint = Color.LightGray)
                Spacer(modifier = Modifier.width(4.dp))
                Text(text = "Address Book", color = Color.Black)
                Spacer(modifier = Modifier.weight(1f))
                Icon(imageVector = Icons.AutoMirrored.Filled.KeyboardArrowRight,
                    contentDescription = "Forward Arrow",
                    tint = Color.Gray)
            }
            Spacer(modifier = Modifier.width(4.dp))
        }
    }
}

@Composable
fun SeventhCard(card: cardItem.SeventhCard) {
    Card(modifier = Modifier
        .fillMaxWidth()
        .padding(horizontal = 8.dp, vertical = 10.dp)
        .fillMaxWidth()
        .height(120.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White)
    ) {
        Column {
            Row {
                VerticalDivider(
                    thickness = 3.dp,
                    modifier = Modifier
                        .height(34.dp)
                        .padding(top = 12.dp)
                        .clip(shape = RoundedCornerShape(10.dp)),
                    color = Color.Green
                )
                Text(
                    text = "Feeding India",
                    fontWeight = FontWeight.SemiBold,
                    color = Color.Black,
                    fontSize = 18.sp,
                    modifier = Modifier.padding(start = 10.dp, top = 10.dp)
                )
            }

            Row(modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 10.dp, vertical = 4.dp),
                verticalAlignment = Alignment.CenterVertically) {
                Icon(painter = painterResource(R.drawable.impact),
                    contentDescription = "Your Orders",
                    modifier = Modifier.size(25.dp),
                    tint = Color.LightGray)
                Spacer(modifier = Modifier.width(4.dp))
                Text(text = "Your Impact", color = Color.Black)
                Spacer(modifier = Modifier.weight(1f))
                Icon(imageVector = Icons.AutoMirrored.Filled.KeyboardArrowRight,
                    contentDescription = "Arrow Right",
                    tint = Color.Unspecified
                )
            }

            HorizontalDivider(thickness = 0.5.dp,
                modifier = Modifier
                    .padding(start = 53.dp, top = 10.dp)
                    .weight(0.2f),
                color = Color.LightGray.copy(alpha = 0.4f)
            )
            Row(modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 10.dp, vertical = 4.dp),
                verticalAlignment = Alignment.CenterVertically) {
                Icon(painter = painterResource(R.drawable.reciept),
                    contentDescription = "Your Orders",
                    modifier = Modifier.size(25.dp),
                    tint = Color.LightGray)
                Spacer(modifier = Modifier.width(4.dp))
                Text(text = "Get Feeding India Receipt", color = Color.Black,
                    modifier = Modifier
                        .padding(start = 5.dp, top = 10.dp)
                        .weight(1f))
                Spacer(modifier = Modifier.weight(1f))
                Icon(imageVector = Icons.AutoMirrored.Filled.KeyboardArrowRight,
                    contentDescription = "Arrow Right",
                    modifier = Modifier.padding(start = 5.dp, top = 10.dp),
                    tint = Color.Gray
                )
            }
        }
    }
}

@Composable
fun EighthCard(card: cardItem.EighthCard) {
    Card(modifier = Modifier
        .padding(start = 10.dp, top = 13.dp, end = 10.dp)
        .fillMaxWidth()
        .height(310.dp),
        colors = CardDefaults.cardColors(Color.White)) {

        Column {
            Row {
                VerticalDivider(
                    thickness = 3.dp,
                    modifier = Modifier
                        .height(34.dp)
                        .padding(top = 12.dp)
                        .clip(shape = RoundedCornerShape(10.dp)),
                    color = Color.Green
                )
                Text(
                    text = "Money",
                    fontWeight = FontWeight.SemiBold,
                    color = Color.Black,
                    fontSize = 18.sp,
                    modifier = Modifier.padding(start = 10.dp, top = 10.dp)
                )
            }
            Row(modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically) {
                Icon(painterResource(R.drawable.rupeesymbol), contentDescription = "Your Orders",
                    modifier = Modifier.padding(start = 10.dp, top = 10.dp),
                    tint = Color.LightGray
                )
                Text(
                    text = "Zomato Money",
                    color = Color.Black,
                    modifier = Modifier
                        .padding(start = 5.dp, top = 10.dp)
                        .weight(1f)
                )
                Icon(imageVector = Icons.AutoMirrored.Filled.KeyboardArrowRight,
                    contentDescription = "Forward Arrow",
                    modifier = Modifier.padding(start = 5.dp, top = 10.dp),
                    tint = Color.Gray)
            }

            HorizontalDivider(thickness = 0.5.dp,
                modifier = Modifier
                    .padding(start = 53.dp, top = 10.dp)
                    .weight(0.2f),
                color = Color.LightGray.copy(alpha = 0.4f)
            )

            Row(modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically) {
                Icon(painterResource(R.drawable.giftcard), contentDescription = "Your Orders",
                    modifier = Modifier.padding(start = 10.dp, top = 10.dp),
                    tint = Color.LightGray
                )
                Text(
                    text = "Buy Gift Cards",
                    color = Color.Black,
                    modifier = Modifier
                        .padding(start = 5.dp, top = 10.dp)
                        .weight(1f)
                )
                Icon(imageVector = Icons.AutoMirrored.Filled.KeyboardArrowRight,
                    contentDescription = "Forward Arrow",
                    modifier = Modifier.padding(start = 5.dp, top = 10.dp),
                    tint = Color.Gray
                )
            }
            HorizontalDivider(thickness = 0.5.dp,
                modifier = Modifier
                    .padding(start = 53.dp, top = 10.dp)
                    .weight(0.2f),
                color = Color.LightGray.copy(alpha = 0.4f)
            )
            Row(modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically) {
                Icon(painterResource(R.drawable.claimgiftcard), contentDescription = "Your Orders",
                    modifier = Modifier.padding(start = 10.dp, top = 10.dp),
                    tint = Color.LightGray
                )
                Text(
                    text = "Claim Gift Cards",
                    color = Color.Black,
                    modifier = Modifier
                        .padding(start = 5.dp, top = 10.dp)
                        .weight(1f)
                )
                Icon(imageVector = Icons.AutoMirrored.Filled.KeyboardArrowRight,
                    contentDescription = "Forward Arrow",
                    modifier = Modifier.padding(start = 5.dp, top = 10.dp),
                    tint = Color.Gray
                )
            }
            HorizontalDivider(thickness = 0.5.dp,
                modifier = Modifier
                    .padding(start = 53.dp, top = 10.dp)
                    .weight(0.2f),
                color = Color.LightGray.copy(alpha = 0.4f)
            )
            Row(modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically) {
                Icon(painterResource(R.drawable.z), contentDescription = "Your Orders",
                    modifier = Modifier.padding(start = 10.dp, top = 10.dp),
                    tint = Color.LightGray
                )
                Text(
                    text = "Zomato Credits",
                    color = Color.Black,
                    modifier = Modifier
                        .padding(start = 5.dp, top = 10.dp)
                        .weight(1f)
                )
                Icon(imageVector = Icons.AutoMirrored.Filled.KeyboardArrowRight,
                    contentDescription = "Forward Arrow",
                    modifier = Modifier.padding(start = 5.dp, top = 10.dp),
                    tint = Color.Gray)
            }
            HorizontalDivider(thickness = 0.5.dp,
                modifier = Modifier
                    .padding(start = 53.dp, top = 10.dp)
                    .weight(0.2f),
                color = Color.LightGray.copy(alpha = 0.4f)
            )
            Row(modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically) {
                Icon(painterResource(R.drawable.payment), contentDescription = "Your Orders",
                    modifier = Modifier.padding(start = 10.dp, top = 10.dp),
                    tint = Color.LightGray
                )
                Text(
                    text = "Payment Settings",
                    color = Color.Black,
                    modifier = Modifier
                        .padding(start = 5.dp, top = 10.dp)
                        .weight(1f)
                )
                Icon(imageVector = Icons.AutoMirrored.Filled.KeyboardArrowRight,
                    contentDescription = "Forward Arrow",
                    modifier = Modifier.padding(start = 5.dp, top = 10.dp),
                    tint = Color.Gray
                )
            }
        }
    }
}

@Composable
fun NinthCard(card: cardItem.NinthCard) {

    Card(modifier = Modifier
        .padding(start = 10.dp, top = 13.dp, end = 10.dp)
        .fillMaxWidth()
        .height(120.dp),
        colors = CardDefaults.cardColors(Color.White)
    ) {
        Column {
            Row {
                VerticalDivider(
                    thickness = 3.dp,
                    modifier = Modifier
                        .height(34.dp)
                        .padding(top = 12.dp)
                        .clip(shape = RoundedCornerShape(10.dp)),
                    color = Color.Green
                )
                Text(
                    text = "Zomato For Enterprise",
                    fontWeight = FontWeight.SemiBold,
                    color = Color.Black,
                    fontSize = 18.sp,
                    modifier = Modifier.padding(start = 10.dp, top = 10.dp)
                )
            }
            Row(modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically) {
                Icon(painterResource(R.drawable.building), contentDescription = "Your Orders",
                    modifier = Modifier.padding(start = 10.dp, top = 10.dp),
                    tint = Color.LightGray
                )
                Text(
                    text = "For Employees",
                    color = Color.Black,
                    modifier = Modifier
                        .padding(start = 5.dp, top = 10.dp)
                        .weight(1f)
                )
                Icon(imageVector = Icons.AutoMirrored.Filled.KeyboardArrowRight,
                    contentDescription = "Forward Arrow",
                    modifier = Modifier.padding(start = 5.dp, top = 10.dp),
                    tint = Color.Gray)
            }

            HorizontalDivider(thickness = 0.5.dp,
                modifier = Modifier
                    .padding(start = 53.dp, top = 10.dp)
                    .weight(0.2f),
                color = Color.LightGray.copy(alpha = 0.4f)
            )

            Row(modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically) {
                Icon(painterResource(R.drawable.empcard), contentDescription = "Your Orders",
                    modifier = Modifier.padding(start = 10.dp, top = 10.dp),
                    tint = Color.LightGray
                )
                Text(
                    text = "For Employers",
                    color = Color.Black,
                    modifier = Modifier
                        .padding(start = 5.dp, top = 10.dp)
                        .weight(1f)
                )
                Icon(imageVector = Icons.AutoMirrored.Filled.KeyboardArrowRight,
                    contentDescription = "Forward Arrow",
                    modifier = Modifier.padding(start = 5.dp, top = 10.dp),
                    tint = Color.Gray
                )
            }
        }
    }
}

@Composable
fun TenthCard(card: cardItem.TenthCard) {

    Card(modifier = Modifier
        .padding(start = 10.dp, top = 13.dp, end = 10.dp)
        .fillMaxWidth()
        .height(120.dp),
        colors = CardDefaults.cardColors(Color.White)
    ) {
        Column {
            Row {
                VerticalDivider(
                    thickness = 3.dp,
                    modifier = Modifier
                        .height(34.dp)
                        .padding(top = 12.dp)
                        .clip(shape = RoundedCornerShape(10.dp)),
                    color = Color.Green
                )
                Text(
                    text = "Coupons",
                    fontWeight = FontWeight.SemiBold,
                    color = Color.Black,
                    fontSize = 18.sp,
                    modifier = Modifier.padding(start = 10.dp, top = 10.dp)
                )
            }
            Row(modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically) {
                Icon(painterResource(R.drawable.coupons), contentDescription = "Your Orders",
                    modifier = Modifier.padding(start = 10.dp, top = 10.dp),
                    tint = Color.LightGray
                )
                Text(
                    text = "Collected Coupons",
                    color = Color.Black,
                    modifier = Modifier
                        .padding(start = 5.dp, top = 10.dp)
                        .weight(1f)
                )
                Icon(imageVector = Icons.AutoMirrored.Filled.KeyboardArrowRight,
                    contentDescription = "Forward Arrow",
                    modifier = Modifier.padding(start = 5.dp, top = 10.dp),
                    tint = Color.Gray)
            }

            HorizontalDivider(thickness = 0.5.dp,
                modifier = Modifier
                    .padding(start = 53.dp, top = 10.dp)
                    .weight(0.2f),
                color = Color.LightGray.copy(alpha = 0.4f)
            )

            Row(modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically) {
                Icon(painterResource(R.drawable.coupons), contentDescription = "Your Orders",
                    modifier = Modifier.padding(start = 10.dp, top = 10.dp),
                    tint = Color.LightGray
                )
                Text(
                    text = "Redeem Gold Coupons",
                    color = Color.Black,
                    modifier = Modifier
                        .padding(start = 5.dp, top = 10.dp)
                        .weight(1f)
                )
                Icon(imageVector = Icons.AutoMirrored.Filled.KeyboardArrowRight,
                    contentDescription = "Forward Arrow",
                    modifier = Modifier.padding(start = 5.dp, top = 10.dp),
                    tint = Color.Gray
                )
            }
        }
    }
}

@Composable
fun EleventhCard(card: cardItem.EleventhCard) {
    Card(modifier = Modifier
        .padding(start = 10.dp, top = 13.dp, end = 10.dp)
        .fillMaxWidth()
        .height(300.dp),
        colors = CardDefaults.cardColors(Color.White)
    ) {
        Column {
            Row {
                VerticalDivider(
                    thickness = 3.dp,
                    modifier = Modifier
                        .height(34.dp)
                        .padding(top = 12.dp)
                        .clip(shape = RoundedCornerShape(10.dp)),
                    color = Color.Green
                )
                Text(
                    text = "Coupons",
                    fontWeight = FontWeight.SemiBold,
                    color = Color.Black,
                    fontSize = 18.sp,
                    modifier = Modifier.padding(start = 10.dp, top = 10.dp)
                )
            }
            Row(modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically) {
                Icon(imageVector = Icons.Default.Info, contentDescription = "Your Orders",
                    modifier = Modifier.padding(start = 10.dp, top = 10.dp),
                    tint = Color.LightGray
                )
                Text(
                    text = "About",
                    color = Color.Black,
                    modifier = Modifier
                        .padding(start = 5.dp, top = 10.dp)
                        .weight(1f)
                )
                Icon(imageVector = Icons.AutoMirrored.Filled.KeyboardArrowRight,
                    contentDescription = "Forward Arrow",
                    modifier = Modifier.padding(start = 5.dp, top = 10.dp),
                    tint = Color.Gray)
            }

            HorizontalDivider(thickness = 0.5.dp,
                modifier = Modifier
                    .padding(start = 53.dp, top = 10.dp)
                    .weight(0.2f),
                color = Color.LightGray.copy(alpha = 0.2f)
            )

            Row(modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically) {
                Icon(painterResource(R.drawable.feedback), contentDescription = "Your Orders",
                    modifier = Modifier.padding(start = 10.dp, top = 10.dp),
                    tint = Color.LightGray
                )
                Text(
                    text = "Send Feedback",
                    color = Color.Black,
                    modifier = Modifier
                        .padding(start = 5.dp, top = 10.dp)
                        .weight(1f)
                )
                Icon(imageVector = Icons.AutoMirrored.Filled.KeyboardArrowRight,
                    contentDescription = "Forward Arrow",
                    modifier = Modifier.padding(start = 5.dp, top = 10.dp),
                    tint = Color.Gray
                )
            }

            HorizontalDivider(thickness = 0.5.dp,
                modifier = Modifier
                    .padding(start = 53.dp, top = 10.dp)
                    .weight(0.2f),
                color = Color.LightGray.copy(alpha = 0.2f)
            )

            Row(modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically) {
                Icon(imageVector = Icons.Default.Settings, contentDescription = "Your Orders",
                    modifier = Modifier.padding(start = 10.dp, top = 10.dp),
                    tint = Color.LightGray
                )
                Text(
                    text = "Settings",
                    color = Color.Black,
                    modifier = Modifier
                        .padding(start = 5.dp, top = 10.dp)
                        .weight(1f)
                )
                Icon(imageVector = Icons.AutoMirrored.Filled.KeyboardArrowRight,
                    contentDescription = "Forward Arrow",
                    modifier = Modifier.padding(start = 5.dp, top = 10.dp),
                    tint = Color.Gray
                )
            }

            HorizontalDivider(thickness = 0.5.dp,
                modifier = Modifier
                    .padding(start = 53.dp, top = 10.dp)
                    .weight(0.2f),
                color = Color.LightGray.copy(alpha = 0.2f)
            )

            Row(modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically) {
                Icon(imageVector = Icons.Default.Info, contentDescription = "Your Orders",
                    modifier = Modifier.padding(start = 10.dp, top = 10.dp),
                    tint = Color.LightGray
                )
                Text(
                    text = "Report a Safety Emergency",
                    color = Color.Black,
                    modifier = Modifier
                        .padding(start = 5.dp, top = 10.dp)
                        .weight(1f)
                )
                Icon(imageVector = Icons.AutoMirrored.Filled.KeyboardArrowRight,
                    contentDescription = "Forward Arrow",
                    modifier = Modifier.padding(start = 5.dp, top = 10.dp),
                    tint = Color.Gray
                )
            }

            HorizontalDivider(thickness = 0.5.dp,
                modifier = Modifier
                    .padding(start = 53.dp, top = 10.dp)
                    .weight(0.2f),
                color = Color.LightGray.copy(alpha = 0.4f)
            )

            Row(modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically) {
                Icon(painterResource(R.drawable.logout), contentDescription = "Your Orders",
                    modifier = Modifier.padding(start = 10.dp, top = 10.dp),
                    tint = Color.LightGray
                )
                Text(
                    text = "Logout",
                    color = Color.Black,
                    modifier = Modifier
                        .padding(start = 5.dp, top = 10.dp)
                        .weight(1f)
                )
                Icon(imageVector = Icons.AutoMirrored.Filled.KeyboardArrowRight,
                    contentDescription = "Forward Arrow",
                    modifier = Modifier.padding(start = 5.dp, top = 10.dp),
                    tint = Color.Gray
                )
            }
        }
    }
}

sealed class cardItem {
    data class FirstCard(
        val profileName: String,
        val percentageText: String
    ): cardItem()
    data class ColumnGrid(val name: String)
    data class SecondCard(val vegText: String): cardItem()
    data class ThirdCard(val appearance: String): cardItem()
    data class FourthCard(val rating: String)
    data class FifthCard(val foodOrder: String)
    data class SixthCard(val titleName: String)
    data class SeventhCard(val title: String)
    data class EighthCard(val title: String)
    data class NinthCard(val title: String)
    data class TenthCard(val title: String)
    data class EleventhCard(val title: String)

}

@Preview(showBackground = true)
@Composable
fun PreviewProfile(modifier: Modifier = Modifier) {
    ProfileScreen(rememberNavController())
}