package com.example.goldenticket.Activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.goldenticket.R
import kotlinx.android.synthetic.main.activity_search.*

class SearchActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_search)

        /*var tagList: ArrayList<String> = ArrayList()
        tagList.add("공포"); tagList.add("블루스퀘어"); tagList.add("세종문화회관");
        tagList.add("판타지"); tagList.add("스릴러"); tagList.add("예술의전당"); tagList.add("충무아트센터");
        tagList.add("로맨스");

        rv_search_tags.adapter = SearchTagsRVAdapter(this, tagList)
        rv_search_tags.layoutManager = StaggeredGridLayoutManager(3, StaggeredGridLayoutManager.HORIZONTAL)*/

        setOnClickListener()
    }

    private fun setOnClickListener() {
        ibtn_search_pre.setOnClickListener {
            finish()
        }
        ibtn_search_submit.setOnClickListener() {
            //1안
            val intent = Intent(this, SearchResultActivity::class.java)
            Log.e("SearchActivity::", "onClickListener::ibtn_search_submit::" + et_search_searchbar.text.toString())
            intent.putExtra("search_tag", et_search_searchbar.text.toString())
            startActivity(intent)
        }
        tv_search_cancel.setOnClickListener {
            finish()
        }

        //clean-code,,,,,please,,
        tv_search_tag1.setOnClickListener {
            //1안
            val intent = Intent(this, SearchResultActivity::class.java)
            intent.putExtra("search_tag", tv_search_tag1.text)
            startActivity(intent)
            //2안 == 검색통신 여기서하고 putExtra(결과)
        }
        tv_search_tag2.setOnClickListener {

        }
        tv_search_tag3.setOnClickListener {

        }
        tv_search_tag4.setOnClickListener {

        }
        tv_search_tag5.setOnClickListener {

        }
        tv_search_tag6.setOnClickListener {

        }
        tv_search_tag7.setOnClickListener {

        }
        tv_search_tag8.setOnClickListener {

        }
        tv_search_tag9.setOnClickListener {

        }
        tv_search_tag0.setOnClickListener {

        }

        //추천 검색어 onclick 시, 검색기능 처리

    }
}
