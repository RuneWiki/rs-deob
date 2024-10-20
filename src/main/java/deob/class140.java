package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

@ObfuscatedName("el")
public class class140 implements MouseListener, MouseMotionListener, FocusListener {

    @ObfuscatedName("el.o")
    public static class140 field2132 = new class140();

    @ObfuscatedName("el.f")
    public static volatile int field2138 = 0;

    @ObfuscatedName("el.i")
    public static volatile int field2134 = 0;

    @ObfuscatedName("el.h")
    public static volatile int field2141 = -1;

    @ObfuscatedName("el.q")
    public static volatile int field2136 = -1;

    @ObfuscatedName("el.u")
    public static int field2137 = 0;

    @ObfuscatedName("el.m")
    public static int field2150 = 0;

    @ObfuscatedName("el.y")
    public static volatile int field2135 = 0;

    @ObfuscatedName("el.p")
    public static int field2139 = 0;

    @ObfuscatedName("el.t")
    public static volatile int field2143 = 0;

    @ObfuscatedName("el.g")
    public static volatile int field2142 = 0;

    @ObfuscatedName("el.v")
    public static volatile long field2148 = 0L;

    @ObfuscatedName("el.l")
    public static int field2144 = 0;

    @ObfuscatedName("el.e")
    public static int field2145 = 0;

    @ObfuscatedName("el.a")
    public static int field2146 = 0;

    @ObfuscatedName("el.w")
    public static long field2147 = 0L;

    @ObfuscatedName("dt.o(Ljava/awt/Component;I)V")
    public static void method2571(Component arg0) {
        arg0.addMouseListener(field2132);
        arg0.addMouseMotionListener(field2132);
        arg0.addFocusListener(field2132);
    }

    @ObfuscatedName("aw.f(Ljava/awt/Component;B)V")
    public static void method955(Component arg0) {
        arg0.removeMouseListener(field2132);
        arg0.removeMouseMotionListener(field2132);
        arg0.removeFocusListener(field2132);
        field2134 = 0;
    }

    @ObfuscatedName("ar.i(II)V")
    public static void method615(int arg0) {
        field2138 = arg0;
    }

    public final synchronized void mousePressed(MouseEvent arg0) {
        if (field2132 != null) {
            field2138 = 0;
            field2143 = arg0.getX();
            field2142 = arg0.getY();
            field2148 = class115.method568();
            if (arg0.isAltDown()) {
                field2135 = 4;
                field2134 = 4;
            } else if (arg0.isMetaDown()) {
                field2135 = 2;
                field2134 = 2;
            } else {
                field2135 = 1;
                field2134 = 1;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (field2132 != null) {
            field2138 = 0;
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
        if (field2132 != null) {
            field2138 = 0;
            field2141 = arg0.getX();
            field2136 = arg0.getY();
        }
    }

    public final synchronized void mouseExited(MouseEvent arg0) {
        if (field2132 != null) {
            field2138 = 0;
            field2141 = -1;
            field2136 = -1;
        }
    }

    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (field2132 != null) {
            field2138 = 0;
            field2141 = arg0.getX();
            field2136 = arg0.getY();
        }
    }

    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (field2132 != null) {
            field2138 = 0;
            field2141 = arg0.getX();
            field2136 = arg0.getY();
        }
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field2132 != null) {
            field2134 = 0;
        }
    }
}
