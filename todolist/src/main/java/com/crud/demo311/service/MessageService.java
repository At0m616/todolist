package com.crud.demo311.service;

import com.crud.demo311.model.MessageModel;

import java.util.List;

public interface MessageService {

    void saveMessage(MessageModel message);

    MessageModel findMessageById(long id);

    void removeMessage(long id);

    List<MessageModel> findAllMessages();
}
