package com.leveloncoder.kotlin.app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
class BaseActivity : AppCompatActivity() {
    lateinit var clickButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*
          Now we create app with button
          if this button is click
          we change xml layout
          let's try do this
          i have constraint layout with
          id layout, try create button
          this button in center
          let's create on click event in Kotlin
          create lateinit variable clickButton extends this button
          with class Button in package (android.widget.Button)
          use function findViewById to find this button
          in xml
          we create clickButton id for this button
          now we use fast lambda
          we create some app now
          I don't test it in my computer it's old
          but you must connect your usb device and
          test it
          Thanks For Viewing
          Good Bye!
        */

        clickButton = findViewById(R.id.clickButton)

        /*
        * It's long lambda
        * clickButton.setOnClickListener(View.OnClickListener {
            // TODO: Some Code write here!
        * })
        */

        // It's fast lambda
        clickButton.setOnClickListener {
            setContentView(R.layout.change_layout)
        }
    }
}