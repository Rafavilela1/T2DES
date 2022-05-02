package br.com.senai.rafaelvilela.application.model;

import java.sql.Date;

public class Pessoa {
private String nome,email,nomeEmpresa,cargo;
private Date dataNascimento;
private Endereco endRes,endCom;
private Telefone telRes,telCel,telCom;
private Double salario;
private Integer [] interesse;
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getNomeEmpresa() {
	return nomeEmpresa;
}
public void setNomeEmpresa(String nomeEmpresa) {
	this.nomeEmpresa = nomeEmpresa;
}
public String getCargo() {
	return cargo;
}
public void setCargo(String cargo) {
	this.cargo = cargo;
}
public Date getDataNascimento() {
	return dataNascimento;
}
public void setDataNascimento(Date dataNascimento) {
	this.dataNascimento = dataNascimento;
}
public Endereco getEndRes() {
	return endRes;
}
public void setEndRes(Endereco endRes) {
	this.endRes = endRes;
}
public Endereco getEndCom() {
	return endCom;
}
public void setEndCom(Endereco endCom) {
	this.endCom = endCom;
}
public Telefone getTelRes() {
	return telRes;
}
public void setTelRes(Telefone telRes) {
	this.telRes = telRes;
}
public Telefone getTelCel() {
	return telCel;
}
public void setTelCel(Telefone telCel) {
	this.telCel = telCel;
}
public Telefone getTelCom() {
	return telCom;
}
public void setTelCom(Telefone telCom) {
	this.telCom = telCom;
}
public Double getSalario() {
	return salario;
}
public void setSalario(Double salario) {
	this.salario = salario;
}
public Integer[] getInteresse() {
	return interesse;
}
public void setInteresses(Integer[] interesse) {
	this.interesse = interesse;
}




}
