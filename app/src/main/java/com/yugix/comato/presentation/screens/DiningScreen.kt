package com.yugix.comato.presentation.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.yugix.comato.R
import com.yugix.comato.presentation.components.DiningScreenContent
import com.yugix.comato.presentation.components.DiningSearchBar
import com.yugix.comato.presentation.components.DiningSliderComponent
import com.yugix.comato.presentation.components.RestaurantPromotion
import com.yugix.comato.presentation.components.TopAppBarDiningScreen

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DiningScreen(navController: NavController, listState: LazyListState) {

    val scrollBehavior = TopAppBarDefaults.exitUntilCollapsedScrollBehavior()

    val samplePromotions = listOf(
        RestaurantPromotion(
            imageRes = R.drawable.restaurant1,
            name = "Lezzetli",
            tagLine = "Experience the finer things",
            discount = "Flat 15% OFF"
        ),
        RestaurantPromotion(
            imageRes = R.drawable.restaurant2,
            name = "Spice Garden",
            tagLine = "Authentic Flavours of India",
            discount = "Buy 1 Get 1 Free"
        ),
        RestaurantPromotion(
            imageRes = R.drawable.restaurant3,
            name = "Sushi Paradise",
            tagLine = "Fresh from the Ocean",
            discount = "20% OFF on Weekdays"
        )
    )

    Scaffold(
        containerColor = Color.Transparent,
        topBar = {
            Column(
                modifier = Modifier.fillMaxSize()
            ) {
                TopAppBarDiningScreen(scrollBehavior,navController)
                Spacer(modifier = Modifier.height(3.dp))
                DiningSearchBar(navController)
            }
        }
    ) { innerPadding ->
        LazyColumn(
            state = listState,
            contentPadding = PaddingValues(vertical = 0.dp),
            modifier = Modifier
                .fillMaxSize()
                .padding(bottom = innerPadding.calculateBottomPadding())
                .nestedScroll(scrollBehavior.nestedScrollConnection)
        ) {
            item {
                Box(
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.diningbanner),
                        modifier = Modifier
                            .fillMaxWidth()
                            .clip(
                                shape = RoundedCornerShape(
                                    bottomStart = 15.dp,
                                    bottomEnd = 15.dp
                                )
                            ),
                        contentDescription = "Banner"
                    )
                }
            }
            item {
                DiningSliderComponent(
                    promotions = samplePromotions,
                    modifier = Modifier.padding(horizontal = 16.dp)
                )
                DiningScreenContent()
            }
        }
    }
}