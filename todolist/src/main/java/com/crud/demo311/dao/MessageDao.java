package com.crud.demo311.dao;

import com.crud.demo311.model.MessageModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MessageDao extends JpaRepository<MessageModel, Long> {

}
