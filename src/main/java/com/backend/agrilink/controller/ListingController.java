package com.backend.agrilink.controller;

import com.backend.agrilink.model.Listing;
import com.backend.agrilink.service.ListingService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/listings")
@RequiredArgsConstructor
@CrossOrigin("*")
public class ListingController {

    private final ListingService service;

    @PostMapping
    public ResponseEntity<Listing> create(@RequestBody Listing listing) {
        return ResponseEntity.ok(service.save(listing));
    }

    @GetMapping
    public ResponseEntity<List<Listing>> getAll() {
        return ResponseEntity.ok(service.findAll());
    }

    @GetMapping("/province/{provincia}")
    public ResponseEntity<List<Listing>> byProvince(@PathVariable String provincia) {
        return ResponseEntity.ok(service.findByProvincia(provincia));
    }
}