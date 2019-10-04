package com.example.viewpager.adapter;


import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.example.viewpager.models.Album;

import java.util.List;


public class AlbumAdapter extends FragmentStatePagerAdapter {
    //atributos
    private List<Album> listaDeAlbum;

    public AlbumAdapter(FragmentManager fm, List<Album> listaDeAlbum) {
        super(fm);
        this.listaDeAlbum = listaDeAlbum;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return listaDeAlbum.get(position).getNomeAlbum();
    }

    @Override
    public Fragment getItem(int i) {
        return listaDeAlbum.get(i).getFragment();
    }

    @Override
    public int getCount() {
        return listaDeAlbum.size();
    }
}
