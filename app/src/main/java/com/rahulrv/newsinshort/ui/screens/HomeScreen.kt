package com.rahulrv.newsinshort.ui.screens

import android.util.Log
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.pager.PageSize
import androidx.compose.foundation.pager.VerticalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.rahulrv.newsinshort.ui.components.EmptyStateComponent
import com.rahulrv.newsinshort.ui.components.Loader
import com.rahulrv.newsinshort.ui.components.NewsList
import com.rahulrv.newsinshort.ui.components.NewsRowComponent
import com.rahulrv.newsinshort.ui.viewmodel.NewsViewModel
import com.rahulrv.utilities.ResourceState

/**
 * Created by  rahulramanujam On 1/20/24
 *
 */
const val TAG = "HomeScreen"

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun HomeScreen(
    newsViewModel: NewsViewModel = hiltViewModel()
) {

    val newsResponse = newsViewModel.news.collectAsState().value

    val pagerState = rememberPagerState(
        initialPage = 0, initialPageOffsetFraction = 0f
    ) {
        100
    }

    VerticalPager(
        state = pagerState,
        modifier = Modifier.fillMaxSize(),
        pageSize = PageSize.Fill,
        pageSpacing = 8.dp
    ) {page:Int ->
        when (newsResponse) {
            is ResourceState.Loading -> {
                Log.d(TAG, "inside loading")
                Loader()
            }

            is ResourceState.Success -> {
                val response = newsResponse.data
                Log.d(TAG, "inside success ${response.totalResults}")
                if(response.articles.isNotEmpty()) {
                    NewsRowComponent(page, response.articles[page])
                } else {
                    EmptyStateComponent()
                }

            }

            is ResourceState.Error -> {
                Log.d(TAG, "inside error ${newsResponse.error}")
            }
        }
    }
}

@Preview
@Composable
fun HomeScreenPreview() {
    HomeScreen()
}