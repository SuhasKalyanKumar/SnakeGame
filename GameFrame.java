package snakeGame;

import javax.swing.JFrame;

public class GameFrame extends JFrame{
	GameFrame(){
		GamePanel panel = new GamePanel();
		add(panel);
		setTitle("Snake Game");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		//setLocationRelativeTo(null);
		pack();
		setVisible(true);
	}
}
