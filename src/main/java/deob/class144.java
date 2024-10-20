package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

@ObfuscatedName("ep")
public class class144 implements MouseListener, MouseMotionListener, FocusListener {

    @ObfuscatedName("ep.k")
    public static int field2201 = 0;

    @ObfuscatedName("ep.q")
    public static class144 field2195 = new class144();

    @ObfuscatedName("ep.f")
    public static volatile int field2206 = 0;

    @ObfuscatedName("ep.c")
    public static volatile int field2212 = 0;

    @ObfuscatedName("ep.v")
    public static volatile int field2198 = -1;

    @ObfuscatedName("ep.j")
    public static volatile int field2199 = -1;

    @ObfuscatedName("ep.m")
    public static int field2200 = 0;

    @ObfuscatedName("ep.y")
    public static volatile int field2203 = 0;

    @ObfuscatedName("ep.u")
    public static int field2205 = 0;

    @ObfuscatedName("ep.h")
    public static volatile int field2204 = 0;

    @ObfuscatedName("ep.l")
    public static volatile int field2209 = 0;

    @ObfuscatedName("ep.b")
    public static volatile long field2202 = 0L;

    @ObfuscatedName("ep.g")
    public static int field2207 = 0;

    @ObfuscatedName("ep.e")
    public static int field2208 = 0;

    @ObfuscatedName("ep.p")
    public static int field2197 = 0;

    @ObfuscatedName("ep.s")
    public static long field2210 = 0L;

    @ObfuscatedName("az.k(Ljava/awt/Component;I)V")
    public static void method968(Component arg0) {
        arg0.removeMouseListener(field2195);
        arg0.removeMouseMotionListener(field2195);
        arg0.removeFocusListener(field2195);
        field2212 = 0;
    }

    @ObfuscatedName("am.q(I)I")
    public static int method671() {
        return ++field2206 - 1;
    }

    public final synchronized void mousePressed(MouseEvent arg0) {
        if (field2195 != null) {
            field2206 = 0;
            field2204 = arg0.getX();
            field2209 = arg0.getY();
            field2202 = class119.method3068();
            if (arg0.isAltDown()) {
                field2203 = 4;
                field2212 = 4;
            } else if (arg0.isMetaDown()) {
                field2203 = 2;
                field2212 = 2;
            } else {
                field2203 = 1;
                field2212 = 1;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (field2195 != null) {
            field2206 = 0;
            field2212 = 0;
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
        if (field2195 != null) {
            field2206 = 0;
            field2198 = arg0.getX();
            field2199 = arg0.getY();
        }
    }

    public final synchronized void mouseExited(MouseEvent arg0) {
        if (field2195 != null) {
            field2206 = 0;
            field2198 = -1;
            field2199 = -1;
        }
    }

    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (field2195 != null) {
            field2206 = 0;
            field2198 = arg0.getX();
            field2199 = arg0.getY();
        }
    }

    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (field2195 != null) {
            field2206 = 0;
            field2198 = arg0.getX();
            field2199 = arg0.getY();
        }
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field2195 != null) {
            field2212 = 0;
        }
    }
}
