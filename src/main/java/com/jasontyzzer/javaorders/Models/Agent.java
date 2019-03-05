package com.jasontyzzer.javaorders.Models;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
@Table(name = "agents")
public class Agent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long agentcode;

    private String agentname, workingarea, phone, country;
    private double commission;

    @OneToMany(cascade = CascadeType.REMOVE, mappedBy = "agent")
    private Set<Customer> customers;

    @OneToMany(cascade = CascadeType.REMOVE, mappedBy = "agent")
    private Set<Order> orders;

    public Agent() {
    }
}
