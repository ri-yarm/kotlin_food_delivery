package com.example.fooddelivery.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.ViewPager2
import com.example.fooddelivery.R

class ImageSliderAdapter(
    private val context: Context,
    private val imageList: ArrayList<Int>,
    private val viewPager2: ViewPager2
) : RecyclerView.Adapter<ImageSliderAdapter.ImageViewHolder>() {


    override fun onCreateViewHolder(
        parent: ViewGroup, viewType: Int
    ): ImageSliderAdapter.ImageViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.image_container, parent, false)

        return ImageViewHolder(view)
    }

    override fun onBindViewHolder(holder: ImageSliderAdapter.ImageViewHolder, position: Int) {
        holder.image.setImageResource(imageList[position])

//        если последний слайдер то вызывем функцию для бесконечной карусели
        if (position == imageList.size - 1) {
            viewPager2.post(runnable)
        }
    }

    override fun getItemCount(): Int {
        return imageList.size
    }

    class ImageViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val image = itemView.findViewById<ImageView>(R.id.image_in_image)
    }

    //    функция для вызова бесконечной карусели
    private val runnable = Runnable {
        imageList.addAll(imageList)
        notifyDataSetChanged()
    }

}