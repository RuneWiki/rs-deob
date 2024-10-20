package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

@ObfuscatedName("em")
public class class141 implements MouseListener, MouseMotionListener, FocusListener {

    @ObfuscatedName("em.f")
    public static class141 field2148 = new class141();

    @ObfuscatedName("em.u")
    public static volatile int field2146 = 0;

    @ObfuscatedName("em.x")
    public static int field2152 = 0;

    @ObfuscatedName("em.b")
    public static volatile int field2155 = 0;

    @ObfuscatedName("em.l")
    public static volatile int field2150 = -1;

    @ObfuscatedName("em.d")
    public static volatile int field2151 = -1;

    @ObfuscatedName("em.n")
    public static int field2145 = 0;

    @ObfuscatedName("em.m")
    public static int field2147 = 0;

    @ObfuscatedName("em.g")
    public static volatile int field2153 = 0;

    @ObfuscatedName("em.s")
    public static volatile int field2154 = 0;

    @ObfuscatedName("em.r")
    public static volatile int field2158 = 0;

    @ObfuscatedName("em.k")
    public static volatile long field2156 = 0L;

    @ObfuscatedName("em.o")
    public static int field2157 = 0;

    @ObfuscatedName("em.q")
    public static int field2162 = 0;

    @ObfuscatedName("em.p")
    public static int field2159 = 0;

    @ObfuscatedName("em.h")
    public static long field2160 = 0L;

    @ObfuscatedName("c.f(Ljava/awt/Component;B)V")
    public static void method604(Component arg0) {
        arg0.addMouseListener(field2148);
        arg0.addMouseMotionListener(field2148);
        arg0.addFocusListener(field2148);
    }

    @ObfuscatedName("b.u(B)I")
    public static int method45() {
        return ++field2146 - 1;
    }

    public final synchronized void mousePressed(MouseEvent arg0) {
        if (field2148 != null) {
            field2146 = 0;
            field2154 = arg0.getX();
            field2158 = arg0.getY();
            field2156 = class116.method2672();
            if (arg0.isAltDown()) {
                field2153 = 4;
                field2155 = 4;
            } else if (arg0.isMetaDown()) {
                field2153 = 2;
                field2155 = 2;
            } else {
                field2153 = 1;
                field2155 = 1;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (field2148 != null) {
            field2146 = 0;
            field2155 = 0;
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
        if (field2148 != null) {
            field2146 = 0;
            field2150 = arg0.getX();
            field2151 = arg0.getY();
        }
    }

    public final synchronized void mouseExited(MouseEvent arg0) {
        if (field2148 != null) {
            field2146 = 0;
            field2150 = -1;
            field2151 = -1;
        }
    }

    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (field2148 != null) {
            field2146 = 0;
            field2150 = arg0.getX();
            field2151 = arg0.getY();
        }
    }

    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (field2148 != null) {
            field2146 = 0;
            field2150 = arg0.getX();
            field2151 = arg0.getY();
        }
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field2148 != null) {
            field2155 = 0;
        }
    }
}
