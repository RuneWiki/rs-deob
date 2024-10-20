package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

@ObfuscatedName("ap")
public class class49 implements MouseListener, MouseMotionListener, FocusListener {

    @ObfuscatedName("ap.q")
    public static class49 field471 = new class49();

    @ObfuscatedName("ap.c")
    public static volatile int field485 = 0;

    @ObfuscatedName("ap.l")
    public static volatile int field482 = 0;

    @ObfuscatedName("ap.b")
    public static volatile int field467 = -1;

    @ObfuscatedName("ap.w")
    public static volatile int field464 = -1;

    @ObfuscatedName("ap.n")
    public static volatile long field469 = -1L;

    @ObfuscatedName("ap.i")
    public static int field470 = 0;

    @ObfuscatedName("ap.p")
    public static int field474 = 0;

    @ObfuscatedName("ap.m")
    public static int field465 = 0;

    @ObfuscatedName("ap.d")
    public static long field473 = 0L;

    @ObfuscatedName("ap.j")
    public static volatile int field472 = 0;

    @ObfuscatedName("ap.x")
    public static volatile int field475 = 0;

    @ObfuscatedName("ap.v")
    public static volatile int field476 = 0;

    @ObfuscatedName("ap.h")
    public static volatile long field477 = 0L;

    @ObfuscatedName("ap.f")
    public static int field478 = 0;

    @ObfuscatedName("ap.a")
    public static int field479 = 0;

    @ObfuscatedName("ap.t")
    public static int field468 = 0;

    @ObfuscatedName("ap.k")
    public static long field466 = 0L;

    @ObfuscatedName("ae.g(Ljava/awt/Component;I)V")
    public static void method540(Component arg0) {
        arg0.addMouseListener(field471);
        arg0.addMouseMotionListener(field471);
        arg0.addFocusListener(field471);
    }

    @ObfuscatedName("cx.r(II)V")
    public static void method2035(int arg0) {
        field485 = arg0;
    }

    @ObfuscatedName("ap.e(Ljava/awt/event/MouseEvent;I)I")
    public final int method906(MouseEvent arg0) {
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
        if (field471 != null) {
            field485 = 0;
            field475 = arg0.getX();
            field476 = arg0.getY();
            field477 = class187.method2664();
            field472 = this.method906(arg0);
            if (field472 != 0) {
                field482 = field472;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (field471 != null) {
            field485 = 0;
            field482 = 0;
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
        if (field471 != null) {
            field485 = 0;
            field467 = -1;
            field464 = -1;
            field469 = arg0.getWhen();
        }
    }

    public final synchronized void mouseDragged(MouseEvent arg0) {
        this.mouseMoved(arg0);
    }

    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (field471 != null) {
            field485 = 0;
            field467 = arg0.getX();
            field464 = arg0.getY();
            field469 = arg0.getWhen();
        }
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field471 != null) {
            field482 = 0;
        }
    }
}
