package deob;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

@ObfuscatedName("ar")
public class class49 implements MouseListener, MouseMotionListener, FocusListener {

    @ObfuscatedName("ar.b")
    public static class49 field420 = new class49();

    @ObfuscatedName("ar.f")
    public static volatile int field427 = 0;

    @ObfuscatedName("ar.n")
    public static volatile int field421 = 0;

    @ObfuscatedName("ar.h")
    public static volatile int field422 = -1;

    @ObfuscatedName("ar.x")
    public static int field418 = 0;

    @ObfuscatedName("ar.j")
    public static volatile int field424 = -1;

    @ObfuscatedName("ar.a")
    public static int field425 = 0;

    @ObfuscatedName("ar.l")
    public static int field426 = 0;

    @ObfuscatedName("ar.d")
    public static volatile int field428 = 0;

    @ObfuscatedName("ar.s")
    public static volatile int field429 = 0;

    @ObfuscatedName("ar.p")
    public static volatile int field434 = 0;

    @ObfuscatedName("ar.g")
    public static volatile long field431 = 0L;

    @ObfuscatedName("ar.y")
    public static int field432 = 0;

    @ObfuscatedName("ar.c")
    public static int field433 = 0;

    @ObfuscatedName("ar.e")
    public static int field438 = 0;

    @ObfuscatedName("ar.t")
    public static long field435 = 0L;

    @ObfuscatedName("ep.w(I)I")
    public static int method2883() {
        return ++field427 - 1;
    }

    @ObfuscatedName("bp.m(II)V")
    public static void method1029(int arg0) {
        field427 = arg0;
    }

    @ObfuscatedName("ar.q(Ljava/awt/event/MouseEvent;I)I")
    public final int method898(MouseEvent arg0) {
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
        if (field420 != null) {
            field427 = 0;
            field429 = arg0.getX();
            field434 = arg0.getY();
            field431 = class185.method3151();
            field428 = this.method898(arg0);
            if (field428 != 0) {
                field421 = field428;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (field420 != null) {
            field427 = 0;
            field421 = 0;
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
        if (field420 != null) {
            field427 = 0;
            field422 = arg0.getX();
            field424 = arg0.getY();
        }
    }

    public final synchronized void mouseExited(MouseEvent arg0) {
        if (field420 != null) {
            field427 = 0;
            field422 = -1;
            field424 = -1;
        }
    }

    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (field420 != null) {
            field427 = 0;
            field422 = arg0.getX();
            field424 = arg0.getY();
        }
    }

    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (field420 != null) {
            field427 = 0;
            field422 = arg0.getX();
            field424 = arg0.getY();
        }
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field420 != null) {
            field421 = 0;
        }
    }
}
