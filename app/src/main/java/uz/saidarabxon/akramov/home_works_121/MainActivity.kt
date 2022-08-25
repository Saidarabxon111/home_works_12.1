package uz.saidarabxon.akramov.homework12_1

import android.os.Bundle

import androidx.appcompat.app.AppCompatActivity

import uz.saidarabxon.akramov.adapter.MyExpendAdapter
import uz.saidarabxon.akramov.home_works_121.R
import uz.saidarabxon.akramov.home_works_121.TogriClass
import uz.saidarabxon.akramov.home_works_121.databinding.ActivityMainBinding



class MainActivity : AppCompatActivity() {


    lateinit var map: HashMap<String, ArrayList<TogriClass>>
    lateinit var titleList: ArrayList<String>
    lateinit var myExpendAdapter: MyExpendAdapter
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)



        loadData()

        myExpendAdapter = MyExpendAdapter(map, titleList)
        binding.expendListView.setAdapter(myExpendAdapter)

    }

    private fun loadData() {


        map = HashMap()
        titleList = ArrayList()

        titleList.add("Mevalar")
        val realList = arrayListOf(
            TogriClass("Olma", R.drawable.apple),
            TogriClass("Mango", R.drawable.mango),
            TogriClass("Banan", R.drawable.banana),
            TogriClass("Apelsin", R.drawable.oreng)
        )




        titleList.add("Gullar")
        var barcaList = arrayListOf(
            TogriClass("Lola", R.drawable.lola),
            TogriClass("Atirgul", R.drawable.atirgul),
            TogriClass("Nastarin", R.drawable.nastarin),
            TogriClass("Boychechak", R.drawable.boychechak)
        )
        titleList.add("Animals")
        val animList = arrayListOf(
            TogriClass("Lion",R.drawable.lola),
            TogriClass("Camel",R.drawable.banana),
            TogriClass("Tiger",R.drawable.atirgul),
            TogriClass("Cow",R.drawable.oreng),
        )

        titleList.add("Birds")
        val birds = arrayListOf(
            TogriClass("Lion",R.drawable.lola),
            TogriClass("Camel",R.drawable.banana),
            TogriClass("Tiger",R.drawable.atirgul),
            TogriClass("Cow",R.drawable.oreng),
        )



        map[titleList[0]] = realList
        map[titleList[1]] = barcaList
        map[titleList[2]]=animList
        map[titleList[3]]=birds


    }
}