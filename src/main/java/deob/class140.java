package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

@ObfuscatedName("ez")
public class class140 implements MouseListener, MouseMotionListener, FocusListener {

    @ObfuscatedName("ez.h")
    public static class140 field2164 = new class140();

    @ObfuscatedName("ez.m")
    public static volatile int field2149 = 0;

    @ObfuscatedName("ez.i")
    public static volatile int field2150 = 0;

    @ObfuscatedName("ez.q")
    public static volatile int field2148 = -1;

    @ObfuscatedName("ez.p")
    public static volatile int field2152 = -1;

    @ObfuscatedName("ez.c")
    public static int field2153 = 0;

    @ObfuscatedName("ez.f")
    public static int field2163 = 0;

    @ObfuscatedName("ez.y")
    public static volatile int field2154 = 0;

    @ObfuscatedName("ez.w")
    public static int field2155 = 0;

    @ObfuscatedName("ez.l")
    public static volatile int field2157 = 0;

    @ObfuscatedName("ez.v")
    public static volatile int field2158 = 0;

    @ObfuscatedName("ez.k")
    public static volatile long field2159 = 0L;

    @ObfuscatedName("ez.o")
    public static int field2160 = 0;

    @ObfuscatedName("ez.u")
    public static int field2161 = 0;

    @ObfuscatedName("ez.s")
    public static int field2151 = 0;

    @ObfuscatedName("ez.g")
    public static long field2162 = 0L;

    @ObfuscatedName("ew.h(Ljava/awt/Component;I)V")
    public static void method2682(Component arg0) {
        arg0.addMouseListener(field2164);
        arg0.addMouseMotionListener(field2164);
        arg0.addFocusListener(field2164);
    }

    @ObfuscatedName("ap.m(B)V")
    public static void method654() {
        if (field2164 != null) {
            class140 var0 = field2164;
            synchronized (field2164) {
                field2164 = null;
            }
        }
    }

    @ObfuscatedName("el.i(B)I")
    public static int method2675() {
        return ++field2149 - 1;
    }

    @ObfuscatedName("client.q(IB)V")
    public static void method474(int arg0) {
        field2149 = arg0;
    }

    public final synchronized void mousePressed(MouseEvent arg0) {
        if (field2164 != null) {
            field2149 = 0;
            field2157 = arg0.getX();
            field2158 = arg0.getY();
            field2159 = class115.method2007();
            if (arg0.isAltDown()) {
                field2154 = 4;
                field2150 = 4;
            } else if (arg0.isMetaDown()) {
                field2154 = 2;
                field2150 = 2;
            } else {
                field2154 = 1;
                field2150 = 1;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (field2164 != null) {
            field2149 = 0;
            field2150 = 0;
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
        if (field2164 != null) {
            field2149 = 0;
            field2148 = arg0.getX();
            field2152 = arg0.getY();
        }
    }

    public final synchronized void mouseExited(MouseEvent arg0) {
        if (field2164 != null) {
            field2149 = 0;
            field2148 = -1;
            field2152 = -1;
        }
    }

    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (field2164 != null) {
            field2149 = 0;
            field2148 = arg0.getX();
            field2152 = arg0.getY();
        }
    }

    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (field2164 != null) {
            field2149 = 0;
            field2148 = arg0.getX();
            field2152 = arg0.getY();
        }
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field2164 != null) {
            field2150 = 0;
        }
    }
}
