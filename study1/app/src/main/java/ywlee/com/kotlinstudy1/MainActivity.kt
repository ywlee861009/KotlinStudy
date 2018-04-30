package ywlee.com.kotlinstudy1

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_changetext.setOnClickListener{
            txv_hello.text = "Hello Kotlin !"
        }
    }
}
