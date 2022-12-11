package Controladores;

import static spark.Spark.*;
import Modelo.*;
import Visao.*;

public class ControladorPesquisaLivros {
  ServicoPesquisaLivros pesq;
  PaginaDadosLivro pagina; 

  public ControladorPesquisaLivros(ServicoPesquisaLivros pesq, PaginaDadosLivro pagina) {
    this.pesq = pesq;
    this.pagina = pagina;
   }
  
  public void start() {
    staticFiles.location("/templates");
        
    get("/", (req, res) -> { 
       res.redirect("index.html");
       return null;
    });

    get("/pesquisa", (req, res) -> { 
      System.out.println("pesquisar");
      String autor = req.queryParams("autor");
      String isbn = req.queryParams("isbn");

      Livro livro = new Livro("", "", "");
      
      if (autor != "") {
        livro = pesq.pesquisaPorAutor(autor);
      }

      if (isbn != "") {
        livro = pesq.pesquisaPorIsbn(isbn);
      }
       
       return pagina.exibeLivro(
         livro.getTitulo(), 
         livro.getAutor(), 
         livro.getISBN()
       );
    });
   }
}