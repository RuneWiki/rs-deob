package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

@ObfuscatedName("bc")
public class class36 implements MouseListener, MouseMotionListener, FocusListener {

    @ObfuscatedName("bc.aj")
    public static class36 field224 = new class36();

    @ObfuscatedName("bc.aq")
    public static volatile int field221 = 0;

    @ObfuscatedName("bc.ar")
    public static volatile int field226 = 0;

    @ObfuscatedName("bc.ag")
    public static volatile int field227 = -1;

    @ObfuscatedName("bc.ao")
    public static volatile int field228 = -1;

    @ObfuscatedName("bc.ae")
    public static volatile long field229 = -1L;

    @ObfuscatedName("bc.aa")
    public static int field230 = 0;

    @ObfuscatedName("bc.au")
    public static int field231 = 0;

    @ObfuscatedName("bc.an")
    public static int field239 = 0;

    @ObfuscatedName("bc.ad")
    public static long field233 = 0L;

    @ObfuscatedName("bc.ax")
    public static volatile int field234 = 0;

    @ObfuscatedName("bc.aw")
    public static volatile int field240 = 0;

    @ObfuscatedName("bc.az")
    public static volatile int field236 = 0;

    @ObfuscatedName("bc.av")
    public static volatile long field225 = 0L;

    @ObfuscatedName("bc.ak")
    public static int field238 = 0;

    @ObfuscatedName("bc.ay")
    public static int field232 = 0;

    @ObfuscatedName("bc.as")
    public static int field242 = 0;

    @ObfuscatedName("bc.ab")
    public static long field241 = 0L;

    @ObfuscatedName("hi.am(Ljava/awt/Component;B)V")
    public static void method3557(Component arg0) {
        arg0.removeMouseListener(field224);
        arg0.removeMouseMotionListener(field224);
        arg0.removeFocusListener(field224);
        field226 = 0;
    }

    @ObfuscatedName("im.ap(B)V")
    public static void method3883() {
        class36 var0 = field224;
        synchronized (field224) {
            field230 = field226;
            field231 = field227;
            field239 = field228;
            field233 = field229;
            field238 = field234;
            field232 = field240;
            field242 = field236;
            field241 = field225;
            field234 = 0;
        }
    }

    @ObfuscatedName("hc.af(I)I")
    public static int method3555() {
        return ++field221 - 1;
    }

    @ObfuscatedName("bc.aj(Ljava/awt/event/MouseEvent;B)I")
    public final int method687(MouseEvent arg0) {
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
        if (field224 != null) {
            field221 = 0;
            field240 = arg0.getX();
            field236 = arg0.getY();
            field225 = Statics.method2852();
            field234 = this.method687(arg0);
            if (field234 != 0) {
                field226 = field234;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (field224 != null) {
            field221 = 0;
            field226 = 0;
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
        if (field224 != null) {
            field221 = 0;
            field227 = -1;
            field228 = -1;
            field229 = arg0.getWhen();
        }
    }

    public final synchronized void mouseDragged(MouseEvent arg0) {
        this.mouseMoved(arg0);
    }

    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (field224 != null) {
            field221 = 0;
            field227 = arg0.getX();
            field228 = arg0.getY();
            field229 = arg0.getWhen();
        }
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field224 != null) {
            field226 = 0;
        }
    }
}
