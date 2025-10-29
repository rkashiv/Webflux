package com.example.reactivedemo.service; 
 
import com.example.reactivedemo.model.Product; 
import com.example.reactivedemo.repository.ProductRepository; 
import org.springframework.stereotype.Service; 
import reactor.core.publisher.Flux; 
import reactor.core.publisher.Mono; 
 
@Service 
public class ProductService { 
 
    private final ProductRepository repo; 
 
    public ProductService(ProductRepository repo) { 
        this.repo = repo; 
    } 
 
    public Flux<Product> getAll() { 
        return repo.findAll(); 
    } 
 
    public Mono<Product> getById(String id) { 
        return repo.findById(id); 
    } 
} 