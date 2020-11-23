package mvc.controller;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import mvc.App;

public class Controller implements MouseListener {

  private App app;

  public Controller(App app) {
    this.app = app;
  }

  @Override
  public void mouseClicked(MouseEvent arg0) {
    app.toggleFS();
  }

  @Override
  public void mouseEntered(MouseEvent arg0) {
    // TODO Auto-generated method stub
  }

  @Override
  public void mouseExited(MouseEvent arg0) {
    // TODO Auto-generated method stub
  }

  @Override
  public void mousePressed(MouseEvent arg0) {
    // TODO Auto-generated method stub
  }

  @Override
  public void mouseReleased(MouseEvent arg0) {
    // TODO Auto-generated method stub
  }

}
