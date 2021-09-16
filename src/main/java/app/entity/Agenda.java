package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
* Classe que representa a tabela AGENDA
* @generated
*/
@Entity
@Table(name = "\"AGENDA\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Agenda")
public class Agenda implements Serializable {

    /**
    * UID da classe, necessário na serialização
    * @generated
    */
    private static final long serialVersionUID = 1L;

    /**
    * @generated
    */
    @Id
    @Column(name = "id", nullable = false, insertable=true, updatable=true)
        private java.lang.String id = UUID.randomUUID().toString().toUpperCase();

    /**
    * @generated
    */
    @Column(name = "titulo", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String titulo;

    /**
    * @generated
    */
    @Column(name = "nomeDoEvento", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String nomeDoEvento;

    /**
    * @generated
    */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "dataEHoraDeInicioDoEvento", nullable = true, unique = false, insertable=true, updatable=true, columnDefinition = "TIMESTAMP")
        
        private java.util.Date dataEHoraDeInicioDoEvento;

    /**
    * @generated
    */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "dataEHoraDoFimDoEvento", nullable = true, unique = false, insertable=true, updatable=true, columnDefinition = "TIMESTAMP")
        
        private java.util.Date dataEHoraDoFimDoEvento;

    /**
    * @generated
    */
    @Column(name = "fusoDaDataInicial", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String fusoDaDataInicial;

    /**
    * @generated
    */
    @Column(name = "fusoDaDataFinal", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String fusoDaDataFinal;

    /**
    * @generated
    */
    @Column(name = "descricaoDoEvento", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String descricaoDoEvento;

    /**
    * @generated
    */
    @Column(name = "regrasDeRepeticoes", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String regrasDeRepeticoes;

    /**
    * @generated
    */
    @Column(name = "regrasRepeticoes", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String regrasRepeticoes;

    /**
    * @generated
    */
    @Column(name = "excecoesDasRegrasDeRepeticoes", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String excecoesDasRegrasDeRepeticoes;

    /**
    * @generated
    */
    @Column(name = "eventosDeDiaInteiro", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Boolean eventosDeDiaInteiro;

    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="fk_user", nullable = true, referencedColumnName = "id", insertable=true, updatable=true, foreignKey = @ForeignKey(name = ""))
        
        private User user;

    /**
    * Construtor
    * @generated
    */
    public Agenda(){
    }

    /**
    * Obtém id
    * return id
    * @generated
    */
    
    public java.lang.String getId(){
        return this.id;
    }

    /**
    * Define id
    * @param id id
    * @generated
    */
    public Agenda setId(java.lang.String id){
        this.id = id;
        return this;
    }
    /**
    * Obtém titulo
    * return titulo
    * @generated
    */
    
    public java.lang.String getTitulo(){
        return this.titulo;
    }

    /**
    * Define titulo
    * @param titulo titulo
    * @generated
    */
    public Agenda setTitulo(java.lang.String titulo){
        this.titulo = titulo;
        return this;
    }
    /**
    * Obtém nomeDoEvento
    * return nomeDoEvento
    * @generated
    */
    
    public java.lang.String getNomeDoEvento(){
        return this.nomeDoEvento;
    }

    /**
    * Define nomeDoEvento
    * @param nomeDoEvento nomeDoEvento
    * @generated
    */
    public Agenda setNomeDoEvento(java.lang.String nomeDoEvento){
        this.nomeDoEvento = nomeDoEvento;
        return this;
    }
    /**
    * Obtém dataEHoraDeInicioDoEvento
    * return dataEHoraDeInicioDoEvento
    * @generated
    */
    
    public java.util.Date getDataEHoraDeInicioDoEvento(){
        return this.dataEHoraDeInicioDoEvento;
    }

    /**
    * Define dataEHoraDeInicioDoEvento
    * @param dataEHoraDeInicioDoEvento dataEHoraDeInicioDoEvento
    * @generated
    */
    public Agenda setDataEHoraDeInicioDoEvento(java.util.Date dataEHoraDeInicioDoEvento){
        this.dataEHoraDeInicioDoEvento = dataEHoraDeInicioDoEvento;
        return this;
    }
    /**
    * Obtém dataEHoraDoFimDoEvento
    * return dataEHoraDoFimDoEvento
    * @generated
    */
    
    public java.util.Date getDataEHoraDoFimDoEvento(){
        return this.dataEHoraDoFimDoEvento;
    }

    /**
    * Define dataEHoraDoFimDoEvento
    * @param dataEHoraDoFimDoEvento dataEHoraDoFimDoEvento
    * @generated
    */
    public Agenda setDataEHoraDoFimDoEvento(java.util.Date dataEHoraDoFimDoEvento){
        this.dataEHoraDoFimDoEvento = dataEHoraDoFimDoEvento;
        return this;
    }
    /**
    * Obtém fusoDaDataInicial
    * return fusoDaDataInicial
    * @generated
    */
    
    public java.lang.String getFusoDaDataInicial(){
        return this.fusoDaDataInicial;
    }

    /**
    * Define fusoDaDataInicial
    * @param fusoDaDataInicial fusoDaDataInicial
    * @generated
    */
    public Agenda setFusoDaDataInicial(java.lang.String fusoDaDataInicial){
        this.fusoDaDataInicial = fusoDaDataInicial;
        return this;
    }
    /**
    * Obtém fusoDaDataFinal
    * return fusoDaDataFinal
    * @generated
    */
    
    public java.lang.String getFusoDaDataFinal(){
        return this.fusoDaDataFinal;
    }

    /**
    * Define fusoDaDataFinal
    * @param fusoDaDataFinal fusoDaDataFinal
    * @generated
    */
    public Agenda setFusoDaDataFinal(java.lang.String fusoDaDataFinal){
        this.fusoDaDataFinal = fusoDaDataFinal;
        return this;
    }
    /**
    * Obtém descricaoDoEvento
    * return descricaoDoEvento
    * @generated
    */
    
    public java.lang.String getDescricaoDoEvento(){
        return this.descricaoDoEvento;
    }

    /**
    * Define descricaoDoEvento
    * @param descricaoDoEvento descricaoDoEvento
    * @generated
    */
    public Agenda setDescricaoDoEvento(java.lang.String descricaoDoEvento){
        this.descricaoDoEvento = descricaoDoEvento;
        return this;
    }
    /**
    * Obtém regrasDeRepeticoes
    * return regrasDeRepeticoes
    * @generated
    */
    
    public java.lang.String getRegrasDeRepeticoes(){
        return this.regrasDeRepeticoes;
    }

    /**
    * Define regrasDeRepeticoes
    * @param regrasDeRepeticoes regrasDeRepeticoes
    * @generated
    */
    public Agenda setRegrasDeRepeticoes(java.lang.String regrasDeRepeticoes){
        this.regrasDeRepeticoes = regrasDeRepeticoes;
        return this;
    }
    /**
    * Obtém regrasRepeticoes
    * return regrasRepeticoes
    * @generated
    */
    
    public java.lang.String getRegrasRepeticoes(){
        return this.regrasRepeticoes;
    }

    /**
    * Define regrasRepeticoes
    * @param regrasRepeticoes regrasRepeticoes
    * @generated
    */
    public Agenda setRegrasRepeticoes(java.lang.String regrasRepeticoes){
        this.regrasRepeticoes = regrasRepeticoes;
        return this;
    }
    /**
    * Obtém excecoesDasRegrasDeRepeticoes
    * return excecoesDasRegrasDeRepeticoes
    * @generated
    */
    
    public java.lang.String getExcecoesDasRegrasDeRepeticoes(){
        return this.excecoesDasRegrasDeRepeticoes;
    }

    /**
    * Define excecoesDasRegrasDeRepeticoes
    * @param excecoesDasRegrasDeRepeticoes excecoesDasRegrasDeRepeticoes
    * @generated
    */
    public Agenda setExcecoesDasRegrasDeRepeticoes(java.lang.String excecoesDasRegrasDeRepeticoes){
        this.excecoesDasRegrasDeRepeticoes = excecoesDasRegrasDeRepeticoes;
        return this;
    }
    /**
    * Obtém eventosDeDiaInteiro
    * return eventosDeDiaInteiro
    * @generated
    */
    
    public java.lang.Boolean getEventosDeDiaInteiro(){
        return this.eventosDeDiaInteiro;
    }

    /**
    * Define eventosDeDiaInteiro
    * @param eventosDeDiaInteiro eventosDeDiaInteiro
    * @generated
    */
    public Agenda setEventosDeDiaInteiro(java.lang.Boolean eventosDeDiaInteiro){
        this.eventosDeDiaInteiro = eventosDeDiaInteiro;
        return this;
    }
    /**
    * Obtém user
    * return user
    * @generated
    */
    
    public User getUser(){
        return this.user;
    }

    /**
    * Define user
    * @param user user
    * @generated
    */
    public Agenda setUser(User user){
        this.user = user;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
Agenda object = (Agenda)obj;
        if (id != null ? !id.equals(object.id) : object.id != null) return false;
        return true;
    }

    /**
    * @generated
    */
    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

}