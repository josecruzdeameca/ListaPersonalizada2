package jose.cruz.listapersonalizada2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val lugares = ArrayList<Lugar>()
        lugares.add(Lugar("Egipto","https://estaticos.muyhistoria.es/media/cache/1140x_thumb/uploads/images/gallery/5acf4e945bafe864573c9872/egipto0_0.jpg","Descripción"))
        lugares.add(Lugar("Egipto","https://estaticos.muyhistoria.es/media/cache/1140x_thumb/uploads/images/gallery/5acf4e945bafe864573c9872/egipto0_0.jpg","DescripciónDescripciónDescripciónDescripciónDescripciónDescripciónDescripciónDescripciónDescripciónDescripciónDescripciónDescripciónDescripciónDescripciónDescripciónDescripciónDescripciónDescripciónDescripciónDescripciónDescripciónDescripciónDescripciónDescripciónDescripciónDescripciónDescripciónDescripciónDescripciónDescripciónDescripciónDescripciónDescripciónDescripciónDescripciónDescripciónDescripciónDescripciónDescripciónDescripciónDescripción"))
        lugares.add(Lugar("Egipto","https://estaticos.muyhistoria.es/media/cache/1140x_thumb/uploads/images/gallery/5acf4e945bafe864573c9872/egipto0_0.jpg","Descripción"))
        lugares.add(Lugar("Egipto","https://estaticos.muyhistoria.es/media/cache/1140x_thumb/uploads/images/gallery/5acf4e945bafe864573c9872/egipto0_0.jpg","Descripción"))
        lugares.add(Lugar("Egipto","https://estaticos.muyhistoria.es/media/cache/1140x_thumb/uploads/images/gallery/5acf4e945bafe864573c9872/egipto0_0.jpg","Descripción"))
        lugares.add(Lugar("Egipto","https://estaticos.muyhistoria.es/media/cache/1140x_thumb/uploads/images/gallery/5acf4e945bafe864573c9872/egipto0_0.jpg","DescripciónDescripciónDescripciónDescripciónDescripciónDescripciónDescripciónDescripciónDescripciónDescripciónDescripciónDescripciónDescripciónDescripciónDescripciónDescripciónDescripciónDescripciónDescripciónDescripciónDescripciónDescripciónDescripciónDescripciónDescripciónDescripciónDescripciónDescripciónDescripciónDescripciónDescripciónDescripciónDescripciónDescripciónDescripciónDescripciónDescripciónDescripciónDescripciónDescripciónDescripción"))
        lugares.add(Lugar("Egipto","https://estaticos.muyhistoria.es/media/cache/1140x_thumb/uploads/images/gallery/5acf4e945bafe864573c9872/egipto0_0.jpg","Descripción"))
        lugares.add(Lugar("Egipto","https://estaticos.muyhistoria.es/media/cache/1140x_thumb/uploads/images/gallery/5acf4e945bafe864573c9872/egipto0_0.jpg","Descripción"))
        lugares.add(Lugar("Egipto","https://estaticos.muyhistoria.es/media/cache/1140x_thumb/uploads/images/gallery/5acf4e945bafe864573c9872/egipto0_0.jpg","Descripción"))
        lugares.add(Lugar("México","https://www.mexicodesconocido.com.mx/wp-content/uploads/2019/03/chic%C3%A9n-Itz%C3%A1_de-trabajo_IG.jpg","Descripción"))

        miRecycler.adapter = LugarAdapter(lugares = lugares, context = this)
        //miRecycler.layoutManager = GridLayoutManager(this,1,GridLayoutManager.VERTICAL,true)
        //miRecycler.layoutManager = StaggeredGridLayoutManager(3,StaggeredGridLayoutManager.VERTICAL)
        miRecycler.layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
    }
}
