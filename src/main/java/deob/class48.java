package deob;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

@ObfuscatedName("ak")
public class class48 implements MouseListener, MouseMotionListener, FocusListener {

    @ObfuscatedName("ak.y")
    public static long field379 = 0L;

    @ObfuscatedName("ak.p")
    public static class48 field371 = new class48();

    @ObfuscatedName("ak.j")
    public static volatile int field385 = 0;

    @ObfuscatedName("ak.r")
    public static volatile int field372 = 0;

    @ObfuscatedName("ak.b")
    public static volatile int field373 = -1;

    @ObfuscatedName("ak.d")
    public static volatile int field374 = -1;

    @ObfuscatedName("ak.s")
    public static volatile long field375 = -1L;

    @ObfuscatedName("ak.u")
    public static int field376 = 0;

    @ObfuscatedName("ak.l")
    public static int field389 = 0;

    @ObfuscatedName("ak.o")
    public static int field370 = 0;

    @ObfuscatedName("ak.c")
    public static volatile int field380 = 0;

    @ObfuscatedName("ak.e")
    public static volatile int field381 = 0;

    @ObfuscatedName("ak.g")
    public static volatile int field382 = 0;

    @ObfuscatedName("ak.a")
    public static volatile long field383 = 0L;

    @ObfuscatedName("ak.k")
    public static int field384 = 0;

    @ObfuscatedName("ak.m")
    public static int field368 = 0;

    @ObfuscatedName("ak.x")
    public static int field378 = 0;

    @ObfuscatedName("ak.z")
    public static long field387 = 0L;

    @ObfuscatedName("ce.v(I)V")
    public static void method1971() {
        class48 var0 = field371;
        synchronized (field371) {
            field376 = field372;
            field389 = field373;
            field370 = field374;
            field379 = field375;
            field384 = field380;
            field368 = field381;
            field378 = field382;
            field387 = field383;
            field380 = 0;
        }
    }

    @ObfuscatedName("jg.n(IB)V")
    public static void method4419(int arg0) {
        field385 = arg0;
    }

    @ObfuscatedName("ak.f(Ljava/awt/event/MouseEvent;I)I")
    public final int method523(MouseEvent arg0) {
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
        if (field371 != null) {
            field385 = 0;
            field381 = arg0.getX();
            field382 = arg0.getY();
            field383 = class380.method2744();
            field380 = this.method523(arg0);
            if (field380 != 0) {
                field372 = field380;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (field371 != null) {
            field385 = 0;
            field372 = 0;
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
        if (field371 != null) {
            field385 = 0;
            field373 = -1;
            field374 = -1;
            field375 = arg0.getWhen();
        }
    }

    public final synchronized void mouseDragged(MouseEvent arg0) {
        this.mouseMoved(arg0);
    }

    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (field371 != null) {
            field385 = 0;
            field373 = arg0.getX();
            field374 = arg0.getY();
            field375 = arg0.getWhen();
        }
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field371 != null) {
            field372 = 0;
        }
    }
}
