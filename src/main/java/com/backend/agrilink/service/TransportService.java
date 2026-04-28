package com.backend.agrilink.service;

import com.backend.agrilink.model.Transport;
import com.backend.agrilink.repository.TransportRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TransportService {

    private final TransportRepository repository;

    public Transport save(Transport transport) {
        transport.setStatus("PENDENTE");
        return repository.save(transport);
    }

    public List<Transport> findAll() {
        return repository.findAll();
    }
}
