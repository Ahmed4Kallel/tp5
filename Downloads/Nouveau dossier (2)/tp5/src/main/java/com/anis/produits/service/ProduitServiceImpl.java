package com.anis.produits.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import com.anis.produits.entities.Produit;
import com.anis.produits.repo.ProduitRepository;



@Service
public  class ProduitServiceImpl implements ProduitService{
	@Autowired
	ProduitRepository produitRepository;
	@Override
	public Produit saveProduit(Produit p) {
		
	return produitRepository.save(p);
	}
	

	@Override
	public Produit updateProduit(Produit p) {
	return produitRepository.save(p);
	}
	
	
	@Override
	public void deleteProduit(Produit p) {
	produitRepository.delete(p);
	}
	
	
	@Override
	public void deleteProduitById(Long id) {
	produitRepository.deleteById(id);
	}
	
	@Override
	public Produit getProduit(Long id) {
	return produitRepository.findById(id).get();
	}
	
	
	@Override
	public List<Produit> getAllProduits() {
	return produitRepository.findAll();
	}
	
	//Added code Q5 --TP3
    @Override
    public Page<Produit> getAllProduitsParPage(int page, int size) {
        return produitRepository.findAll(PageRequest.of(page, size));
    }
}
