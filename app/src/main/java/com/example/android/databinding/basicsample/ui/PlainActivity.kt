/*
 * Copyright (C) 2018 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.android.databinding.basicsample.ui

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import com.example.android.databinding.basicsample.R
import com.example.android.databinding.basicsample.data.SimpleViewModel
import com.example.android.databinding.basicsample.databinding.PlainActivityBinding

/**
 * Plain activity with data binding.
 */
class PlainActivity : AppCompatActivity() {

    private val viewModel by viewModels<SimpleViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: PlainActivityBinding =
            DataBindingUtil.setContentView(this, R.layout.plain_activity)

        binding.lifecycleOwner = this  // use Fragment.viewLifecycleOwner for fragments
        binding.viewmodel = viewModel
    }

}
