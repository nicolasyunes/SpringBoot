package com.informatorio.emplmanager.repository;

import com.informatorio.emplmanager.entity.producto;
import org.springframework.data.jpa.repository.JpaRespository;
import org.springframework.stereotype.Respository;


@Respository 

public interface ProductRespository extends JpaRespository<producto, Long> { 
    
    


}