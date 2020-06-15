

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PessoaTest {
    
    private Pessoa pessoa = new Pessoa();
    
    public PessoaTest() {
    }

    @Before
    public void setUp() {
        pessoa.setNome("Ze");
        pessoa.setIdade(20);
    }

    @After
    public void tearDown() {
    }
    
    @Test
    public void testSetIdade() {
        pessoa.setIdade(20);
        assertEquals(20, pessoa.getIdade());
        
        pessoa.setIdade(-10);
        assertEquals(0, pessoa.getIdade());        
    }
    
    @Test
    public void testGetIdade() {
        assertEquals(20, pessoa.getIdade());
    }    
    
    @Test
    public void testSetNome() {
        pessoa.setNome("Ze");
        assertEquals("Ze", pessoa.getNome());
    }
    
    @Test
    public void testGetNome() {
        assertEquals("Ze", pessoa.getNome());
    }       
    
    @Test
    public void testVerificarAdulto() {
        pessoa.setIdade(20);
        assertEquals("maior de idade", pessoa.verificarAdulto());
        pessoa.setIdade(15);
        assertEquals("menor de idade", pessoa.verificarAdulto());        
    }  
    
    @Test
    public void testVerificarAdultoo() {
        pessoa.setIdade(20);
        assertEquals("maior de idade", pessoa.verificarAdultoo());
        pessoa.setIdade(15);
        assertEquals("menor de idade", pessoa.verificarAdultoo());        
    }  
    
    @Test
    public void testVerificarCategoria() {
        pessoa.setIdade(65);
        assertEquals("idoso", pessoa.verificarCategoria());
        
        pessoa.setIdade(14);
        assertEquals("juvenil", pessoa.verificarCategoria());        
        
        pessoa.setIdade(7);
        assertEquals("infantil", pessoa.verificarCategoria());                
        
        pessoa.setIdade(-1);
        assertEquals("não se enquadra em nenhuma categoria", pessoa.verificarCategoria());                        
        
        pessoa.setIdade(3);
        assertEquals("não se enquadra em nenhuma categoria", pessoa.verificarCategoria());                                
    }      
    
    @Test
    public void testVerificarNome() {
        pessoa.setNome("Joao");
        assertEquals("Nome válido!", pessoa.verificarNome());
        
        pessoa.setNome("x");
        assertEquals("Nome INválido!", pessoa.verificarNome());
    }     
    
    @Test
    public void testVerificarNomeee() {
        pessoa.setNome("joao");
        assertEquals(true, pessoa.verificarNomeee());
        
        pessoa.setNome("y");
        assertEquals(false, pessoa.verificarNomeee());        
    } 
    
    @Test
    public void testVerificarNomeeee() {
        pessoa.setNome("thiago");
        assertEquals(true, pessoa.verificarNomeeee());
        
        pessoa.setNome("jose");
        assertEquals(false, pessoa.verificarNomeeee());        
    }   
    
    @Test
    public void testVerificarAcesso() {
        pessoa.setNome("thiago");
        pessoa.setIdade(36);
        assertEquals(true, pessoa.verificarAcesso());
        
        pessoa.setNome("thiago");
        pessoa.setIdade(20);
        assertEquals(false, pessoa.verificarAcesso());    
        
        pessoa.setNome("josé");
        pessoa.setIdade(36);
        assertEquals(false, pessoa.verificarAcesso());  
        
        pessoa.setNome("josé");
        pessoa.setIdade(20);
        assertEquals(false, pessoa.verificarAcesso());                
                
    } 
    
    public void testVerificarNomeSwitch() {
        pessoa.setNome("thiago");
        assertEquals("é o thiago", pessoa.verificarNomeSwitch());
        
        pessoa.setNome("manuel");
        assertEquals("é o manuel", pessoa.verificarNomeSwitch());        
        
        pessoa.setNome("asdf");
        assertEquals("não sei quem é", pessoa.verificarNomeSwitch());                
        
    }     
    

}
