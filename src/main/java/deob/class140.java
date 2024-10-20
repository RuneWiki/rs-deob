package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

@ObfuscatedName("en")
public class class140 implements MouseListener, MouseMotionListener, FocusListener {

    @ObfuscatedName("en.n")
    public static class140 field2136 = new class140();

    @ObfuscatedName("en.d")
    public static volatile int field2130 = 0;

    @ObfuscatedName("en.s")
    public static volatile int field2134 = 0;

    @ObfuscatedName("en.q")
    public static volatile int field2132 = -1;

    @ObfuscatedName("en.j")
    public static volatile int field2129 = -1;

    @ObfuscatedName("en.k")
    public static int field2131 = 0;

    @ObfuscatedName("en.i")
    public static int field2145 = 0;

    @ObfuscatedName("en.m")
    public static int field2142 = 0;

    @ObfuscatedName("en.p")
    public static volatile int field2137 = 0;

    @ObfuscatedName("en.h")
    public static volatile int field2138 = 0;

    @ObfuscatedName("en.e")
    public static volatile int field2139 = 0;

    @ObfuscatedName("en.g")
    public static volatile long field2140 = 0L;

    @ObfuscatedName("en.b")
    public static int field2141 = 0;

    @ObfuscatedName("en.f")
    public static int field2144 = 0;

    @ObfuscatedName("en.y")
    public static int field2135 = 0;

    @ObfuscatedName("en.z")
    public static long field2143 = 0L;

    @ObfuscatedName("dk.n(Ljava/awt/Component;I)V")
    public static void method2221(Component arg0) {
        arg0.removeMouseListener(field2136);
        arg0.removeMouseMotionListener(field2136);
        arg0.removeFocusListener(field2136);
        field2134 = 0;
    }

    @ObfuscatedName("at.d(I)V")
    public static void method853() {
        class140 var0 = field2136;
        synchronized (field2136) {
            field2145 = field2134;
            field2131 = field2132;
            field2142 = field2129;
            field2141 = field2137;
            field2144 = field2138;
            field2135 = field2139;
            field2143 = field2140;
            field2137 = 0;
        }
    }

    public final synchronized void mousePressed(MouseEvent arg0) {
        if (field2136 != null) {
            field2130 = 0;
            field2138 = arg0.getX();
            field2139 = arg0.getY();
            field2140 = class115.method1998();
            if (arg0.isAltDown()) {
                field2137 = 4;
                field2134 = 4;
            } else if (arg0.isMetaDown()) {
                field2137 = 2;
                field2134 = 2;
            } else {
                field2137 = 1;
                field2134 = 1;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (field2136 != null) {
            field2130 = 0;
            field2134 = 0;
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
        if (field2136 != null) {
            field2130 = 0;
            field2132 = arg0.getX();
            field2129 = arg0.getY();
        }
    }

    public final synchronized void mouseExited(MouseEvent arg0) {
        if (field2136 != null) {
            field2130 = 0;
            field2132 = -1;
            field2129 = -1;
        }
    }

    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (field2136 != null) {
            field2130 = 0;
            field2132 = arg0.getX();
            field2129 = arg0.getY();
        }
    }

    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (field2136 != null) {
            field2130 = 0;
            field2132 = arg0.getX();
            field2129 = arg0.getY();
        }
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field2136 != null) {
            field2134 = 0;
        }
    }
}
