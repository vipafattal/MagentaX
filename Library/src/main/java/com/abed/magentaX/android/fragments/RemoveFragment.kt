package com.abed.magentaX.android.fragments

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager

fun FragmentManager.removeFragment(frag: Fragment?) {
    if (frag != null)
        beginTransaction().remove(frag).commit()

}

fun Fragment.removeFragment() {
    fragmentManager?.removeFragment(this)
}

fun FragmentManager.removeFragmentByTag(tag: String): Boolean {
    val fragment = findFragmentByTag(tag)
    removeFragment(fragment)
    return fragment != null
}

fun FragmentManager.removeAllFragments() {
    for (fragment in fragments)
        removeFragment(fragment)
    popBackStack(null, FragmentManager.POP_BACK_STACK_INCLUSIVE)
}