package deob;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

@ObfuscatedName("bw")
public class class36 implements MouseListener, MouseMotionListener, FocusListener {

    @ObfuscatedName("bw.ai")
    public static class36 field219 = new class36();

    @ObfuscatedName("bw.ar")
    public static volatile int field223 = 0;

    @ObfuscatedName("bw.as")
    public static volatile int field236 = 0;

    @ObfuscatedName("bw.aa")
    public static volatile int field239 = -1;

    @ObfuscatedName("bw.az")
    public static volatile int field222 = -1;

    @ObfuscatedName("bw.ao")
    public static volatile long field235 = -1L;

    @ObfuscatedName("bw.au")
    public static int field228 = 0;

    @ObfuscatedName("bw.ak")
    public static int field229 = 0;

    @ObfuscatedName("bw.ah")
    public static int field230 = 0;

    @ObfuscatedName("bw.aj")
    public static long field231 = 0L;

    @ObfuscatedName("bw.af")
    public static volatile int field232 = 0;

    @ObfuscatedName("bw.ax")
    public static volatile int field224 = 0;

    @ObfuscatedName("bw.an")
    public static volatile int field234 = 0;

    @ObfuscatedName("bw.ag")
    public static volatile long field226 = 0L;

    @ObfuscatedName("bw.am")
    public static int field227 = 0;

    @ObfuscatedName("bw.ad")
    public static int field225 = 0;

    @ObfuscatedName("bw.at")
    public static int field238 = 0;

    @ObfuscatedName("bw.ay")
    public static long field233 = 0L;

    @ObfuscatedName("om.aw(II)V")
    public static void method6384(int arg0) {
        field223 = arg0;
    }

    @ObfuscatedName("bw.al(Ljava/awt/event/MouseEvent;B)I")
    public final int method606(MouseEvent arg0) {
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
        if (field219 != null) {
            field223 = 0;
            field224 = arg0.getX();
            field234 = arg0.getY();
            field226 = class318.method2218();
            field232 = this.method606(arg0);
            if (field232 != 0) {
                field236 = field232;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (field219 != null) {
            field223 = 0;
            field236 = 0;
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
        if (field219 != null) {
            field223 = 0;
            field239 = -1;
            field222 = -1;
            field235 = arg0.getWhen();
        }
    }

    public final synchronized void mouseDragged(MouseEvent arg0) {
        this.mouseMoved(arg0);
    }

    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (field219 != null) {
            field223 = 0;
            field239 = arg0.getX();
            field222 = arg0.getY();
            field235 = arg0.getWhen();
        }
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field219 != null) {
            field236 = 0;
        }
    }
}
