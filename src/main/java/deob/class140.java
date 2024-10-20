package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

@ObfuscatedName("eg")
public class class140 implements MouseListener, MouseMotionListener, FocusListener {

    @ObfuscatedName("eg.y")
    public static volatile int field2142 = 0;

    @ObfuscatedName("eg.d")
    public static class140 field2138 = new class140();

    @ObfuscatedName("eg.g")
    public static volatile int field2126 = 0;

    @ObfuscatedName("eg.w")
    public static volatile int field2127 = 0;

    @ObfuscatedName("eg.e")
    public static volatile int field2128 = -1;

    @ObfuscatedName("eg.c")
    public static volatile int field2136 = -1;

    @ObfuscatedName("eg.a")
    public static int field2130 = 0;

    @ObfuscatedName("eg.q")
    public static int field2131 = 0;

    @ObfuscatedName("eg.m")
    public static int field2132 = 0;

    @ObfuscatedName("eg.n")
    public static volatile int field2139 = 0;

    @ObfuscatedName("eg.k")
    public static volatile int field2135 = 0;

    @ObfuscatedName("eg.o")
    public static volatile long field2129 = 0L;

    @ObfuscatedName("eg.f")
    public static int field2137 = 0;

    @ObfuscatedName("eg.s")
    public static int field2134 = 0;

    @ObfuscatedName("eg.z")
    public static int field2133 = 0;

    @ObfuscatedName("eg.b")
    public static long field2140 = 0L;

    @ObfuscatedName("cd.y(Ljava/awt/Component;B)V")
    public static void method2020(Component arg0) {
        arg0.addMouseListener(field2138);
        arg0.addMouseMotionListener(field2138);
        arg0.addFocusListener(field2138);
    }

    @ObfuscatedName("ev.d(Ljava/awt/Component;I)V")
    public static void method2785(Component arg0) {
        arg0.removeMouseListener(field2138);
        arg0.removeMouseMotionListener(field2138);
        arg0.removeFocusListener(field2138);
        field2127 = 0;
    }

    @ObfuscatedName("q.g(I)V")
    public static void method108() {
        if (field2138 != null) {
            class140 var0 = field2138;
            synchronized (field2138) {
                field2138 = null;
            }
        }
    }

    @ObfuscatedName("aj.w(I)V")
    public static void method694() {
        class140 var0 = field2138;
        synchronized (field2138) {
            field2130 = field2127;
            field2131 = field2128;
            field2132 = field2136 * -1945082579;
            field2137 = field2142;
            field2134 = field2139;
            field2133 = field2135;
            field2140 = field2129;
            field2142 = 0;
        }
    }

    @ObfuscatedName("r.e(II)V")
    public static void method194(int arg0) {
        field2126 = arg0;
    }

    public final synchronized void mousePressed(MouseEvent arg0) {
        if (field2138 != null) {
            field2126 = 0;
            field2139 = arg0.getX();
            field2135 = arg0.getY();
            field2129 = class115.method671();
            if (arg0.isAltDown()) {
                field2142 = 4;
                field2127 = 4;
            } else if (arg0.isMetaDown()) {
                field2142 = 2;
                field2127 = 2;
            } else {
                field2142 = 1;
                field2127 = 1;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (field2138 != null) {
            field2126 = 0;
            field2127 = 0;
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
        if (field2138 != null) {
            field2126 = 0;
            field2128 = arg0.getX();
            field2136 = arg0.getY();
        }
    }

    public final synchronized void mouseExited(MouseEvent arg0) {
        if (field2138 != null) {
            field2126 = 0;
            field2128 = -1;
            field2136 = -1;
        }
    }

    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (field2138 != null) {
            field2126 = 0;
            field2128 = arg0.getX();
            field2136 = arg0.getY();
        }
    }

    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (field2138 != null) {
            field2126 = 0;
            field2128 = arg0.getX();
            field2136 = arg0.getY();
        }
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field2138 != null) {
            field2127 = 0;
        }
    }
}
