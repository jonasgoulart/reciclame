package br.com.reciclame.controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@RequestScoped
@ManagedBean(name="vitrineBean")
public class VitrineBean 
{
	public String destaque()
	{
		return "users.xhtml";
	}
}