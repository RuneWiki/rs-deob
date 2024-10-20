package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

@ObfuscatedName("en")
public class class140 implements MouseListener, MouseMotionListener, FocusListener {

    @ObfuscatedName("en.j")
    public static class140 field2142 = new class140();

    @ObfuscatedName("en.m")
    public static volatile int field2130 = 0;

    @ObfuscatedName("en.f")
    public static volatile int field2146 = 0;

    @ObfuscatedName("en.l")
    public static volatile int field2129 = -1;

    @ObfuscatedName("en.u")
    public static volatile int field2133 = -1;

    @ObfuscatedName("en.a")
    public static int field2134 = 0;

    @ObfuscatedName("en.h")
    public static int field2135 = 0;

    @ObfuscatedName("en.i")
    public static int field2136 = 0;

    @ObfuscatedName("en.t")
    public static volatile int field2137 = 0;

    @ObfuscatedName("en.k")
    public static volatile int field2139 = 0;

    @ObfuscatedName("en.s")
    public static volatile int field2132 = 0;

    @ObfuscatedName("en.w")
    public static volatile long field2140 = 0L;

    @ObfuscatedName("en.e")
    public static int field2141 = 0;

    @ObfuscatedName("en.z")
    public static int field2131 = 0;

    @ObfuscatedName("en.p")
    public static int field2143 = 0;

    @ObfuscatedName("en.r")
    public static long field2144 = 0L;

    @ObfuscatedName("at.j(Ljava/awt/Component;I)V")
    public static void method767(Component arg0) {
        arg0.addMouseListener(field2142);
        arg0.addMouseMotionListener(field2142);
        arg0.addFocusListener(field2142);
    }

    @ObfuscatedName("cd.m(I)V")
    public static void method2039() {
        class140 var0 = field2142;
        synchronized (field2142) {
            field2134 = field2146;
            field2135 = field2129;
            field2136 = field2133;
            field2141 = field2137;
            field2131 = field2139;
            field2143 = field2132;
            field2144 = field2140;
            field2137 = 0;
        }
    }

    @ObfuscatedName("ex.f(I)I")
    public static int method2722() {
        return ++field2130 - 1;
    }

    @ObfuscatedName("aa.l(II)V")
    public static void method670(int arg0) {
        field2130 = arg0;
    }

    public final synchronized void mousePressed(MouseEvent arg0) {
        if (field2142 != null) {
            field2130 = 0;
            field2139 = arg0.getX();
            field2132 = arg0.getY();
            field2140 = class115.method2038();
            if (arg0.isAltDown()) {
                field2137 = 4;
                field2146 = 4;
            } else if (arg0.isMetaDown()) {
                field2137 = 2;
                field2146 = 2;
            } else {
                field2137 = 1;
                field2146 = 1;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (field2142 != null) {
            field2130 = 0;
            field2146 = 0;
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
        if (field2142 != null) {
            field2130 = 0;
            field2129 = arg0.getX();
            field2133 = arg0.getY();
        }
    }

    public final synchronized void mouseExited(MouseEvent arg0) {
        if (field2142 != null) {
            field2130 = 0;
            field2129 = -1;
            field2133 = -1;
        }
    }

    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (field2142 != null) {
            field2130 = 0;
            field2129 = arg0.getX();
            field2133 = arg0.getY();
        }
    }

    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (field2142 != null) {
            field2130 = 0;
            field2129 = arg0.getX();
            field2133 = arg0.getY();
        }
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field2142 != null) {
            field2146 = 0;
        }
    }
}
