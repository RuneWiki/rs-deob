package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

@ObfuscatedName("bo")
public class class54 implements MouseListener, MouseMotionListener, FocusListener {

    @ObfuscatedName("bo.x")
    public static int field489 = 0;

    @ObfuscatedName("bo.h")
    public static class54 field481 = new class54();

    @ObfuscatedName("bo.f")
    public static volatile int field482 = 0;

    @ObfuscatedName("bo.p")
    public static volatile int field483 = 0;

    @ObfuscatedName("bo.m")
    public static volatile int field484 = -1;

    @ObfuscatedName("bo.q")
    public static volatile int field498 = -1;

    @ObfuscatedName("bo.b")
    public static volatile long field486 = -1L;

    @ObfuscatedName("bo.n")
    public static int field487 = 0;

    @ObfuscatedName("bo.e")
    public static int field488 = 0;

    @ObfuscatedName("bo.r")
    public static long field493 = 0L;

    @ObfuscatedName("bo.t")
    public static volatile int field490 = 0;

    @ObfuscatedName("bo.l")
    public static volatile int field492 = 0;

    @ObfuscatedName("bo.o")
    public static volatile int field495 = 0;

    @ObfuscatedName("bo.u")
    public static volatile long field494 = 0L;

    @ObfuscatedName("bo.y")
    public static int field497 = 0;

    @ObfuscatedName("bo.k")
    public static int field496 = 0;

    @ObfuscatedName("bo.v")
    public static int field480 = 0;

    @ObfuscatedName("bo.d")
    public static long field491 = 0L;

    @ObfuscatedName("kw.a(Ljava/awt/Component;I)V")
    public static void method5294(Component arg0) {
        arg0.addMouseListener(field481);
        arg0.addMouseMotionListener(field481);
        arg0.addFocusListener(field481);
    }

    @ObfuscatedName("gw.s(Ljava/awt/Component;B)V")
    public static void method3776(Component arg0) {
        arg0.removeMouseListener(field481);
        arg0.removeMouseMotionListener(field481);
        arg0.removeFocusListener(field481);
        field483 = 0;
    }

    @ObfuscatedName("ct.g(I)V")
    public static void method1959() {
        if (field481 != null) {
            class54 var0 = field481;
            synchronized (field481) {
                field481 = null;
            }
        }
    }

    @ObfuscatedName("at.x(I)V")
    public static void method536() {
        class54 var0 = field481;
        synchronized (field481) {
            field487 = field483;
            field488 = field484;
            field489 = field498;
            field493 = field486;
            field497 = field490;
            field496 = field492;
            field480 = field495;
            field491 = field494;
            field490 = 0;
        }
    }

    @ObfuscatedName("bv.h(S)I")
    public static int method1047() {
        return ++field482 - 1;
    }

    @ObfuscatedName("bo.f(Ljava/awt/event/MouseEvent;I)I")
    public final int method918(MouseEvent arg0) {
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
        if (field481 != null) {
            field482 = 0;
            field492 = arg0.getX();
            field495 = arg0.getY();
            field494 = class192.method183();
            field490 = this.method918(arg0);
            if (field490 != 0) {
                field483 = field490;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (field481 != null) {
            field482 = 0;
            field483 = 0;
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
        if (field481 != null) {
            field482 = 0;
            field484 = -1;
            field498 = -1;
            field486 = arg0.getWhen();
        }
    }

    public final synchronized void mouseDragged(MouseEvent arg0) {
        this.mouseMoved(arg0);
    }

    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (field481 != null) {
            field482 = 0;
            field484 = arg0.getX();
            field498 = arg0.getY();
            field486 = arg0.getWhen();
        }
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field481 != null) {
            field483 = 0;
        }
    }
}
