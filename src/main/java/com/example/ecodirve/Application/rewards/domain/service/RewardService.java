package com.example.ecodirve.Application.rewards.domain.service;

import com.example.ecodirve.Application.rewards.domain.model.Reward;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface RewardService {
    List<Reward> getAll();
    Page<Reward> getAll(Pageable pageable);
    List<Reward> getRewardByScore(Double score);
    List<Reward> getRewardsByFleetId(Long fleetId);
    Reward getNameAndFleetId(String name,Long fleetId);
    Reward getByName(String name);
    Reward getById(Long rewardId);
    Reward create(Reward reward);
    Reward update(Long rewardId,Reward request);

    ResponseEntity<?> delete(Long rewardId);

}
