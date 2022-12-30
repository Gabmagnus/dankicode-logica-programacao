package ex005;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferStrategy;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;

public class Game extends Canvas implements Runnable, MouseListener{
	int x,y = 0;
	int dir = 5, right = 0, left = 1, top = 2, down = 3;
	int scr_x = 640, scr_y = 640;
	int vel = 4;

	public static void main(String[] args) {
		Game game = new Game();
		JFrame frame = new JFrame();
		frame.setTitle("Exercicio Logica");
		frame.add(game);
		frame.setResizable(false);
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		new Thread(game).start();
	}

	public Game() {
		this.addMouseListener(this);
		this.setPreferredSize(new Dimension(scr_x,scr_y));
	}
	
	public void update() {
		if (dir == right) {
			x+=vel;
		} else if (dir == left) {
			x-=vel;
		} else if (dir == top) {
			y-=vel;
		} else if (dir == down) {
			y+=vel;
		} else {
			System.out.println("Erros foram cometidos!");
		}

		if (x == 0 && y == 0) {
			dir = right;
		} else if (x+50 >= scr_x && y == 0) {
			dir = down;
		} else if (x+50 >= scr_x && y+50 >= scr_y) {
			dir = left;
		} else if (x == 0 && y+50 >= scr_y) {
			dir = top;
		}

	}

	public void render() {
		BufferStrategy bs = this.getBufferStrategy();
		if(bs == null)
		{
			this.createBufferStrategy(3);
			return;
		}
		Graphics g = bs.getDrawGraphics();
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, scr_x, scr_y);

		//

		if (dir == right) {
			g.setColor(Color.RED);
		} else if (dir == left) {
			g.setColor(Color.BLUE);
		} else if (dir == top) {
			g.setColor(Color.MAGENTA);
		} else if (dir == down) {
			g.setColor(Color.GREEN);

		} else {
			System.out.println("Erros foram cometidos!");
		}
		g.fillRect(x, y, 50, 50);
		
		g.dispose();
		bs.show();
		
	}
	
	@Override
	public void run() {
		double fps = 144.0;
		while(true) {
			update();
			render();
			try {
				Thread.sleep((int)(1000/fps));
			} catch (InterruptedException e) {}
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}