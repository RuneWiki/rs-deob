package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

@ObfuscatedName("eh")
public class class144 implements MouseListener, MouseMotionListener, FocusListener {

    @ObfuscatedName("eh.l")
    public static class144 field2203 = new class144();

    @ObfuscatedName("eh.g")
    public static volatile int field2204 = 0;

    @ObfuscatedName("eh.r")
    public static volatile int field2205 = 0;

    @ObfuscatedName("eh.e")
    public static volatile int field2206 = -1;

    @ObfuscatedName("eh.h")
    public static volatile int field2215 = -1;

    @ObfuscatedName("eh.s")
    public static int field2208 = 0;

    @ObfuscatedName("eh.k")
    public static int field2207 = 0;

    @ObfuscatedName("eh.u")
    public static int field2210 = 0;

    @ObfuscatedName("eh.n")
    public static volatile int field2211 = 0;

    @ObfuscatedName("eh.b")
    public static volatile int field2212 = 0;

    @ObfuscatedName("eh.m")
    public static volatile int field2213 = 0;

    @ObfuscatedName("eh.q")
    public static volatile long field2214 = 0L;

    @ObfuscatedName("eh.p")
    public static int field2218 = 0;

    @ObfuscatedName("eh.w")
    public static int field2216 = 0;

    @ObfuscatedName("eh.o")
    public static int field2217 = 0;

    @ObfuscatedName("eh.d")
    public static long field2209 = 0L;

    @ObfuscatedName("db.l(Ljava/awt/Component;I)V")
    public static void method2403(Component arg0) {
        arg0.addMouseListener(field2203);
        arg0.addMouseMotionListener(field2203);
        arg0.addFocusListener(field2203);
    }

    @ObfuscatedName("ar.g(I)V")
    public static void method871() {
        if (field2203 != null) {
            class144 var0 = field2203;
            synchronized (field2203) {
                field2203 = null;
            }
        }
    }

    @ObfuscatedName("au.r(I)I")
    public static int method986() {
        return ++field2204 - 1;
    }

    public final synchronized void mousePressed(MouseEvent arg0) {
        if (field2203 != null) {
            field2204 = 0;
            field2212 = arg0.getX();
            field2213 = arg0.getY();
            field2214 = class119.method1224();
            if (arg0.isAltDown()) {
                field2211 = 4;
                field2205 = 4;
            } else if (arg0.isMetaDown()) {
                field2211 = 2;
                field2205 = 2;
            } else {
                field2211 = 1;
                field2205 = 1;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (field2203 != null) {
            field2204 = 0;
            field2205 = 0;
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
        if (field2203 != null) {
            field2204 = 0;
            field2206 = arg0.getX();
            field2215 = arg0.getY();
        }
    }

    public final synchronized void mouseExited(MouseEvent arg0) {
        if (field2203 != null) {
            field2204 = 0;
            field2206 = -1;
            field2215 = -1;
        }
    }

    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (field2203 != null) {
            field2204 = 0;
            field2206 = arg0.getX();
            field2215 = arg0.getY();
        }
    }

    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (field2203 != null) {
            field2204 = 0;
            field2206 = arg0.getX();
            field2215 = arg0.getY();
        }
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field2203 != null) {
            field2205 = 0;
        }
    }
}
