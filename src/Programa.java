
import controller.*;
import model.*;
import view.*;

public class Programa {

		private static int currentClientId;
		private static int currentProductId;

		public static void main(String[] args) {
			Cliente clientModel = getClientFromDatabase();
			VisualizaCliente clientView = new VisualizaCliente ();
			ClienteController clientController = new ClienteController(clientModel, clientView);

			Endereco addressModel = getAddressFromDatabase(clientController.getIdClient());
			VisualizaEndereco addressView = new VisualizaEndereco();
			EnderecoController addressController = new EnderecoController(addressModel, addressView);
			
			Telefone telephoneModel = getTelephoneFromDatabase(clientController.getIdClient());
			VisualizaTelefone telephoneView = new VisualizaTelefone();
			TelefoneController telephoneController = new TelefoneController(telephoneModel, telephoneView);
			
			Produto productModel = getProductFromDatabase();
			VisualizaProduto productView = new VisualizaProduto();
			ProdutoController productController = new ProdutoController(productModel, productView);
			
			Pedido orderModel = getOrderFromDatabase(clientController.getIdClient());
			VisualizarPedido orderView = new VisualizarPedido();
			PedidoController orderController = new PedidoController(orderModel, orderView);
			
			ProdutoPedido orderProductModel = getOrderProductFromDatabase(productController.getProductId(), orderController.getOrderEi());
			VisualizaPedidoProduto orderProductView = new VisualizaPedidoProduto();
			ProdutoPedidoController orderProductController = new ProdutoPedidoController(orderProductModel, orderProductView);

			clientController.updateView();
			addressController.updateView();
			telephoneController.updateView();
			productController.updateView();
			orderController.updateView();
			orderProductController.updateView();
		}

		private static Cliente getClientFromDatabase() {
			Cliente client = new Cliente(currentClientId, "Felipe Teste", "email@empresa.com",
					"123.123.123-00", "12.121.121-90", "1986-01-22");

			currentClientId++;

			return client;
		}
		
		private static Telefone getTelephoneFromDatabase(int fkClient) {
			Telefone telephone = new Telefone(11, "12345-5678", fkClient);

			return telephone;
		}

		private static Endereco getAddressFromDatabase(int fkClient) {
			Endereco address = new Endereco(200, "Rua TEste", "Jd. São Salvador", "Complemento", "Embú das Artes", "São Paulo",
					fkClient);

			return address;
		}

		private static Pedido getOrderFromDatabase(int fkClient) {
			Pedido order = new Pedido("", "", 1234.5, "Pendente", fkClient);
			
			return order;
		}
		
		private static Produto getProductFromDatabase() {
			Produto product = new Produto(currentProductId, "Teste", "Produto OK", 2, 200.20);
			
			return product;
		}
		
		private static ProdutoPedido getOrderProductFromDatabase(int fkProduct, String fkOrder) {
			ProdutoPedido orderProduct = new ProdutoPedido(fkProduct, fkOrder, 10);
			
			return orderProduct;
		}
	
}
