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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author ManhHuy
 */
@Entity
@Table(name = "hdbv")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Hdbv.findAll", query = "SELECT h FROM Hdbv h"),
    @NamedQuery(name = "Hdbv.findById", query = "SELECT h FROM Hdbv h WHERE h.id = :id")})
public class Hdbv implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @JoinColumn(name = "chuTich", referencedColumnName = "id")
    @ManyToOne
    private Giangvien chuTich;
    @JoinColumn(name = "thuKy", referencedColumnName = "id")
    @ManyToOne
    private Giangvien thuKy;
    @JoinColumn(name = "phanBien", referencedColumnName = "id")
    @ManyToOne
    private Giangvien phanBien;
    @OneToMany(mappedBy = "hdbv")
    private Collection<KhoaLuan> khoaLuanCollection;

    public Hdbv() {
    }

    public Hdbv(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Giangvien getChuTich() {
        return chuTich;
    }

    public void setChuTich(Giangvien chuTich) {
        this.chuTich = chuTich;
    }

    public Giangvien getThuKy() {
        return thuKy;
    }

    public void setThuKy(Giangvien thuKy) {
        this.thuKy = thuKy;
    }

    public Giangvien getPhanBien() {
        return phanBien;
    }

    public void setPhanBien(Giangvien phanBien) {
        this.phanBien = phanBien;
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
        if (!(object instanceof Hdbv)) {
            return false;
        }
        Hdbv other = (Hdbv) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.btl.pojo.Hdbv[ id=" + id + " ]";
    }
    
}
