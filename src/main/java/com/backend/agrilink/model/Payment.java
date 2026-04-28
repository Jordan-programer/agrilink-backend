package com.backend.agrilink.model;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "pagamentos")
@Data
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long pedidoId;

    private String metodo;

    private String status;

    private Double valor;

    private UUID referencia;

    


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
     * @return Long return the pedidoId
     */
    public Long getPedidoId() {
        return pedidoId;
    }

    /**
     * @param pedidoId the pedidoId to set
     */
    public void setPedidoId(Long pedidoId) {
        this.pedidoId = pedidoId;
    }

    /**
     * @return String return the metodo
     */
    public String getMetodo() {
        return metodo;
    }

    /**
     * @param metodo the metodo to set
     */
    public void setMetodo(String metodo) {
        this.metodo = metodo;
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
     * @return Double return the valor
     */
    public Double getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(Double valor) {
        this.valor = valor;
    }

    /**
     * @return UUID return the referencia
     */
    public UUID getReferencia() {
        return referencia;
    }

    /**
     * @param referencia the referencia to set
     */
    public void setReferencia(UUID referencia) {
        this.referencia = referencia;
    }

}