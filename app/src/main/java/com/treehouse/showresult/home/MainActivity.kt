package com.treehouse.showresult.home


import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.DividerItemDecoration
import android.support.v7.widget.LinearLayoutManager
import android.widget.Toast
import com.treehouse.showresult.App
import com.treehouse.showresult.R
import com.treehouse.showresult.home.di.DaggerHomeComponent
import com.treehouse.showresult.home.di.HomeModule
import com.treehouse.showresult.model.UserDat
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : AppCompatActivity(), HomeContract.View {


    private val UserAdapter = UserAdapter()
    @Inject
    lateinit var homePresenter: HomeContract.Presenter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        DaggerHomeComponent.builder()
            .appComponent((application as App).getComponent())
            .homeModule(HomeModule(this))
            .build()
            .inject(this)


        val layoutManager = LinearLayoutManager(this)

        rvData.layoutManager = layoutManager
        rvData.addItemDecoration(DividerItemDecoration
            (this,layoutManager.orientation))
        rvData.adapter = UserAdapter

        btnShow.setOnClickListener {
            //homePresenter.getUserDetails(etUserName.text.toString()) }
        homePresenter.getUserDetails(user = String()) }

}
    override fun showError(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_LONG).show()}

    override fun showResults(result: List<UserDat>) {
        UserAdapter.setData(result)
    }
     }
