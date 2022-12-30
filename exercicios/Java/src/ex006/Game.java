package ex006;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

public class Game extends Canvas implements Runnable, MouseListener {
	int mx = -100, my = -100;
	boolean isPressed = false;
	boolean isEntered = false;
	int sqrx,sqry = 0;
	int dir = 0, right = 0, left = 1, top = 2, down = 3;
	int scr_x = 640, scr_y = 640;
	int vel = 1;
	int i = 0;
	

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
			sqrx+=vel;
		} else if (dir == left) {
			sqrx-=vel;
		} else if (dir == top) {
			sqry-=vel;
		} else if (dir == down) {
			sqry+=vel;
		} else {
			System.out.println("Erros foram cometidos!");
		}

		if (sqrx == 0 && sqry == 0) {
			dir = right;
		} else if (sqrx+50 >= scr_x && sqry == 0) {
			dir = down;
		} else if (sqrx+50 >= scr_x && sqry+50 >= scr_y) {
			dir = left;
		} else if (sqrx == 0 && sqry+50 >= scr_y) {
			dir = top;
		}

		if (isPressed) {
			isPressed = false;
			clickEvent();
		}

	}

	public void clickEvent() {
		if (mx >= sqrx && mx <= sqrx+50) {
			if (my >= sqry && my <= sqry+50) {
				i++;
				System.out.println("Clicou! [ x:" +i+" ]");
			}
		}
	}

	public void render() {

		BufferedImage imagem = null;
		try {
		imagem = ImageIO.read(new File("src/ex006/poze.png"));
		} catch (IOException e) {
		e.printStackTrace();
		}
		
		BufferStrategy bs = this.getBufferStrategy();
		if(bs == null)
		{
		this.createBufferStrategy(3);
		return;
		}
		Graphics g = bs.getDrawGraphics();
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, scr_x, scr_y);
		
		g.drawImage(imagem, sqrx, sqry, 50, 50, null);
		
		g.dispose();
		bs.show();
	}
	
	@Override
	public void run() {
		double fps = 60;
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
		mx = e.getX();
		my = e.getY();
		isPressed = true;
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
	}

	@Override
	public void mouseExited(MouseEvent e) {
		
	}
}