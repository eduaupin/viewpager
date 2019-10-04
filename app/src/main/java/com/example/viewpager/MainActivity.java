package com.example.viewpager;

import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import com.example.viewpager.adapter.AlbumAdapter;
import com.example.viewpager.models.Album;
import com.example.viewpager.views.fragments.FotoFragment;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Album> listaAlbum = new ArrayList<>();

        listaAlbum.add(new Album("1st Studio Album",
                FotoFragment.newInstance(R.drawable.ff1, "1st Studio Album")));
        listaAlbum.add(new Album("Greatest Hits",
                FotoFragment.newInstance(R.drawable.ff2, "Greatest Hits")));
        listaAlbum.add(new Album("The Color and The Shape",
                FotoFragment.newInstance(R.drawable.ff3, "The Color and The Shape")));
        listaAlbum.add(new Album("Concret and Gold",
                FotoFragment.newInstance(R.drawable.ff4, "Concret and Gold")));

        AlbumAdapter adapter = new AlbumAdapter(getSupportFragmentManager(), listaAlbum);

        ViewPager viewPager = findViewById(R.id.viewPager);
        viewPager.setAdapter(adapter);

        TabLayout tabLayout = findViewById(R.id.tabs);
        viewPager.setOffscreenPageLimit(listaAlbum.size());
        tabLayout.setupWithViewPager(viewPager);
    }
}
