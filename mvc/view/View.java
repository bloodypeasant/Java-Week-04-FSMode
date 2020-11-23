package mvc.view;

import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

import mvc.controller.Controller;

public class View extends Canvas {

  private static final long serialVersionUID = 1L;
  private static final int HEIGHT = 600;
  private static final int WIDTH = 800;

  private BufferedImage img;

  public View(Controller controller) {
    setPreferredSize(new Dimension(WIDTH, HEIGHT));
    try {
      img = ImageIO.read(new File("mvc/resources/img.jpg"));
    } catch (Exception e) {
      System.err.println(e.getMessage());
    }
    addMouseListener(controller);
  }

  @Override
  public void paint(Graphics g) {
    g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
  }

}
