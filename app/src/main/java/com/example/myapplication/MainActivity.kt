package com.example.myapplication

import android.app.AlertDialog
import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import com.example.myapplication.ui.theme.MyApplicationTheme
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import com.example.myapplication.design_patterns.creational.DI.DependencyInjectionSample
//import com.example.myapplication.design_patterns.creational.DI.SomeClass
import com.example.myapplication.design_patterns.creational.Singleton
import com.example.myapplication.design_patterns.creational.factory.HostingPackageFactory
import com.example.myapplication.design_patterns.creational.factory.HostingPackageType
import com.google.firebase.crashlytics.buildtools.reloc.com.google.common.eventbus.EventBus
import javax.inject.Inject


//@AndroidEntryPoint
class MainActivity  @Inject constructor(val dependencyInjectionSample: DependencyInjectionSample) : ComponentActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    Column {


                        //Builder
                        builder()

                        //Dependency Injection
//                        SomeClass().doSomething()
//                        dependencyInjectionSample.print("Name")

                        //Singleton
                        Singleton.iAmInsideSingleton()

                        //Factory
                        val hostingServices =
                            HostingPackageFactory.getHostingFrom(HostingPackageType.Premium)
                                .getService()
                        Text(text = hostingServices.toString())

                        //Structural

                        //Command
                        EventBus().post(MySpecificEvent())
                        fun onEvent(event: MySpecificEvent?) {
                            /* Do something */
                        }


                    }
                }
            }
        }
    }

    fun builder(){
        AlertDialog.Builder(this)
            .setTitle("Sandwich Dialog")
            .setMessage("Please use the spicy mustard.")
            .setNegativeButton("No thanks") { dialogInterface, i ->
                // "No thanks" action
            }
            .setPositiveButton("OK") { dialogInterface, i ->
                // "OK" action
            }
            .show()

    }

    override fun onStart() {
        super.onStart()
        EventBus().register(this)
    }

    override fun onStop() {
        super.onStop()
        EventBus().unregister(this)
    }

//    @Subscribe(threadMode = ThreadMode.MAIN)
//    fun onEvent(event: MySpecificEvent?) {
//        /* Do something */
//    }

}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {

    Box(modifier = Modifier.fillMaxWidth()){
        Text(
            text = "Hello $name!",
            modifier = modifier
        )
    }


}



class MySpecificEvent { /* Additional fields if needed */ }

