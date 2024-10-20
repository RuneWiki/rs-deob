package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

@ObfuscatedName("bc")
public class class55 implements MouseListener, MouseMotionListener, FocusListener {

    @ObfuscatedName("bc.q")
    public static class55 field472 = new class55();

    @ObfuscatedName("bc.v")
    public static volatile int field460 = 0;

    @ObfuscatedName("bc.l")
    public static volatile int field461 = 0;

    @ObfuscatedName("bc.c")
    public static volatile int field462 = -1;

    @ObfuscatedName("bc.o")
    public static volatile int field463 = -1;

    @ObfuscatedName("bc.i")
    public static volatile long field468 = -1L;

    @ObfuscatedName("bc.d")
    public static int field475 = 0;

    @ObfuscatedName("bc.m")
    public static int field466 = 0;

    @ObfuscatedName("bc.p")
    public static int field467 = 0;

    @ObfuscatedName("bc.h")
    public static long field456 = 0L;

    @ObfuscatedName("bc.k")
    public static volatile int field474 = 0;

    @ObfuscatedName("bc.x")
    public static volatile int field465 = 0;

    @ObfuscatedName("bc.j")
    public static volatile int field471 = 0;

    @ObfuscatedName("bc.r")
    public static volatile long field470 = 0L;

    @ObfuscatedName("bc.e")
    public static int field473 = 0;

    @ObfuscatedName("bc.s")
    public static int field464 = 0;

    @ObfuscatedName("bc.b")
    public static int field469 = 0;

    @ObfuscatedName("bc.z")
    public static long field476 = 0L;

    @ObfuscatedName("ay.a(Ljava/awt/Component;I)V")
    public static void method740(Component arg0) {
        arg0.removeMouseListener(field472);
        arg0.removeMouseMotionListener(field472);
        arg0.removeFocusListener(field472);
        field461 = 0;
    }

    @ObfuscatedName("it.t(B)V")
    public static void method4431() {
        if (field472 != null) {
            class55 var0 = field472;
            synchronized (field472) {
                field472 = null;
            }
        }
    }

    @ObfuscatedName("ec.n(I)I")
    public static int method3166() {
        return ++field460 - 1;
    }

    @ObfuscatedName("bc.q(Ljava/awt/event/MouseEvent;B)I")
    public final int method970(MouseEvent arg0) {
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
        if (field472 != null) {
            field460 = 0;
            field465 = arg0.getX();
            field471 = arg0.getY();
            field470 = class297.method3777();
            field474 = this.method970(arg0);
            if (field474 != 0) {
                field461 = field474;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (field472 != null) {
            field460 = 0;
            field461 = 0;
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
        if (field472 != null) {
            field460 = 0;
            field462 = -1;
            field463 = -1;
            field468 = arg0.getWhen();
        }
    }

    public final synchronized void mouseDragged(MouseEvent arg0) {
        this.mouseMoved(arg0);
    }

    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (field472 != null) {
            field460 = 0;
            field462 = arg0.getX();
            field463 = arg0.getY();
            field468 = arg0.getWhen();
        }
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field472 != null) {
            field461 = 0;
        }
    }
}
