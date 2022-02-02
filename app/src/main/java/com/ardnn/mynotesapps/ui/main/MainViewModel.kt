package com.ardnn.mynotesapps.ui.main

import android.app.Application
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.paging.LivePagedListBuilder
import androidx.paging.PagedList
import com.ardnn.mynotesapps.database.Note
import com.ardnn.mynotesapps.repository.NoteRepository

class MainViewModel(application: Application): ViewModel() {
    private val mNoteRepository = NoteRepository(application)

    fun getAllNotes(): LiveData<PagedList<Note>> =
        LivePagedListBuilder(mNoteRepository.getAllNotes(), 20).build()
}