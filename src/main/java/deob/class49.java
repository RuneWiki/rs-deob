package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

@ObfuscatedName("ar")
public class class49 implements MouseListener, MouseMotionListener, FocusListener {

    @ObfuscatedName("ar.y")
    public static long field467 = 0L;

    @ObfuscatedName("ar.i")
    public static class49 field463 = new class49();

    @ObfuscatedName("ar.r")
    public static volatile int field459 = 0;

    @ObfuscatedName("ar.j")
    public static volatile int field460 = 0;

    @ObfuscatedName("ar.p")
    public static volatile int field461 = -1;

    @ObfuscatedName("ar.e")
    public static volatile int field462 = -1;

    @ObfuscatedName("ar.s")
    public static volatile long field474 = -1L;

    @ObfuscatedName("ar.v")
    public static int field464 = 0;

    @ObfuscatedName("ar.k")
    public static int field465 = 0;

    @ObfuscatedName("ar.o")
    public static int field458 = 0;

    @ObfuscatedName("ar.q")
    public static volatile int field473 = 0;

    @ObfuscatedName("ar.l")
    public static volatile int field469 = 0;

    @ObfuscatedName("ar.f")
    public static volatile int field470 = 0;

    @ObfuscatedName("ar.z")
    public static volatile long field471 = 0L;

    @ObfuscatedName("ar.a")
    public static int field472 = 0;

    @ObfuscatedName("ar.x")
    public static int field457 = 0;

    @ObfuscatedName("ar.b")
    public static int field468 = 0;

    @ObfuscatedName("ar.w")
    public static long field475 = 0L;

    @ObfuscatedName("iq.y(Ljava/awt/Component;I)V")
    public static void method4212(Component arg0) {
        arg0.addMouseListener(field463);
        arg0.addMouseMotionListener(field463);
        arg0.addFocusListener(field463);
    }

    @ObfuscatedName("ak.c(Ljava/awt/Component;B)V")
    public static void method707(Component arg0) {
        arg0.removeMouseListener(field463);
        arg0.removeMouseMotionListener(field463);
        arg0.removeFocusListener(field463);
        field460 = 0;
    }

    @ObfuscatedName("br.n(B)V")
    public static void method967() {
        if (field463 != null) {
            class49 var0 = field463;
            synchronized (field463) {
                field463 = null;
            }
        }
    }

    @ObfuscatedName("gb.u(I)V")
    public static void method3515() {
        class49 var0 = field463;
        synchronized (field463) {
            field464 = field460;
            field465 = field461;
            field458 = field462;
            field467 = field474;
            field472 = field473;
            field457 = field469;
            field468 = field470;
            field475 = field471;
            field473 = 0;
        }
    }

    @ObfuscatedName("k.i(I)I")
    public static int method108() {
        return ++field459 - 1;
    }

    @ObfuscatedName("ar.p(Ljava/awt/event/MouseEvent;I)I")
    public final int method878(MouseEvent arg0) {
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
        if (field463 != null) {
            field459 = 0;
            field469 = arg0.getX();
            field470 = arg0.getY();
            field471 = class187.method1700();
            field473 = this.method878(arg0);
            if (field473 != 0) {
                field460 = field473;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (field463 != null) {
            field459 = 0;
            field460 = 0;
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
        if (field463 != null) {
            field459 = 0;
            field461 = -1;
            field462 = -1;
            field474 = arg0.getWhen();
        }
    }

    public final synchronized void mouseDragged(MouseEvent arg0) {
        this.mouseMoved(arg0);
    }

    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (field463 != null) {
            field459 = 0;
            field461 = arg0.getX();
            field462 = arg0.getY();
            field474 = arg0.getWhen();
        }
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field463 != null) {
            field460 = 0;
        }
    }
}
