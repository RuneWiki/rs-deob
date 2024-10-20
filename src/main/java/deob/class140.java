package deob;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

@ObfuscatedName("eu")
public class class140 implements MouseListener, MouseMotionListener, FocusListener {

    @ObfuscatedName("eu.m")
    public static class140 field2131 = new class140();

    @ObfuscatedName("eu.l")
    public static volatile int field2116 = 0;

    @ObfuscatedName("eu.y")
    public static volatile int field2123 = 0;

    @ObfuscatedName("eu.u")
    public static volatile int field2117 = 0;

    @ObfuscatedName("eu.k")
    public static int field2121 = 0;

    @ObfuscatedName("eu.j")
    public static volatile int field2115 = -1;

    @ObfuscatedName("eu.i")
    public static volatile int field2119 = -1;

    @ObfuscatedName("eu.x")
    public static int field2122 = 0;

    @ObfuscatedName("eu.g")
    public static int field2120 = 0;

    @ObfuscatedName("eu.e")
    public static volatile int field2124 = 0;

    @ObfuscatedName("eu.p")
    public static volatile int field2125 = 0;

    @ObfuscatedName("eu.a")
    public static volatile long field2126 = 0L;

    @ObfuscatedName("eu.v")
    public static int field2130 = 0;

    @ObfuscatedName("eu.c")
    public static int field2128 = 0;

    @ObfuscatedName("eu.s")
    public static int field2129 = 0;

    @ObfuscatedName("eu.r")
    public static long field2127 = 0L;

    @ObfuscatedName("ds.m(B)V")
    public static void method2625() {
        if (field2131 != null) {
            class140 var0 = field2131;
            synchronized (field2131) {
                field2131 = null;
            }
        }
    }

    @ObfuscatedName("ej.l(I)I")
    public static int method2752() {
        return ++field2116 - 1;
    }

    @ObfuscatedName("fl.y(IB)V")
    public static void method3165(int arg0) {
        field2116 = arg0;
    }

    public final synchronized void mousePressed(MouseEvent arg0) {
        if (field2131 != null) {
            field2116 = 0;
            field2124 = arg0.getX();
            field2125 = arg0.getY();
            field2126 = class115.method2177();
            if (arg0.isAltDown()) {
                field2123 = 4;
                field2117 = 4;
            } else if (arg0.isMetaDown()) {
                field2123 = 2;
                field2117 = 2;
            } else {
                field2123 = 1;
                field2117 = 1;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (field2131 != null) {
            field2116 = 0;
            field2117 = 0;
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
        if (field2131 != null) {
            field2116 = 0;
            field2115 = arg0.getX();
            field2119 = arg0.getY();
        }
    }

    public final synchronized void mouseExited(MouseEvent arg0) {
        if (field2131 != null) {
            field2116 = 0;
            field2115 = -1;
            field2119 = -1;
        }
    }

    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (field2131 != null) {
            field2116 = 0;
            field2115 = arg0.getX();
            field2119 = arg0.getY();
        }
    }

    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (field2131 != null) {
            field2116 = 0;
            field2115 = arg0.getX();
            field2119 = arg0.getY();
        }
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field2131 != null) {
            field2117 = 0;
        }
    }
}
