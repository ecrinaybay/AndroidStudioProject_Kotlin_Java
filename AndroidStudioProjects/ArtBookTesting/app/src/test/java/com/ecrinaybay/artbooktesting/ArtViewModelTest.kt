package com.ecrinaybay.artbooktesting

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import com.ecrinaybay.artbooktesting.repo.ArtRepository
import com.ecrinaybay.artbooktesting.repo.FakeArtRepository
import com.ecrinaybay.artbooktesting.util.Status
import com.ecrinaybay.artbooktesting.viewmodel.ArtViewModel
import com.ecrinaybay.artbooktesting.viewmodel.MainCoroutineRule
import com.ecrinaybay.artbooktesting.viewmodel.getOrAwaitValueTest
import com.google.common.truth.Truth.assertThat
import kotlinx.coroutines.ExperimentalCoroutinesApi
import org.junit.Before
import org.junit.Rule
import org.junit.Test

@ExperimentalCoroutinesApi
class ArtViewModelTest {

    @get: Rule
    var instantTaskExecutorRule = InstantTaskExecutorRule()

    @get: Rule
    var mainCoroutineRule = MainCoroutineRule()

    private lateinit var viewModel : ArtViewModel

    @Before
    fun setup(){
        //Test Doubles
        viewModel = ArtViewModel(FakeArtRepository())
    }

    @Test
    fun `insert art without year returns error`(){
        viewModel.makeArt("Mona Lisa","Da Vinci", "")
        val value = viewModel.insertArtMessage.getOrAwaitValueTest()
        assertThat(value.status).isEqualTo(Status.ERROR)

    }

    @Test
    fun `insert art without name returns error`(){
        viewModel.makeArt("","Da Vinci", "1800")
        val value = viewModel.insertArtMessage.getOrAwaitValueTest()
        assertThat(value.status).isEqualTo(Status.ERROR)
    }

    @Test
    fun `insert art without artistName returns error`(){
        viewModel.makeArt("Mona Lisa","", "1800")
        val value = viewModel.insertArtMessage.getOrAwaitValueTest()
        assertThat(value.status).isEqualTo(Status.ERROR)
    }

}




































































