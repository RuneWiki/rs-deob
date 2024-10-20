package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

@ObfuscatedName("bn")
public class class60 implements MouseListener, MouseMotionListener, FocusListener {

    @ObfuscatedName("bn.e")
    public static class60 field739 = new class60();

    @ObfuscatedName("bn.o")
    public static volatile int field724 = 0;

    @ObfuscatedName("bn.m")
    public static volatile int field725 = 0;

    @ObfuscatedName("bn.g")
    public static volatile int field731 = -1;

    @ObfuscatedName("bn.d")
    public static volatile int field727 = -1;

    @ObfuscatedName("bn.b")
    public static int field728 = 0;

    @ObfuscatedName("bn.k")
    public static int field729 = 0;

    @ObfuscatedName("bn.f")
    public static int field726 = 0;

    @ObfuscatedName("bn.j")
    public static volatile int field723 = 0;

    @ObfuscatedName("bn.q")
    public static volatile int field732 = 0;

    @ObfuscatedName("bn.h")
    public static volatile int field733 = 0;

    @ObfuscatedName("bn.i")
    public static volatile long field730 = 0L;

    @ObfuscatedName("bn.s")
    public static int field737 = 0;

    @ObfuscatedName("bn.n")
    public static int field736 = 0;

    @ObfuscatedName("bn.c")
    public static int field735 = 0;

    @ObfuscatedName("bn.v")
    public static long field738 = 0L;

    @ObfuscatedName("hv.e(Ljava/awt/Component;I)V")
    public static void method3585(Component arg0) {
        arg0.addMouseListener(field739);
        arg0.addMouseMotionListener(field739);
        arg0.addFocusListener(field739);
    }

    @ObfuscatedName("f.o(Ljava/awt/Component;I)V")
    public static void method18(Component arg0) {
        arg0.removeMouseListener(field739);
        arg0.removeMouseMotionListener(field739);
        arg0.removeFocusListener(field739);
        field725 = 0;
    }

    @ObfuscatedName("bd.m(I)I")
    public static int method887() {
        return ++field724 - 1;
    }

    @ObfuscatedName("ed.g(II)V")
    public static void method2457(int arg0) {
        field724 = arg0;
    }

    public final synchronized void mousePressed(MouseEvent arg0) {
        if (field739 != null) {
            field724 = 0;
            field732 = arg0.getX();
            field733 = arg0.getY();
            field730 = class176.method218();
            if (arg0.isAltDown()) {
                field723 = 4;
                field725 = 4;
            } else if (arg0.isMetaDown()) {
                field723 = 2;
                field725 = 2;
            } else {
                field723 = 1;
                field725 = 1;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (field739 != null) {
            field724 = 0;
            field725 = 0;
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
        if (field739 != null) {
            field724 = 0;
            field731 = arg0.getX();
            field727 = arg0.getY();
        }
    }

    public final synchronized void mouseExited(MouseEvent arg0) {
        if (field739 != null) {
            field724 = 0;
            field731 = -1;
            field727 = -1;
        }
    }

    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (field739 != null) {
            field724 = 0;
            field731 = arg0.getX();
            field727 = arg0.getY();
        }
    }

    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (field739 != null) {
            field724 = 0;
            field731 = arg0.getX();
            field727 = arg0.getY();
        }
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field739 != null) {
            field725 = 0;
        }
    }
}
