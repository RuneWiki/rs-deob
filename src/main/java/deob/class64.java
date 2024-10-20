package deob;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

@ObfuscatedName("bc")
public class class64 implements MouseListener, MouseMotionListener, FocusListener {

    @ObfuscatedName("bc.x")
    public static int field500 = 0;

    @ObfuscatedName("bc.t")
    public static class64 field486 = new class64();

    @ObfuscatedName("bc.j")
    public static volatile int field487 = 0;

    @ObfuscatedName("bc.n")
    public static volatile int field495 = 0;

    @ObfuscatedName("bc.p")
    public static volatile int field489 = -1;

    @ObfuscatedName("bc.l")
    public static volatile int field506 = -1;

    @ObfuscatedName("bc.z")
    public static volatile long field491 = -1L;

    @ObfuscatedName("bc.u")
    public static int field492 = 0;

    @ObfuscatedName("bc.e")
    public static int field493 = 0;

    @ObfuscatedName("bc.m")
    public static long field502 = 0L;

    @ObfuscatedName("bc.c")
    public static volatile int field496 = 0;

    @ObfuscatedName("bc.i")
    public static volatile int field497 = 0;

    @ObfuscatedName("bc.f")
    public static volatile int field498 = 0;

    @ObfuscatedName("bc.a")
    public static volatile long field499 = 0L;

    @ObfuscatedName("bc.b")
    public static int field484 = 0;

    @ObfuscatedName("bc.y")
    public static int field490 = 0;

    @ObfuscatedName("bc.r")
    public static int field503 = 0;

    @ObfuscatedName("bc.q")
    public static long field501 = 0L;

    @ObfuscatedName("w.h(I)V")
    public static void method34() {
        if (field486 != null) {
            class64 var0 = field486;
            synchronized (field486) {
                field486 = null;
            }
        }
    }

    @ObfuscatedName("t.v(I)V")
    public static void method39() {
        class64 var0 = field486;
        synchronized (field486) {
            field492 = field495;
            field493 = field489;
            field500 = field506;
            field502 = field491;
            field484 = field496;
            field490 = field497;
            field503 = field498;
            field501 = field499;
            field496 = 0;
        }
    }

    @ObfuscatedName("ed.x(I)I")
    public static int method3121() {
        return ++field487 - 1;
    }

    @ObfuscatedName("co.w(IB)V")
    public static void method2149(int arg0) {
        field487 = arg0;
    }

    @ObfuscatedName("bc.t(Ljava/awt/event/MouseEvent;I)I")
    public final int method1013(MouseEvent arg0) {
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
        if (field486 != null) {
            field487 = 0;
            field497 = arg0.getX();
            field498 = arg0.getY();
            field499 = class308.method4891();
            field496 = this.method1013(arg0);
            if (field496 != 0) {
                field495 = field496;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (field486 != null) {
            field487 = 0;
            field495 = 0;
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
        if (field486 != null) {
            field487 = 0;
            field489 = -1;
            field506 = -1;
            field491 = arg0.getWhen();
        }
    }

    public final synchronized void mouseDragged(MouseEvent arg0) {
        this.mouseMoved(arg0);
    }

    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (field486 != null) {
            field487 = 0;
            field489 = arg0.getX();
            field506 = arg0.getY();
            field491 = arg0.getWhen();
        }
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field486 != null) {
            field495 = 0;
        }
    }
}
