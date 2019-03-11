package rguerrero.fragmentos

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        botonCambio.setOnClickListener{
            val transaccion = supportFragmentManager.beginTransaction()

            val fragmentoUno = PrimerFragmento()

            transaccion.replace(R.id.frameCambio,fragmentoUno)

            transaccion.addToBackStack(null)
            transaccion.commit()

        }
    }
}
