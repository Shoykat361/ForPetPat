package com.shoykat.forpetpat.Adapter

import android.provider.ContactsContract.RawContacts
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.shoykat.forpetpat.RawData
import com.shoykat.forpetpat.databinding.RowLayoutBinding

class HomeAdapter(private val imageList: List<RawData>) : RecyclerView.Adapter<HomeAdapter.ImageViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = RowLayoutBinding.inflate(inflater, parent, false)
        return ImageViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ImageViewHolder, position: Int) {
        val imageData = imageList[position]
        holder.bind(imageData)
    }

    override fun getItemCount(): Int {
        return imageList.size
    }

    inner class ImageViewHolder(private val binding: RowLayoutBinding) : RecyclerView.ViewHolder(binding.root) {

        fun bind(imageData: RawData) {
            //binding.imageData = imageData
            //binding.executePendingBindings()
        }
    }
}