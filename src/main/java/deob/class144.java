package deob;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

@ObfuscatedName("el")
public class class144 implements MouseListener, MouseMotionListener, FocusListener {

    @ObfuscatedName("el.f")
    public static class144 field2205 = new class144();

    @ObfuscatedName("el.e")
    public static volatile int field2194 = 0;

    @ObfuscatedName("el.n")
    public static volatile int field2195 = 0;

    @ObfuscatedName("el.t")
    public static volatile int field2209 = -1;

    @ObfuscatedName("el.v")
    public static volatile int field2197 = -1;

    @ObfuscatedName("el.b")
    public static int field2206 = 0;

    @ObfuscatedName("el.m")
    public static int field2193 = 0;

    @ObfuscatedName("el.k")
    public static int field2200 = 0;

    @ObfuscatedName("el.c")
    public static volatile int field2201 = 0;

    @ObfuscatedName("el.w")
    public static volatile int field2202 = 0;

    @ObfuscatedName("el.l")
    public static volatile int field2203 = 0;

    @ObfuscatedName("el.h")
    public static volatile long field2204 = 0L;

    @ObfuscatedName("el.i")
    public static int field2199 = 0;

    @ObfuscatedName("el.u")
    public static int field2198 = 0;

    @ObfuscatedName("el.x")
    public static int field2208 = 0;

    @ObfuscatedName("el.d")
    public static long field2196 = 0L;

    @ObfuscatedName("ee.f(II)V")
    public static void method2743(int arg0) {
        field2194 = arg0;
    }

    public final synchronized void mousePressed(MouseEvent arg0) {
        if (field2205 != null) {
            field2194 = 0;
            field2202 = arg0.getX();
            field2203 = arg0.getY();
            field2204 = class119.method137();
            if (arg0.isAltDown()) {
                field2201 = 4;
                field2195 = 4;
            } else if (arg0.isMetaDown()) {
                field2201 = 2;
                field2195 = 2;
            } else {
                field2201 = 1;
                field2195 = 1;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (field2205 != null) {
            field2194 = 0;
            field2195 = 0;
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
        if (field2205 != null) {
            field2194 = 0;
            field2209 = arg0.getX();
            field2197 = arg0.getY();
        }
    }

    public final synchronized void mouseExited(MouseEvent arg0) {
        if (field2205 != null) {
            field2194 = 0;
            field2209 = -1;
            field2197 = -1;
        }
    }

    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (field2205 != null) {
            field2194 = 0;
            field2209 = arg0.getX();
            field2197 = arg0.getY();
        }
    }

    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (field2205 != null) {
            field2194 = 0;
            field2209 = arg0.getX();
            field2197 = arg0.getY();
        }
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field2205 != null) {
            field2195 = 0;
        }
    }
}
