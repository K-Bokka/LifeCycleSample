package com.kbokka.android.lifecyclesample

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class SubActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    Log.i("LifeCycleSample", "Sub onCreate() called.")
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_sub)
  }

  public override fun onStart() {
    Log.i("LifeCycleSample", "Sub onStart() called.")
    super.onStart()
  }

  public override fun onResume() {
    Log.i("LifeCycleSample", "Sub onResume() called.")
    super.onResume()
  }

  public override fun onPause() {
    Log.i("LifeCycleSample", "Sub onPause() called.")
    super.onPause()
  }

  public override fun onStop() {
    Log.i("LifeCycleSample", "Sub onStop() called.")
    super.onStop()
  }

  public override fun onDestroy() {
    Log.i("LifeCycleSample", "Sub onDestroy() called.")
    super.onDestroy()
  }

  fun onButtonClick(view: View) {
    finish()
  }
}
