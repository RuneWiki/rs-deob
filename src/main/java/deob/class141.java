package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

@ObfuscatedName("em")
public class class141 implements MouseListener, MouseMotionListener, FocusListener {

    @ObfuscatedName("em.w")
    public static class141 field2164 = new class141();

    @ObfuscatedName("em.x")
    public static int field2183 = 0;

    @ObfuscatedName("em.t")
    public static volatile int field2170 = 0;

    @ObfuscatedName("em.p")
    public static volatile int field2166 = 0;

    @ObfuscatedName("em.e")
    public static volatile int field2167 = -1;

    @ObfuscatedName("em.y")
    public static volatile int field2172 = 0;

    @ObfuscatedName("em.m")
    public static volatile int field2175 = -1;

    @ObfuscatedName("em.c")
    public static int field2185 = 0;

    @ObfuscatedName("em.v")
    public static int field2169 = 0;

    @ObfuscatedName("em.l")
    public static volatile int field2173 = 0;

    @ObfuscatedName("em.z")
    public static volatile int field2174 = 0;

    @ObfuscatedName("em.s")
    public static volatile long field2165 = 0L;

    @ObfuscatedName("em.j")
    public static int field2178 = 0;

    @ObfuscatedName("em.q")
    public static int field2177 = 0;

    @ObfuscatedName("em.a")
    public static int field2168 = 0;

    @ObfuscatedName("em.d")
    public static long field2179 = 0L;

    @ObfuscatedName("cb.w(Ljava/awt/Component;I)V")
    public static void method2150(Component arg0) {
        arg0.removeMouseListener(field2164);
        arg0.removeMouseMotionListener(field2164);
        arg0.removeFocusListener(field2164);
        field2166 = 0;
    }

    @ObfuscatedName("df.x(I)V")
    public static void method2284() {
        if (field2164 != null) {
            class141 var0 = field2164;
            synchronized (field2164) {
                field2164 = null;
            }
        }
    }

    @ObfuscatedName("cc.t(I)V")
    public static void method1778() {
        class141 var0 = field2164;
        synchronized (field2164) {
            field2185 = field2166;
            field2169 = field2167;
            field2183 = field2175;
            field2178 = field2172;
            field2177 = field2173;
            field2168 = field2174;
            field2179 = field2165;
            field2172 = 0;
        }
    }

    @ObfuscatedName("v.p(B)I")
    public static int method110() {
        return ++field2170 - 1;
    }

    @ObfuscatedName("et.e(II)V")
    public static void method2836(int arg0) {
        field2170 = arg0;
    }

    public final synchronized void mousePressed(MouseEvent arg0) {
        if (field2164 != null) {
            field2170 = 0;
            field2173 = arg0.getX();
            field2174 = arg0.getY();
            field2165 = Statics.method162();
            if (arg0.isAltDown()) {
                field2172 = 4;
                field2166 = 4;
            } else if (arg0.isMetaDown()) {
                field2172 = 2;
                field2166 = 2;
            } else {
                field2172 = 1;
                field2166 = 1;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (field2164 != null) {
            field2170 = 0;
            field2166 = 0;
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
            field2170 = 0;
            field2167 = arg0.getX();
            field2175 = arg0.getY();
        }
    }

    public final synchronized void mouseExited(MouseEvent arg0) {
        if (field2164 != null) {
            field2170 = 0;
            field2167 = -1;
            field2175 = -1;
        }
    }

    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (field2164 != null) {
            field2170 = 0;
            field2167 = arg0.getX();
            field2175 = arg0.getY();
        }
    }

    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (field2164 != null) {
            field2170 = 0;
            field2167 = arg0.getX();
            field2175 = arg0.getY();
        }
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field2164 != null) {
            field2166 = 0;
        }
    }
}
