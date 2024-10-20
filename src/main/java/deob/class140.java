package deob;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

@ObfuscatedName("ef")
public class class140 implements MouseListener, MouseMotionListener, FocusListener {

    @ObfuscatedName("ef.j")
    public static class140 field2165 = new class140();

    @ObfuscatedName("ef.l")
    public static volatile int field2171 = 0;

    @ObfuscatedName("ef.a")
    public static volatile int field2159 = 0;

    @ObfuscatedName("ef.i")
    public static volatile int field2158 = -1;

    @ObfuscatedName("ef.f")
    public static volatile int field2161 = -1;

    @ObfuscatedName("ef.m")
    public static int field2162 = 0;

    @ObfuscatedName("ef.o")
    public static int field2163 = 0;

    @ObfuscatedName("ef.h")
    public static int field2172 = 0;

    @ObfuscatedName("ef.n")
    public static volatile int field2160 = 0;

    @ObfuscatedName("ef.k")
    public static volatile int field2166 = 0;

    @ObfuscatedName("ef.r")
    public static volatile int field2167 = 0;

    @ObfuscatedName("ef.b")
    public static volatile long field2168 = 0L;

    @ObfuscatedName("ef.q")
    public static int field2169 = 0;

    @ObfuscatedName("ef.u")
    public static int field2170 = 0;

    @ObfuscatedName("ef.g")
    public static int field2164 = 0;

    @ObfuscatedName("ef.y")
    public static long field2157 = 0L;

    @ObfuscatedName("t.j(II)V")
    public static void method573(int arg0) {
        field2171 = arg0;
    }

    public final synchronized void mousePressed(MouseEvent arg0) {
        if (field2165 != null) {
            field2171 = 0;
            field2166 = arg0.getX();
            field2167 = arg0.getY();
            field2168 = class115.method2249();
            if (arg0.isAltDown()) {
                field2160 = 4;
                field2159 = 4;
            } else if (arg0.isMetaDown()) {
                field2160 = 2;
                field2159 = 2;
            } else {
                field2160 = 1;
                field2159 = 1;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (field2165 != null) {
            field2171 = 0;
            field2159 = 0;
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
        if (field2165 != null) {
            field2171 = 0;
            field2158 = arg0.getX();
            field2161 = arg0.getY();
        }
    }

    public final synchronized void mouseExited(MouseEvent arg0) {
        if (field2165 != null) {
            field2171 = 0;
            field2158 = -1;
            field2161 = -1;
        }
    }

    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (field2165 != null) {
            field2171 = 0;
            field2158 = arg0.getX();
            field2161 = arg0.getY();
        }
    }

    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (field2165 != null) {
            field2171 = 0;
            field2158 = arg0.getX();
            field2161 = arg0.getY();
        }
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field2165 != null) {
            field2159 = 0;
        }
    }
}
