package com.proje.proje;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyService {
    @Autowired
    private ProjeApplication.CompanyRepository companyRepository;

    public List<Company> getAllCompanies() {
        return companyRepository.findAll();
    }

    public Company getCompanyById(Long id) {
        return companyRepository.findById(id).orElse(null);
    }

    public Company createCompany(Company company) {
        return companyRepository.save(company);
    }

    public Company updateCompany(Long id, Company updatedCompany) {
        Company existingCompany = companyRepository.findById(id).orElse(null);
        if (existingCompany != null) {
            existingCompany.setName(updatedCompany.getName());
            return companyRepository.save(existingCompany);
        }
        return existingCompany;
    }

    public void deleteCompany(Long id) {
        companyRepository.deleteById(id);
    }
}

