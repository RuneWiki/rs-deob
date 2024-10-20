package deob;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

@ObfuscatedName("ea")
public class class140 implements MouseListener, MouseMotionListener, FocusListener {

    @ObfuscatedName("ea.l")
    public static class140 field2160 = new class140();

    @ObfuscatedName("ea.e")
    public static volatile int field2146 = 0;

    @ObfuscatedName("ea.q")
    public static volatile int field2147 = 0;

    @ObfuscatedName("ea.o")
    public static volatile int field2149 = -1;

    @ObfuscatedName("ea.g")
    public static volatile int field2157 = -1;

    @ObfuscatedName("ea.m")
    public static int field2150 = 0;

    @ObfuscatedName("ea.b")
    public static int field2151 = 0;

    @ObfuscatedName("ea.p")
    public static int field2152 = 0;

    @ObfuscatedName("ea.t")
    public static volatile int field2153 = 0;

    @ObfuscatedName("ea.w")
    public static volatile int field2145 = 0;

    @ObfuscatedName("ea.x")
    public static volatile int field2155 = 0;

    @ObfuscatedName("ea.k")
    public static volatile long field2156 = 0L;

    @ObfuscatedName("ea.z")
    public static int field2162 = 0;

    @ObfuscatedName("ea.v")
    public static int field2163 = 0;

    @ObfuscatedName("ea.j")
    public static int field2159 = 0;

    @ObfuscatedName("ea.f")
    public static long field2154 = 0L;

    @ObfuscatedName("cz.l(I)V")
    public static void method2075() {
        if (field2160 != null) {
            class140 var0 = field2160;
            synchronized (field2160) {
                field2160 = null;
            }
        }
    }

    @ObfuscatedName("cg.e(B)I")
    public static int method2053() {
        return ++field2146 - 1;
    }

    public final synchronized void mousePressed(MouseEvent arg0) {
        if (field2160 != null) {
            field2146 = 0;
            field2145 = arg0.getX();
            field2155 = arg0.getY();
            field2156 = class115.method2266();
            if (arg0.isAltDown()) {
                field2153 = 4;
                field2147 = 4;
            } else if (arg0.isMetaDown()) {
                field2153 = 2;
                field2147 = 2;
            } else {
                field2153 = 1;
                field2147 = 1;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (field2160 != null) {
            field2146 = 0;
            field2147 = 0;
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
        if (field2160 != null) {
            field2146 = 0;
            field2149 = arg0.getX();
            field2157 = arg0.getY();
        }
    }

    public final synchronized void mouseExited(MouseEvent arg0) {
        if (field2160 != null) {
            field2146 = 0;
            field2149 = -1;
            field2157 = -1;
        }
    }

    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (field2160 != null) {
            field2146 = 0;
            field2149 = arg0.getX();
            field2157 = arg0.getY();
        }
    }

    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (field2160 != null) {
            field2146 = 0;
            field2149 = arg0.getX();
            field2157 = arg0.getY();
        }
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field2160 != null) {
            field2147 = 0;
        }
    }
}
