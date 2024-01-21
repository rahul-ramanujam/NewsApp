package com.rahulrv.newsinshort.ui.screens

import android.util.Log
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.navigation.compose.hiltViewModel
import com.rahulrv.newsinshort.ui.components.Loader
import com.rahulrv.newsinshort.ui.viewmodel.NewsViewModel
import com.rahulrv.utilities.ResourceState

/**
 * Created by  rahulramanujam On 1/20/24
 *
 */
const val TAG = "HomeScreen"
@Composable
fun HomeScreen(
    newsViewModel: NewsViewModel = hiltViewModel()
) {

    val newsResponse = newsViewModel.news.collectAsState().value

    Surface(
        modifier = Modifier.fillMaxSize()
    ) {
        when(newsResponse) {
            is ResourceState.Loading -> {
                Log.d(TAG, "inside loading")
                Loader()
            }

            is ResourceState.Success -> {
                val response = newsResponse.data
                Log.d(TAG, "inside success ${response.totalResults}")
            }

            is ResourceState.Error -> {
                Log.d(TAG, "inside error")
            }
        }
    }
}
@Preview
@Composable
fun HomeScreenPreview() {
    HomeScreen()
}