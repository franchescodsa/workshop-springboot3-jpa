package com.franchesco.Projetospring.entites.enums;

public enum OrderStatus {

	WAITING_PAYMENT(1),
	PAID(2),
	SHIPPED(3),
	DELIVERED(4),
	CANCELED(5);
	
	private int code;
	
	/*Construtor Privado: OrderStatus(int code) é um construtor privado que associa um código a cada valor enum. 
	 * Isso permite que cada status de pedido (OrderStatus) tenha um código numérico específico.*/
	private OrderStatus(int code) {
		this.code =code;
	}
	
	/*Método getCode: Esse método permite acessar o código associado ao status de pedido.*/
	public int getCode() {
		return code;
	}
	
	/*Método valueOf(int code): Esse método estático permite converter um código numérico em um valor OrderStatus. 
	 * Ele itera pelos valores do enum e compara os códigos. 
	 * Se encontrar um valor com o código correto, retorna o valor OrderStatus correspondente. 
	 * Caso contrário, lança uma exceção com a mensagem corrigida para "Invalid order status code".*/
	public static OrderStatus valueOf(int code) {
		for(OrderStatus value : OrderStatus.values()) {
			if(value.getCode() ==code) {
				return value;
			}
		}
		throw new IllegalArgumentException("Invslide order sattus code ");
	}
}
