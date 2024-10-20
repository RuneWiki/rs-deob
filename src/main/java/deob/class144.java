package deob;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

@ObfuscatedName("es")
public class class144 implements MouseListener, MouseMotionListener, FocusListener {

    @ObfuscatedName("es.e")
    public static class144 field2195 = new class144();

    @ObfuscatedName("es.l")
    public static volatile int field2201 = 0;

    @ObfuscatedName("es.c")
    public static volatile int field2197 = 0;

    @ObfuscatedName("es.h")
    public static volatile int field2198 = -1;

    @ObfuscatedName("es.r")
    public static volatile int field2212 = -1;

    @ObfuscatedName("es.a")
    public static int field2200 = 0;

    @ObfuscatedName("es.b")
    public static int field2199 = 0;

    @ObfuscatedName("es.u")
    public static int field2202 = 0;

    @ObfuscatedName("es.o")
    public static volatile int field2207 = 0;

    @ObfuscatedName("es.p")
    public static volatile int field2204 = 0;

    @ObfuscatedName("es.i")
    public static volatile int field2205 = 0;

    @ObfuscatedName("es.q")
    public static volatile long field2206 = 0L;

    @ObfuscatedName("es.g")
    public static int field2209 = 0;

    @ObfuscatedName("es.j")
    public static int field2208 = 0;

    @ObfuscatedName("es.w")
    public static int field2214 = 0;

    @ObfuscatedName("es.x")
    public static long field2210 = 0L;

    @ObfuscatedName("eq.e(I)V")
    public static void method2805() {
        if (field2195 != null) {
            class144 var0 = field2195;
            synchronized (field2195) {
                field2195 = null;
            }
        }
    }

    @ObfuscatedName("dy.l(I)V")
    public static void method2395() {
        class144 var0 = field2195;
        synchronized (field2195) {
            field2200 = field2197;
            field2199 = field2198;
            field2202 = field2212;
            field2209 = field2207;
            field2208 = field2204;
            field2214 = field2205;
            field2210 = field2206;
            field2207 = 0;
        }
    }

    @ObfuscatedName("hx.c(IB)V")
    public static void method3796(int arg0) {
        field2201 = arg0;
    }

    public final synchronized void mousePressed(MouseEvent arg0) {
        if (field2195 != null) {
            field2201 = 0;
            field2204 = arg0.getX();
            field2205 = arg0.getY();
            field2206 = class119.method415();
            if (arg0.isAltDown()) {
                field2207 = 4;
                field2197 = 4;
            } else if (arg0.isMetaDown()) {
                field2207 = 2;
                field2197 = 2;
            } else {
                field2207 = 1;
                field2197 = 1;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (field2195 != null) {
            field2201 = 0;
            field2197 = 0;
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
        if (field2195 != null) {
            field2201 = 0;
            field2198 = arg0.getX();
            field2212 = arg0.getY();
        }
    }

    public final synchronized void mouseExited(MouseEvent arg0) {
        if (field2195 != null) {
            field2201 = 0;
            field2198 = -1;
            field2212 = -1;
        }
    }

    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (field2195 != null) {
            field2201 = 0;
            field2198 = arg0.getX();
            field2212 = arg0.getY();
        }
    }

    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (field2195 != null) {
            field2201 = 0;
            field2198 = arg0.getX();
            field2212 = arg0.getY();
        }
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field2195 != null) {
            field2197 = 0;
        }
    }
}
