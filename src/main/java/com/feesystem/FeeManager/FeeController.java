package com.feesystem.FeeManager;

//package com.feesystem.FeeManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:3535/")
@RestController
@RequestMapping("/api")
public class FeeController {

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private FeeRecordRepository feeRecordRepository;

    // --- Student APIs ---

    @PostMapping("/students")
    public Student addStudent(@RequestBody Student student) {
        return studentRepository.save(student);
    }

    @GetMapping("/students")
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @PutMapping("/students/{id}")
    public Student updateStudent(@PathVariable Long id, @RequestBody Student updatedStudent) {
        Optional<Student> optionalStudent = studentRepository.findById(id);
        if (optionalStudent.isPresent()) {
            Student student = optionalStudent.get();
            student.setName(updatedStudent.getName());
            student.setEnrollmentNumber(updatedStudent.getEnrollmentNumber());
            student.setGender(updatedStudent.getGender());
            student.setAddress(updatedStudent.getAddress());
            student.setCaste(updatedStudent.getCaste());
            student.setYear(updatedStudent.getYear());
            return studentRepository.save(student);
        } else {
            return null;
        }
    }

    @DeleteMapping("/students/{id}")
    public void deleteStudent(@PathVariable Long id) {
        studentRepository.deleteById(id);
    }

    // --- FeeRecord APIs ---

    @PostMapping("/fees")
    public FeeRecord addFee(@RequestBody FeeRecord feeRecord) {
        return feeRecordRepository.save(feeRecord);
    }

    @GetMapping("/fees")
    public List<FeeRecord> getAllFees() {
        return feeRecordRepository.findAll();
    }

    @PutMapping("/fees/{id}")
    public FeeRecord updateFee(@PathVariable Long id, @RequestBody FeeRecord updatedFee) {
        Optional<FeeRecord> optionalFee = feeRecordRepository.findById(id);
        if (optionalFee.isPresent()) {
            FeeRecord fee = optionalFee.get();
            fee.setTotalFee(updatedFee.getTotalFee());
            fee.setPaymentDate(updatedFee.getPaymentDate());
            fee.setStudent(updatedFee.getStudent());
            return feeRecordRepository.save(fee);
        } else {
            return null;
        }
    }

    @DeleteMapping("/fees/{id}")
    public void deleteFee(@PathVariable Long id) {
        feeRecordRepository.deleteById(id);
    }
}

