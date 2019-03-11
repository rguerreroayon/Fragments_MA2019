package rguerrero.fragmentos

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.FrameLayout
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var valor = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        botonCambio.setOnClickListener{

            if(valor){
                frameUno()
                valor = true

            }else frameDos()

            valor = false




        }
    }

    fun frameUno(){
        val transaccion = supportFragmentManager.beginTransaction()
        val fragmentoUno = PrimerFragmento()

        transaccion.replace(R.id.frameCambio,fragmentoUno)

        transaccion.addToBackStack(null)
        transaccion.commit()
    }

    fun frameDos(){
        val transaccion = supportFragmentManager.beginTransaction()
        val fragmentoDos = SegundoFragmento()

        transaccion.replace(R.id.frameCambio,fragmentoDos)

        transaccion.addToBackStack(null)
        transaccion.commit()
    }

}
