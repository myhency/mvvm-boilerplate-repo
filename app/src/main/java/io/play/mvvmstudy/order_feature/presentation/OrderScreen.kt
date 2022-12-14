package io.play.mvvmstudy.order_feature.presentation

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import io.play.mvvmstudy.order_feature.presentation.components.OrderUiListItem
import io.play.mvvmstudy.ui.theme.gray
import io.play.mvvmstudy.ui.theme.orange
import io.play.mvvmstudy.ui.theme.white

@RequiresApi(Build.VERSION_CODES.O)
@Composable
fun OrderScreen(navController: NavController, orderViewModel: OrderViewModel = hiltViewModel()) {
    val scaffoldState = rememberScaffoldState()

    Scaffold(scaffoldState = scaffoldState, floatingActionButton = {
        FloatingActionButton(onClick = { /*TODO*/ }, backgroundColor = orange) {
            Icon(
                imageVector = Icons.Default.Add,
                contentDescription = "fab_add_order",
                tint = white
            )
        }

    }, topBar = {
        TopAppBar(title = { Text(text = "Order overview", color = white) }, backgroundColor = orange)
    }
    ) {
        if(orderViewModel.orderList.isEmpty()) {
            Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                Text(text = "There are no orders yet")
            }
        } else {
            LazyColumn(modifier = Modifier
                .fillMaxSize()
                .background(gray)
                .padding(10.dp),
            verticalArrangement = Arrangement.spacedBy(10.dp)) {
                items(
                    orderViewModel.orderList,
                    key = { orderListItem -> orderListItem.orderId}
                ) {
                    OrderUiListItem(
                        it,
                        modifier = Modifier
                            .fillMaxWidth()
                            .clip(RoundedCornerShape(10.dp))
                            .border(1.dp, color = white, RoundedCornerShape(10.dp))
                            .clickable {
                                orderViewModel.onOrderClick(it.orderId)
                            }
                            .padding(15.dp)
                    )
                }
            }
        }
    }
}