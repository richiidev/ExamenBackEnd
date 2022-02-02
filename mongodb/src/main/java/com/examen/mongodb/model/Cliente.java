package com.examen.mongodb.model;

import java.sql.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "cliente")
public class Cliente {

	@Id
	String id;
	String nombre_usuario;
	String contraseña;
	String nombre;
	String Apellidos;
	String correo;
	int edad;
	double estatura;
	double peso;
	double IMC;
	double GEB;
	double ETA;
	Date fecha_creacion;
	Date fecha_actualizacion;
	
	public Cliente() {
	}
	
	public Cliente(String id, String nombre_usuario, String contraseña, String nombre, String apellidos, String correo,
			int edad, double estatura, double peso, double iMC, double gEB, double eTA, Date fecha_creacion,
			Date fecha_actualizacion) {
		this.id = id;
		this.nombre_usuario = nombre_usuario;
		this.contraseña = contraseña;
		this.nombre = nombre;
		Apellidos = apellidos;
		this.correo = correo;
		this.edad = edad;
		this.estatura = estatura;
		this.peso = peso;
		IMC = iMC;
		GEB = gEB;
		ETA = eTA;
		this.fecha_creacion = fecha_creacion;
		this.fecha_actualizacion = fecha_actualizacion;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNombre_usuario() {
		return nombre_usuario;
	}
	public void setNombre_usuario(String nombre_usuario) {
		this.nombre_usuario = nombre_usuario;
	}
	public String getContraseña() {
		return contraseña;
	}
	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return Apellidos;
	}
	public void setApellidos(String apellidos) {
		Apellidos = apellidos;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public double getEstatura() {
		return estatura;
	}
	public void setEstatura(double estatura) {
		this.estatura = estatura;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getIMC() {
		return IMC;
	}
	public void setIMC(double iMC) {
		IMC = iMC;
	}
	public double getGEB() {
		return GEB;
	}
	public void setGEB(double gEB) {
		GEB = gEB;
	}
	public double getETA() {
		return ETA;
	}
	public void setETA(double eTA) {
		ETA = eTA;
	}
	public Date getFecha_creacion() {
		return fecha_creacion;
	}
	public void setFecha_creacion(Date fecha_creacion) {
		this.fecha_creacion = fecha_creacion;
	}
	public Date getFecha_actualizacion() {
		return fecha_actualizacion;
	}
	public void setFecha_actualizacion(Date fecha_actualizacion) {
		this.fecha_actualizacion = fecha_actualizacion;
	}
	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nombre_usuario=" + nombre_usuario + ", contraseña=" + contraseña + ", nombre="
				+ nombre + ", Apellidos=" + Apellidos + ", correo=" + correo + ", edad=" + edad + ", estatura="
				+ estatura + ", peso=" + peso + ", IMC=" + IMC + ", GEB=" + GEB + ", ETA=" + ETA + ", fecha_creacion="
				+ fecha_creacion + ", fecha_actualizacion=" + fecha_actualizacion + "]";
	}
	
	
	
}
