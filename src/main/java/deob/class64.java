package deob;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

@ObfuscatedName("bl")
public class class64 implements MouseListener, MouseMotionListener, FocusListener {

    @ObfuscatedName("bl.c")
    public static class64 field495 = new class64();

    @ObfuscatedName("bl.y")
    public static long field500 = 0L;

    @ObfuscatedName("bl.h")
    public static volatile int field496 = 0;

    @ObfuscatedName("bl.z")
    public static volatile int field505 = 0;

    @ObfuscatedName("bl.e")
    public static volatile int field493 = -1;

    @ObfuscatedName("bl.q")
    public static volatile int field499 = -1;

    @ObfuscatedName("bl.l")
    public static volatile long field512 = -1L;

    @ObfuscatedName("bl.s")
    public static int field501 = 0;

    @ObfuscatedName("bl.b")
    public static int field502 = 0;

    @ObfuscatedName("bl.a")
    public static int field503 = 0;

    @ObfuscatedName("bl.w")
    public static volatile int field498 = 0;

    @ObfuscatedName("bl.k")
    public static volatile int field506 = 0;

    @ObfuscatedName("bl.i")
    public static volatile int field507 = 0;

    @ObfuscatedName("bl.x")
    public static volatile long field497 = 0L;

    @ObfuscatedName("bl.f")
    public static int field509 = 0;

    @ObfuscatedName("bl.g")
    public static int field510 = 0;

    @ObfuscatedName("bl.u")
    public static int field511 = 0;

    @ObfuscatedName("bl.t")
    public static long field504 = 0L;

    @ObfuscatedName("bw.v(B)V")
    public static void method829() {
        class64 var0 = field495;
        synchronized (field495) {
            field501 = field505;
            field502 = field493;
            field503 = field499;
            field500 = field512;
            field509 = field498;
            field510 = field506;
            field511 = field507;
            field504 = field497;
            field498 = 0;
        }
    }

    @ObfuscatedName("bl.d(Ljava/awt/event/MouseEvent;I)I")
    public final int method1003(MouseEvent arg0) {
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
        if (field495 != null) {
            field496 = 0;
            field506 = arg0.getX();
            field507 = arg0.getY();
            field497 = class308.method1082();
            field498 = this.method1003(arg0);
            if (field498 != 0) {
                field505 = field498;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (field495 != null) {
            field496 = 0;
            field505 = 0;
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
        if (field495 != null) {
            field496 = 0;
            field493 = -1;
            field499 = -1;
            field512 = arg0.getWhen();
        }
    }

    public final synchronized void mouseDragged(MouseEvent arg0) {
        this.mouseMoved(arg0);
    }

    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (field495 != null) {
            field496 = 0;
            field493 = arg0.getX();
            field499 = arg0.getY();
            field512 = arg0.getWhen();
        }
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field495 != null) {
            field505 = 0;
        }
    }
}
