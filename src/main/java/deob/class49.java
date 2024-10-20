package deob;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

@ObfuscatedName("ak")
public class class49 implements MouseListener, MouseMotionListener, FocusListener {

    @ObfuscatedName("ak.b")
    public static class49 field428 = new class49();

    @ObfuscatedName("ak.l")
    public static volatile int field429 = 0;

    @ObfuscatedName("ak.w")
    public static volatile int field430 = 0;

    @ObfuscatedName("ak.d")
    public static volatile int field431 = -1;

    @ObfuscatedName("ak.n")
    public static volatile int field432 = -1;

    @ObfuscatedName("ak.s")
    public static volatile long field433 = -1L;

    @ObfuscatedName("ak.g")
    public static int field434 = 0;

    @ObfuscatedName("ak.a")
    public static int field437 = 0;

    @ObfuscatedName("ak.r")
    public static int field439 = 0;

    @ObfuscatedName("ak.k")
    public static long field438 = 0L;

    @ObfuscatedName("ak.m")
    public static volatile int field441 = 0;

    @ObfuscatedName("ak.q")
    public static volatile int field442 = 0;

    @ObfuscatedName("ak.x")
    public static volatile int field440 = 0;

    @ObfuscatedName("ak.u")
    public static volatile long field425 = 0L;

    @ObfuscatedName("ak.o")
    public static int field426 = 0;

    @ObfuscatedName("ak.t")
    public static int field443 = 0;

    @ObfuscatedName("ak.v")
    public static int field444 = 0;

    @ObfuscatedName("ak.p")
    public static long field445 = 0L;

    @ObfuscatedName("i.f(I)V")
    public static void method438() {
        if (field428 != null) {
            class49 var0 = field428;
            synchronized (field428) {
                field428 = null;
            }
        }
    }

    @ObfuscatedName("ak.e(Ljava/awt/event/MouseEvent;I)I")
    public final int method850(MouseEvent arg0) {
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
        if (field428 != null) {
            field429 = 0;
            field442 = arg0.getX();
            field440 = arg0.getY();
            field425 = class187.method2864();
            field441 = this.method850(arg0);
            if (field441 != 0) {
                field430 = field441;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (field428 != null) {
            field429 = 0;
            field430 = 0;
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
        if (field428 != null) {
            field429 = 0;
            field431 = -1;
            field432 = -1;
            field433 = arg0.getWhen();
        }
    }

    public final synchronized void mouseDragged(MouseEvent arg0) {
        this.mouseMoved(arg0);
    }

    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (field428 != null) {
            field429 = 0;
            field431 = arg0.getX();
            field432 = arg0.getY();
            field433 = arg0.getWhen();
        }
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field428 != null) {
            field430 = 0;
        }
    }
}
