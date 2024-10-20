package deob;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

@ObfuscatedName("bh")
public class class60 implements MouseListener, MouseMotionListener, FocusListener {

    @ObfuscatedName("bh.n")
    public static class60 field727 = new class60();

    @ObfuscatedName("bh.p")
    public static volatile int field712 = 0;

    @ObfuscatedName("bh.i")
    public static volatile int field713 = 0;

    @ObfuscatedName("bh.j")
    public static volatile int field711 = -1;

    @ObfuscatedName("bh.f")
    public static volatile int field715 = -1;

    @ObfuscatedName("bh.m")
    public static int field717 = 0;

    @ObfuscatedName("bh.c")
    public static int field730 = 0;

    @ObfuscatedName("bh.z")
    public static int field716 = 0;

    @ObfuscatedName("bh.h")
    public static volatile int field719 = 0;

    @ObfuscatedName("bh.g")
    public static volatile int field718 = 0;

    @ObfuscatedName("bh.e")
    public static volatile int field721 = 0;

    @ObfuscatedName("bh.o")
    public static volatile long field722 = 0L;

    @ObfuscatedName("bh.x")
    public static int field714 = 0;

    @ObfuscatedName("bh.a")
    public static int field724 = 0;

    @ObfuscatedName("bh.y")
    public static int field725 = 0;

    @ObfuscatedName("bh.r")
    public static long field726 = 0L;

    @ObfuscatedName("fn.n(B)V")
    public static void method2902() {
        class60 var0 = field727;
        synchronized (field727) {
            field717 = field713;
            field730 = field711;
            field716 = field715 * -1753198765;
            field714 = field719;
            field724 = field718;
            field725 = field721;
            field726 = field722;
            field719 = 0;
        }
    }

    @ObfuscatedName("if.p(II)V")
    public static void method4022(int arg0) {
        field712 = arg0;
    }

    public final synchronized void mousePressed(MouseEvent arg0) {
        if (field727 != null) {
            field712 = 0;
            field718 = arg0.getX();
            field721 = arg0.getY();
            field722 = class176.method2396();
            if (arg0.isAltDown()) {
                field719 = 4;
                field713 = 4;
            } else if (arg0.isMetaDown()) {
                field719 = 2;
                field713 = 2;
            } else {
                field719 = 1;
                field713 = 1;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (field727 != null) {
            field712 = 0;
            field713 = 0;
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
        if (field727 != null) {
            field712 = 0;
            field711 = arg0.getX();
            field715 = arg0.getY();
        }
    }

    public final synchronized void mouseExited(MouseEvent arg0) {
        if (field727 != null) {
            field712 = 0;
            field711 = -1;
            field715 = -1;
        }
    }

    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (field727 != null) {
            field712 = 0;
            field711 = arg0.getX();
            field715 = arg0.getY();
        }
    }

    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (field727 != null) {
            field712 = 0;
            field711 = arg0.getX();
            field715 = arg0.getY();
        }
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field727 != null) {
            field713 = 0;
        }
    }
}
