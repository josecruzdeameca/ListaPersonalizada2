package jose.cruz.listapersonalizada2

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.mi_tarjeta.view.*
import kotlinx.android.synthetic.main.mi_tarjeta.view.iv_1
import kotlinx.android.synthetic.main.mi_tarjeta.view.tv_descripcion
import kotlinx.android.synthetic.main.mi_tarjeta.view.tv_titulo
import kotlinx.android.synthetic.main.mi_tarjeta_2.view.*

class LugarAdapter(lugares:ArrayList<Lugar>, context:Context): RecyclerView.Adapter<LugarAdapter.ViewHolder>(){


    var lugares:ArrayList<Lugar>?=null
    var context:Context?=null

    init {
        this.lugares = lugares
        this.context = context
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val vistaLugar:View = LayoutInflater.from(context)
            .inflate(R.layout.mi_tarjeta, parent, false)
        val lugarViewHolder = ViewHolder(vistaLugar)
        vistaLugar.tag = lugarViewHolder
        return lugarViewHolder
    }

    override fun getItemCount(): Int {
        return lugares!!.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.nombre!!.text = lugares!![position].nombre
        holder.descripcion!!.text = lugares!![position].descripcion

        Picasso.get().load(lugares!![position].foto).into(holder.imagen)

    }

    class ViewHolder(vista:View):RecyclerView.ViewHolder(vista) {
        var imagen:ImageView?= null
        var nombre:TextView?=null
        var descripcion:TextView?=null

        init {
            imagen = vista.iv_1
            nombre = vista.tv_titulo
            descripcion = vista.tv_descripcion
        }

    }

}