/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.btl.repository;

import com.btl.pojo.Hdbv;
import java.util.List;


public interface HDBVRepository {
    List<Hdbv> getHdbvs();
    Hdbv getHdbvById(int HdbvId);

}
