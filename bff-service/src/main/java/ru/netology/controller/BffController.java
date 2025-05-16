package ru.netology.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.netology.model.UserOrders;
import ru.netology.service.BffService;

@RestController
@RequestMapping("/api/site-bff")
public class BffController {
    @Autowired
    private BffService service;

    @GetMapping("/user/{userId}")
    public ResponseEntity<UserOrders> getById(@PathVariable int userId) {
        try {
            UserOrders userAndOrder = service.getById(userId);
            return new ResponseEntity<>(userAndOrder, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
