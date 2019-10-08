package com.example.recyclerviewex

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class ChapterAdapter(
    private val context: MainActivity,
    private val chatersList: ArrayList<String>
) :
    RecyclerView.Adapter<ChapterAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChapterAdapter.ViewHolder {
        //TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.item_layout,parent,false))
    }

    override fun getItemCount(): Int {
        //TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        return chatersList.size
    }

    override fun onBindViewHolder(holder: ChapterAdapter.ViewHolder, position: Int) {
        //TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        holder.chapterName?.text=chatersList.get(position)
    }

    class ViewHolder(view:View):RecyclerView.ViewHolder(view){

    }
}

/*class ChapterAdapter(private val context: MainActivity, private val chaptersList: ArrayList<String>) :
 RecyclerView.Adapter<ChapterAdapter.ViewHolder>() {

     override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
     return ViewHolder(LayoutInflater.from(context).inflate(R.layout.item_mindorks_chapters, parent, false))
     }
     override fun getItemCount(): Int {
     return chaptersList.size
     }
     override fun onBindViewHolder(holder: ViewHolder, position: Int) {
     holder.chapterName?.text = chaptersList.get(position)
     holder.itemView.setOnClickListener {
     Toast.makeText(context, chaptersList.get(position), Toast.LENGTH_LONG).show()
     }
     }
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val chapterName = view.tvChapterName
 }

}*/