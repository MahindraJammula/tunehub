package com.example.demo.services;

import java.util.List;

import com.example.demo.entites.Playlist;
import com.example.demo.entites.Users;

public interface PlaylistService {
	public void addPlaylist(Playlist playlist);

	public List<Playlist> fetchAllPlaylists();
}
