import java.io.FileNotFoundException;
import java.io.IOException;

public class main {
	public static void main(String[] args) throws IOException 
	{
		//Mercadoria m = new Mercadoria();
		//m.testeCSV("db/mercadoria.csv");
		//m.achaMercadoria("db/mercadoria.csv", "1", "2");
		ItensDeVenda itensVenda = new ItensDeVenda();
		itensVenda.achaVendaPorFilialCategoria("db/itensDeVenda.csv", "1", "aaaaa", "celular");
		return;
	}
	public void ChamaLucroController()
	{
		return;
	}
	public void ChamaApuracaoPgtoFornecedorController()
	{
		
		return;
	}
}
