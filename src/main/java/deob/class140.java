package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

@ObfuscatedName("ef")
public class class140 implements MouseListener, MouseMotionListener, FocusListener {

    @ObfuscatedName("ef.o")
    public static class140 field2140 = new class140();

    @ObfuscatedName("ef.e")
    public static volatile int field2139 = 0;

    @ObfuscatedName("ef.u")
    public static volatile int field2143 = 0;

    @ObfuscatedName("ef.b")
    public static volatile int field2156 = -1;

    @ObfuscatedName("ef.p")
    public static volatile int field2142 = -1;

    @ObfuscatedName("ef.s")
    public static int field2141 = 0;

    @ObfuscatedName("ef.y")
    public static volatile int field2146 = 0;

    @ObfuscatedName("ef.t")
    public static int field2144 = 0;

    @ObfuscatedName("ef.w")
    public static int field2145 = 0;

    @ObfuscatedName("ef.h")
    public static volatile int field2147 = 0;

    @ObfuscatedName("ef.d")
    public static volatile int field2148 = 0;

    @ObfuscatedName("ef.l")
    public static volatile long field2149 = 0L;

    @ObfuscatedName("ef.n")
    public static int field2150 = 0;

    @ObfuscatedName("ef.q")
    public static int field2151 = 0;

    @ObfuscatedName("ef.f")
    public static int field2154 = 0;

    @ObfuscatedName("ef.v")
    public static long field2152 = 0L;

    @ObfuscatedName("es.o(Ljava/awt/Component;I)V")
    public static void method2955(Component arg0) {
        arg0.removeMouseListener(field2140);
        arg0.removeMouseMotionListener(field2140);
        arg0.removeFocusListener(field2140);
        field2143 = 0;
    }

    @ObfuscatedName("ca.e(I)V")
    public static void method2035() {
        if (field2140 != null) {
            class140 var0 = field2140;
            synchronized (field2140) {
                field2140 = null;
            }
        }
    }

    @ObfuscatedName("ah.u(I)V")
    public static void method645() {
        class140 var0 = field2140;
        synchronized (field2140) {
            field2141 = field2143;
            field2144 = field2156;
            field2145 = field2142;
            field2150 = field2146;
            field2151 = field2147;
            field2154 = field2148;
            field2152 = field2149;
            field2146 = 0;
        }
    }

    public final synchronized void mousePressed(MouseEvent arg0) {
        if (field2140 != null) {
            field2139 = 0;
            field2147 = arg0.getX();
            field2148 = arg0.getY();
            field2149 = class115.method102();
            if (arg0.isAltDown()) {
                field2146 = 4;
                field2143 = 4;
            } else if (arg0.isMetaDown()) {
                field2146 = 2;
                field2143 = 2;
            } else {
                field2146 = 1;
                field2143 = 1;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (field2140 != null) {
            field2139 = 0;
            field2143 = 0;
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
        if (field2140 != null) {
            field2139 = 0;
            field2156 = arg0.getX();
            field2142 = arg0.getY();
        }
    }

    public final synchronized void mouseExited(MouseEvent arg0) {
        if (field2140 != null) {
            field2139 = 0;
            field2156 = -1;
            field2142 = -1;
        }
    }

    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (field2140 != null) {
            field2139 = 0;
            field2156 = arg0.getX();
            field2142 = arg0.getY();
        }
    }

    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (field2140 != null) {
            field2139 = 0;
            field2156 = arg0.getX();
            field2142 = arg0.getY();
        }
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field2140 != null) {
            field2143 = 0;
        }
    }
}
