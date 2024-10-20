package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

@ObfuscatedName("ew")
public class class144 implements MouseListener, MouseMotionListener, FocusListener {

    @ObfuscatedName("ew.m")
    public static class144 field2213 = new class144();

    @ObfuscatedName("ew.w")
    public static volatile int field2222 = 0;

    @ObfuscatedName("ew.e")
    public static volatile int field2210 = 0;

    @ObfuscatedName("ew.o")
    public static volatile int field2211 = -1;

    @ObfuscatedName("ew.g")
    public static volatile int field2212 = -1;

    @ObfuscatedName("ew.l")
    public static int field2217 = 0;

    @ObfuscatedName("ew.j")
    public static int field2214 = 0;

    @ObfuscatedName("ew.r")
    public static int field2215 = 0;

    @ObfuscatedName("ew.x")
    public static volatile int field2216 = 0;

    @ObfuscatedName("ew.k")
    public static volatile int field2219 = 0;

    @ObfuscatedName("ew.v")
    public static volatile int field2218 = 0;

    @ObfuscatedName("ew.h")
    public static volatile long field2224 = 0L;

    @ObfuscatedName("ew.u")
    public static int field2225 = 0;

    @ObfuscatedName("ew.y")
    public static int field2221 = 0;

    @ObfuscatedName("ew.p")
    public static int field2223 = 0;

    @ObfuscatedName("ew.s")
    public static long field2209 = 0L;

    @ObfuscatedName("w.m(Ljava/awt/Component;I)V")
    public static void method5(Component arg0) {
        arg0.addMouseListener(field2213);
        arg0.addMouseMotionListener(field2213);
        arg0.addFocusListener(field2213);
    }

    @ObfuscatedName("cq.w(I)I")
    public static int method2129() {
        return ++field2222 - 1;
    }

    public final synchronized void mousePressed(MouseEvent arg0) {
        if (field2213 != null) {
            field2222 = 0;
            field2219 = arg0.getX();
            field2218 = arg0.getY();
            field2224 = class119.method3544();
            if (arg0.isAltDown()) {
                field2216 = 4;
                field2210 = 4;
            } else if (arg0.isMetaDown()) {
                field2216 = 2;
                field2210 = 2;
            } else {
                field2216 = 1;
                field2210 = 1;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (field2213 != null) {
            field2222 = 0;
            field2210 = 0;
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
        if (field2213 != null) {
            field2222 = 0;
            field2211 = arg0.getX();
            field2212 = arg0.getY();
        }
    }

    public final synchronized void mouseExited(MouseEvent arg0) {
        if (field2213 != null) {
            field2222 = 0;
            field2211 = -1;
            field2212 = -1;
        }
    }

    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (field2213 != null) {
            field2222 = 0;
            field2211 = arg0.getX();
            field2212 = arg0.getY();
        }
    }

    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (field2213 != null) {
            field2222 = 0;
            field2211 = arg0.getX();
            field2212 = arg0.getY();
        }
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field2213 != null) {
            field2210 = 0;
        }
    }
}
