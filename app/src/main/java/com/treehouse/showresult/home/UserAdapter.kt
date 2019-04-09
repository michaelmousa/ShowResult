package com.treehouse.showresult.home

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.treehouse.showresult.R
import com.treehouse.showresult.model.UserDat

class UserAdapter : RecyclerView.Adapter<UserAdapter.RanViewHolder>() {


    private val data = arrayListOf<UserDat>()

    fun setData(data: List<UserDat>) {
        this.data.clear()
        this.data.addAll(data)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RanViewHolder {
        val rootView = LayoutInflater.from(parent.context).inflate(R.layout.item_pass, parent, false)
        return RanViewHolder(rootView)
    }

    override fun getItemCount(): Int { return data.size }

    override fun onBindViewHolder(viewHolder: RanViewHolder, position: Int)
    { viewHolder.bind(data[position]) }

    class RanViewHolder(private val rootView: View) : RecyclerView.ViewHolder(rootView) {

        fun bind(data: UserDat) {

            val tvUserName =rootView.findViewById<TextView>(R.id.tvUserName)
            tvUserName.text= data.username
            val tvName =rootView.findViewById<TextView>(R.id.tvName)
            tvName.text= data.name
            val tvId =rootView.findViewById<TextView>(R.id.tvId)
            tvId.text= data.id
            val tvEmail =rootView.findViewById<TextView>(R.id.tvEmail)
            tvEmail.text= data.email
            val tvPhone =rootView.findViewById<TextView>(R.id.tvPhone)
            tvPhone.text= data.phone
            val tvWebsite =rootView.findViewById<TextView>(R.id.tvWebsite)
            tvWebsite.text= data.website
            val tvStreet =rootView.findViewById<TextView>(R.id.tvStreet)
            tvStreet.text= data.company.bs
            val tvStree =rootView.findViewById<TextView>(R.id.tvStree)
            tvStree.text= data.company.catchPhrase
            val tvStre =rootView.findViewById<TextView>(R.id.tvStre)
            tvStre.text= data.company.name
            val tvStr =rootView.findViewById<TextView>(R.id.tvStr)
            tvStr.text= data.address.city

        }
    }
}