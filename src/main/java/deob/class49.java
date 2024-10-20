package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

@ObfuscatedName("ai")
public class class49 implements MouseListener, MouseMotionListener, FocusListener {

    @ObfuscatedName("ai.k")
    public static int field456 = 0;

    @ObfuscatedName("ai.u")
    public static class49 field450 = new class49();

    @ObfuscatedName("ai.i")
    public static volatile int field457 = 0;

    @ObfuscatedName("ai.t")
    public static volatile int field452 = 0;

    @ObfuscatedName("ai.p")
    public static volatile int field459 = -1;

    @ObfuscatedName("ai.l")
    public static volatile int field454 = -1;

    @ObfuscatedName("ai.b")
    public static volatile long field455 = -1L;

    @ObfuscatedName("ai.c")
    public static int field466 = 0;

    @ObfuscatedName("ai.d")
    public static int field458 = 0;

    @ObfuscatedName("ai.w")
    public static long field449 = 0L;

    @ObfuscatedName("ai.a")
    public static volatile int field460 = 0;

    @ObfuscatedName("ai.z")
    public static volatile int field451 = 0;

    @ObfuscatedName("ai.e")
    public static volatile int field462 = 0;

    @ObfuscatedName("ai.q")
    public static volatile long field463 = 0L;

    @ObfuscatedName("ai.j")
    public static int field464 = 0;

    @ObfuscatedName("ai.y")
    public static int field465 = 0;

    @ObfuscatedName("ai.m")
    public static int field447 = 0;

    @ObfuscatedName("ai.h")
    public static long field453 = 0L;

    @ObfuscatedName("aq.v(Ljava/awt/Component;I)V")
    public static void method617(Component arg0) {
        arg0.addMouseListener(field450);
        arg0.addMouseMotionListener(field450);
        arg0.addFocusListener(field450);
    }

    @ObfuscatedName("dr.s(Ljava/awt/Component;I)V")
    public static void method2376(Component arg0) {
        arg0.removeMouseListener(field450);
        arg0.removeMouseMotionListener(field450);
        arg0.removeFocusListener(field450);
        field452 = 0;
    }

    @ObfuscatedName("r.o(B)V")
    public static void method457() {
        if (field450 != null) {
            class49 var0 = field450;
            synchronized (field450) {
                field450 = null;
            }
        }
    }

    @ObfuscatedName("k.k(IB)V")
    public static void method41(int arg0) {
        field457 = arg0;
    }

    @ObfuscatedName("ai.u(Ljava/awt/event/MouseEvent;I)I")
    public final int method862(MouseEvent arg0) {
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
        if (field450 != null) {
            field457 = 0;
            field451 = arg0.getX();
            field462 = arg0.getY();
            field463 = class187.method3154();
            field460 = this.method862(arg0);
            if (field460 != 0) {
                field452 = field460;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (field450 != null) {
            field457 = 0;
            field452 = 0;
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
        if (field450 != null) {
            field457 = 0;
            field459 = -1;
            field454 = -1;
            field455 = arg0.getWhen();
        }
    }

    public final synchronized void mouseDragged(MouseEvent arg0) {
        this.mouseMoved(arg0);
    }

    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (field450 != null) {
            field457 = 0;
            field459 = arg0.getX();
            field454 = arg0.getY();
            field455 = arg0.getWhen();
        }
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field450 != null) {
            field452 = 0;
        }
    }
}
