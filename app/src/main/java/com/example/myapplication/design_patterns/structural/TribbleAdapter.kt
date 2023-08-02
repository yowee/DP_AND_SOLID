package com.example.myapplication.design_patterns.structural

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.myapplication.R

class TribbleAdapter(private val tribbles: List<Tribble>) : RecyclerView.Adapter<TribbleAdapter.TribbleViewHolder>() {

    private fun TribbleViewHolder(view: View?): TribbleViewHolder {
       return TribbleViewHolder(view)
    }

    override fun onBindViewHolder(viewHolder: TribbleViewHolder, itemIndex: Int) {
        viewHolder.bind(tribbles[itemIndex])
    }

    override fun getItemCount() = tribbles.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TribbleViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.row_tribble, parent, false)
        return TribbleViewHolder(view)
    }

    class TribbleViewHolder(view: View, itemView: View) : ViewHolder(itemView) {
        fun bind(tribble: Tribble) {

        }
    }
}

class Tribble {

}
