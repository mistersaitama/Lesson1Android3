package kg.geektech.lesson1android3;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import kg.geektech.lesson1android3.data.models.Film;
import kg.geektech.lesson1android3.databinding.FragmentFilmDetailFragmentBinding;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class FilmDetailFragment extends Fragment {

    private FragmentFilmDetailFragmentBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
      binding = FragmentFilmDetailFragmentBinding.inflate(getLayoutInflater());
        return binding.getRoot();

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        App.api.getFilmById(getArguments().getString("id")).enqueue(new Callback<Film>() {
            @Override
            public void onResponse(Call<Film> call, Response<Film> response) {
        if (response.isSuccessful() && response.body() != null){
            binding.tvTitle.setText(response.body().getTitle());
            binding.tvOriginalTitle.setText(response.body().getOriginalTitle());
            binding.tvDescription.setText(response.body().getDescription());
            binding.tvDirector.setText(response.body().getDirector());
            binding.tvProducer.setText(response.body().getProducer());
            binding.tvReleaseDate.setText(response.body().getRelease_date());

        }
            }
            @Override
            public void onFailure(Call<Film> call, Throwable t) {

            }
        });
    }
}