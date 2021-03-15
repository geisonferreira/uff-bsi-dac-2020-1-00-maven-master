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

/**
 *
 * @author geisonferreira
 */
@Entity
public class EVENTO implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String NOME;
    private String SIGLA;
    private String AREADECONCETRACAO;
    private String INSTITUICAOORGANIZADORA;

    public String getNOME() {
        return NOME;
    }

    public String getSIGLA() {
        return SIGLA;
    }

    public String getAREADECONCETRACAO() {
        return AREADECONCETRACAO;
    }

    public String getINSTITUICAOORGANIZADORA() {
        return INSTITUICAOORGANIZADORA;
    }

    public void setNOME(String NOME) {
        this.NOME = NOME;
    }

    public void setSIGLA(String SIGLA) {
        this.SIGLA = SIGLA;
    }

    public void setAREADECONCETRACAO(String AREADECONCETRACAO) {
        this.AREADECONCETRACAO = AREADECONCETRACAO;
    }

    public void setINSTITUICAOORGANIZADORA(String INSTITUICAOORGANIZADORA) {
        this.INSTITUICAOORGANIZADORA = INSTITUICAOORGANIZADORA;
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
        if (!(object instanceof EVENTO)) {
            return false;
        }
        EVENTO other = (EVENTO) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "persistencia.EVENTO[ id=" + id + " ]";
    }
    
}
