import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ItensDeVenda {
	int quantidade;
	int valor;
	
	public void somaDePrecoVenda(String Categoria){}
	
	public void achaVendaPorIdFilialCategoria(String file, String id, String filial, String nome_cat) throws IOException{
        Scanner scanner = new Scanner(new File(file));
        BufferedWriter writer = new BufferedWriter(new FileWriter("db/achaItensDeVenda.csv"));
        scanner.useDelimiter(",");
        int i = 1;
        boolean id_check = true;
        boolean filial_check = false;
        boolean nome_cat_check = false;
        while (scanner.hasNextLine())
        {
            String line = scanner.nextLine();
            String[] fields = line.split(",");
            if (fields.length >0) 
            {
                for (String field: fields) 
                {	
                	switch(i)
                	{
                	case(1):	            	
	            		if(id.equals(field) == true)
		            		id_check = true;
                		break;
                	case(2):
                		if(id_check == true && filial.equals(field) == true)
                			filial_check = true;
                		break;
                	case(4):
	            		if(id_check == true && filial_check == true && nome_cat.equals(field))
	            			nome_cat_check = true;
                		break;
                	}
                	System.out.print(field + "|");
                	i = i + 1;
                }
                if(id_check == true && filial_check == true && nome_cat_check == true)
                {            
                	 writer.write(line+"\n");          
                }
                i = 1;
                id_check = true;
                filial_check = false;
                nome_cat_check = false;
                System.out.println();               
            }
            else
            {
                System.err.println("Invalid record: " + line);
            }
        }
        writer.close();
        scanner.close();
	}
	
	public void achaVendaPorFilialCategoria(String file, String id, String filial, String nome_cat) throws IOException{
        Scanner scanner = new Scanner(new File(file));
        BufferedWriter writer = new BufferedWriter(new FileWriter("db/achaItensDeVenda.csv"));
        scanner.useDelimiter(",");
        int i = 1;
        boolean id_check = false;
        boolean filial_check = false;
        boolean nome_cat_check = false;
        while (scanner.hasNextLine())
        {
            String line = scanner.nextLine();
            String[] fields = line.split(",");
            if (fields.length >0) 
            {
                for (String field: fields) 
                {	
                	switch(i)
                	{
                	case(1):	            	
	            		if(id.equals(field) == true)
		            		id_check = true;
                		break;
                	case(2):
                		if(id_check == true && filial.equals(field) == true)
                			filial_check = true;
                		break;
                	case(4):
	            		if(id_check == true && filial_check == true && nome_cat.equals(field))
	            			nome_cat_check = true;
                		break;
                	}
                	System.out.print(field + "|");
                	i = i + 1;
                }
                if(id_check == true && filial_check == true && nome_cat_check == true)
                {            
                	 writer.write(line+"\n");          
                }
                i = 1;
                id_check = false;
                filial_check = false;
                nome_cat_check = false;
                System.out.println();               
            }
            else
            {
                System.err.println("Invalid record: " + line);
            }
        }
        writer.close();
        scanner.close();
	}
}
