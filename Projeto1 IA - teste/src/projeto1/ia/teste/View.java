package projeto1.ia.teste;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 *
 * @author natan
 */
public class View extends JFrame {

    private int[][] labirinto =
           {{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
            {1, 0, 1, 0, 1, 0, 1, 0, 0, 0, 0, 0, 1},
            {1, 0, 1, 0, 0, 0, 1, 0, 1, 1, 1, 0, 1},
            {1, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 1},
            {1, 0, 1, 0, 0, 0, 0, 0, 1, 1, 1, 0, 1},
            {1, 0, 1, 0, 1, 1, 1, 0, 1, 0, 0, 0, 1},
            {1, 0, 1, 0, 1, 0, 0, 0, 1, 1, 1, 0, 1},
            {1, 0, 1, 0, 1, 1, 1, 0, 1, 0, 1, 0, 1},
            {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 9, 1},
            {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}
           };

    public View() {
        setTitle("Resolvedor de Labirintos !!");
        setSize(640,480);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
    }
    
    @Override
    public void paint(Graphics g){
        
        super.paint(g);
        
        g.translate(50, 50);
        
        for (int linha = 0; linha < labirinto.length; linha++) {
            for (int coluna = 0; coluna < labirinto[0].length; coluna++) {
                Color cor;
                
                switch(labirinto[linha][coluna]){
                    case 1: cor = Color.BLACK; break;
                    case 9: cor = Color.RED; break;
                    default: cor = Color.WHITE; break;
                }
                
                g.setColor(cor);
                g.fillRect(30 * coluna, 30 * linha, 30, 30);
                
                g.setColor(Color.BLACK);
                g.drawRect(30 * coluna, 30 * linha, 30, 30);
            }
        }
        
    }
    
    public static void main(String[] args){
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run(){
                View view = new View();
                view.setVisible(true);
                
            }
        });
    }
    
}
