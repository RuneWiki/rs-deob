package deob;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

@ObfuscatedName("eu")
public class class140 implements MouseListener, MouseMotionListener, FocusListener {

    @ObfuscatedName("eu.d")
    public static class140 field2124 = new class140();

    @ObfuscatedName("eu.p")
    public static volatile int field2123 = 0;

    @ObfuscatedName("eu.v")
    public static volatile int field2133 = 0;

    @ObfuscatedName("eu.l")
    public static volatile int field2132 = -1;

    @ObfuscatedName("eu.y")
    public static volatile int field2130 = 0;

    @ObfuscatedName("eu.w")
    public static volatile int field2126 = -1;

    @ObfuscatedName("eu.u")
    public static int field2131 = 0;

    @ObfuscatedName("eu.a")
    public static int field2128 = 0;

    @ObfuscatedName("eu.e")
    public static int field2129 = 0;

    @ObfuscatedName("eu.b")
    public static volatile int field2140 = 0;

    @ObfuscatedName("eu.o")
    public static volatile int field2127 = 0;

    @ObfuscatedName("eu.m")
    public static volatile long field2122 = 0L;

    @ObfuscatedName("eu.x")
    public static int field2134 = 0;

    @ObfuscatedName("eu.k")
    public static int field2135 = 0;

    @ObfuscatedName("eu.n")
    public static int field2136 = 0;

    @ObfuscatedName("eu.j")
    public static long field2137 = 0L;

    @ObfuscatedName("av.d(I)I")
    public static int method935() {
        return ++field2123 - 1;
    }

    public final synchronized void mousePressed(MouseEvent arg0) {
        if (field2124 != null) {
            field2123 = 0;
            field2140 = arg0.getX();
            field2127 = arg0.getY();
            field2122 = class115.method2142();
            if (arg0.isAltDown()) {
                field2130 = 4;
                field2133 = 4;
            } else if (arg0.isMetaDown()) {
                field2130 = 2;
                field2133 = 2;
            } else {
                field2130 = 1;
                field2133 = 1;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (field2124 != null) {
            field2123 = 0;
            field2133 = 0;
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
        if (field2124 != null) {
            field2123 = 0;
            field2132 = arg0.getX();
            field2126 = arg0.getY();
        }
    }

    public final synchronized void mouseExited(MouseEvent arg0) {
        if (field2124 != null) {
            field2123 = 0;
            field2132 = -1;
            field2126 = -1;
        }
    }

    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (field2124 != null) {
            field2123 = 0;
            field2132 = arg0.getX();
            field2126 = arg0.getY();
        }
    }

    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (field2124 != null) {
            field2123 = 0;
            field2132 = arg0.getX();
            field2126 = arg0.getY();
        }
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field2124 != null) {
            field2133 = 0;
        }
    }
}
