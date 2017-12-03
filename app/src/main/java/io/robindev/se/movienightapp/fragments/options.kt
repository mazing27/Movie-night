package io.robindev.se.movienightapp.fragments

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import io.robindev.se.movienightapp.R

/**
 * Created by rory on 2017-12-01.
 */
class options : Fragment() {
    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater?.inflate(R.layout.fragment_settings, container, false)

        activity.title = "Options"
        return view
    }
}