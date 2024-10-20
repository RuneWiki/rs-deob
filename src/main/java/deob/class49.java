package deob;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

@ObfuscatedName("ao")
public class class49 implements MouseListener, MouseMotionListener, FocusListener {

    @ObfuscatedName("ao.j")
    public static class49 field460 = new class49();

    @ObfuscatedName("ao.g")
    public static volatile int field472 = 0;

    @ObfuscatedName("ao.i")
    public static volatile int field476 = 0;

    @ObfuscatedName("ao.h")
    public static volatile int field463 = -1;

    @ObfuscatedName("ao.l")
    public static volatile int field464 = -1;

    @ObfuscatedName("ao.d")
    public static volatile long field467 = -1L;

    @ObfuscatedName("ao.o")
    public static int field461 = 0;

    @ObfuscatedName("ao.s")
    public static int field466 = 0;

    @ObfuscatedName("ao.k")
    public static int field468 = 0;

    @ObfuscatedName("ao.v")
    public static long field465 = 0L;

    @ObfuscatedName("ao.p")
    public static volatile int field474 = 0;

    @ObfuscatedName("ao.n")
    public static volatile int field471 = 0;

    @ObfuscatedName("ao.t")
    public static volatile int field473 = 0;

    @ObfuscatedName("ao.r")
    public static volatile long field462 = 0L;

    @ObfuscatedName("ao.x")
    public static int field469 = 0;

    @ObfuscatedName("ao.b")
    public static int field475 = 0;

    @ObfuscatedName("ao.w")
    public static int field478 = 0;

    @ObfuscatedName("ao.e")
    public static long field477 = 0L;

    @ObfuscatedName("r.c(I)V")
    public static void method193() {
        if (field460 != null) {
            class49 var0 = field460;
            synchronized (field460) {
                field460 = null;
            }
        }
    }

    @ObfuscatedName("if.q(B)V")
    public static void method4182() {
        class49 var0 = field460;
        synchronized (field460) {
            field461 = field476;
            field466 = field463;
            field468 = field464;
            field465 = field467;
            field469 = field474;
            field475 = field471;
            field478 = field473;
            field477 = field462;
            field474 = 0;
        }
    }

    @ObfuscatedName("iv.m(I)I")
    public static int method4178() {
        return ++field472 - 1;
    }

    @ObfuscatedName("ao.j(Ljava/awt/event/MouseEvent;B)I")
    public final int method899(MouseEvent arg0) {
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
        if (field460 != null) {
            field472 = 0;
            field471 = arg0.getX();
            field473 = arg0.getY();
            field462 = class187.method918();
            field474 = this.method899(arg0);
            if (field474 != 0) {
                field476 = field474;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (field460 != null) {
            field472 = 0;
            field476 = 0;
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
        if (field460 != null) {
            field472 = 0;
            field463 = -1;
            field464 = -1;
            field467 = arg0.getWhen();
        }
    }

    public final synchronized void mouseDragged(MouseEvent arg0) {
        this.mouseMoved(arg0);
    }

    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (field460 != null) {
            field472 = 0;
            field463 = arg0.getX();
            field464 = arg0.getY();
            field467 = arg0.getWhen();
        }
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field460 != null) {
            field476 = 0;
        }
    }
}
