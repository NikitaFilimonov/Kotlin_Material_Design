package com.example.kotlin_material_design.ui.main.picture

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.kotlin_material_design.R
import com.example.kotlin_material_design.ui.main.animations.AnimationsActivity
import com.example.kotlin_material_design.ui.main.animations.AnimationsActivityBonus
import com.example.kotlin_material_design.ui.main.recycler.RecyclerActivity
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import kotlinx.android.synthetic.main.bottom_navigation_layout.*

class BottomNavigationDrawerFragment : BottomSheetDialogFragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.bottom_navigation_layout, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        navigation_view.setNavigationItemSelectedListener { menuItem ->
            when (menuItem.itemId) {
                R.id.navigation_one -> activity?.let {
                    startActivity(
                        Intent(
                            it,
                            AnimationsActivity::class.java
                        )
                    )
                }
                R.id.navigation_two -> activity?.let {
                    startActivity(
                        Intent(
                            it,
                            AnimationsActivityBonus::class.java
                        )
                    )
                }
                R.id.navigation_three -> activity?.let {
                    startActivity(
                        Intent(
                            it,
                            RecyclerActivity::class.java
                        )
                    )
                }
            }
            dismiss()
            true
        }
    }
}
