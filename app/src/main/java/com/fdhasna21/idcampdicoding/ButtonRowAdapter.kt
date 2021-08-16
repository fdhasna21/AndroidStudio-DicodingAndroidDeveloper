package com.fdhasna21.idcampdicoding

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.fdhasna21.idcampdicoding.databinding.ButtonRowAdapterBinding
import com.fdhasna21.idcampdicoding.modul.ModulDataClass
import java.util.ArrayList

class ButtonRowAdapter(val data : ArrayList<ModulDataClass>, val context: Context)
    : RecyclerView.Adapter<ButtonRowAdapter.ViewHolder>() {

    class ViewHolder(val binding: ButtonRowAdapterBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            ButtonRowAdapterBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = data[position]
        holder.binding.rowButton.text = item.name
        holder.binding.rowButton.setOnClickListener {
            context.startActivity(Intent(context, item.className::class.java))
        }
    }

    override fun getItemCount(): Int {
        return data.size
    }
}
