package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

@ObfuscatedName("ej")
public class class140 implements MouseListener, MouseMotionListener, FocusListener {

    @ObfuscatedName("ej.a")
    public static class140 field2137 = new class140();

    @ObfuscatedName("ej.r")
    public static volatile int field2140 = 0;

    @ObfuscatedName("ej.f")
    public static volatile int field2142 = 0;

    @ObfuscatedName("ej.s")
    public static volatile int field2138 = -1;

    @ObfuscatedName("ej.y")
    public static volatile int field2152 = 0;

    @ObfuscatedName("ej.e")
    public static volatile int field2134 = -1;

    @ObfuscatedName("ej.g")
    public static int field2139 = 0;

    @ObfuscatedName("ej.m")
    public static int field2141 = 0;

    @ObfuscatedName("ej.j")
    public static int field2136 = 0;

    @ObfuscatedName("ej.n")
    public static volatile int field2143 = 0;

    @ObfuscatedName("ej.l")
    public static volatile int field2144 = 0;

    @ObfuscatedName("ej.h")
    public static volatile long field2135 = 0L;

    @ObfuscatedName("ej.i")
    public static int field2146 = 0;

    @ObfuscatedName("ej.v")
    public static int field2147 = 0;

    @ObfuscatedName("ej.z")
    public static int field2148 = 0;

    @ObfuscatedName("ej.u")
    public static long field2149 = 0L;

    @ObfuscatedName("cn.a(Ljava/awt/Component;I)V")
    public static void method2064(Component arg0) {
        arg0.addMouseListener(field2137);
        arg0.addMouseMotionListener(field2137);
        arg0.addFocusListener(field2137);
    }

    @ObfuscatedName("db.r(Ljava/awt/Component;I)V")
    public static void method2616(Component arg0) {
        arg0.removeMouseListener(field2137);
        arg0.removeMouseMotionListener(field2137);
        arg0.removeFocusListener(field2137);
        field2142 = 0;
    }

    @ObfuscatedName("bm.f(B)V")
    public static void method1558() {
        if (field2137 != null) {
            class140 var0 = field2137;
            synchronized (field2137) {
                field2137 = null;
            }
        }
    }

    @ObfuscatedName("dw.s(I)V")
    public static void method2619() {
        class140 var0 = field2137;
        synchronized (field2137) {
            field2139 = field2142;
            field2141 = field2138;
            field2136 = field2134;
            field2146 = field2152;
            field2147 = field2143;
            field2148 = field2144;
            field2149 = field2135;
            field2152 = 0;
        }
    }

    public final synchronized void mousePressed(MouseEvent arg0) {
        if (field2137 != null) {
            field2140 = 0;
            field2143 = arg0.getX();
            field2144 = arg0.getY();
            field2135 = class115.method207();
            if (arg0.isAltDown()) {
                field2152 = 4;
                field2142 = 4;
            } else if (arg0.isMetaDown()) {
                field2152 = 2;
                field2142 = 2;
            } else {
                field2152 = 1;
                field2142 = 1;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (field2137 != null) {
            field2140 = 0;
            field2142 = 0;
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
        if (field2137 != null) {
            field2140 = 0;
            field2138 = arg0.getX();
            field2134 = arg0.getY();
        }
    }

    public final synchronized void mouseExited(MouseEvent arg0) {
        if (field2137 != null) {
            field2140 = 0;
            field2138 = -1;
            field2134 = -1;
        }
    }

    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (field2137 != null) {
            field2140 = 0;
            field2138 = arg0.getX();
            field2134 = arg0.getY();
        }
    }

    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (field2137 != null) {
            field2140 = 0;
            field2138 = arg0.getX();
            field2134 = arg0.getY();
        }
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field2137 != null) {
            field2142 = 0;
        }
    }
}
