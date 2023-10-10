package com.example.botnavlayout.ui.files;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.botnavlayout.databinding.FragmentNavigationFilesBinding;
import com.example.botnavlayout.ui.dashboard.DashboardViewModel;

import java.io.File;

public class FilesFragment extends Fragment {

    private FragmentNavigationFilesBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        FilesViewModel filesViewModel =
                new ViewModelProvider(this).get(FilesViewModel.class);

        binding = FragmentNavigationFilesBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textFiles;
        filesViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}