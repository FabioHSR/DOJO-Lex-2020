package ftt.ec;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class lex {
	public static void main(String[] args) {
		String arquivo = "//home/fito/eclipse-workspace/DOJO-Lex-2020/src/ftt/ec//jquery-3.4.1.js";
		String conteudo = "";
        
    try {
      try(FileReader fr = new FileReader(arquivo)){
        try(BufferedReader br = new BufferedReader(fr)){
          String linha;

          while((linha = br.readLine()) != null) {
            // Remove comentários de uma linha
            conteudo += linha.replaceAll("[\\s]*(//[\\s]+.*)|(//$)", "").replaceAll("\\s+", " ");
          }
        }
      }
            
      try(FileWriter fw = new FileWriter(arquivo.substring(0, arquivo.lastIndexOf(".")) + ".min" + arquivo.substring(arquivo.lastIndexOf(".")))){
        try(PrintWriter pw = new PrintWriter(fw)){
          pw.print(conteudo.replaceAll("/\\*[^*]*(?:\\*(?!/)[^*]*)*\\*/", "") // Remove comentários de multiplas linhas
                           .replaceAll("\\s?\\[\\s?", "\\[") // Romeve espaços entre [
                           .replaceAll("\\s?\\]\\s?", "\\]") // Romeve espaços entre ]
                           .replaceAll("\\s?\\(\\s?", "\\(") // Romeve espaços entre (
                           .replaceAll("\\s?\\)\\s?", "\\)") // Romeve espaços entre )
                           .replaceAll("\\s?\\{\\s?", "\\{") // Romeve espaços entre {
                           .replaceAll("\\s?\\}\\s?", "\\}") // Romeve espaços entre }
                           .replaceAll("\\s?=\\s?", "=") // Romeve espaços entre =
                           .replaceAll("\\s?!\\s?", "!") // Romeve espaços entre !
                           .replaceAll("\\s?\\|\\s?", "\\|") // Romeve espaços entre |
                           .replaceAll("\\s?&\\s?", "&") // Romeve espaços entre &
                           .replaceAll("\\s?,\\s?", ",") // Romeve espaços entre ,
                           .replaceAll("\\s?;\\s?", ";") // Romeve espaços entre ;
                           .replaceAll("\\s?\\:\\s?", "\\:") // Romeve espaços entre :
                           .replaceAll("\\s?\\?\\s?", "\\?") // Romeve espaços entre ?
                           .replaceAll("\\s?<\\s?", "<") // Romeve espaços entre <
                           .replaceAll("\\s?>\\s?", ">")); // Romeve espaços entre >
        }
      }
    } catch (Exception erro) {
      System.out.println(erro.getMessage());
    }
		
		System.out.println("LEX Dojo...");
	}
}