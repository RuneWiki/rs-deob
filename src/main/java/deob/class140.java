package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

@ObfuscatedName("ef")
public class class140 implements MouseListener, MouseMotionListener, FocusListener {

    @ObfuscatedName("ef.h")
    public static class140 field2143 = new class140();

    @ObfuscatedName("ef.q")
    public static volatile int field2129 = 0;

    @ObfuscatedName("ef.v")
    public static volatile int field2130 = 0;

    @ObfuscatedName("ef.n")
    public static volatile int field2131 = -1;

    @ObfuscatedName("ef.f")
    public static volatile int field2138 = -1;

    @ObfuscatedName("ef.g")
    public static int field2142 = 0;

    @ObfuscatedName("ef.o")
    public static int field2134 = 0;

    @ObfuscatedName("ef.s")
    public static int field2135 = 0;

    @ObfuscatedName("ef.k")
    public static volatile int field2136 = 0;

    @ObfuscatedName("ef.b")
    public static volatile int field2137 = 0;

    @ObfuscatedName("ef.c")
    public static volatile int field2133 = 0;

    @ObfuscatedName("ef.l")
    public static volatile long field2139 = 0L;

    @ObfuscatedName("ef.p")
    public static int field2140 = 0;

    @ObfuscatedName("ef.d")
    public static int field2146 = 0;

    @ObfuscatedName("ef.i")
    public static int field2132 = 0;

    @ObfuscatedName("ef.x")
    public static long field2141 = 0L;

    @ObfuscatedName("ar.h(Ljava/awt/Component;B)V")
    public static void method698(Component arg0) {
        arg0.addMouseListener(field2143);
        arg0.addMouseMotionListener(field2143);
        arg0.addFocusListener(field2143);
    }

    @ObfuscatedName("bs.q(B)V")
    public static void method1060() {
        if (field2143 != null) {
            class140 var0 = field2143;
            synchronized (field2143) {
                field2143 = null;
            }
        }
    }

    @ObfuscatedName("aj.v(IB)V")
    public static void method988(int arg0) {
        field2129 = arg0;
    }

    public final synchronized void mousePressed(MouseEvent arg0) {
        if (field2143 != null) {
            field2129 = 0;
            field2137 = arg0.getX();
            field2133 = arg0.getY();
            field2139 = class115.method2082();
            if (arg0.isAltDown()) {
                field2136 = 4;
                field2130 = 4;
            } else if (arg0.isMetaDown()) {
                field2136 = 2;
                field2130 = 2;
            } else {
                field2136 = 1;
                field2130 = 1;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (field2143 != null) {
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
        if (field2143 != null) {
            field2129 = 0;
            field2131 = arg0.getX();
            field2138 = arg0.getY();
        }
    }

    public final synchronized void mouseExited(MouseEvent arg0) {
        if (field2143 != null) {
            field2129 = 0;
            field2131 = -1;
            field2138 = -1;
        }
    }

    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (field2143 != null) {
            field2129 = 0;
            field2131 = arg0.getX();
            field2138 = arg0.getY();
        }
    }

    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (field2143 != null) {
            field2129 = 0;
            field2131 = arg0.getX();
            field2138 = arg0.getY();
        }
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field2143 != null) {
            field2130 = 0;
        }
    }
}
