package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

@ObfuscatedName("ep")
public class class135 implements MouseListener, MouseMotionListener, FocusListener {

    @ObfuscatedName("ep.j")
    public static class135 field2042 = new class135();

    @ObfuscatedName("ep.y")
    public static volatile int field2047 = 0;

    @ObfuscatedName("ep.z")
    public static volatile int field2040 = 0;

    @ObfuscatedName("ep.l")
    public static volatile int field2059 = 0;

    @ObfuscatedName("ep.w")
    public static volatile int field2053 = -1;

    @ObfuscatedName("ep.d")
    public static volatile int field2055 = -1;

    @ObfuscatedName("ep.f")
    public static int field2044 = 0;

    @ObfuscatedName("ep.i")
    public static int field2045 = 0;

    @ObfuscatedName("ep.a")
    public static int field2046 = 0;

    @ObfuscatedName("ep.o")
    public static volatile int field2039 = 0;

    @ObfuscatedName("ep.u")
    public static volatile int field2049 = 0;

    @ObfuscatedName("ep.m")
    public static volatile long field2050 = 0L;

    @ObfuscatedName("ep.e")
    public static int field2043 = 0;

    @ObfuscatedName("ep.v")
    public static int field2052 = 0;

    @ObfuscatedName("ep.r")
    public static int field2048 = 0;

    @ObfuscatedName("ep.t")
    public static long field2054 = 0L;

    @ObfuscatedName("eq.j(Ljava/awt/Component;I)V")
    public static void method2688(Component arg0) {
        arg0.addMouseListener(field2042);
        arg0.addMouseMotionListener(field2042);
        arg0.addFocusListener(field2042);
    }

    @ObfuscatedName("z.y(I)V")
    public static void method15() {
        if (field2042 != null) {
            class135 var0 = field2042;
            synchronized (field2042) {
                field2042 = null;
            }
        }
    }

    public final synchronized void mousePressed(MouseEvent arg0) {
        if (field2042 != null) {
            field2040 = 0;
            field2039 = arg0.getX();
            field2049 = arg0.getY();
            field2050 = Statics.method2875();
            if (arg0.isAltDown()) {
                field2047 = 4;
                field2059 = 4;
            } else if (arg0.isMetaDown()) {
                field2047 = 2;
                field2059 = 2;
            } else {
                field2047 = 1;
                field2059 = 1;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (field2042 != null) {
            field2040 = 0;
            field2059 = 0;
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
        if (field2042 != null) {
            field2040 = 0;
            field2053 = arg0.getX();
            field2055 = arg0.getY();
        }
    }

    public final synchronized void mouseExited(MouseEvent arg0) {
        if (field2042 != null) {
            field2040 = 0;
            field2053 = -1;
            field2055 = -1;
        }
    }

    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (field2042 != null) {
            field2040 = 0;
            field2053 = arg0.getX();
            field2055 = arg0.getY();
        }
    }

    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (field2042 != null) {
            field2040 = 0;
            field2053 = arg0.getX();
            field2055 = arg0.getY();
        }
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field2042 != null) {
            field2059 = 0;
        }
    }
}
