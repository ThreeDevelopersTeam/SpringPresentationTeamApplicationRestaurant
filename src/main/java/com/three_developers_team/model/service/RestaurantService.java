package com.three_developers_team.model.service;

import com.three_developers_team.model.entity.Restaurant;
import com.three_developers_team.model.repository.RestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RestaurantService {

    @Autowired
    private RestaurantRepository restaurantRepository;

    public List<Restaurant> findAll(){
        return restaurantRepository.findAll();
    }

    public Restaurant findById(Long id){
        Optional<Restaurant> restaurant = restaurantRepository.findById(id);
        return restaurant.orElse(new Restaurant());
    }

}
