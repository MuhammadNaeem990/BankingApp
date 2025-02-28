package com.example.bankingapp.Activity

import android.os.Bundle
import android.view.WindowManager
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat


import androidx.recyclerview.widget.LinearLayoutManager
import com.example.bankingapp.Adapter.ReportListAdapter
import com.example.bankingapp.R
import com.example.bankingapp.ViewModel.MainViewModel
import com.example.bankingapp.databinding.ActivityIntroBinding
import com.example.bankingapp.databinding.ActivityReportBinding

class ReportActivity : AppCompatActivity() {
	lateinit var binding:ActivityReportBinding
	private val mainViewModel:MainViewModel by viewModels()
	
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		binding = ActivityReportBinding.inflate(layoutInflater)
		setContentView(binding.root)
		
		window.setFlags(
			WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
			WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
		)
		
		initRecyclerView()
		setVariable()
		
	}
	
	private fun setVariable() {
		binding.backBtn.setOnClickListener{finish()}
	}
	
	private fun initRecyclerView() {
		binding.view2.layoutManager = LinearLayoutManager(this,LinearLayoutManager
			.VERTICAL,false)
		binding.view2.adapter = ReportListAdapter(mainViewModel.loadBudget())
		binding.view2.isNestedScrollingEnabled = true
	}
}