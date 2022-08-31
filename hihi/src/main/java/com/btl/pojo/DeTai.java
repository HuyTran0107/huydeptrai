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
@Table(name = "de_tai")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DeTai.findAll", query = "SELECT d FROM DeTai d"),
    @NamedQuery(name = "DeTai.findById", query = "SELECT d FROM DeTai d WHERE d.id = :id"),
    @NamedQuery(name = "DeTai.findByTenDeTai", query = "SELECT d FROM DeTai d WHERE d.tenDeTai = :tenDeTai"),
    @NamedQuery(name = "DeTai.findByMoTa", query = "SELECT d FROM DeTai d WHERE d.moTa = :moTa")})
public class DeTai implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "tenDeTai")
    private String tenDeTai;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "moTa")
    private String moTa;
    @OneToMany(mappedBy = "detai")
    private Collection<KhoaLuan> khoaLuanCollection;

    public DeTai() {
    }

    public DeTai(Integer id) {
        this.id = id;
    }

    public DeTai(Integer id, String tenDeTai, String moTa) {
        this.id = id;
        this.tenDeTai = tenDeTai;
        this.moTa = moTa;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTenDeTai() {
        return tenDeTai;
    }

    public void setTenDeTai(String tenDeTai) {
        this.tenDeTai = tenDeTai;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    @XmlTransient
    public Collection<KhoaLuan> getKhoaLuanCollection() {
        return khoaLuanCollection;
    }

    public void setKhoaLuanCollection(Collection<KhoaLuan> khoaLuanCollection) {
        this.khoaLuanCollection = khoaLuanCollection;
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
        if (!(object instanceof DeTai)) {
            return false;
        }
        DeTai other = (DeTai) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.btl.pojo.DeTai[ id=" + id + " ]";
    }
    
}
