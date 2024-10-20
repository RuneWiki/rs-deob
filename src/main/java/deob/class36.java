package deob;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

@ObfuscatedName("bf")
public class class36 implements MouseListener, MouseMotionListener, FocusListener {

    @ObfuscatedName("bf.at")
    public static class36 field252 = new class36();

    @ObfuscatedName("bf.ac")
    public static volatile int field236 = 0;

    @ObfuscatedName("bf.ai")
    public static volatile int field237 = 0;

    @ObfuscatedName("bf.az")
    public static volatile int field238 = -1;

    @ObfuscatedName("bf.ap")
    public static volatile int field239 = -1;

    @ObfuscatedName("bf.aa")
    public static volatile long field240 = -1L;

    @ObfuscatedName("bf.af")
    public static int field241 = 0;

    @ObfuscatedName("bf.ad")
    public static int field255 = 0;

    @ObfuscatedName("bf.aq")
    public static int field233 = 0;

    @ObfuscatedName("bf.al")
    public static long field242 = 0L;

    @ObfuscatedName("bf.an")
    public static volatile int field244 = 0;

    @ObfuscatedName("bf.ar")
    public static volatile int field256 = 0;

    @ObfuscatedName("bf.ab")
    public static volatile int field254 = 0;

    @ObfuscatedName("bf.ag")
    public static volatile long field248 = 0L;

    @ObfuscatedName("bf.am")
    public static int field249 = 0;

    @ObfuscatedName("bf.ax")
    public static int field250 = 0;

    @ObfuscatedName("bf.ah")
    public static int field251 = 0;

    @ObfuscatedName("bf.as")
    public static long field234 = 0L;

    @ObfuscatedName("mh.au(S)I")
    public static int method5453() {
        return ++field236 - 1;
    }

    @ObfuscatedName("as.ae(IB)V")
    public static void method295(int arg0) {
        field236 = arg0;
    }

    @ObfuscatedName("bf.ao(Ljava/awt/event/MouseEvent;I)I")
    public final int method676(MouseEvent arg0) {
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
        if (field252 != null) {
            field236 = 0;
            field256 = arg0.getX();
            field254 = arg0.getY();
            field248 = class302.method655();
            field244 = this.method676(arg0);
            if (field244 != 0) {
                field237 = field244;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (field252 != null) {
            field236 = 0;
            field237 = 0;
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
        if (field252 != null) {
            field236 = 0;
            field238 = -1;
            field239 = -1;
            field240 = arg0.getWhen();
        }
    }

    public final synchronized void mouseDragged(MouseEvent arg0) {
        this.mouseMoved(arg0);
    }

    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (field252 != null) {
            field236 = 0;
            field238 = arg0.getX();
            field239 = arg0.getY();
            field240 = arg0.getWhen();
        }
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field252 != null) {
            field237 = 0;
        }
    }
}
