package uk.co.joshuabest.joshedex.util

import android.os.Bundle
import android.widget.ImageView
import androidx.annotation.LayoutRes

abstract class JoshedexActivity : androidx.appcompat.app.AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(provideLayoutId())
        observeViewModel()
    }

    @LayoutRes
    protected abstract fun provideLayoutId(): Int

    protected abstract fun observeViewModel()

    protected fun setBackButton(backBtn: ImageView) {
        backBtn.setOnClickListener { onBackPressed() }
    }
}