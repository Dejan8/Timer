package timer;

import java.awt.AWTException;
import java.awt.Image;
import java.awt.MenuItem;
import java.awt.PopupMenu;
import java.awt.SystemTray;
import java.awt.TrayIcon;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Timer {
    public static void main(String[] args) {
         PopupMenu pum = new PopupMenu();
            MenuItem settings = new MenuItem("Settings");
            MenuItem miClose = new MenuItem("Close");
            miClose.addActionListener((ActionEvent e) -> {
                System.exit(0);
            });
            settings.addActionListener((ActionEvent e) -> {
                OpFr mjf = new OpFr();
                mjf.setVisible(true);
                mjf.setLocationRelativeTo(mjf);
         });
            pum.add(settings);
            pum.add(miClose);
            

            SystemTray st = SystemTray.getSystemTray();
            try {
                Image img = ImageIO.read(new File("images.png"));
                TrayIcon myTray = new TrayIcon(img);
                myTray.setPopupMenu(pum);
                st.add(myTray);
                myTray.setImageAutoSize(true);
                myTray.setToolTip("Timer assignment");
            } catch (AWTException | IOException ex) {
            }

        
            

    }
    }
    

