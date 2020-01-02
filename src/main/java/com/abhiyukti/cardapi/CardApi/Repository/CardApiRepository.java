package com.abhiyukti.cardapi.CardApi.Repository;

import org.springframework.data.repository.CrudRepository;


import com.abhiyukti.cardapi.CardApi.CardEntity.NodeEntries;

public interface CardApiRepository extends CrudRepository<NodeEntries, String>{

}