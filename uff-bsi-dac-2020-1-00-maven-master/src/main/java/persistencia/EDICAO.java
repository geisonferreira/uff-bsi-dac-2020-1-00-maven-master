/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author geisonferreira
 */
@Entity
public class EDICAO implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String NUMERO;
    private String ANO;
    private String DATAINICIO;
    private String DATAFIM;
    private String CIDADE;
    private String PAIS;
    @ManyToOne
    private EVENTO evento; 

    public String getNUMERO() {
        return NUMERO;
    }

    public String getANO() {
        return ANO;
    }

    public String getDATAINICIO() {
        return DATAINICIO;
    }

    public String getDATAFIM() {
        return DATAFIM;
    }

    public String getCIDADE() {
        return CIDADE;
    }

    public String getPAIS() {
        return PAIS;
    }

    public void setNUMERO(String NUMERO) {
        this.NUMERO = NUMERO;
    }

    public void setANO(String ANO) {
        this.ANO = ANO;
    }

    public void setDATAINICIO(String DATAINICIO) {
        this.DATAINICIO = DATAINICIO;
    }

    public void setDATAFIM(String DATAFIM) {
        this.DATAFIM = DATAFIM;
    }

    public void setCIDADE(String CIDADE) {
        this.CIDADE = CIDADE;
    }

    public void setPAIS(String PAIS) {
        this.PAIS = PAIS;
    }

    public EVENTO getEvento() {
        return evento;
    }

    public void setEvento(EVENTO evento) {
        this.evento = evento;
    }
    
    
    
    
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
        if (!(object instanceof EDICAO)) {
            return false;
        }
        EDICAO other = (EDICAO) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "persistencia.EDICAO[ id=" + id + " ]";
    }
    
}
