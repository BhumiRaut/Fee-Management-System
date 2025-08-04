package com.feesystem.FeeManager;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class FeeRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double totalFee;

    private Double paidFee;

    private LocalDate paymentDate;

    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;


    public Long getId() { return id; }

    public Double getTotalFee() { return totalFee; }
    public void setTotalFee(Double totalFee) { this.totalFee = totalFee; }

    public Double getPaidFee() { return paidFee; }                // ✅ Getter
    public void setPaidFee(Double paidFee) { this.paidFee = paidFee; }  // ✅ Setter

    public LocalDate getPaymentDate() { return paymentDate; }
    public void setPaymentDate(LocalDate paymentDate) { this.paymentDate = paymentDate; }

    public Student getStudent() { return student; }
    public void setStudent(Student student) { this.student = student; }
}
