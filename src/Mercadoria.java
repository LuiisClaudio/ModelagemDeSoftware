import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;



//import com.opencsv.CSVParser;
//import com.opencsv.CSVParserBuilder;
//import com.opencsv.CSVReaderBuilder;


public class Mercadoria {
	String nome;
	int precoVenda;
	int precoCompra;
	
	public Mercadoria()
	{
		return;
	}
	
	public void AgrupaMercadoriaCategoria(String categoria){}
	
	public void testeCSV(String file) throws FileNotFoundException{
        Scanner scanner = new Scanner(new File(file));
        scanner.useDelimiter(",");
        while (scanner.hasNextLine())
        {
            String line = scanner.nextLine();
            String[] fields = line.split(",");
            if (fields.length >= 4) // At least one address specified.
            {
                for (String field: fields) 
                {
                	System.out.print(field + "|");
                }
                System.out.println();
            }
            else
            {
                System.err.println("Invalid record: " + line);
            }
        }
	}
	
	public void achaMercadoria(String file, String id, String id_cat) throws IOException{
        Scanner scanner = new Scanner(new File(file));
        BufferedWriter writer = new BufferedWriter(new FileWriter("db/achaMercadoria.csv"));
        scanner.useDelimiter(",");
        int i = 1;
        boolean id_check = false;
        boolean id_cat_check = false;
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
	            		if(id_check == true && id_cat.equals(field))
	            		{
	            			id_cat_check = true;
	            		}
                		break;
                	}
                	System.out.print(field + "|");
                	i = i + 1;
                }
                if(id_check == true && id_cat_check == true)
                {            
                	 writer.write(line+"\n");          
                }
                i = 1;
                id_check = false;
                id_cat_check = false;
                System.out.println();               
            }
            else
            {
                System.err.println("Invalid record: " + line);
            }
        }
        writer.close();
	}
	
	
	
	 
}

