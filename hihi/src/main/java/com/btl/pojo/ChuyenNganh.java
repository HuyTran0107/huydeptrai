/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.btl.pojo;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author ManhHuy
 */
@Entity
@Table(name = "chuyen_nganh")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ChuyenNganh.findAll", query = "SELECT c FROM ChuyenNganh c"),
    @NamedQuery(name = "ChuyenNganh.findById", query = "SELECT c FROM ChuyenNganh c WHERE c.id = :id"),
    @NamedQuery(name = "ChuyenNganh.findByTenChuyenNganh", query = "SELECT c FROM ChuyenNganh c WHERE c.tenChuyenNganh = :tenChuyenNganh")})
public class ChuyenNganh implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "tenChuyenNganh")
    private String tenChuyenNganh;
    @OneToMany(mappedBy = "chuyennganh")
    private Collection<Sinhvien> sinhvienCollection;

    public ChuyenNganh() {
    }

    public ChuyenNganh(Integer id) {
        this.id = id;
    }

    public ChuyenNganh(Integer id, String tenChuyenNganh) {
        this.id = id;
        this.tenChuyenNganh = tenChuyenNganh;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTenChuyenNganh() {
        return tenChuyenNganh;
    }

    public void setTenChuyenNganh(String tenChuyenNganh) {
        this.tenChuyenNganh = tenChuyenNganh;
    }

    @XmlTransient
    public Collection<Sinhvien> getSinhvienCollection() {
        return sinhvienCollection;
    }

    public void setSinhvienCollection(Collection<Sinhvien> sinhvienCollection) {
        this.sinhvienCollection = sinhvienCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ChuyenNganh)) {
            return false;
        }
        ChuyenNganh other = (ChuyenNganh) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.btl.pojo.ChuyenNganh[ id=" + id + " ]";
    }
    
}
