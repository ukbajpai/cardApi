package com.abhiyukti.cardapi.CardApi.Services;

import java.util.ArrayList;
import java.util.List;

import com.abhiyukti.cardapi.CardApi.CardEntity.NodeEntries;
import com.abhiyukti.cardapi.CardApi.Repository.CardApiRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NodeEntriesServices{
    @Autowired
    private CardApiRepository cardApiRepo;

    public List<NodeEntries> findAll(){
        List<NodeEntries> nodeRow = new ArrayList<>();
        cardApiRepo.findAll().forEach(nodeRow :: add);
        return nodeRow;
    }

    public List<NodeEntries> findByParent(String parentId) {
         List<NodeEntries> nodeRow = new ArrayList<>();
        cardApiRepo.findByParent(parentId).forEach(nodeRow :: add);
        return nodeRow;
    }
}