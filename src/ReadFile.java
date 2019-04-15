import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import br.com.projutils.entidade.Escola;

public class ReadFile {
	
	public static void main(String[] args) {
	
		ReadFileCVS();
	}

	public static void ReadFileCVS() {
		
		List<Escola> lstArquivo = new ArrayList<>(); 
		File arquivoCSV = new File("C:\\Users\\Dante\\Documents\\FonteDados.csv");

		try {

			String LinhasdoArquivo = new String();

			Scanner ler = new Scanner(arquivoCSV);

			while (ler.hasNext()) {

				LinhasdoArquivo = ler.nextLine();

				System.out.println(LinhasdoArquivo);
				
				lstArquivo.add(getObj(LinhasdoArquivo.split(";")));
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		
	//	lstArquivo.forEach(a -> System.out.println(Arrays.toString(a)));

	}

	private static Escola getObj(String[] split) {
		
		
		Escola escola = new Escola();
		
		escola.setId(Integer.parseInt(split[0]));
		//todas as colunas
		
		return escola;
	}
	
	
	
}
