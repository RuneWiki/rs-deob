package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

@ObfuscatedName("ec")
public class class140 implements MouseListener, MouseMotionListener, FocusListener {

    @ObfuscatedName("ec.k")
    public static int field2120 = 0;

    @ObfuscatedName("ec.h")
    public static class140 field2123 = new class140();

    @ObfuscatedName("ec.o")
    public static volatile int field2115 = 0;

    @ObfuscatedName("ec.z")
    public static volatile int field2128 = 0;

    @ObfuscatedName("ec.c")
    public static volatile int field2117 = -1;

    @ObfuscatedName("ec.d")
    public static volatile int field2118 = -1;

    @ObfuscatedName("ec.l")
    public static int field2119 = 0;

    @ObfuscatedName("ec.b")
    public static int field2121 = 0;

    @ObfuscatedName("ec.j")
    public static volatile int field2133 = 0;

    @ObfuscatedName("ec.f")
    public static volatile int field2126 = 0;

    @ObfuscatedName("ec.i")
    public static volatile int field2124 = 0;

    @ObfuscatedName("ec.g")
    public static volatile long field2125 = 0L;

    @ObfuscatedName("ec.t")
    public static int field2131 = 0;

    @ObfuscatedName("ec.e")
    public static int field2127 = 0;

    @ObfuscatedName("ec.q")
    public static int field2114 = 0;

    @ObfuscatedName("ec.u")
    public static long field2129 = 0L;

    @ObfuscatedName("am.k(Ljava/awt/Component;I)V")
    public static void method971(Component arg0) {
        arg0.addMouseListener(field2123);
        arg0.addMouseMotionListener(field2123);
        arg0.addFocusListener(field2123);
    }

    @ObfuscatedName("j.h(Ljava/awt/Component;I)V")
    public static void method115(Component arg0) {
        arg0.removeMouseListener(field2123);
        arg0.removeMouseMotionListener(field2123);
        arg0.removeFocusListener(field2123);
        field2128 = 0;
    }

    @ObfuscatedName("ah.o(I)V")
    public static void method815() {
        if (field2123 != null) {
            class140 var0 = field2123;
            synchronized (field2123) {
                field2123 = null;
            }
        }
    }

    @ObfuscatedName("l.z(I)V")
    public static void method94() {
        class140 var0 = field2123;
        synchronized (field2123) {
            field2119 = field2128;
            field2120 = field2117;
            field2121 = field2118 * 1737424399;
            field2131 = field2133;
            field2127 = field2126;
            field2114 = field2124;
            field2129 = field2125;
            field2133 = 0;
        }
    }

    public final synchronized void mousePressed(MouseEvent arg0) {
        if (field2123 != null) {
            field2115 = 0;
            field2126 = arg0.getX();
            field2124 = arg0.getY();
            field2125 = class115.method124();
            if (arg0.isAltDown()) {
                field2133 = 4;
                field2128 = 4;
            } else if (arg0.isMetaDown()) {
                field2133 = 2;
                field2128 = 2;
            } else {
                field2133 = 1;
                field2128 = 1;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (field2123 != null) {
            field2115 = 0;
            field2128 = 0;
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
        if (field2123 != null) {
            field2115 = 0;
            field2117 = arg0.getX();
            field2118 = arg0.getY();
        }
    }

    public final synchronized void mouseExited(MouseEvent arg0) {
        if (field2123 != null) {
            field2115 = 0;
            field2117 = -1;
            field2118 = -1;
        }
    }

    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (field2123 != null) {
            field2115 = 0;
            field2117 = arg0.getX();
            field2118 = arg0.getY();
        }
    }

    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (field2123 != null) {
            field2115 = 0;
            field2117 = arg0.getX();
            field2118 = arg0.getY();
        }
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field2123 != null) {
            field2128 = 0;
        }
    }
}
