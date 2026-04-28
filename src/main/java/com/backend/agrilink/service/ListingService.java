package com.backend.agrilink.service;

import com.backend.agrilink.model.Listing;
import com.backend.agrilink.repository.ListingRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ListingService {

    private final ListingRepository repository;

    public Listing save(Listing listing) {
        listing.setStatus("ATIVO");
        return repository.save(listing);
    }

    public List<Listing> findAll() {
        return repository.findAll();
    }

    public List<Listing> findByProvincia(String provincia) {
        return repository.findByProvincia(provincia);
    }
}