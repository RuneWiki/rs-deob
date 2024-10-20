package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

@ObfuscatedName("ee")
public class class140 implements MouseListener, MouseMotionListener, FocusListener {

    @ObfuscatedName("ee.i")
    public static class140 field2153 = new class140();

    @ObfuscatedName("ee.v")
    public static volatile int field2133 = 0;

    @ObfuscatedName("ee.f")
    public static volatile int field2146 = 0;

    @ObfuscatedName("ee.h")
    public static volatile int field2135 = -1;

    @ObfuscatedName("ee.a")
    public static volatile int field2144 = -1;

    @ObfuscatedName("ee.s")
    public static int field2137 = 0;

    @ObfuscatedName("ee.p")
    public static int field2143 = 0;

    @ObfuscatedName("ee.r")
    public static int field2139 = 0;

    @ObfuscatedName("ee.k")
    public static volatile int field2140 = 0;

    @ObfuscatedName("ee.d")
    public static volatile int field2141 = 0;

    @ObfuscatedName("ee.n")
    public static volatile int field2142 = 0;

    @ObfuscatedName("ee.z")
    public static volatile long field2148 = 0L;

    @ObfuscatedName("ee.c")
    public static int field2138 = 0;

    @ObfuscatedName("ee.b")
    public static int field2145 = 0;

    @ObfuscatedName("ee.w")
    public static int field2136 = 0;

    @ObfuscatedName("ee.g")
    public static long field2147 = 0L;

    @ObfuscatedName("s.i(Ljava/awt/Component;I)V")
    public static void method89(Component arg0) {
        arg0.removeMouseListener(field2153);
        arg0.removeMouseMotionListener(field2153);
        arg0.removeFocusListener(field2153);
        field2146 = 0;
    }

    @ObfuscatedName("ff.v(I)V")
    public static void method2912() {
        if (field2153 != null) {
            class140 var0 = field2153;
            synchronized (field2153) {
                field2153 = null;
            }
        }
    }

    @ObfuscatedName("y.f(I)I")
    public static int method549() {
        return ++field2133 - 1;
    }

    @ObfuscatedName("dg.h(II)V")
    public static void method2584(int arg0) {
        field2133 = arg0;
    }

    public final synchronized void mousePressed(MouseEvent arg0) {
        if (field2153 != null) {
            field2133 = 0;
            field2141 = arg0.getX();
            field2142 = arg0.getY();
            field2148 = class115.method2906();
            if (arg0.isAltDown()) {
                field2140 = 4;
                field2146 = 4;
            } else if (arg0.isMetaDown()) {
                field2140 = 2;
                field2146 = 2;
            } else {
                field2140 = 1;
                field2146 = 1;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (field2153 != null) {
            field2133 = 0;
            field2146 = 0;
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
        if (field2153 != null) {
            field2133 = 0;
            field2135 = arg0.getX();
            field2144 = arg0.getY();
        }
    }

    public final synchronized void mouseExited(MouseEvent arg0) {
        if (field2153 != null) {
            field2133 = 0;
            field2135 = -1;
            field2144 = -1;
        }
    }

    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (field2153 != null) {
            field2133 = 0;
            field2135 = arg0.getX();
            field2144 = arg0.getY();
        }
    }

    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (field2153 != null) {
            field2133 = 0;
            field2135 = arg0.getX();
            field2144 = arg0.getY();
        }
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field2153 != null) {
            field2146 = 0;
        }
    }
}
