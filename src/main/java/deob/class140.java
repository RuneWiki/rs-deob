package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

@ObfuscatedName("ey")
public class class140 implements MouseListener, MouseMotionListener, FocusListener {

    @ObfuscatedName("ey.c")
    public static class140 field2114 = new class140();

    @ObfuscatedName("ey.h")
    public static volatile int field2111 = 0;

    @ObfuscatedName("ey.k")
    public static int field2116 = 0;

    @ObfuscatedName("ey.t")
    public static volatile int field2110 = 0;

    @ObfuscatedName("ey.g")
    public static volatile int field2113 = -1;

    @ObfuscatedName("ey.o")
    public static volatile int field2112 = -1;

    @ObfuscatedName("ey.i")
    public static int field2115 = 0;

    @ObfuscatedName("ey.w")
    public static int field2120 = 0;

    @ObfuscatedName("ey.m")
    public static volatile int field2118 = 0;

    @ObfuscatedName("ey.r")
    public static volatile int field2119 = 0;

    @ObfuscatedName("ey.y")
    public static volatile int field2124 = 0;

    @ObfuscatedName("ey.q")
    public static volatile long field2127 = 0L;

    @ObfuscatedName("ey.f")
    public static int field2122 = 0;

    @ObfuscatedName("ey.x")
    public static int field2123 = 0;

    @ObfuscatedName("ey.d")
    public static int field2117 = 0;

    @ObfuscatedName("ey.e")
    public static long field2121 = 0L;

    @ObfuscatedName("dp.c(Ljava/awt/Component;B)V")
    public static void method2223(Component arg0) {
        arg0.removeMouseListener(field2114);
        arg0.removeMouseMotionListener(field2114);
        arg0.removeFocusListener(field2114);
        field2110 = 0;
    }

    @ObfuscatedName("w.h(B)V")
    public static void method110() {
        if (field2114 != null) {
            class140 var0 = field2114;
            synchronized (field2114) {
                field2114 = null;
            }
        }
    }

    @ObfuscatedName("dd.k(I)V")
    public static void method2604() {
        class140 var0 = field2114;
        synchronized (field2114) {
            field2115 = field2110;
            field2116 = field2113;
            field2120 = field2112;
            field2122 = field2118;
            field2123 = field2119;
            field2117 = field2124;
            field2121 = field2127;
            field2118 = 0;
        }
    }

    public final synchronized void mousePressed(MouseEvent arg0) {
        if (field2114 != null) {
            field2111 = 0;
            field2119 = arg0.getX();
            field2124 = arg0.getY();
            field2127 = class115.method2622();
            if (arg0.isAltDown()) {
                field2118 = 4;
                field2110 = 4;
            } else if (arg0.isMetaDown()) {
                field2118 = 2;
                field2110 = 2;
            } else {
                field2118 = 1;
                field2110 = 1;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (field2114 != null) {
            field2111 = 0;
            field2110 = 0;
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
        if (field2114 != null) {
            field2111 = 0;
            field2113 = arg0.getX();
            field2112 = arg0.getY();
        }
    }

    public final synchronized void mouseExited(MouseEvent arg0) {
        if (field2114 != null) {
            field2111 = 0;
            field2113 = -1;
            field2112 = -1;
        }
    }

    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (field2114 != null) {
            field2111 = 0;
            field2113 = arg0.getX();
            field2112 = arg0.getY();
        }
    }

    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (field2114 != null) {
            field2111 = 0;
            field2113 = arg0.getX();
            field2112 = arg0.getY();
        }
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field2114 != null) {
            field2110 = 0;
        }
    }
}
