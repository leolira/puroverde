package com.projeto.puroverde.entity;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Vendas.class)
public abstract class Vendas_ {

	public static volatile SingularAttribute<Vendas, Cliente> vendaCliente;
	public static volatile SingularAttribute<Vendas, Produto> vendaProduto;
	public static volatile SingularAttribute<Vendas, Date> dataVenda;
	public static volatile SingularAttribute<Vendas, Long> id;
	public static volatile SingularAttribute<Vendas, Integer> quantidadeVenda;
	public static volatile SingularAttribute<Vendas, String> status;

}

