package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

@ObfuscatedName("es")
public class class140 implements MouseListener, MouseMotionListener, FocusListener {

    @ObfuscatedName("es.v")
    public static class140 field2157 = new class140();

    @ObfuscatedName("es.f")
    public static volatile int field2155 = 0;

    @ObfuscatedName("es.i")
    public static volatile int field2156 = 0;

    @ObfuscatedName("es.d")
    public static volatile int field2159 = -1;

    @ObfuscatedName("es.o")
    public static volatile int field2158 = -1;

    @ObfuscatedName("es.c")
    public static int field2164 = 0;

    @ObfuscatedName("es.p")
    public static int field2161 = 0;

    @ObfuscatedName("es.j")
    public static int field2170 = 0;

    @ObfuscatedName("es.a")
    public static volatile int field2162 = 0;

    @ObfuscatedName("es.y")
    public static volatile int field2163 = 0;

    @ObfuscatedName("es.h")
    public static volatile int field2171 = 0;

    @ObfuscatedName("es.z")
    public static volatile long field2165 = 0L;

    @ObfuscatedName("es.w")
    public static int field2166 = 0;

    @ObfuscatedName("es.l")
    public static int field2167 = 0;

    @ObfuscatedName("es.q")
    public static int field2168 = 0;

    @ObfuscatedName("es.x")
    public static long field2169 = 0L;

    @ObfuscatedName("bl.v(Ljava/awt/Component;I)V")
    public static void method1514(Component arg0) {
        arg0.addMouseListener(field2157);
        arg0.addMouseMotionListener(field2157);
        arg0.addFocusListener(field2157);
    }

    @ObfuscatedName("bh.f(B)V")
    public static void method1587() {
        class140 var0 = field2157;
        synchronized (field2157) {
            field2164 = field2156;
            field2161 = field2159;
            field2170 = field2158;
            field2166 = field2162;
            field2167 = field2163;
            field2168 = field2171;
            field2169 = field2165;
            field2162 = 0;
        }
    }

    @ObfuscatedName("ax.i(IB)V")
    public static void method954(int arg0) {
        field2155 = arg0;
    }

    public final synchronized void mousePressed(MouseEvent arg0) {
        if (field2157 != null) {
            field2155 = 0;
            field2163 = arg0.getX();
            field2171 = arg0.getY();
            field2165 = class115.method819();
            if (arg0.isAltDown()) {
                field2162 = 4;
                field2156 = 4;
            } else if (arg0.isMetaDown()) {
                field2162 = 2;
                field2156 = 2;
            } else {
                field2162 = 1;
                field2156 = 1;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (field2157 != null) {
            field2155 = 0;
            field2156 = 0;
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
        if (field2157 != null) {
            field2155 = 0;
            field2159 = arg0.getX();
            field2158 = arg0.getY();
        }
    }

    public final synchronized void mouseExited(MouseEvent arg0) {
        if (field2157 != null) {
            field2155 = 0;
            field2159 = -1;
            field2158 = -1;
        }
    }

    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (field2157 != null) {
            field2155 = 0;
            field2159 = arg0.getX();
            field2158 = arg0.getY();
        }
    }

    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (field2157 != null) {
            field2155 = 0;
            field2159 = arg0.getX();
            field2158 = arg0.getY();
        }
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field2157 != null) {
            field2156 = 0;
        }
    }
}
