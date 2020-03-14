package dev.fujioka.quarkus.demo.service;

import java.util.List;
import java.util.Optional;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import dev.fujioka.quarkus.demo.domain.Product;
import dev.fujioka.quarkus.demo.repository.ProductRepository;

@ApplicationScoped
public class ProductService implements CrudService<Product> {

    @Inject
     ProductRepository productRepository;

    public List<Product> findAll() {
        return productRepository.findAll();
    }


    public Optional<Product> save(Product entity) {
        return Optional.ofNullable(productRepository.save(entity));
    }


    public Optional<Product> findById(long id) {
        return productRepository.findById(id);
    }


    public void delete(Product entity) {
        productRepository.delete(entity);
    }


    public void deleteById(long id) {
         productRepository.deleteById(id);
    }


    public long count() {
        return productRepository.count();
    }
}
