package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

@ObfuscatedName("ee")
public class class144 implements MouseListener, MouseMotionListener, FocusListener {

    @ObfuscatedName("ee.x")
    public static int field2211 = 0;

    @ObfuscatedName("ee.r")
    public static class144 field2221 = new class144();

    @ObfuscatedName("ee.j")
    public static volatile int field2210 = 0;

    @ObfuscatedName("ee.z")
    public static volatile int field2201 = 0;

    @ObfuscatedName("ee.i")
    public static volatile int field2202 = -1;

    @ObfuscatedName("ee.b")
    public static volatile int field2203 = -1;

    @ObfuscatedName("ee.l")
    public static int field2204 = 0;

    @ObfuscatedName("ee.m")
    public static int field2205 = 0;

    @ObfuscatedName("ee.p")
    public static volatile int field2207 = 0;

    @ObfuscatedName("ee.f")
    public static volatile int field2208 = 0;

    @ObfuscatedName("ee.d")
    public static volatile int field2213 = 0;

    @ObfuscatedName("ee.v")
    public static volatile long field2200 = 0L;

    @ObfuscatedName("ee.q")
    public static int field2199 = 0;

    @ObfuscatedName("ee.t")
    public static int field2212 = 0;

    @ObfuscatedName("ee.g")
    public static int field2214 = 0;

    @ObfuscatedName("ee.s")
    public static long field2209 = 0L;

    @ObfuscatedName("h.x(Ljava/awt/Component;I)V")
    public static void method181(Component arg0) {
        arg0.addMouseListener(field2221);
        arg0.addMouseMotionListener(field2221);
        arg0.addFocusListener(field2221);
    }

    @ObfuscatedName("h.r(I)V")
    public static void method179() {
        if (field2221 != null) {
            class144 var0 = field2221;
            synchronized (field2221) {
                field2221 = null;
            }
        }
    }

    @ObfuscatedName("hw.j(I)V")
    public static void method3723() {
        class144 var0 = field2221;
        synchronized (field2221) {
            field2204 = field2201;
            field2205 = field2202;
            field2211 = field2203 * -390630589;
            field2199 = field2207;
            field2212 = field2208;
            field2214 = field2213;
            field2209 = field2200;
            field2207 = 0;
        }
    }

    @ObfuscatedName("ed.z(II)V")
    public static void method2721(int arg0) {
        field2210 = arg0;
    }

    public final synchronized void mousePressed(MouseEvent arg0) {
        if (field2221 != null) {
            field2210 = 0;
            field2208 = arg0.getX();
            field2213 = arg0.getY();
            field2200 = class119.method698();
            if (arg0.isAltDown()) {
                field2207 = 4;
                field2201 = 4;
            } else if (arg0.isMetaDown()) {
                field2207 = 2;
                field2201 = 2;
            } else {
                field2207 = 1;
                field2201 = 1;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (field2221 != null) {
            field2210 = 0;
            field2201 = 0;
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
        if (field2221 != null) {
            field2210 = 0;
            field2202 = arg0.getX();
            field2203 = arg0.getY();
        }
    }

    public final synchronized void mouseExited(MouseEvent arg0) {
        if (field2221 != null) {
            field2210 = 0;
            field2202 = -1;
            field2203 = -1;
        }
    }

    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (field2221 != null) {
            field2210 = 0;
            field2202 = arg0.getX();
            field2203 = arg0.getY();
        }
    }

    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (field2221 != null) {
            field2210 = 0;
            field2202 = arg0.getX();
            field2203 = arg0.getY();
        }
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field2221 != null) {
            field2201 = 0;
        }
    }
}
