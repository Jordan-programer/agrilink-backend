package com.backend.agrilink.model;

import java.time.LocalDate;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "transportes")
@Data
public class Transport {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private UUID transportadorId;

    private String status;

    private LocalDate dataPartida;
    
    private String origem;

    private String destino;

    private LocalDate dataChegada;

    /**
     * @return Long return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return UUID return the transportadorId
     */
    public UUID getTransportadorId() {
        return transportadorId;
    }

    /**
     * @param transportadorId the transportadorId to set
     */
    public void setTransportadorId(UUID transportadorId) {
        this.transportadorId = transportadorId;
    }

    /**
     * @return String return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return LocalDate return the dataPartida
     */
    public LocalDate getDataPartida() {
        return dataPartida;
    }

    /**
     * @param dataPartida the dataPartida to set
     */
    public void setDataPartida(LocalDate dataPartida) {
        this.dataPartida = dataPartida;
    }

    /**
     * @return String return the origem
     */
    public String getOrigem() {
        return origem;
    }

    /**
     * @param origem the origem to set
     */
    public void setOrigem(String origem) {
        this.origem = origem;
    }

    /**
     * @return String return the destino
     */
    public String getDestino() {
        return destino;
    }

    /**
     * @param destino the destino to set
     */
    public void setDestino(String destino) {
        this.destino = destino;
    }

    /**
     * @return LocalDate return the dataChegada
     */
    public LocalDate getDataChegada() {
        return dataChegada;
    }

    /**
     * @param dataChegada the dataChegada to set
     */
    public void setDataChegada(LocalDate dataChegada) {
        this.dataChegada = dataChegada;
    }

}
