package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

@ObfuscatedName("ea")
public class class141 implements MouseListener, MouseMotionListener, FocusListener {

    @ObfuscatedName("ea.a")
    public static class141 field2146 = new class141();

    @ObfuscatedName("ea.w")
    public static volatile int field2147 = 0;

    @ObfuscatedName("ea.d")
    public static volatile int field2149 = 0;

    @ObfuscatedName("ea.c")
    public static volatile int field2163 = -1;

    @ObfuscatedName("ea.y")
    public static volatile int field2154 = 0;

    @ObfuscatedName("ea.k")
    public static int field2152 = 0;

    @ObfuscatedName("ea.r")
    public static volatile int field2150 = -1;

    @ObfuscatedName("ea.p")
    public static int field2148 = 0;

    @ObfuscatedName("ea.q")
    public static int field2162 = 0;

    @ObfuscatedName("ea.m")
    public static volatile int field2155 = 0;

    @ObfuscatedName("ea.e")
    public static volatile int field2156 = 0;

    @ObfuscatedName("ea.x")
    public static volatile long field2157 = 0L;

    @ObfuscatedName("ea.z")
    public static int field2158 = 0;

    @ObfuscatedName("ea.i")
    public static int field2161 = 0;

    @ObfuscatedName("ea.t")
    public static int field2160 = 0;

    @ObfuscatedName("ea.n")
    public static long field2159 = 0L;

    @ObfuscatedName("cw.w(Ljava/awt/Component;B)V")
    public static void method2229(Component arg0) {
        arg0.removeMouseListener(field2146);
        arg0.removeMouseMotionListener(field2146);
        arg0.removeFocusListener(field2146);
        field2149 = 0;
    }

    @ObfuscatedName("aw.d(I)V")
    public static void method1151() {
        if (field2146 != null) {
            class141 var0 = field2146;
            synchronized (field2146) {
                field2146 = null;
            }
        }
    }

    @ObfuscatedName("cq.c(IB)V")
    public static void method2138(int arg0) {
        field2147 = arg0;
    }

    public final synchronized void mousePressed(MouseEvent arg0) {
        if (field2146 != null) {
            field2147 = 0;
            field2155 = arg0.getX();
            field2156 = arg0.getY();
            field2157 = class116.method2781();
            if (arg0.isAltDown()) {
                field2154 = 4;
                field2149 = 4;
            } else if (arg0.isMetaDown()) {
                field2154 = 2;
                field2149 = 2;
            } else {
                field2154 = 1;
                field2149 = 1;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (field2146 != null) {
            field2147 = 0;
            field2149 = 0;
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
        if (field2146 != null) {
            field2147 = 0;
            field2163 = arg0.getX();
            field2150 = arg0.getY();
        }
    }

    public final synchronized void mouseExited(MouseEvent arg0) {
        if (field2146 != null) {
            field2147 = 0;
            field2163 = -1;
            field2150 = -1;
        }
    }

    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (field2146 != null) {
            field2147 = 0;
            field2163 = arg0.getX();
            field2150 = arg0.getY();
        }
    }

    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (field2146 != null) {
            field2147 = 0;
            field2163 = arg0.getX();
            field2150 = arg0.getY();
        }
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field2146 != null) {
            field2149 = 0;
        }
    }
}
