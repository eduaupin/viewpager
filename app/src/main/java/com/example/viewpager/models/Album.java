package com.example.viewpager.models;


import androidx.fragment.app.Fragment;

public class Album {
    //atributos
    private String nomeAlbum;
    private int imagemAlbum;
    private Fragment fragment;

    //construtores
    public Album(String nomeAlbum, int imagemAlbum, Fragment fragment) {
        this.nomeAlbum = nomeAlbum;
        this.imagemAlbum = imagemAlbum;
        this.fragment = fragment;
    }

    public Album(String nomeAlbum, Fragment fragment) {
        this.nomeAlbum = nomeAlbum;
        this.fragment = fragment;
    }

    public Album() {
    }

    //getters and settters

    public String getNomeAlbum() {
        return nomeAlbum;
    }

    public void setNomeAlbum(String nomeAlbum) {
        this.nomeAlbum = nomeAlbum;
    }

    public int getImagemAlbum() {
        return imagemAlbum;
    }

    public void setImagemAlbum(int imagemAlbum) {
        this.imagemAlbum = imagemAlbum;
    }

    public Fragment getFragment() {
        return fragment;
    }

    public void setFragment(Fragment fragment) {
        this.fragment = fragment;
    }
}
