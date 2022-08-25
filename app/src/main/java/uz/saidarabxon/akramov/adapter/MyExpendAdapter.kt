package uz.saidarabxon.akramov.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseExpandableListAdapter
import uz.saidarabxon.akramov.home_works_121.TogriClass
import uz.saidarabxon.akramov.home_works_121.databinding.ItemChildBinding
import uz.saidarabxon.akramov.home_works_121.databinding.ItemGroupBinding


class MyExpendAdapter(
    private val map: HashMap<String, ArrayList<TogriClass>>, val titleList: ArrayList<String>)
    : BaseExpandableListAdapter() {
    override fun getGroupCount(): Int {
        return titleList.size
    }

    override fun getChildrenCount(p0: Int): Int {
        val group = titleList[p0]
        val childList = map[group]

        return childList?.size!!
    }

    override fun getGroup(p0: Int): Any {
        val group = titleList[p0]
        return group

    }

    override fun getChild(p0: Int, p1: Int): Any {
        val group = titleList[p0]
        val childList = map[group]

        return childList?.get(p1)!!
    }

    override fun getGroupId(p0: Int): Long {
        return p0.toLong()

    }

    override fun getChildId(p0: Int, p1: Int): Long {
        return p1.toLong()
    }

    override fun hasStableIds(): Boolean {
        return true

    }

    override fun getGroupView(
        p0: Int,
        isExpanded: Boolean,
        convertView: View?,
        p3: ViewGroup?
    ): View {
        val itemGroup = ItemGroupBinding.inflate(LayoutInflater.from(p3?.context), p3, false)

        itemGroup.tvItemGroup.text = titleList[p0]

        return itemGroup.root
    }

    override fun getChildView(
        p0: Int,
        p1: Int,
        isLastChild: Boolean,
        convertView: View?,
        p4: ViewGroup?
    ): View {
        val itemChildB = ItemChildBinding.inflate(LayoutInflater.from(p4?.context), p4, false)

        val group = titleList[p0]
        val childList = map[group]

        itemChildB.tvItemChild.text = childList?.get(p1)?.text
        itemChildB.imageItem.setImageResource(childList?.get(p1)?.image!!)


        return itemChildB.root
    }

    override fun isChildSelectable(p0: Int, childPosition: Int): Boolean {
        return true
    }
}