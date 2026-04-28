package com.backend.agrilink.service;

import com.backend.agrilink.model.Payment;
import com.backend.agrilink.repository.PaymentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PaymentService {

    private final PaymentRepository repository;

    public Payment processPayment(Payment payment) {

        // simulação de pagamento
        payment.setStatus("PAGO");

        return repository.save(payment);
    }

    public Payment findById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Pagamento não encontrado"));
    }
}