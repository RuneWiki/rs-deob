package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

@ObfuscatedName("ex")
public class class140 implements MouseListener, MouseMotionListener, FocusListener {

    @ObfuscatedName("ex.i")
    public static class140 field2143 = new class140();

    @ObfuscatedName("ex.v")
    public static volatile int field2130 = 0;

    @ObfuscatedName("ex.r")
    public static volatile int field2142 = 0;

    @ObfuscatedName("ex.n")
    public static volatile int field2147 = -1;

    @ObfuscatedName("ex.x")
    public static int field2136 = 0;

    @ObfuscatedName("ex.q")
    public static volatile int field2140 = -1;

    @ObfuscatedName("ex.h")
    public static int field2134 = 0;

    @ObfuscatedName("ex.d")
    public static int field2146 = 0;

    @ObfuscatedName("ex.c")
    public static volatile int field2137 = 0;

    @ObfuscatedName("ex.y")
    public static volatile int field2138 = 0;

    @ObfuscatedName("ex.m")
    public static volatile int field2139 = 0;

    @ObfuscatedName("ex.e")
    public static volatile long field2132 = 0L;

    @ObfuscatedName("ex.z")
    public static int field2141 = 0;

    @ObfuscatedName("ex.t")
    public static int field2133 = 0;

    @ObfuscatedName("ex.b")
    public static int field2131 = 0;

    @ObfuscatedName("ex.l")
    public static long field2144 = 0L;

    @ObfuscatedName("o.i(Ljava/awt/Component;I)V")
    public static void method569(Component arg0) {
        arg0.removeMouseListener(field2143);
        arg0.removeMouseMotionListener(field2143);
        arg0.removeFocusListener(field2143);
        field2142 = 0;
    }

    @ObfuscatedName("cn.v(I)V")
    public static void method2139() {
        class140 var0 = field2143;
        synchronized (field2143) {
            field2134 = field2142;
            field2146 = field2147;
            field2136 = field2140;
            field2141 = field2137;
            field2133 = field2138;
            field2131 = field2139;
            field2144 = field2132;
            field2137 = 0;
        }
    }

    @ObfuscatedName("m.r(I)I")
    public static int method118() {
        return ++field2130 - 1;
    }

    @ObfuscatedName("ar.n(II)V")
    public static void method658(int arg0) {
        field2130 = arg0;
    }

    public final synchronized void mousePressed(MouseEvent arg0) {
        if (field2143 != null) {
            field2130 = 0;
            field2138 = arg0.getX();
            field2139 = arg0.getY();
            field2132 = class115.method2134();
            if (arg0.isAltDown()) {
                field2137 = 4;
                field2142 = 4;
            } else if (arg0.isMetaDown()) {
                field2137 = 2;
                field2142 = 2;
            } else {
                field2137 = 1;
                field2142 = 1;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (field2143 != null) {
            field2130 = 0;
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
        if (field2143 != null) {
            field2130 = 0;
            field2147 = arg0.getX();
            field2140 = arg0.getY();
        }
    }

    public final synchronized void mouseExited(MouseEvent arg0) {
        if (field2143 != null) {
            field2130 = 0;
            field2147 = -1;
            field2140 = -1;
        }
    }

    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (field2143 != null) {
            field2130 = 0;
            field2147 = arg0.getX();
            field2140 = arg0.getY();
        }
    }

    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (field2143 != null) {
            field2130 = 0;
            field2147 = arg0.getX();
            field2140 = arg0.getY();
        }
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field2143 != null) {
            field2142 = 0;
        }
    }
}
