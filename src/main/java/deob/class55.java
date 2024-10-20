package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

@ObfuscatedName("bd")
public class class55 implements MouseListener, MouseMotionListener, FocusListener {

    @ObfuscatedName("bd.u")
    public static class55 field459 = new class55();

    @ObfuscatedName("bd.r")
    public static volatile int field460 = 0;

    @ObfuscatedName("bd.p")
    public static volatile int field470 = 0;

    @ObfuscatedName("bd.q")
    public static volatile int field457 = -1;

    @ObfuscatedName("bd.m")
    public static volatile int field463 = -1;

    @ObfuscatedName("bd.y")
    public static long field468 = 0L;

    @ObfuscatedName("bd.i")
    public static volatile long field462 = -1L;

    @ObfuscatedName("bd.c")
    public static int field465 = 0;

    @ObfuscatedName("bd.b")
    public static int field466 = 0;

    @ObfuscatedName("bd.o")
    public static int field467 = 0;

    @ObfuscatedName("bd.a")
    public static volatile int field469 = 0;

    @ObfuscatedName("bd.e")
    public static volatile int field461 = 0;

    @ObfuscatedName("bd.w")
    public static volatile int field478 = 0;

    @ObfuscatedName("bd.t")
    public static volatile long field472 = 0L;

    @ObfuscatedName("bd.g")
    public static int field473 = 0;

    @ObfuscatedName("bd.x")
    public static int field474 = 0;

    @ObfuscatedName("bd.h")
    public static int field475 = 0;

    @ObfuscatedName("bd.s")
    public static long field464 = 0L;

    @ObfuscatedName("ae.z(Ljava/awt/Component;I)V")
    public static void method682(Component arg0) {
        arg0.addMouseListener(field459);
        arg0.addMouseMotionListener(field459);
        arg0.addFocusListener(field459);
    }

    @ObfuscatedName("fa.n(Ljava/awt/Component;I)V")
    public static void method3225(Component arg0) {
        arg0.removeMouseListener(field459);
        arg0.removeMouseMotionListener(field459);
        arg0.removeFocusListener(field459);
        field470 = 0;
    }

    @ObfuscatedName("client.v(I)V")
    public static void method1391() {
        if (field459 != null) {
            class55 var0 = field459;
            synchronized (field459) {
                field459 = null;
            }
        }
    }

    @ObfuscatedName("g.r(S)I")
    public static int method183() {
        return ++field460 - 1;
    }

    @ObfuscatedName("bd.p(Ljava/awt/event/MouseEvent;I)I")
    public final int method927(MouseEvent arg0) {
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
        if (field459 != null) {
            field460 = 0;
            field461 = arg0.getX();
            field478 = arg0.getY();
            field472 = class297.method502();
            field469 = this.method927(arg0);
            if (field469 != 0) {
                field470 = field469;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (field459 != null) {
            field460 = 0;
            field470 = 0;
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
        if (field459 != null) {
            field460 = 0;
            field457 = -1;
            field463 = -1;
            field462 = arg0.getWhen();
        }
    }

    public final synchronized void mouseDragged(MouseEvent arg0) {
        this.mouseMoved(arg0);
    }

    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (field459 != null) {
            field460 = 0;
            field457 = arg0.getX();
            field463 = arg0.getY();
            field462 = arg0.getWhen();
        }
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field459 != null) {
            field470 = 0;
        }
    }
}
