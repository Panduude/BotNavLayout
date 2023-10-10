package com.example.botnavlayout.ui.photos;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.botnavlayout.databinding.FragmentNavigationPhotosBinding;
import com.example.botnavlayout.ui.photos.PhotosViewModel;

public class PhotosFragment extends Fragment {

    private FragmentNavigationPhotosBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        PhotosViewModel photosViewModel =
                new ViewModelProvider(this).get(PhotosViewModel.class);

        binding = FragmentNavigationPhotosBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textPhotos;
        photosViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}