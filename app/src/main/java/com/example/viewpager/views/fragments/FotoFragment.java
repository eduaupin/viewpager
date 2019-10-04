package com.example.viewpager.views.fragments;


import android.graphics.drawable.Drawable;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.viewpager.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class FotoFragment extends Fragment {
    private static final String NOME = "nome";
    private static final String IMAGEM = "imagem";
    private TextView nomeAlbum;
    private ImageView imageAlbum;

    public FotoFragment() {
        // Required empty public constructor
    }

    public static Fragment newInstance(int imagem, String nomeAlbum) {

       //declarar fragmento que vai ser retornado (this)
        FotoFragment fotoFragment = new FotoFragment();
        Bundle bundle = new Bundle();
        bundle.putInt(IMAGEM, imagem);
        bundle.putString(NOME, nomeAlbum);
        fotoFragment.setArguments(bundle);

        return fotoFragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_foto, container, false);
        initViews(view);

        if(getArguments() != null){

            int imagemRecebida = getArguments().getInt(IMAGEM);
            String nomeRecebido = getArguments().getString(NOME);

            Drawable drawable = getResources().getDrawable(imagemRecebida);

            imageAlbum.setImageDrawable(drawable);
            nomeAlbum.setText(nomeRecebido);
        }

        return view;
    }

    public void initViews(View view){
        nomeAlbum = view.findViewById(R.id.nomeAlbum);
        imageAlbum = view.findViewById(R.id.imagemAlbum);
    }

}
