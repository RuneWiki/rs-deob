package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

@ObfuscatedName("eq")
public class class144 implements MouseListener, MouseMotionListener, FocusListener {

    @ObfuscatedName("eq.a")
    public static class144 field2230 = new class144();

    @ObfuscatedName("eq.d")
    public static volatile int field2229 = 0;

    @ObfuscatedName("eq.v")
    public static volatile int field2218 = 0;

    @ObfuscatedName("eq.r")
    public static volatile int field2219 = -1;

    @ObfuscatedName("eq.z")
    public static volatile int field2220 = -1;

    @ObfuscatedName("eq.t")
    public static int field2221 = 0;

    @ObfuscatedName("eq.n")
    public static int field2226 = 0;

    @ObfuscatedName("eq.i")
    public static int field2223 = 0;

    @ObfuscatedName("eq.g")
    public static volatile int field2216 = 0;

    @ObfuscatedName("eq.m")
    public static volatile int field2225 = 0;

    @ObfuscatedName("eq.k")
    public static volatile int field2222 = 0;

    @ObfuscatedName("eq.x")
    public static volatile long field2217 = 0L;

    @ObfuscatedName("eq.u")
    public static int field2228 = 0;

    @ObfuscatedName("eq.j")
    public static int field2224 = 0;

    @ObfuscatedName("eq.q")
    public static int field2227 = 0;

    @ObfuscatedName("eq.w")
    public static long field2231 = 0L;

    @ObfuscatedName("dq.a(Ljava/awt/Component;I)V")
    public static void method2691(Component arg0) {
        arg0.removeMouseListener(field2230);
        arg0.removeMouseMotionListener(field2230);
        arg0.removeFocusListener(field2230);
        field2218 = 0;
    }

    @ObfuscatedName("ak.d(I)V")
    public static void method875() {
        class144 var0 = field2230;
        synchronized (field2230) {
            field2221 = field2218;
            field2226 = field2219;
            field2223 = field2220 * 1469584685;
            field2228 = field2216;
            field2224 = field2225;
            field2227 = field2222;
            field2231 = field2217;
            field2216 = 0;
        }
    }

    @ObfuscatedName("dj.v(I)I")
    public static int method2313() {
        return ++field2229 - 1;
    }

    public final synchronized void mousePressed(MouseEvent arg0) {
        if (field2230 != null) {
            field2229 = 0;
            field2225 = arg0.getX();
            field2222 = arg0.getY();
            field2217 = class119.method64();
            if (arg0.isAltDown()) {
                field2216 = 4;
                field2218 = 4;
            } else if (arg0.isMetaDown()) {
                field2216 = 2;
                field2218 = 2;
            } else {
                field2216 = 1;
                field2218 = 1;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (field2230 != null) {
            field2229 = 0;
            field2218 = 0;
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
        if (field2230 != null) {
            field2229 = 0;
            field2219 = arg0.getX();
            field2220 = arg0.getY();
        }
    }

    public final synchronized void mouseExited(MouseEvent arg0) {
        if (field2230 != null) {
            field2229 = 0;
            field2219 = -1;
            field2220 = -1;
        }
    }

    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (field2230 != null) {
            field2229 = 0;
            field2219 = arg0.getX();
            field2220 = arg0.getY();
        }
    }

    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (field2230 != null) {
            field2229 = 0;
            field2219 = arg0.getX();
            field2220 = arg0.getY();
        }
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field2230 != null) {
            field2218 = 0;
        }
    }
}
