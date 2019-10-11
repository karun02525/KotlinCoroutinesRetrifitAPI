package com.kaju

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.kaju.model.UserData
import kotlinx.android.synthetic.main.post_item.view.*

class MainAdapter(var items: List<UserData>) : RecyclerView.Adapter<MainAdapter.PostHolder>() {
    override fun getItemCount() = items.size
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = PostHolder(LayoutInflater.from(parent.context).inflate(R.layout.post_item, parent, false))
    override fun onBindViewHolder(holder: PostHolder, position: Int) = holder.bind(items[position])

    inner class PostHolder(view: View) : RecyclerView.ViewHolder(view) {
        fun bind(item: UserData) = with(itemView) {
            postId.text = item.firstName
            postTitle.text = item.mobile
            postBody.text = item.uid
        }
    }
}