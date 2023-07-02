package com.example.ecodirve.Application.rewards.mapping;

import com.example.ecodirve.Application.rewards.domain.model.Reward;
import com.example.ecodirve.Application.rewards.resource.CreateRewardResource;
import com.example.ecodirve.Application.rewards.resource.RewardResource;
import com.example.ecodirve.Application.rewards.resource.UpdateRewardResource;
import com.example.ecodirve.Shared.mapping.EnhancedModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.List;
@Component
@EnableAutoConfiguration
public class RewardMapper implements Serializable {
    @Autowired
    EnhancedModelMapper mapper;

    public RewardResource toResource(Reward model){
        return mapper.map(model, RewardResource.class);
    }

    public Page<RewardResource> modelListPage(List<Reward> modelList, Pageable pageable){
        return new PageImpl<>(mapper.mapList(modelList,RewardResource.class),pageable,modelList.size());
    }


    public Reward toModel(CreateRewardResource resource){
        return mapper.map(resource,Reward.class);

    }

    public Reward toModel(UpdateRewardResource resource){
        return mapper.map(resource,Reward.class);
    }


}