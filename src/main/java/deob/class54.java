package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

@ObfuscatedName("bi")
public class class54 implements MouseListener, MouseMotionListener, FocusListener {

    @ObfuscatedName("bi.g")
    public static class54 field463 = new class54();

    @ObfuscatedName("bi.b")
    public static volatile int field464 = 0;

    @ObfuscatedName("bi.a")
    public static volatile int field465 = 0;

    @ObfuscatedName("bi.c")
    public static volatile int field483 = -1;

    @ObfuscatedName("bi.z")
    public static volatile int field467 = -1;

    @ObfuscatedName("bi.j")
    public static volatile long field461 = -1L;

    @ObfuscatedName("bi.d")
    public static int field469 = 0;

    @ObfuscatedName("bi.t")
    public static int field468 = 0;

    @ObfuscatedName("bi.f")
    public static int field475 = 0;

    @ObfuscatedName("bi.i")
    public static long field472 = 0L;

    @ObfuscatedName("bi.m")
    public static volatile int field473 = 0;

    @ObfuscatedName("bi.v")
    public static volatile int field474 = 0;

    @ObfuscatedName("bi.r")
    public static volatile int field470 = 0;

    @ObfuscatedName("bi.x")
    public static volatile long field476 = 0L;

    @ObfuscatedName("bi.y")
    public static int field460 = 0;

    @ObfuscatedName("bi.p")
    public static int field478 = 0;

    @ObfuscatedName("bi.k")
    public static int field479 = 0;

    @ObfuscatedName("bi.o")
    public static long field480 = 0L;

    @ObfuscatedName("az.n(Ljava/awt/Component;I)V")
    public static void method687(Component arg0) {
        arg0.addMouseListener(field463);
        arg0.addMouseMotionListener(field463);
        arg0.addFocusListener(field463);
    }

    @ObfuscatedName("gd.h(IB)V")
    public static void method3735(int arg0) {
        field464 = arg0;
    }

    @ObfuscatedName("bi.l(Ljava/awt/event/MouseEvent;I)I")
    public final int method901(MouseEvent arg0) {
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
            field464 = 0;
            field474 = arg0.getX();
            field470 = arg0.getY();
            field476 = class192.method81();
            field473 = this.method901(arg0);
            if (field473 != 0) {
                field465 = field473;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (field463 != null) {
            field464 = 0;
            field465 = 0;
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
            field464 = 0;
            field483 = -1;
            field467 = -1;
            field461 = arg0.getWhen();
        }
    }

    public final synchronized void mouseDragged(MouseEvent arg0) {
        this.mouseMoved(arg0);
    }

    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (field463 != null) {
            field464 = 0;
            field483 = arg0.getX();
            field467 = arg0.getY();
            field461 = arg0.getWhen();
        }
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field463 != null) {
            field465 = 0;
        }
    }
}
