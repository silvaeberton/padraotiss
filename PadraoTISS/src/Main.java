import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;

public class Main {

	public static void main(String[] args) {
		
		try {
			URL url = new URL("http://www.ans.gov.br/images/stories/Plano_de_saude_e_Operadoras/tiss/Padrao_tiss/tiss3/Padrao_TISS_Componente_Organizacional_202006.pdf");
			
			File file = new File("Componente-organizacional.pdf");		
			
			InputStream is = url.openStream();
			FileOutputStream fos = new FileOutputStream(file);

	        int bytes = 0;

	        while ((bytes = is.read()) != -1) {
	            fos.write(bytes); 	            
	        }	             
	        
	        System.out.println("Download conluido");
	        
	        is.close();
	        
	        fos.close();       
	        
		}catch(Exception e) {
			System.out.println("Exception " + e);
		}
		
		
	}
}