package deob;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

@ObfuscatedName("bn")
public class class60 implements MouseListener, MouseMotionListener, FocusListener {

    @ObfuscatedName("bn.p")
    public static class60 field746 = new class60();

    @ObfuscatedName("bn.m")
    public static volatile int field739 = 0;

    @ObfuscatedName("bn.e")
    public static volatile int field744 = 0;

    @ObfuscatedName("bn.t")
    public static volatile int field728 = -1;

    @ObfuscatedName("bn.w")
    public static volatile int field741 = -1;

    @ObfuscatedName("bn.z")
    public static int field730 = 0;

    @ObfuscatedName("bn.j")
    public static int field731 = 0;

    @ObfuscatedName("bn.i")
    public static int field732 = 0;

    @ObfuscatedName("bn.f")
    public static volatile int field745 = 0;

    @ObfuscatedName("bn.c")
    public static volatile int field734 = 0;

    @ObfuscatedName("bn.o")
    public static volatile int field735 = 0;

    @ObfuscatedName("bn.q")
    public static volatile long field729 = 0L;

    @ObfuscatedName("bn.n")
    public static int field737 = 0;

    @ObfuscatedName("bn.a")
    public static int field738 = 0;

    @ObfuscatedName("bn.g")
    public static int field733 = 0;

    @ObfuscatedName("bn.v")
    public static long field740 = 0L;

    @ObfuscatedName("ar.p(II)V")
    public static void method454(int arg0) {
        field739 = arg0;
    }

    public final synchronized void mousePressed(MouseEvent arg0) {
        if (field746 != null) {
            field739 = 0;
            field734 = arg0.getX();
            field735 = arg0.getY();
            field729 = class176.method2747();
            if (arg0.isAltDown()) {
                field745 = 4;
                field744 = 4;
            } else if (arg0.isMetaDown()) {
                field745 = 2;
                field744 = 2;
            } else {
                field745 = 1;
                field744 = 1;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (field746 != null) {
            field739 = 0;
            field744 = 0;
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
        if (field746 != null) {
            field739 = 0;
            field728 = arg0.getX();
            field741 = arg0.getY();
        }
    }

    public final synchronized void mouseExited(MouseEvent arg0) {
        if (field746 != null) {
            field739 = 0;
            field728 = -1;
            field741 = -1;
        }
    }

    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (field746 != null) {
            field739 = 0;
            field728 = arg0.getX();
            field741 = arg0.getY();
        }
    }

    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (field746 != null) {
            field739 = 0;
            field728 = arg0.getX();
            field741 = arg0.getY();
        }
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field746 != null) {
            field744 = 0;
        }
    }
}
