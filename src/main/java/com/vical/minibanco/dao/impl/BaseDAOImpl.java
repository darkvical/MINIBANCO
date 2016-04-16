package com.vical.minibanco.dao.impl;

import java.io.Serializable;

import javax.annotation.PostConstruct;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import com.vical.minibanco.dao.IBaseDAO;

public abstract class BaseDAOImpl<Entidad, Id extends Serializable> extends HibernateDaoSupport implements
		IBaseDAO<Entidad, Id> {
	private static final long serialVersionUID = 5281242421429543688L;

	//FACILITA DETERMINAR LA CLASE QUE HACE REFERENCIA A BD
	protected Class<Entidad> clase;
	protected abstract Class<Entidad> getClase();
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public BaseDAOImpl() {
		super();
		this.clase = getClase();
	}
	
	@PostConstruct
	protected void postConstructor(){
		super.setSessionFactory(sessionFactory);
	}
	
	@Override
	public Entidad crear(Entidad entidad) {
		getHibernateTemplate().save(entidad);
		return entidad;
	}

	@Override
	public Entidad obtener(Long id) {
		return getHibernateTemplate().get(getClase(), id);
	}

	@Override
	public Entidad modificar(Entidad entidad) {
		getHibernateTemplate().update(entidad);
		getHibernateTemplate().flush();
		return entidad;
	}

	@Override
	public void eliminar(Entidad entidad) {
		getHibernateTemplate().delete(entidad);
		getHibernateTemplate().flush();
	}
}