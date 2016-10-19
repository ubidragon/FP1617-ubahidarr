package fp.teoria.clases;

public class Pedidos {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		EstadoPedido estado= EstadoPedido.DISPONIBLE;
		System.out.println("Pedido ");
		switch(estado){
		
			case ENVIADO:
				System.out.println("enviado");
				break;
			case DISPONIBLE:
				System.out.println("listo para ser ");
				
			case RECOGIDO:
				System.out.println("recogido");
					
			
		}
	}

}
