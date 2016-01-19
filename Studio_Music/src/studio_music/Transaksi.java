/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studio_music;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author OVIN
 */
@Entity
@Table(name = "transaksi", catalog = "studio_music", schema = "")
@NamedQueries({
    @NamedQuery(name = "Transaksi.findAll", query = "SELECT t FROM Transaksi t"),
    @NamedQuery(name = "Transaksi.findByIdTransaksi", query = "SELECT t FROM Transaksi t WHERE t.idTransaksi = :idTransaksi"),
    @NamedQuery(name = "Transaksi.findByNama", query = "SELECT t FROM Transaksi t WHERE t.nama = :nama"),
    @NamedQuery(name = "Transaksi.findByNoTelp", query = "SELECT t FROM Transaksi t WHERE t.noTelp = :noTelp"),
    @NamedQuery(name = "Transaksi.findByStudio", query = "SELECT t FROM Transaksi t WHERE t.studio = :studio"),
    @NamedQuery(name = "Transaksi.findByHargaSewa", query = "SELECT t FROM Transaksi t WHERE t.hargaSewa = :hargaSewa"),
    @NamedQuery(name = "Transaksi.findByLamaSewa", query = "SELECT t FROM Transaksi t WHERE t.lamaSewa = :lamaSewa"),
    @NamedQuery(name = "Transaksi.findByTotal", query = "SELECT t FROM Transaksi t WHERE t.total = :total")})
public class Transaksi implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_transaksi")
    private Integer idTransaksi;
    @Basic(optional = false)
    @Column(name = "nama")
    private String nama;
    @Basic(optional = false)
    @Lob
    @Column(name = "alamat")
    private String alamat;
    @Basic(optional = false)
    @Column(name = "no_telp")
    private String noTelp;
    @Basic(optional = false)
    @Column(name = "studio")
    private String studio;
    @Basic(optional = false)
    @Column(name = "harga_sewa")
    private int hargaSewa;
    @Basic(optional = false)
    @Column(name = "lama_sewa")
    private int lamaSewa;
    @Basic(optional = false)
    @Column(name = "total")
    private int total;

    public Transaksi() {
    }

    public Transaksi(Integer idTransaksi) {
        this.idTransaksi = idTransaksi;
    }

    public Transaksi(Integer idTransaksi, String nama, String alamat, String noTelp, String studio, int hargaSewa, int lamaSewa, int total) {
        this.idTransaksi = idTransaksi;
        this.nama = nama;
        this.alamat = alamat;
        this.noTelp = noTelp;
        this.studio = studio;
        this.hargaSewa = hargaSewa;
        this.lamaSewa = lamaSewa;
        this.total = total;
    }

    public Integer getIdTransaksi() {
        return idTransaksi;
    }

    public void setIdTransaksi(Integer idTransaksi) {
        Integer oldIdTransaksi = this.idTransaksi;
        this.idTransaksi = idTransaksi;
        changeSupport.firePropertyChange("idTransaksi", oldIdTransaksi, idTransaksi);
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        String oldNama = this.nama;
        this.nama = nama;
        changeSupport.firePropertyChange("nama", oldNama, nama);
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        String oldAlamat = this.alamat;
        this.alamat = alamat;
        changeSupport.firePropertyChange("alamat", oldAlamat, alamat);
    }

    public String getNoTelp() {
        return noTelp;
    }

    public void setNoTelp(String noTelp) {
        String oldNoTelp = this.noTelp;
        this.noTelp = noTelp;
        changeSupport.firePropertyChange("noTelp", oldNoTelp, noTelp);
    }

    public String getStudio() {
        return studio;
    }

    public void setStudio(String studio) {
        String oldStudio = this.studio;
        this.studio = studio;
        changeSupport.firePropertyChange("studio", oldStudio, studio);
    }

    public int getHargaSewa() {
        return hargaSewa;
    }

    public void setHargaSewa(int hargaSewa) {
        int oldHargaSewa = this.hargaSewa;
        this.hargaSewa = hargaSewa;
        changeSupport.firePropertyChange("hargaSewa", oldHargaSewa, hargaSewa);
    }

    public int getLamaSewa() {
        return lamaSewa;
    }

    public void setLamaSewa(int lamaSewa) {
        int oldLamaSewa = this.lamaSewa;
        this.lamaSewa = lamaSewa;
        changeSupport.firePropertyChange("lamaSewa", oldLamaSewa, lamaSewa);
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        int oldTotal = this.total;
        this.total = total;
        changeSupport.firePropertyChange("total", oldTotal, total);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTransaksi != null ? idTransaksi.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Transaksi)) {
            return false;
        }
        Transaksi other = (Transaksi) object;
        if ((this.idTransaksi == null && other.idTransaksi != null) || (this.idTransaksi != null && !this.idTransaksi.equals(other.idTransaksi))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "studio_music.Transaksi[ idTransaksi=" + idTransaksi + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
