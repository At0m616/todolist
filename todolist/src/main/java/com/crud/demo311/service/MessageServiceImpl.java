package com.crud.demo311.service;

import com.crud.demo311.dao.MessageDao;
import com.crud.demo311.model.MessageModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageServiceImpl implements MessageService{

    private final MessageDao messageDao;

    @Autowired
    public MessageServiceImpl(MessageDao messageDao) {
        this.messageDao = messageDao;
    }

    @Override
    public void saveMessage(MessageModel message) {
        messageDao.save(message);
    }

    @Override
    public MessageModel findMessageById(long id) {
        return messageDao.getById(id);
    }

    @Override
    public void removeMessage(long id) {
        messageDao.delete(findMessageById(id));
    }

    @Override
    public List<MessageModel> findAllMessages() {
        return messageDao.findAll();
    }
}
