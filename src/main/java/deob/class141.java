package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

@ObfuscatedName("es")
public class class141 implements MouseListener, MouseMotionListener, FocusListener {

    @ObfuscatedName("es.b")
    public static class141 field2132 = new class141();

    @ObfuscatedName("es.g")
    public static volatile int field2130 = 0;

    @ObfuscatedName("es.j")
    public static volatile int field2131 = 0;

    @ObfuscatedName("es.d")
    public static volatile int field2133 = -1;

    @ObfuscatedName("es.x")
    public static int field2136 = 0;

    @ObfuscatedName("es.y")
    public static volatile int field2129 = 0;

    @ObfuscatedName("es.r")
    public static volatile int field2137 = -1;

    @ObfuscatedName("es.c")
    public static int field2134 = 0;

    @ObfuscatedName("es.l")
    public static int field2135 = 0;

    @ObfuscatedName("es.u")
    public static volatile int field2138 = 0;

    @ObfuscatedName("es.p")
    public static volatile int field2139 = 0;

    @ObfuscatedName("es.n")
    public static volatile long field2140 = 0L;

    @ObfuscatedName("es.w")
    public static int field2141 = 0;

    @ObfuscatedName("es.z")
    public static int field2142 = 0;

    @ObfuscatedName("es.k")
    public static int field2143 = 0;

    @ObfuscatedName("es.o")
    public static long field2144 = 0L;

    @ObfuscatedName("ae.b(Ljava/awt/Component;I)V")
    public static void method648(Component arg0) {
        arg0.addMouseListener(field2132);
        arg0.addMouseMotionListener(field2132);
        arg0.addFocusListener(field2132);
    }

    @ObfuscatedName("ef.g(Ljava/awt/Component;B)V")
    public static void method2731(Component arg0) {
        arg0.removeMouseListener(field2132);
        arg0.removeMouseMotionListener(field2132);
        arg0.removeFocusListener(field2132);
        field2131 = 0;
    }

    @ObfuscatedName("cu.j(II)V")
    public static void method1943(int arg0) {
        field2130 = arg0;
    }

    public final synchronized void mousePressed(MouseEvent arg0) {
        if (field2132 != null) {
            field2130 = 0;
            field2138 = arg0.getX();
            field2139 = arg0.getY();
            field2140 = class116.method1946();
            if (arg0.isAltDown()) {
                field2129 = 4;
                field2131 = 4;
            } else if (arg0.isMetaDown()) {
                field2129 = 2;
                field2131 = 2;
            } else {
                field2129 = 1;
                field2131 = 1;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (field2132 != null) {
            field2130 = 0;
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
        if (field2132 != null) {
            field2130 = 0;
            field2133 = arg0.getX();
            field2137 = arg0.getY();
        }
    }

    public final synchronized void mouseExited(MouseEvent arg0) {
        if (field2132 != null) {
            field2130 = 0;
            field2133 = -1;
            field2137 = -1;
        }
    }

    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (field2132 != null) {
            field2130 = 0;
            field2133 = arg0.getX();
            field2137 = arg0.getY();
        }
    }

    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (field2132 != null) {
            field2130 = 0;
            field2133 = arg0.getX();
            field2137 = arg0.getY();
        }
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field2132 != null) {
            field2131 = 0;
        }
    }
}
