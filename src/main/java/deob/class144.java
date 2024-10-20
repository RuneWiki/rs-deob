package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

@ObfuscatedName("eg")
public class class144 implements MouseListener, MouseMotionListener, FocusListener {

    @ObfuscatedName("eg.s")
    public static class144 field2196 = new class144();

    @ObfuscatedName("eg.z")
    public static volatile int field2195 = 0;

    @ObfuscatedName("eg.t")
    public static volatile int field2183 = 0;

    @ObfuscatedName("eg.y")
    public static volatile int field2191 = 0;

    @ObfuscatedName("eg.p")
    public static volatile int field2188 = -1;

    @ObfuscatedName("eg.g")
    public static volatile int field2187 = -1;

    @ObfuscatedName("eg.m")
    public static int field2185 = 0;

    @ObfuscatedName("eg.f")
    public static int field2193 = 0;

    @ObfuscatedName("eg.k")
    public static int field2190 = 0;

    @ObfuscatedName("eg.h")
    public static volatile int field2192 = 0;

    @ObfuscatedName("eg.r")
    public static volatile int field2184 = 0;

    @ObfuscatedName("eg.w")
    public static volatile long field2194 = 0L;

    @ObfuscatedName("eg.u")
    public static int field2199 = 0;

    @ObfuscatedName("eg.n")
    public static int field2189 = 0;

    @ObfuscatedName("eg.d")
    public static int field2197 = 0;

    @ObfuscatedName("eg.a")
    public static long field2198 = 0L;

    @ObfuscatedName("eu.s(Ljava/awt/Component;I)V")
    public static void method2849(Component arg0) {
        arg0.addMouseListener(field2196);
        arg0.addMouseMotionListener(field2196);
        arg0.addFocusListener(field2196);
    }

    @ObfuscatedName("at.z(Ljava/awt/Component;I)V")
    public static void method898(Component arg0) {
        arg0.removeMouseListener(field2196);
        arg0.removeMouseMotionListener(field2196);
        arg0.removeFocusListener(field2196);
        field2183 = 0;
    }

    @ObfuscatedName("ex.t(B)V")
    public static void method2810() {
        if (field2196 != null) {
            class144 var0 = field2196;
            synchronized (field2196) {
                field2196 = null;
            }
        }
    }

    @ObfuscatedName("dr.y(B)I")
    public static int method2151() {
        return ++field2195 - 1;
    }

    public final synchronized void mousePressed(MouseEvent arg0) {
        if (field2196 != null) {
            field2195 = 0;
            field2192 = arg0.getX();
            field2184 = arg0.getY();
            field2194 = class119.method2280();
            if (arg0.isAltDown()) {
                field2191 = 4;
                field2183 = 4;
            } else if (arg0.isMetaDown()) {
                field2191 = 2;
                field2183 = 2;
            } else {
                field2191 = 1;
                field2183 = 1;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (field2196 != null) {
            field2195 = 0;
            field2183 = 0;
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
        if (field2196 != null) {
            field2195 = 0;
            field2188 = arg0.getX();
            field2187 = arg0.getY();
        }
    }

    public final synchronized void mouseExited(MouseEvent arg0) {
        if (field2196 != null) {
            field2195 = 0;
            field2188 = -1;
            field2187 = -1;
        }
    }

    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (field2196 != null) {
            field2195 = 0;
            field2188 = arg0.getX();
            field2187 = arg0.getY();
        }
    }

    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (field2196 != null) {
            field2195 = 0;
            field2188 = arg0.getX();
            field2187 = arg0.getY();
        }
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field2196 != null) {
            field2183 = 0;
        }
    }
}
