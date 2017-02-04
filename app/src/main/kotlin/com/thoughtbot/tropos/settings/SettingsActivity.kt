package com.thoughtbot.tropos.settings

import android.os.Bundle
import com.thoughtbot.tropos.R
import com.thoughtbot.tropos.commons.BaseActivity

class SettingsActivity : BaseActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_settings)
  }

}

