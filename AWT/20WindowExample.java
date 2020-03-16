/*public abstract void windowActivated(WindowEvent e);  
public abstract void windowClosed(WindowEvent e);  
public abstract void windowClosing(WindowEvent e);  
public abstract void windowDeactivated(WindowEvent e);  
public abstract void windowDeiconified(WindowEvent e);  
public abstract void windowIconified(WindowEvent e);  
public abstract void windowOpened(WindowEvent e);  
Java WindowListener Example
*/

import java.awt.*;  
import java.awt.event.WindowEvent;  
import java.awt.event.WindowListener;  
class WindowExample extends Frame implements WindowListener{  
    WindowExample(){  
        addWindowListener(this);  
          
        setSize(400,400);  
        setLayout(null);  
        setVisible(true);  
    }  
      
public static void main(String[] args) {  
    new WindowExample();  
}  
public void windowActivated(WindowEvent arg0) {  
    System.out.println("activated");  
}  
public void windowClosed(WindowEvent arg0) {  
    System.out.println("closed");  
}  
public void windowClosing(WindowEvent arg0) {  
    System.out.println("closing");  
    dispose();  
}  
public void windowDeactivated(WindowEvent arg0) {  
    System.out.println("deactivated");  
}  
public void windowDeiconified(WindowEvent arg0) {  
    System.out.println("deiconified");  
}  
public void windowIconified(WindowEvent arg0) {  
    System.out.println("iconified");  
}  
public void windowOpened(WindowEvent arg0) {  
    System.out.println("opened");  
}  
}  