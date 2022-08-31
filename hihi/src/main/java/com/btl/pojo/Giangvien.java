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
@Table(name = "giangvien")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Giangvien.findAll", query = "SELECT g FROM Giangvien g"),
    @NamedQuery(name = "Giangvien.findById", query = "SELECT g FROM Giangvien g WHERE g.id = :id"),
    @NamedQuery(name = "Giangvien.findByFirstname", query = "SELECT g FROM Giangvien g WHERE g.firstname = :firstname"),
    @NamedQuery(name = "Giangvien.findByLastname", query = "SELECT g FROM Giangvien g WHERE g.lastname = :lastname"),
    @NamedQuery(name = "Giangvien.findByUsername", query = "SELECT g FROM Giangvien g WHERE g.username = :username"),
    @NamedQuery(name = "Giangvien.findByPassword", query = "SELECT g FROM Giangvien g WHERE g.password = :password"),
    @NamedQuery(name = "Giangvien.findByEmail", query = "SELECT g FROM Giangvien g WHERE g.email = :email")})
public class Giangvien implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "firstname")
    private String firstname;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "lastname")
    private String lastname;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "username")
    private String username;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "password")
    private String password;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Size(max = 50)
    @Column(name = "email")
    private String email;
    @OneToMany(mappedBy = "chuTich")
    private Collection<Hdbv> hdbvCollection;
    @OneToMany(mappedBy = "thuKy")
    private Collection<Hdbv> hdbvCollection1;
    @OneToMany(mappedBy = "phanBien")
    private Collection<Hdbv> hdbvCollection2;
    @JoinColumn(name = "user", referencedColumnName = "id")
    @ManyToOne
    private User user;

    public Giangvien() {
    }

    public Giangvien(Integer id) {
        this.id = id;
    }

    public Giangvien(Integer id, String firstname, String lastname, String username, String password) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.username = username;
        this.password = password;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @XmlTransient
    public Collection<Hdbv> getHdbvCollection() {
        return hdbvCollection;
    }

    public void setHdbvCollection(Collection<Hdbv> hdbvCollection) {
        this.hdbvCollection = hdbvCollection;
    }

    @XmlTransient
    public Collection<Hdbv> getHdbvCollection1() {
        return hdbvCollection1;
    }

    public void setHdbvCollection1(Collection<Hdbv> hdbvCollection1) {
        this.hdbvCollection1 = hdbvCollection1;
    }

    @XmlTransient
    public Collection<Hdbv> getHdbvCollection2() {
        return hdbvCollection2;
    }

    public void setHdbvCollection2(Collection<Hdbv> hdbvCollection2) {
        this.hdbvCollection2 = hdbvCollection2;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
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
        if (!(object instanceof Giangvien)) {
            return false;
        }
        Giangvien other = (Giangvien) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.btl.pojo.Giangvien[ id=" + id + " ]";
    }
    
}
