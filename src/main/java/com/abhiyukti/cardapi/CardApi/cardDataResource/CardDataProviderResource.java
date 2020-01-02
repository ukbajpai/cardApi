package com.abhiyukti.cardapi.CardApi.cardDataResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import com.abhiyukti.cardapi.CardApi.CardEntity.NodeEntries;
import com.abhiyukti.cardapi.CardApi.Services.NodeEntriesServices;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class CardDataProviderResource{

    @Autowired
    private NodeEntriesServices service;

    @RequestMapping("/nodeEntries")
    public List<NodeEntries> findNodeEntries(){
        return service.findAll();
    }

    @RequestMapping("/nodeEntries/parent/{id}")
    public List<NodeEntries> findNodeEntriesByParent(@PathVariable String id){
        System.out.println("Parent Id "+id);
        return service.findByParent(id);
    }
}