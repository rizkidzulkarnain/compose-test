package com.example.composetest

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.composetest.databinding.ActivityTestingBinding
import com.example.composetest.di.ActivityBuilder
import com.example.composetest.viewmodel.TestingViewModelContract
import javax.inject.Inject
import javax.inject.Named

class TestingActivity : AppCompatActivity() {
    @field:[Inject Named(ActivityBuilder.MainActivityViewModel)]
    lateinit var testingViewModelContract: TestingViewModelContract

    lateinit var binding: ActivityTestingBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        (applicationContext as MainApplication).component.inject(this)

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_testing)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_testing)
        binding.setVariable(0, testingViewModelContract)
        binding.executePendingBindings()
        setSupportActionBar(binding.toolbar)

        testingViewModelContract.getData()
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }
}
