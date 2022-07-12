package com.example.demo.bookstore.controller;

import com.example.demo.bookstore.Book;
import com.example.demo.bookstore.service.AdminService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


@Controller
@RequestMapping("/admin")
@AllArgsConstructor
public class AdminController {


    private final AdminService adminService;

    @GetMapping("")
    public String adminHomePage(Model model){
        Book book=new Book();
        model.addAttribute("book", book);
        return "index";
    }


    @RequestMapping("/save")
    public String saveBook(@ModelAttribute("book") Book book, RedirectAttributes redirectAttributes){
         adminService.addBook(book);
        redirectAttributes.addFlashAttribute("message", "Successful!");
         return "redirect:/admin";

    }

}
