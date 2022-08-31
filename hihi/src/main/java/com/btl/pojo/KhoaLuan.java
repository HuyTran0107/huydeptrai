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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author ManhHuy
 */
@Entity
@Table(name = "khoa_luan")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "KhoaLuan.findAll", query = "SELECT k FROM KhoaLuan k"),
    @NamedQuery(name = "KhoaLuan.findById", query = "SELECT k FROM KhoaLuan k WHERE k.id = :id"),
    @NamedQuery(name = "KhoaLuan.findByName", query = "SELECT k FROM KhoaLuan k WHERE k.name = :name"),
    @NamedQuery(name = "KhoaLuan.findByPrice", query = "SELECT k FROM KhoaLuan k WHERE k.price = :price")})
public class KhoaLuan implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "name")
    private String name;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "price")
    private Float price;
    @OneToMany(mappedBy = "khoaLuan")
    private Collection<Sinhvien> sinhvienCollection;
    @JoinColumn(name = "detai", referencedColumnName = "id")
    @ManyToOne
    private DeTai detai;
    @JoinColumn(name = "diem", referencedColumnName = "id")
    @ManyToOne
    private Diem diem;
    @JoinColumn(name = "hdbv", referencedColumnName = "id")
    @ManyToOne
    private Hdbv hdbv;
    @JoinColumn(name = "tieuchichamdiem", referencedColumnName = "id")
    @ManyToOne
    private TieuChiChamDiem tieuchichamdiem;

    public KhoaLuan() {
    }

    public KhoaLuan(Integer id) {
        this.id = id;
    }

    public KhoaLuan(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    @XmlTransient
    public Collection<Sinhvien> getSinhvienCollection() {
        return sinhvienCollection;
    }

    public void setSinhvienCollection(Collection<Sinhvien> sinhvienCollection) {
        this.sinhvienCollection = sinhvienCollection;
    }

    public DeTai getDetai() {
        return detai;
    }

    public void setDetai(DeTai detai) {
        this.detai = detai;
    }

    public Diem getDiem() {
        return diem;
    }

    public void setDiem(Diem diem) {
        this.diem = diem;
    }

    public Hdbv getHdbv() {
        return hdbv;
    }

    public void setHdbv(Hdbv hdbv) {
        this.hdbv = hdbv;
    }

    public TieuChiChamDiem getTieuchichamdiem() {
        return tieuchichamdiem;
    }

    public void setTieuchichamdiem(TieuChiChamDiem tieuchichamdiem) {
        this.tieuchichamdiem = tieuchichamdiem;
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
        if (!(object instanceof KhoaLuan)) {
            return false;
        }
        KhoaLuan other = (KhoaLuan) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.btl.pojo.KhoaLuan[ id=" + id + " ]";
    }
    
}
