package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

@ObfuscatedName("bo")
public class class36 implements MouseListener, MouseMotionListener, FocusListener {

    @ObfuscatedName("bo.ax")
    public static class36 field228 = new class36();

    @ObfuscatedName("bo.ao")
    public static volatile int field231 = 0;

    @ObfuscatedName("bo.ah")
    public static volatile int field230 = 0;

    @ObfuscatedName("bo.ar")
    public static volatile int field229 = -1;

    @ObfuscatedName("bo.ab")
    public static volatile int field232 = -1;

    @ObfuscatedName("bo.am")
    public static volatile long field236 = -1L;

    @ObfuscatedName("bo.av")
    public static int field234 = 0;

    @ObfuscatedName("bo.ag")
    public static int field235 = 0;

    @ObfuscatedName("bo.aa")
    public static int field241 = 0;

    @ObfuscatedName("bo.ap")
    public static long field237 = 0L;

    @ObfuscatedName("bo.ay")
    public static volatile int field238 = 0;

    @ObfuscatedName("bo.as")
    public static volatile int field239 = 0;

    @ObfuscatedName("bo.aj")
    public static volatile int field240 = 0;

    @ObfuscatedName("bo.an")
    public static volatile long field233 = 0L;

    @ObfuscatedName("bo.au")
    public static int field242 = 0;

    @ObfuscatedName("bo.ai")
    public static int field244 = 0;

    @ObfuscatedName("bo.ae")
    public static int field248 = 0;

    @ObfuscatedName("bo.aw")
    public static long field245 = 0L;

    @ObfuscatedName("dq.ac(Ljava/awt/Component;I)V")
    public static void method2182(Component arg0) {
        arg0.addMouseListener(field228);
        arg0.addMouseMotionListener(field228);
        arg0.addFocusListener(field228);
    }

    @ObfuscatedName("rs.al(B)V")
    public static void method7485() {
        if (field228 != null) {
            class36 var0 = field228;
            synchronized (field228) {
                field228 = null;
            }
        }
    }

    @ObfuscatedName("fi.ak(II)V")
    public static void method2928(int arg0) {
        field231 = arg0;
    }

    @ObfuscatedName("bo.ax(Ljava/awt/event/MouseEvent;B)I")
    public final int method640(MouseEvent arg0) {
        int var2 = arg0.getButton();
        if (arg0.isAltDown() || var2 == 2) {
            return 4;
        } else if (arg0.isMetaDown() || var2 == 3) {
            return 2;
        } else {
            return 1;
        }
    }

    public final synchronized void mousePressed(MouseEvent arg0) {
        if (field228 != null) {
            field231 = 0;
            field239 = arg0.getX();
            field240 = arg0.getY();
            field233 = class316.method6401();
            field238 = this.method640(arg0);
            if (field238 != 0) {
                field230 = field238;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (field228 != null) {
            field231 = 0;
            field230 = 0;
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    public final void mouseClicked(MouseEvent arg0) {
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    public final synchronized void mouseEntered(MouseEvent arg0) {
        this.mouseMoved(arg0);
    }

    public final synchronized void mouseExited(MouseEvent arg0) {
        if (field228 != null) {
            field231 = 0;
            field229 = -1;
            field232 = -1;
            field236 = arg0.getWhen();
        }
    }

    public final synchronized void mouseDragged(MouseEvent arg0) {
        this.mouseMoved(arg0);
    }

    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (field228 != null) {
            field231 = 0;
            field229 = arg0.getX();
            field232 = arg0.getY();
            field236 = arg0.getWhen();
        }
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field228 != null) {
            field230 = 0;
        }
    }
}
