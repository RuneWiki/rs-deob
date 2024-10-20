package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

@ObfuscatedName("es")
public class class140 implements MouseListener, MouseMotionListener, FocusListener {

    @ObfuscatedName("es.z")
    public static class140 field2167 = new class140();

    @ObfuscatedName("es.q")
    public static volatile int field2150 = 0;

    @ObfuscatedName("es.k")
    public static int field2152 = 0;

    @ObfuscatedName("es.f")
    public static volatile int field2160 = 0;

    @ObfuscatedName("es.d")
    public static volatile int field2149 = -1;

    @ObfuscatedName("es.l")
    public static volatile int field2153 = -1;

    @ObfuscatedName("es.r")
    public static int field2161 = 0;

    @ObfuscatedName("es.g")
    public static int field2156 = 0;

    @ObfuscatedName("es.h")
    public static volatile int field2155 = 0;

    @ObfuscatedName("es.n")
    public static volatile int field2158 = 0;

    @ObfuscatedName("es.j")
    public static volatile int field2159 = 0;

    @ObfuscatedName("es.a")
    public static volatile long field2162 = 0L;

    @ObfuscatedName("es.b")
    public static int field2151 = 0;

    @ObfuscatedName("es.c")
    public static int field2154 = 0;

    @ObfuscatedName("es.v")
    public static int field2163 = 0;

    @ObfuscatedName("es.p")
    public static long field2164 = 0L;

    @ObfuscatedName("ay.z(Ljava/awt/Component;I)V")
    public static void method626(Component arg0) {
        arg0.addMouseListener(field2167);
        arg0.addMouseMotionListener(field2167);
        arg0.addFocusListener(field2167);
    }

    @ObfuscatedName("dt.q(I)I")
    public static int method2236() {
        return ++field2150 - 1;
    }

    @ObfuscatedName("al.k(IB)V")
    public static void method622(int arg0) {
        field2150 = arg0;
    }

    public final synchronized void mousePressed(MouseEvent arg0) {
        if (field2167 != null) {
            field2150 = 0;
            field2158 = arg0.getX();
            field2159 = arg0.getY();
            field2162 = class115.method82();
            if (arg0.isAltDown()) {
                field2155 = 4;
                field2160 = 4;
            } else if (arg0.isMetaDown()) {
                field2155 = 2;
                field2160 = 2;
            } else {
                field2155 = 1;
                field2160 = 1;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (field2167 != null) {
            field2150 = 0;
            field2160 = 0;
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
        if (field2167 != null) {
            field2150 = 0;
            field2149 = arg0.getX();
            field2153 = arg0.getY();
        }
    }

    public final synchronized void mouseExited(MouseEvent arg0) {
        if (field2167 != null) {
            field2150 = 0;
            field2149 = -1;
            field2153 = -1;
        }
    }

    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (field2167 != null) {
            field2150 = 0;
            field2149 = arg0.getX();
            field2153 = arg0.getY();
        }
    }

    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (field2167 != null) {
            field2150 = 0;
            field2149 = arg0.getX();
            field2153 = arg0.getY();
        }
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field2167 != null) {
            field2160 = 0;
        }
    }
}
