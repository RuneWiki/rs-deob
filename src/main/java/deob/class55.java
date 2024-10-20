package deob;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

@ObfuscatedName("bk")
public class class55 implements MouseListener, MouseMotionListener, FocusListener {

    @ObfuscatedName("bk.x")
    public static int field463 = 0;

    @ObfuscatedName("bk.l")
    public static class55 field455 = new class55();

    @ObfuscatedName("bk.u")
    public static volatile int field468 = 0;

    @ObfuscatedName("bk.j")
    public static volatile int field457 = 0;

    @ObfuscatedName("bk.v")
    public static volatile int field458 = -1;

    @ObfuscatedName("bk.d")
    public static volatile int field459 = -1;

    @ObfuscatedName("bk.z")
    public static volatile long field454 = -1L;

    @ObfuscatedName("bk.n")
    public static int field461 = 0;

    @ObfuscatedName("bk.h")
    public static int field462 = 0;

    @ObfuscatedName("bk.f")
    public static long field464 = 0L;

    @ObfuscatedName("bk.s")
    public static volatile int field471 = 0;

    @ObfuscatedName("bk.p")
    public static volatile int field473 = 0;

    @ObfuscatedName("bk.e")
    public static volatile int field467 = 0;

    @ObfuscatedName("bk.i")
    public static volatile long field453 = 0L;

    @ObfuscatedName("bk.q")
    public static int field469 = 0;

    @ObfuscatedName("bk.y")
    public static int field470 = 0;

    @ObfuscatedName("bk.r")
    public static int field460 = 0;

    @ObfuscatedName("bk.k")
    public static long field472 = 0L;

    @ObfuscatedName("bk.c(Ljava/awt/event/MouseEvent;I)I")
    public final int method896(MouseEvent arg0) {
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
            field468 = 0;
            field473 = arg0.getX();
            field467 = arg0.getY();
            field453 = Statics.method2303();
            field471 = this.method896(arg0);
            if (field471 != 0) {
                field457 = field471;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (field455 != null) {
            field468 = 0;
            field457 = 0;
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
            field468 = 0;
            field458 = -1;
            field459 = -1;
            field454 = arg0.getWhen();
        }
    }

    public final synchronized void mouseDragged(MouseEvent arg0) {
        this.mouseMoved(arg0);
    }

    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (field455 != null) {
            field468 = 0;
            field458 = arg0.getX();
            field459 = arg0.getY();
            field454 = arg0.getWhen();
        }
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field455 != null) {
            field457 = 0;
        }
    }
}
