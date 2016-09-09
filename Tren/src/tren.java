
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class tren extends JPanel{
    
    int w,x;
    
    public void paint(Graphics g){
       
        g.setColor(Color.GREEN);  // Fondo
        g.fillRect(0, 442, 850, 20);
        g.setColor(new Color(160,160,160));
        g.fillRect(0, 388, 850, 55);
        g.setColor(new Color(0,180,255));
        g.fillRect(0, 0, 850, 300);
        g.setColor(Color.BLACK); // La punta de los cerros
        g.fillOval(195, 95, 170, 140);
        g.fillOval(545, 95, 150, 140);
        g.fillOval(376, 80, 134, 134);
        
        for(int a=0; a<=13;a++){   // Las vias
            for(int i=0; i<=3;i++){
                w=i+a*60;
                x=i+a*60+10;
                g.setColor(Color.BLACK);
                g.drawLine(w, 440, x, 388);
                g.drawLine(w+16, 440, x+16, 388);
                g.setColor(Color.RED);
                g.drawLine(w+4, 440, x+4, 388);
                g.drawLine(w+8, 440, x+8, 388);
                g.drawLine(w+12, 440, x+12, 388);
             }
        }
        
        for(int a=0; a<=5;a++){ // Las llantas
                x=140+a*90+a*20;
                g.setColor(Color.BLACK);
                g.fillOval(x-4, 391, 40, 40);
                g.setColor(Color.WHITE);
                g.fillOval(x, 395,32, 32);
        }
        
        for(int a=0; a<=2;a++){  // Los conectores de las llantas
                x=154+a*180+a*40;
                g.setColor(Color.BLACK);
                g.fillRoundRect(x, 398, 70, 16, 20, 25);
                g.setColor(Color.WHITE);
                g.fillRoundRect(x+4, 402, 62, 8, 20, 25);
                g.setColor(Color.BLACK);
                g.fillRoundRect(x+40, 408, 70, 16, 20, 25);
                g.setColor(Color.WHITE);
                g.fillRoundRect(x+44, 412, 62, 8, 20, 25);
             
        }
        
        g.setColor(Color.YELLOW); //  Lo amarrillo del Sol
        g.fillOval(380, 84, 126, 126);
        g.setColor(Color.BLACK);
        
        for(int a=0; a<=3;a++){      // Los rayos
        g.drawLine(442+a, 76, 442+a, 20);
        g.drawLine(400, 90+a, 372, 44+a);
        g.drawLine(372, 130+a, 326, 96+a);
        g.drawLine(484, 90+a, 512, 44+a);
        g.drawLine(512, 130+a, 558, 96+a);
        g.drawLine(384, 108+a, 360, 88+a);
        g.drawLine(502, 110+a, 524, 88+a);
        g.drawLine(420+a, 80, 410+a, 54);
        g.drawLine(464+a, 80, 474+a, 54);
        }
        
        g.setColor(new Color(185,122,87)); // Pinta los cerros
        g.fillRect(0, 250, 850, 134);
        g.fillOval(200, 100, 160, 130);
        g.fillOval(550, 100, 140, 130);
        g.fillRect(202, 150, 156, 130);
        g.fillRect(552, 150, 136, 130);
        for(int a=1; a<=124;a++){
            g.drawLine(0, 250+a, 230, 113+a);
            g.drawLine(542, 260+a, 332, 114+a);
            g.drawLine(430, 180+a, 577, 113+a);
            g.drawLine(850, 220+a, 650, 105+a);
        }
        
        for(int a=0; a<=4;a++){ // Las lineas de los costados de los cerros
            g.setColor(Color.BLACK);
            g.drawLine(0, 250-a, 230, 113-a);
            g.drawLine(542, 260-a, 332, 114-a);
            g.drawLine(430, 180-a, 577, 113-a);
            g.drawLine(850, 220-a, 650, 105-a);
        }
        
        for(int a=0; a<=5;a++){  // Circulos de fonde del humo de caldera
        g.fillOval(692-a*8, 246-a*12, 62-a*4, 32-a);
        }
        
        g.fillOval(339, 304, 50, 50);     // La nube o palos del vagon dos
        g.fillOval(370, 290, 50, 100);
        g.fillOval(398, 304, 40, 40);
        g.fillOval(424, 296, 50, 60);
        g.fillOval(444, 308, 60, 60);
        g.fillOval(480, 312, 40, 60);
        g.setColor(new Color(199,199,199));
        g.fillOval(343, 308, 42, 42);
        g.fillOval(374, 294, 42, 92);
        g.fillOval(402, 308, 32, 32);
        g.fillOval(428, 300, 42, 52);
        g.fillOval(448, 312, 52, 52);
        g.fillOval(484, 316, 32, 52);
        
        g.setColor(new Color(233,234,235));
        for(int a=0; a<=5;a++){    // humo de caldera
        g.fillOval(696-a*8, 250-a*12, 54-a*4, 24-a);
        }
        
        g.setColor(new Color(102,15,17)); // El arbol
         for(int a=0;a<=49;a++){
         g.drawArc(-36+a, 210, 80, 180, 290, 80);
         g.drawArc(90-a, 210, 80, 180, 170, 80);
         }
         
         g.setColor(Color.BLACK); // El arbol
         for(int a=0;a<=3;a++){
         g.drawArc(-40+a, 210, 80, 180, 290, 80);
         g.drawArc(90+a, 210, 80, 180, 170, 80);
         }
         
        g.setColor(Color.BLACK);    // Los vagones
        g.fillRect(0, 441, 850, 4);
        g.fillRect(0, 384, 850, 4);
        g.fillRect(120, 266, 180, 128);
        g.fillRect(340, 330, 180, 64);
        g.fillRect(560, 326, 180, 68);
        g.fillRect(560, 266, 76, 64);
        g.fillRect(710, 286, 30, 44);
        g.fillRect(700, 266, 50, 20);
        
        g.fillRect(300, 368, 40, 14);  // conectores de los vagones
        g.fillRect(520, 368, 40, 14);
        
        for(int a=0; a<=1;a++){
        g.fillOval(36+a*4, 250+a*4, 60-a*8, 60-a*8); // Follaje del arbol
        g.fillOval(20+a*4, 240+a*4, 60-a*8, 60-a*8);
        g.fillOval(6+a*4, 226+a*4, 60-a*8, 60-a*8);
        g.fillOval(0+a*4, 210+a*4, 60-a*8, 60-a*8);
        g.fillOval(6+a*4, 194+a*4, 60-a*8, 60-a*8);
        g.fillOval(20+a*4, 178+a*4, 60-a*8, 60-a*8);
        g.fillOval(36+a*4, 168+a*4, 60-a*8, 60-a*8); // Follaje del arbol
        g.fillOval(52+a*4, 240+a*4, 60-a*8, 60-a*8);
        g.fillOval(68+a*4, 226+a*4, 60-a*8, 60-a*8);
        g.fillOval(72+a*4, 210+a*4, 60-a*8, 60-a*8);
        g.fillOval(68+a*4, 194+a*4, 60-a*8, 60-a*8);
        g.fillOval(52+a*4, 178+a*4, 60-a*8, 60-a*8);
        g.setColor(Color.GREEN);
        }
        g.fillOval(26, 200, 60, 60);
        
        g.setColor(Color.BLACK);
        for(int a=0; a<=67;a++){ // Triangulo del primer vagon
            g.drawLine(740, 326, 740+a, 393);
        }
        g.setColor(Color.YELLOW);
        for(int a=0; a<=58;a++){ // Triangulo del primer vagon
            g.drawLine(740, 331, 740+a, 389);
        }
        
        g.setColor(new Color(255,138,21)); // Anaranjado del primer y ultimo vagon
        g.fillRect(124, 270, 172, 120);
        g.fillRect(564, 330, 172, 60);
        g.fillRect(564, 270, 68, 60);
        g.fillRect(714, 286, 22, 40);
        g.fillRect(704, 270, 42, 12);
        
        g.fillRect(570, 278, 56, 46); // Ventana del primer vagon
        
        for(int a=0; a<=2;a++){ //Ventanas del ultimo vagon
        g.setColor(Color.BLACK);
        g.fillRect(135+a*55, 280, 42, 42);
        g.setColor(new Color(0,221,221));
        g.fillRect(139+a*55, 284, 34, 34);
        }
        
        g.fillRect(574, 282, 48, 38); // Ventana del primer vagon
        
        g.setColor(Color.BLACK);  // Cuadro inferior del ultimo vagon
        g.fillRect(135, 332, 152, 48);
        
         for(int a=0; a<=3;a++){ //  Lineas cerca del triangulo del primer vagon
                g.fillRect(702-a*10, 360+a*8, 30+a*10, 3);
         }
         
         g.setColor(new Color(250,221,160)); // Pintura de cuadro inferior del ultimo vagon
         g.fillRect(139, 336, 144, 40);
         g.setColor(Color.BLACK);  
         g.fillRect(145, 342, 132, 28);
         for(int a=0; a<=3;a++){ 
            g.drawLine(137+a, 336, 147+a, 346);
            g.drawLine(137+a, 376, 147+a, 366);
            g.drawLine(281+a, 336, 271+a, 346);
            g.drawLine(281+a, 376, 271+a, 366);
        }
         
         for(int a=0; a<=1;a++){    // fonde de las nubes
             for(int b=0; b<=1;b++){
                 g.fillOval(80+b*600, 40+a*20, 40, 40);
                 g.fillOval(150+b*600, 40+a*20, 40, 40);
             }
             g.fillOval(95+a*600, 36, 80, 70);
         }
         
         g.setColor(Color.WHITE);
         for(int a=0; a<=1;a++){    // nubes
             for(int b=0; b<=1;b++){
                 g.fillOval(84+b*600, 44+a*20, 32, 32);
                 g.fillOval(154+b*600, 44+a*20, 32, 32);
             }
             g.fillOval(99+a*600, 40, 72, 62);
         }    
         
         g.setColor(Color.YELLOW);  // Acabado del cuadro inferior del ultimo vagon
         g.fillRect(149, 346, 124, 20);
         
         g.setColor(Color.BLACK); // El arbol
        g.fillRect(0, 441, 850, 4); // Linea superior de la via
    }
}
