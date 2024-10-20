package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

@ObfuscatedName("ek")
public class class141 implements MouseListener, MouseMotionListener, FocusListener {

    @ObfuscatedName("ek.s")
    public static class141 field2159 = new class141();

    @ObfuscatedName("ek.j")
    public static volatile int field2158 = 0;

    @ObfuscatedName("ek.p")
    public static volatile int field2172 = 0;

    @ObfuscatedName("ek.x")
    public static int field2164 = 0;

    @ObfuscatedName("ek.d")
    public static volatile int field2169 = -1;

    @ObfuscatedName("ek.u")
    public static volatile int field2161 = -1;

    @ObfuscatedName("ek.o")
    public static int field2162 = 0;

    @ObfuscatedName("ek.b")
    public static int field2163 = 0;

    @ObfuscatedName("ek.k")
    public static volatile int field2168 = 0;

    @ObfuscatedName("ek.c")
    public static volatile int field2166 = 0;

    @ObfuscatedName("ek.l")
    public static volatile int field2167 = 0;

    @ObfuscatedName("ek.t")
    public static volatile long field2157 = 0L;

    @ObfuscatedName("ek.i")
    public static int field2160 = 0;

    @ObfuscatedName("ek.r")
    public static int field2170 = 0;

    @ObfuscatedName("ek.m")
    public static int field2171 = 0;

    @ObfuscatedName("ek.e")
    public static long field2165 = 0L;

    @ObfuscatedName("ce.s(Ljava/awt/Component;B)V")
    public static void method1941(Component arg0) {
        arg0.addMouseListener(field2159);
        arg0.addMouseMotionListener(field2159);
        arg0.addFocusListener(field2159);
    }

    @ObfuscatedName("ec.j(Ljava/awt/Component;I)V")
    public static void method2738(Component arg0) {
        arg0.removeMouseListener(field2159);
        arg0.removeMouseMotionListener(field2159);
        arg0.removeFocusListener(field2159);
        field2172 = 0;
    }

    @ObfuscatedName("bd.p(II)V")
    public static void method1033(int arg0) {
        field2158 = arg0;
    }

    public final synchronized void mousePressed(MouseEvent arg0) {
        if (field2159 != null) {
            field2158 = 0;
            field2166 = arg0.getX();
            field2167 = arg0.getY();
            field2157 = class116.method157();
            if (arg0.isAltDown()) {
                field2168 = 4;
                field2172 = 4;
            } else if (arg0.isMetaDown()) {
                field2168 = 2;
                field2172 = 2;
            } else {
                field2168 = 1;
                field2172 = 1;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (field2159 != null) {
            field2158 = 0;
            field2172 = 0;
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
        if (field2159 != null) {
            field2158 = 0;
            field2169 = arg0.getX();
            field2161 = arg0.getY();
        }
    }

    public final synchronized void mouseExited(MouseEvent arg0) {
        if (field2159 != null) {
            field2158 = 0;
            field2169 = -1;
            field2161 = -1;
        }
    }

    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (field2159 != null) {
            field2158 = 0;
            field2169 = arg0.getX();
            field2161 = arg0.getY();
        }
    }

    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (field2159 != null) {
            field2158 = 0;
            field2169 = arg0.getX();
            field2161 = arg0.getY();
        }
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field2159 != null) {
            field2172 = 0;
        }
    }
}
