package com.example.android.navigation


import android.content.Context
import android.os.Bundle
import android.view.*
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.NavigationUI
import com.example.android.navigation.databinding.FragmentTitleBinding
import org.jetbrains.anko.AnkoLogger
import org.jetbrains.anko.info

class TitleFragment : Fragment(), AnkoLogger {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        info("${hashCode()} onCreateView, savedInstanceState: $savedInstanceState, $activity")
        //
        val binding : FragmentTitleBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_title, container, false)
        binding.playButton.setOnClickListener {
            it.findNavController().navigate(TitleFragmentDirections.actionTitleFragmentToGameFragment())
        }
        setHasOptionsMenu(true)
        return binding.root
    }

    override fun onCreateOptionsMenu(menu: Menu?, inflater: MenuInflater?) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater?.inflate(R.menu.overflow_menu, menu)
    }

    override fun onOptionsItemSelected(item: MenuItem?) = when (item?.itemId) {
        R.id.aboutFragment -> NavigationUI.onNavDestinationSelected(item, findNavController())
        else -> super.onOptionsItemSelected(item)
    }

    //
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        info("${hashCode()} onCreate, savedInstanceState: $savedInstanceState, $activity")
    }
    override fun onStart() {
        super.onStart()
        info("${hashCode()} onStart, $activity")
    }
    override fun onResume() {
        super.onResume()
        info("${hashCode()} onResume, $activity")
    }
    override fun onAttach(context: Context?) {
        super.onAttach(context)
        info("${hashCode()} onAttach $context")
    }
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        info("${hashCode()} onActivityCreated, $activity")
    }
    override fun onStop() {
        super.onStop()
        info("${hashCode()} onStop, $activity")
    }
    override fun onDetach() {
        super.onDetach()
        info("${hashCode()} onDetach, $activity")
    }
    override fun onDestroyView() {
        super.onDestroyView()
        info("${hashCode()} onDestroyView, $activity")
    }
    override fun onDestroy() {
        super.onDestroy()
        info("${hashCode()} onDestroy, $activity")
    }
    override fun onPause() {
        super.onPause()
        info("${hashCode()} onPause, $activity")
    }
    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putLong("date", System.currentTimeMillis())
        info("${hashCode()} onSaveInstanceState, $activity")
    }
    override fun onViewStateRestored(savedInstanceState: Bundle?) {
        super.onViewStateRestored(savedInstanceState)
        info("${hashCode()} onViewStateRestored, savedInstanceState: $savedInstanceState, $activity")
    }

}
