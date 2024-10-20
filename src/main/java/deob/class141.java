package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

@ObfuscatedName("en")
public class class141 implements MouseListener, MouseMotionListener, FocusListener {

    @ObfuscatedName("en.e")
    public static class141 field2143 = new class141();

    @ObfuscatedName("en.w")
    public static volatile int field2140 = 0;

    @ObfuscatedName("en.f")
    public static volatile int field2148 = 0;

    @ObfuscatedName("en.s")
    public static volatile int field2138 = -1;

    @ObfuscatedName("en.p")
    public static volatile int field2139 = -1;

    @ObfuscatedName("en.h")
    public static int field2137 = 0;

    @ObfuscatedName("en.g")
    public static int field2141 = 0;

    @ObfuscatedName("en.a")
    public static int field2142 = 0;

    @ObfuscatedName("en.r")
    public static volatile int field2145 = 0;

    @ObfuscatedName("en.k")
    public static volatile int field2144 = 0;

    @ObfuscatedName("en.m")
    public static volatile int field2135 = 0;

    @ObfuscatedName("en.n")
    public static volatile long field2146 = 0L;

    @ObfuscatedName("en.y")
    public static int field2147 = 0;

    @ObfuscatedName("en.i")
    public static int field2136 = 0;

    @ObfuscatedName("en.j")
    public static int field2149 = 0;

    @ObfuscatedName("en.l")
    public static long field2150 = 0L;

    @ObfuscatedName("bz.e(Ljava/awt/Component;I)V")
    public static void method1489(Component arg0) {
        arg0.addMouseListener(field2143);
        arg0.addMouseMotionListener(field2143);
        arg0.addFocusListener(field2143);
    }

    @ObfuscatedName("fr.w(Ljava/awt/Component;B)V")
    public static void method3128(Component arg0) {
        arg0.removeMouseListener(field2143);
        arg0.removeMouseMotionListener(field2143);
        arg0.removeFocusListener(field2143);
        field2148 = 0;
    }

    @ObfuscatedName("ag.f(I)V")
    public static void method714() {
        if (field2143 != null) {
            class141 var0 = field2143;
            synchronized (field2143) {
                field2143 = null;
            }
        }
    }

    @ObfuscatedName("aj.s(B)V")
    public static void method703() {
        class141 var0 = field2143;
        synchronized (field2143) {
            field2137 = field2148;
            field2141 = field2138;
            field2142 = field2139 * 2132622329;
            field2147 = field2145;
            field2136 = field2144;
            field2149 = field2135;
            field2150 = field2146;
            field2145 = 0;
        }
    }

    @ObfuscatedName("f.p(II)V")
    public static void method40(int arg0) {
        field2140 = arg0;
    }

    public final synchronized void mousePressed(MouseEvent arg0) {
        if (field2143 != null) {
            field2140 = 0;
            field2144 = arg0.getX();
            field2135 = arg0.getY();
            field2146 = class116.method2794();
            if (arg0.isAltDown()) {
                field2145 = 4;
                field2148 = 4;
            } else if (arg0.isMetaDown()) {
                field2145 = 2;
                field2148 = 2;
            } else {
                field2145 = 1;
                field2148 = 1;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (field2143 != null) {
            field2140 = 0;
            field2148 = 0;
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
        if (field2143 != null) {
            field2140 = 0;
            field2138 = arg0.getX();
            field2139 = arg0.getY();
        }
    }

    public final synchronized void mouseExited(MouseEvent arg0) {
        if (field2143 != null) {
            field2140 = 0;
            field2138 = -1;
            field2139 = -1;
        }
    }

    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (field2143 != null) {
            field2140 = 0;
            field2138 = arg0.getX();
            field2139 = arg0.getY();
        }
    }

    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (field2143 != null) {
            field2140 = 0;
            field2138 = arg0.getX();
            field2139 = arg0.getY();
        }
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field2143 != null) {
            field2148 = 0;
        }
    }
}
