package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

@ObfuscatedName("at")
public class class36 implements MouseListener, MouseMotionListener, FocusListener {

    @ObfuscatedName("at.t")
    public static class36 field482 = new class36();

    @ObfuscatedName("at.n")
    public static volatile int field484 = 0;

    @ObfuscatedName("at.q")
    public static volatile int field480 = 0;

    @ObfuscatedName("at.h")
    public static volatile int field483 = -1;

    @ObfuscatedName("at.k")
    public static int field486 = 0;

    @ObfuscatedName("at.r")
    public static volatile int field493 = -1;

    @ObfuscatedName("at.l")
    public static int field485 = 0;

    @ObfuscatedName("at.i")
    public static int field487 = 0;

    @ObfuscatedName("at.e")
    public static volatile int field488 = 0;

    @ObfuscatedName("at.a")
    public static volatile int field492 = 0;

    @ObfuscatedName("at.g")
    public static volatile int field490 = 0;

    @ObfuscatedName("at.w")
    public static volatile long field491 = 0L;

    @ObfuscatedName("at.v")
    public static int field481 = 0;

    @ObfuscatedName("at.u")
    public static int field489 = 0;

    @ObfuscatedName("at.m")
    public static int field494 = 0;

    @ObfuscatedName("at.b")
    public static long field495 = 0L;

    @ObfuscatedName("k.t(Ljava/awt/Component;I)V")
    public static void method52(Component arg0) {
        arg0.addMouseListener(field482);
        arg0.addMouseMotionListener(field482);
        arg0.addFocusListener(field482);
    }

    @ObfuscatedName("i.n(Ljava/awt/Component;I)V")
    public static void method66(Component arg0) {
        arg0.removeMouseListener(field482);
        arg0.removeMouseMotionListener(field482);
        arg0.removeFocusListener(field482);
        field480 = 0;
    }

    @ObfuscatedName("i.q(S)V")
    public static void method64() {
        if (field482 != null) {
            class36 var0 = field482;
            synchronized (field482) {
                field482 = null;
            }
        }
    }

    public final synchronized void mousePressed(MouseEvent arg0) {
        if (field482 != null) {
            field484 = 0;
            field492 = arg0.getX();
            field490 = arg0.getY();
            field491 = class63.method697();
            if (arg0.isMetaDown()) {
                field488 = 2;
                field480 = 2;
            } else {
                field488 = 1;
                field480 = 1;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (field482 != null) {
            field484 = 0;
            field480 = 0;
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
        if (field482 != null) {
            field484 = 0;
            field483 = arg0.getX();
            field493 = arg0.getY();
        }
    }

    public final synchronized void mouseExited(MouseEvent arg0) {
        if (field482 != null) {
            field484 = 0;
            field483 = -1;
            field493 = -1;
        }
    }

    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (field482 != null) {
            field484 = 0;
            field483 = arg0.getX();
            field493 = arg0.getY();
        }
    }

    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (field482 != null) {
            field484 = 0;
            field483 = arg0.getX();
            field493 = arg0.getY();
        }
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field482 != null) {
            field480 = 0;
        }
    }
}
