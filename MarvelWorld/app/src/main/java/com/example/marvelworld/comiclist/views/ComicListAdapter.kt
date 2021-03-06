package com.example.marvelworld.comiclist.views

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.marvelworld.R
import com.example.marvelworld.comiclist.models.Comic
import com.squareup.picasso.Picasso

class ComicListAdapter(
    private val comicList: List<Comic>
) : RecyclerView.Adapter<ComicListAdapter.ComicViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ComicViewHolder {
        val view = LayoutInflater
            .from(parent.context)
            .inflate(R.layout.comic_list_item, parent, false)

        return ComicViewHolder(view)
    }

    override fun onBindViewHolder(holder: ComicViewHolder, position: Int) {
        val comic = comicList[position]
        holder.bind(comic)
    }

    override fun getItemCount() = comicList.size

    class ComicViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        private val image: ImageView = view.findViewById(R.id.img_comic_list_item)
        private val title: TextView = view.findViewById(R.id.title_comic_list_item)

        fun bind(comic: Comic) {
            val path = comic.thumbnail.getImagePath()
            Picasso.get().load(path).into(image)
            title.text = comic.title
        }
    }
}