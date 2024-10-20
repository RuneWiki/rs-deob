package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

@ObfuscatedName("ek")
public class class141 implements MouseListener, MouseMotionListener, FocusListener {

    @ObfuscatedName("ek.j")
    public static class141 field2125 = new class141();

    @ObfuscatedName("ek.h")
    public static volatile int field2124 = 0;

    @ObfuscatedName("ek.m")
    public static volatile int field2131 = 0;

    @ObfuscatedName("ek.z")
    public static volatile int field2126 = -1;

    @ObfuscatedName("ek.x")
    public static int field2127 = 0;

    @ObfuscatedName("ek.e")
    public static volatile int field2123 = -1;

    @ObfuscatedName("ek.i")
    public static int field2128 = 0;

    @ObfuscatedName("ek.c")
    public static int field2129 = 0;

    @ObfuscatedName("ek.n")
    public static volatile int field2130 = 0;

    @ObfuscatedName("ek.l")
    public static volatile int field2132 = 0;

    @ObfuscatedName("ek.u")
    public static volatile int field2133 = 0;

    @ObfuscatedName("ek.r")
    public static volatile long field2141 = 0L;

    @ObfuscatedName("ek.a")
    public static int field2135 = 0;

    @ObfuscatedName("ek.d")
    public static int field2136 = 0;

    @ObfuscatedName("ek.p")
    public static int field2137 = 0;

    @ObfuscatedName("ek.q")
    public static long field2138 = 0L;

    @ObfuscatedName("ab.j(Ljava/awt/Component;I)V")
    public static void method643(Component arg0) {
        arg0.addMouseListener(field2125);
        arg0.addMouseMotionListener(field2125);
        arg0.addFocusListener(field2125);
    }

    @ObfuscatedName("du.h(B)V")
    public static void method2296() {
        if (field2125 != null) {
            class141 var0 = field2125;
            synchronized (field2125) {
                field2125 = null;
            }
        }
    }

    @ObfuscatedName("dq.m(I)V")
    public static void method2281() {
        class141 var0 = field2125;
        synchronized (field2125) {
            field2128 = field2131;
            field2129 = field2126;
            field2127 = field2123;
            field2135 = field2130;
            field2136 = field2132;
            field2137 = field2133;
            field2138 = field2141;
            field2130 = 0;
        }
    }

    public final synchronized void mousePressed(MouseEvent arg0) {
        if (field2125 != null) {
            field2124 = 0;
            field2132 = arg0.getX();
            field2133 = arg0.getY();
            field2141 = class116.method1579();
            if (arg0.isAltDown()) {
                field2130 = 4;
                field2131 = 4;
            } else if (arg0.isMetaDown()) {
                field2130 = 2;
                field2131 = 2;
            } else {
                field2130 = 1;
                field2131 = 1;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (field2125 != null) {
            field2124 = 0;
            field2131 = 0;
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
        if (field2125 != null) {
            field2124 = 0;
            field2126 = arg0.getX();
            field2123 = arg0.getY();
        }
    }

    public final synchronized void mouseExited(MouseEvent arg0) {
        if (field2125 != null) {
            field2124 = 0;
            field2126 = -1;
            field2123 = -1;
        }
    }

    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (field2125 != null) {
            field2124 = 0;
            field2126 = arg0.getX();
            field2123 = arg0.getY();
        }
    }

    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (field2125 != null) {
            field2124 = 0;
            field2126 = arg0.getX();
            field2123 = arg0.getY();
        }
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field2125 != null) {
            field2131 = 0;
        }
    }
}
