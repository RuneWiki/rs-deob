package deob;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

@ObfuscatedName("bb")
public class class54 implements MouseListener, MouseMotionListener, FocusListener {

    @ObfuscatedName("bb.w")
    public static class54 field455 = new class54();

    @ObfuscatedName("bb.o")
    public static volatile int field453 = 0;

    @ObfuscatedName("bb.u")
    public static volatile int field476 = 0;

    @ObfuscatedName("bb.g")
    public static volatile int field471 = -1;

    @ObfuscatedName("bb.l")
    public static volatile int field459 = -1;

    @ObfuscatedName("bb.e")
    public static volatile long field460 = -1L;

    @ObfuscatedName("bb.x")
    public static int field463 = 0;

    @ObfuscatedName("bb.d")
    public static int field461 = 0;

    @ObfuscatedName("bb.k")
    public static int field456 = 0;

    @ObfuscatedName("bb.n")
    public static long field464 = 0L;

    @ObfuscatedName("bb.i")
    public static volatile int field472 = 0;

    @ObfuscatedName("bb.a")
    public static volatile int field466 = 0;

    @ObfuscatedName("bb.z")
    public static volatile int field467 = 0;

    @ObfuscatedName("bb.j")
    public static volatile long field468 = 0L;

    @ObfuscatedName("bb.s")
    public static int field469 = 0;

    @ObfuscatedName("bb.t")
    public static int field462 = 0;

    @ObfuscatedName("bb.y")
    public static int field475 = 0;

    @ObfuscatedName("bb.h")
    public static long field470 = 0L;

    @ObfuscatedName("c.m(I)I")
    public static int method274() {
        return ++field453 - 1;
    }

    @ObfuscatedName("bb.f(Ljava/awt/event/MouseEvent;I)I")
    public final int method925(MouseEvent arg0) {
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
        if (field455 != null) {
            field453 = 0;
            field466 = arg0.getX();
            field467 = arg0.getY();
            field468 = class204.method3658();
            field472 = this.method925(arg0);
            if (field472 != 0) {
                field476 = field472;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (field455 != null) {
            field453 = 0;
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
        if (field455 != null) {
            field453 = 0;
            field471 = -1;
            field459 = -1;
            field460 = arg0.getWhen();
        }
    }

    public final synchronized void mouseDragged(MouseEvent arg0) {
        this.mouseMoved(arg0);
    }

    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (field455 != null) {
            field453 = 0;
            field471 = arg0.getX();
            field459 = arg0.getY();
            field460 = arg0.getWhen();
        }
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field455 != null) {
            field476 = 0;
        }
    }
}
