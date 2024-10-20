package deob;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

@ObfuscatedName("bg")
public class class54 implements MouseListener, MouseMotionListener, FocusListener {

    @ObfuscatedName("bg.y")
    public static long field468 = 0L;

    @ObfuscatedName("bg.p")
    public static class54 field456 = new class54();

    @ObfuscatedName("bg.b")
    public static volatile int field460 = 0;

    @ObfuscatedName("bg.e")
    public static volatile int field461 = 0;

    @ObfuscatedName("bg.x")
    public static int field477 = 0;

    @ObfuscatedName("bg.a")
    public static volatile int field462 = -1;

    @ObfuscatedName("bg.d")
    public static volatile int field463 = -1;

    @ObfuscatedName("bg.c")
    public static volatile long field464 = -1L;

    @ObfuscatedName("bg.o")
    public static int field465 = 0;

    @ObfuscatedName("bg.v")
    public static int field466 = 0;

    @ObfuscatedName("bg.k")
    public static volatile int field470 = 0;

    @ObfuscatedName("bg.s")
    public static volatile int field469 = 0;

    @ObfuscatedName("bg.l")
    public static volatile int field478 = 0;

    @ObfuscatedName("bg.t")
    public static volatile long field472 = 0L;

    @ObfuscatedName("bg.j")
    public static int field473 = 0;

    @ObfuscatedName("bg.n")
    public static int field474 = 0;

    @ObfuscatedName("bg.u")
    public static int field475 = 0;

    @ObfuscatedName("bg.z")
    public static long field471 = 0L;

    @ObfuscatedName("bg.f(Ljava/awt/event/MouseEvent;I)I")
    public final int method930(MouseEvent arg0) {
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
        if (field456 != null) {
            field460 = 0;
            field469 = arg0.getX();
            field478 = arg0.getY();
            field472 = class297.method481();
            field470 = this.method930(arg0);
            if (field470 != 0) {
                field461 = field470;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (field456 != null) {
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
        if (field456 != null) {
            field460 = 0;
            field462 = -1;
            field463 = -1;
            field464 = arg0.getWhen();
        }
    }

    public final synchronized void mouseDragged(MouseEvent arg0) {
        this.mouseMoved(arg0);
    }

    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (field456 != null) {
            field460 = 0;
            field462 = arg0.getX();
            field463 = arg0.getY();
            field464 = arg0.getWhen();
        }
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field456 != null) {
            field461 = 0;
        }
    }
}
