package DeletandoArquivos;

import java.io.File;

public class deleteData {
    
	public static void main(String[] args) {
		
		try {
			File file = new File("/home/alienmj/arquivos/arquivo.txt");
			
			 if(file.delete()) {
				 System.out.println(file.getName() +" Arquivo deletado");
			 }else {
				 System.out.println(file.getName() +" falha ao deletar");
			 }
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
