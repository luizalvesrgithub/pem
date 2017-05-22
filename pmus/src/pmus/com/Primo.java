package pmus.com;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class Primo  extends Applet
{   
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void paint( Graphics g )
    {   int xBase   = 20;
        int top     = 20;
        int yScale  = 200;
        int xAxis   = 360;

        int yBase   = top + yScale;
        int x, y;

        // Primeiro desenhamos os eixos abcissas e ordenadas
        g.drawLine( xBase, top, xBase, top + 2*yScale );
        g.drawLine( xBase, yBase, xBase + xAxis, yBase );

        // Depois plotamos a senóide para o intervalo de 0 a 360 graus
        // Observe 
        g.setColor( Color.red );

        for( int i=0; i < xAxis; i++ )
        {   x = xBase + i;
            y = (int)( yBase - Math.sin( Math.toRadians(i) ) * yScale );
            // there's no drawPoint in java so draw a VERY short line
            g.drawLine( x, y, x, y );
        }
    }
}