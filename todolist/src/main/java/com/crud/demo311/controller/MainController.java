package com.crud.demo311.controller;

import com.crud.demo311.model.MessageModel;
import com.crud.demo311.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class MainController {

    private final MessageService messageService;

    @Autowired
    public MainController(MessageService messageService) {
        this.messageService = messageService;
    }

    @GetMapping("/")
    public String getAllMessage(Model model){
        model.addAttribute("message", new MessageModel());

        List<MessageModel> listMessages = messageService.findAllMessages();
        model.addAttribute("listMessages", listMessages);
        return "index";
    }

    @PostMapping("/")
    public String saveMessage(MessageModel message){
        messageService.saveMessage(message);
        return "redirect:";
    }

    @PostMapping("/{id}")
    public String deleteMessage(@PathVariable("id") int id){
        messageService.removeMessage(id);
        return "redirect:";
    }
}
