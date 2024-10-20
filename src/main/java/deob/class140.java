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
    public static class140 field2139 = new class140();

    @ObfuscatedName("en.q")
    public static volatile int field2129 = 0;

    @ObfuscatedName("en.c")
    public static volatile int field2130 = 0;

    @ObfuscatedName("en.l")
    public static volatile int field2131 = -1;

    @ObfuscatedName("en.r")
    public static volatile int field2132 = -1;

    @ObfuscatedName("en.u")
    public static int field2133 = 0;

    @ObfuscatedName("en.j")
    public static int field2134 = 0;

    @ObfuscatedName("en.w")
    public static int field2135 = 0;

    @ObfuscatedName("en.y")
    public static volatile int field2141 = 0;

    @ObfuscatedName("en.o")
    public static volatile int field2137 = 0;

    @ObfuscatedName("en.h")
    public static volatile int field2138 = 0;

    @ObfuscatedName("en.e")
    public static volatile long field2142 = 0L;

    @ObfuscatedName("en.v")
    public static int field2140 = 0;

    @ObfuscatedName("en.p")
    public static int field2128 = 0;

    @ObfuscatedName("en.m")
    public static int field2143 = 0;

    @ObfuscatedName("en.b")
    public static long field2136 = 0L;

    @ObfuscatedName("cd.n(Ljava/awt/Component;I)V")
    public static void method2151(Component arg0) {
        arg0.addMouseListener(field2139);
        arg0.addMouseMotionListener(field2139);
        arg0.addFocusListener(field2139);
    }

    @ObfuscatedName("ce.q(Ljava/awt/Component;I)V")
    public static void method1963(Component arg0) {
        arg0.removeMouseListener(field2139);
        arg0.removeMouseMotionListener(field2139);
        arg0.removeFocusListener(field2139);
        field2130 = 0;
    }

    @ObfuscatedName("af.c(I)V")
    public static void method872() {
        if (field2139 != null) {
            class140 var0 = field2139;
            synchronized (field2139) {
                field2139 = null;
            }
        }
    }

    @ObfuscatedName("do.l(B)V")
    public static void method2283() {
        class140 var0 = field2139;
        synchronized (field2139) {
            field2133 = field2130;
            field2134 = field2131;
            field2135 = field2132;
            field2140 = field2141;
            field2128 = field2137;
            field2143 = field2138;
            field2136 = field2142;
            field2141 = 0;
        }
    }

    public final synchronized void mousePressed(MouseEvent arg0) {
        if (field2139 != null) {
            field2129 = 0;
            field2137 = arg0.getX();
            field2138 = arg0.getY();
            field2142 = class115.method179();
            if (arg0.isAltDown()) {
                field2141 = 4;
                field2130 = 4;
            } else if (arg0.isMetaDown()) {
                field2141 = 2;
                field2130 = 2;
            } else {
                field2141 = 1;
                field2130 = 1;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (field2139 != null) {
            field2129 = 0;
            field2130 = 0;
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
        if (field2139 != null) {
            field2129 = 0;
            field2131 = arg0.getX();
            field2132 = arg0.getY();
        }
    }

    public final synchronized void mouseExited(MouseEvent arg0) {
        if (field2139 != null) {
            field2129 = 0;
            field2131 = -1;
            field2132 = -1;
        }
    }

    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (field2139 != null) {
            field2129 = 0;
            field2131 = arg0.getX();
            field2132 = arg0.getY();
        }
    }

    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (field2139 != null) {
            field2129 = 0;
            field2131 = arg0.getX();
            field2132 = arg0.getY();
        }
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field2139 != null) {
            field2130 = 0;
        }
    }
}
