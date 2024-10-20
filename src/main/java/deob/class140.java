package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

@ObfuscatedName("ed")
public class class140 implements MouseListener, MouseMotionListener, FocusListener {

    @ObfuscatedName("ed.g")
    public static class140 field2154 = new class140();

    @ObfuscatedName("ed.b")
    public static volatile int field2152 = 0;

    @ObfuscatedName("ed.w")
    public static volatile int field2140 = 0;

    @ObfuscatedName("ed.d")
    public static volatile int field2141 = -1;

    @ObfuscatedName("ed.z")
    public static volatile int field2147 = -1;

    @ObfuscatedName("ed.l")
    public static int field2151 = 0;

    @ObfuscatedName("ed.m")
    public static int field2139 = 0;

    @ObfuscatedName("ed.p")
    public static int field2145 = 0;

    @ObfuscatedName("ed.u")
    public static volatile int field2138 = 0;

    @ObfuscatedName("ed.c")
    public static volatile int field2156 = 0;

    @ObfuscatedName("ed.v")
    public static volatile int field2143 = 0;

    @ObfuscatedName("ed.o")
    public static volatile long field2149 = 0L;

    @ObfuscatedName("ed.n")
    public static int field2150 = 0;

    @ObfuscatedName("ed.k")
    public static int field2142 = 0;

    @ObfuscatedName("ed.f")
    public static int field2148 = 0;

    @ObfuscatedName("ed.x")
    public static long field2153 = 0L;

    @ObfuscatedName("dr.g(Ljava/awt/Component;I)V")
    public static void method2626(Component arg0) {
        arg0.addMouseListener(field2154);
        arg0.addMouseMotionListener(field2154);
        arg0.addFocusListener(field2154);
    }

    @ObfuscatedName("ah.b(Ljava/awt/Component;I)V")
    public static void method974(Component arg0) {
        arg0.removeMouseListener(field2154);
        arg0.removeMouseMotionListener(field2154);
        arg0.removeFocusListener(field2154);
        field2140 = 0;
    }

    @ObfuscatedName("bs.w(B)V")
    public static void method1606() {
        if (field2154 != null) {
            class140 var0 = field2154;
            synchronized (field2154) {
                field2154 = null;
            }
        }
    }

    @ObfuscatedName("gu.d(I)I")
    public static int method3405() {
        return ++field2152 - 1;
    }

    @ObfuscatedName("x.z(II)V")
    public static void method180(int arg0) {
        field2152 = arg0;
    }

    public final synchronized void mousePressed(MouseEvent arg0) {
        if (field2154 != null) {
            field2152 = 0;
            field2156 = arg0.getX();
            field2143 = arg0.getY();
            field2149 = class115.method579();
            if (arg0.isAltDown()) {
                field2138 = 4;
                field2140 = 4;
            } else if (arg0.isMetaDown()) {
                field2138 = 2;
                field2140 = 2;
            } else {
                field2138 = 1;
                field2140 = 1;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (field2154 != null) {
            field2152 = 0;
            field2140 = 0;
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
        if (field2154 != null) {
            field2152 = 0;
            field2141 = arg0.getX();
            field2147 = arg0.getY();
        }
    }

    public final synchronized void mouseExited(MouseEvent arg0) {
        if (field2154 != null) {
            field2152 = 0;
            field2141 = -1;
            field2147 = -1;
        }
    }

    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (field2154 != null) {
            field2152 = 0;
            field2141 = arg0.getX();
            field2147 = arg0.getY();
        }
    }

    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (field2154 != null) {
            field2152 = 0;
            field2141 = arg0.getX();
            field2147 = arg0.getY();
        }
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field2154 != null) {
            field2140 = 0;
        }
    }
}
