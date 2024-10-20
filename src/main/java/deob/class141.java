package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

@ObfuscatedName("er")
public class class141 implements MouseListener, MouseMotionListener, FocusListener {

    @ObfuscatedName("er.t")
    public static class141 field2187 = new class141();

    @ObfuscatedName("er.i")
    public static volatile int field2175 = 0;

    @ObfuscatedName("er.g")
    public static volatile int field2176 = 0;

    @ObfuscatedName("er.h")
    public static volatile int field2181 = -1;

    @ObfuscatedName("er.z")
    public static volatile int field2178 = -1;

    @ObfuscatedName("er.r")
    public static int field2179 = 0;

    @ObfuscatedName("er.f")
    public static int field2193 = 0;

    @ObfuscatedName("er.s")
    public static int field2190 = 0;

    @ObfuscatedName("er.d")
    public static volatile int field2182 = 0;

    @ObfuscatedName("er.l")
    public static volatile int field2183 = 0;

    @ObfuscatedName("er.y")
    public static volatile int field2184 = 0;

    @ObfuscatedName("er.p")
    public static volatile long field2185 = 0L;

    @ObfuscatedName("er.k")
    public static int field2186 = 0;

    @ObfuscatedName("er.o")
    public static int field2191 = 0;

    @ObfuscatedName("er.b")
    public static int field2188 = 0;

    @ObfuscatedName("er.j")
    public static long field2189 = 0L;

    @ObfuscatedName("dt.t(Ljava/awt/Component;I)V")
    public static void method2189(Component arg0) {
        arg0.addMouseListener(field2187);
        arg0.addMouseMotionListener(field2187);
        arg0.addFocusListener(field2187);
    }

    @ObfuscatedName("db.i(B)V")
    public static void method2193() {
        if (field2187 != null) {
            class141 var0 = field2187;
            synchronized (field2187) {
                field2187 = null;
            }
        }
    }

    @ObfuscatedName("x.g(S)V")
    public static void method549() {
        class141 var0 = field2187;
        synchronized (field2187) {
            field2179 = field2176;
            field2193 = field2181;
            field2190 = field2178;
            field2186 = field2182;
            field2191 = field2183;
            field2188 = field2184;
            field2189 = field2185;
            field2182 = 0;
        }
    }

    @ObfuscatedName("ce.h(II)V")
    public static void method2002(int arg0) {
        field2175 = arg0;
    }

    public final synchronized void mousePressed(MouseEvent arg0) {
        if (field2187 != null) {
            field2175 = 0;
            field2183 = arg0.getX();
            field2184 = arg0.getY();
            field2185 = class116.method2586();
            if (arg0.isAltDown()) {
                field2182 = 4;
                field2176 = 4;
            } else if (arg0.isMetaDown()) {
                field2182 = 2;
                field2176 = 2;
            } else {
                field2182 = 1;
                field2176 = 1;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (field2187 != null) {
            field2175 = 0;
            field2176 = 0;
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
        if (field2187 != null) {
            field2175 = 0;
            field2181 = arg0.getX();
            field2178 = arg0.getY();
        }
    }

    public final synchronized void mouseExited(MouseEvent arg0) {
        if (field2187 != null) {
            field2175 = 0;
            field2181 = -1;
            field2178 = -1;
        }
    }

    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (field2187 != null) {
            field2175 = 0;
            field2181 = arg0.getX();
            field2178 = arg0.getY();
        }
    }

    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (field2187 != null) {
            field2175 = 0;
            field2181 = arg0.getX();
            field2178 = arg0.getY();
        }
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field2187 != null) {
            field2176 = 0;
        }
    }
}
