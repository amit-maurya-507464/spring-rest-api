package com.tejbhan.Spring.Rest.API;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class Controller {

    @Autowired
    private ContactUsRepo contactUsRepo;

    @PostMapping("saveContactUs")
    public ContactUs saveContactUs(@RequestBody ContactUs contactUs) {
        return contactUsRepo.save(contactUs);
    }

    @GetMapping("getContactUs")
    public ContactUs getContactUs(@RequestParam Long id) {
        Optional<ContactUs> data = contactUsRepo.findById(id);
        return data.orElse(null);
    }

    @GetMapping("getAllContactUs")
    public List<ContactUs> getAllContactUs() {
        return contactUsRepo.findAll();
    }
}
