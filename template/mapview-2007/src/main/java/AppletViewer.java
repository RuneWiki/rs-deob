import javax.swing.*;
import java.applet.Applet;
import java.applet.AppletStub;
import java.awt.*;
import java.net.*;
import java.util.Properties;

// properly, you'd use JagexAppletViewer, but this is handy for quick testing
public class AppletViewer extends Applet implements AppletStub {
    public static final String HOST_ADDRESS = "127.0.0.1";

    public static Properties client_parameters = new Properties();

    static {
        client_parameters.put("codeversion", "0");
    }

    public static void main(String[] args) {
        AppletViewer applet = new AppletViewer();
        applet.start();
    }

    public void start() {
        try {
            JFrame frame = new JFrame("World Map");
            frame.add(this);
            frame.getContentPane().setBackground(Color.BLACK);
            frame.setVisible(true);
            frame.setSize(1280, 720);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
            frame.setLocation(dim.width / 2 - frame.getSize().width / 2, dim.height / 2 - frame.getSize().height / 2);
            frame.toFront();

            class6 sign = new class6(false, this, 32, "runescape", 2);
            class30.providesignlink(sign);

            mapview app = new mapview();
            app.init();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void appletResize(int dimensionX, int dimensionY) {
        super.resize(new Dimension(dimensionX, dimensionY));
    }

    @Override
    public String getParameter(String paramName) {
        return (String) client_parameters.get(paramName);
    }

    @Override
    public URL getDocumentBase() {
        return this.getCodeBase();
    }

    @Override
    public URL getCodeBase() {
        try {
            return new URL("http://" + HOST_ADDRESS);
        } catch (MalformedURLException ex) {
            ex.printStackTrace();
        }

        return null;
    }
}
