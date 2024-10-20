package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

@ObfuscatedName("ey")
public class class144 implements MouseListener, MouseMotionListener, FocusListener {

    @ObfuscatedName("ey.i")
    public static class144 field2208 = new class144();

    @ObfuscatedName("ey.h")
    public static volatile int field2200 = 0;

    @ObfuscatedName("ey.e")
    public static volatile int field2206 = 0;

    @ObfuscatedName("ey.g")
    public static volatile int field2202 = -1;

    @ObfuscatedName("ey.n")
    public static volatile int field2203 = -1;

    @ObfuscatedName("ey.u")
    public static int field2204 = 0;

    @ObfuscatedName("ey.d")
    public static int field2205 = 0;

    @ObfuscatedName("ey.l")
    public static int field2207 = 0;

    @ObfuscatedName("ey.m")
    public static volatile int field2201 = 0;

    @ObfuscatedName("ey.j")
    public static volatile int field2214 = 0;

    @ObfuscatedName("ey.y")
    public static volatile int field2209 = 0;

    @ObfuscatedName("ey.s")
    public static volatile long field2210 = 0L;

    @ObfuscatedName("ey.p")
    public static int field2211 = 0;

    @ObfuscatedName("ey.v")
    public static int field2212 = 0;

    @ObfuscatedName("ey.r")
    public static int field2213 = 0;

    @ObfuscatedName("ey.c")
    public static long field2199 = 0L;

    @ObfuscatedName("bh.i(Ljava/awt/Component;B)V")
    public static void method1525(Component arg0) {
        arg0.addMouseListener(field2208);
        arg0.addMouseMotionListener(field2208);
        arg0.addFocusListener(field2208);
    }

    @ObfuscatedName("n.e(I)V")
    public static void method56() {
        if (field2208 != null) {
            class144 var0 = field2208;
            synchronized (field2208) {
                field2208 = null;
            }
        }
    }

    public final synchronized void mousePressed(MouseEvent arg0) {
        if (field2208 != null) {
            field2200 = 0;
            field2214 = arg0.getX();
            field2209 = arg0.getY();
            field2210 = class119.method719();
            if (arg0.isAltDown()) {
                field2201 = 4;
                field2206 = 4;
            } else if (arg0.isMetaDown()) {
                field2201 = 2;
                field2206 = 2;
            } else {
                field2201 = 1;
                field2206 = 1;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (field2208 != null) {
            field2200 = 0;
            field2206 = 0;
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
        if (field2208 != null) {
            field2200 = 0;
            field2202 = arg0.getX();
            field2203 = arg0.getY();
        }
    }

    public final synchronized void mouseExited(MouseEvent arg0) {
        if (field2208 != null) {
            field2200 = 0;
            field2202 = -1;
            field2203 = -1;
        }
    }

    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (field2208 != null) {
            field2200 = 0;
            field2202 = arg0.getX();
            field2203 = arg0.getY();
        }
    }

    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (field2208 != null) {
            field2200 = 0;
            field2202 = arg0.getX();
            field2203 = arg0.getY();
        }
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field2208 != null) {
            field2206 = 0;
        }
    }
}
