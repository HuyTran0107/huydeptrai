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
@Table(name = "tieu_chi_cham_diem")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TieuChiChamDiem.findAll", query = "SELECT t FROM TieuChiChamDiem t"),
    @NamedQuery(name = "TieuChiChamDiem.findById", query = "SELECT t FROM TieuChiChamDiem t WHERE t.id = :id"),
    @NamedQuery(name = "TieuChiChamDiem.findByTenTieuChi", query = "SELECT t FROM TieuChiChamDiem t WHERE t.tenTieuChi = :tenTieuChi")})
public class TieuChiChamDiem implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "tenTieuChi")
    private String tenTieuChi;
    @OneToMany(mappedBy = "tieuchichamdiem")
    private Collection<KhoaLuan> khoaLuanCollection;

    public TieuChiChamDiem() {
    }

    public TieuChiChamDiem(Integer id) {
        this.id = id;
    }

    public TieuChiChamDiem(Integer id, String tenTieuChi) {
        this.id = id;
        this.tenTieuChi = tenTieuChi;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTenTieuChi() {
        return tenTieuChi;
    }

    public void setTenTieuChi(String tenTieuChi) {
        this.tenTieuChi = tenTieuChi;
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
        if (!(object instanceof TieuChiChamDiem)) {
            return false;
        }
        TieuChiChamDiem other = (TieuChiChamDiem) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.btl.pojo.TieuChiChamDiem[ id=" + id + " ]";
    }
    
}
