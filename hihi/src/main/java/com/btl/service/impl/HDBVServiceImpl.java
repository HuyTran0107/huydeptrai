/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.btl.service.impl;

import com.btl.pojo.Hdbv;
import org.springframework.stereotype.Service;
import com.btl.repository.HDBVRepository;
import com.btl.service.HDBVService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;


@Service
public class HDBVServiceImpl implements HDBVService {

    @Autowired
    private HDBVRepository HDBVRepository;

    @Override
    public List<Hdbv> getHdbvs() {
        return this.HDBVRepository.getHdbvs();
    }

    @Override
    public Hdbv getHdbvById(int HdbvId) {
        return this.HDBVRepository.getHdbvById(HdbvId);
    }
}
