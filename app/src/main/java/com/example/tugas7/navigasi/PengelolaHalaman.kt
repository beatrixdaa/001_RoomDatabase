package com.example.tugas7.navigasi

import android.icu.text.CaseMap.Title
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarScrollBehavior
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.tugas7.R


@Composable
fun SiswaApp(navController: NavController=rememberNavController()){
    HostNavigasi(navController=navController)
}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SiswaTopAppBar(
title:String,
canNavController: Boolean,
modifier: Modifier = Modifier,
scrollBehavior: TopAppBarScrollBehavior? = null,
navigateUp:() -> Unit = {}
){
    CenterAlignedTopAppBar(title =  { Text(title) },
 modifier = modifier,
scrollBehavior=scrollBehavior,
        navigationIcon = {
            if (canNavController) {
                IconButton(onClick = navigateUp) {
                    Icon(
                        imageVector = Icons.Filled.ArrowBack,
                        contentDescription = stringResource(id = R.string.back)
                    )
                }
            }
        })



}




@Composable
fun HostNavigasi(navController: NavController,
                 modifier: Modifier =Modifier) {

}

