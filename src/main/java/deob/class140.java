package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

@ObfuscatedName("et")
public class class140 implements MouseListener, MouseMotionListener, FocusListener {

    @ObfuscatedName("et.f")
    public static class140 field2148 = new class140();

    @ObfuscatedName("et.s")
    public static volatile int field2139 = 0;

    @ObfuscatedName("et.q")
    public static volatile int field2153 = 0;

    @ObfuscatedName("et.g")
    public static volatile int field2141 = -1;

    @ObfuscatedName("et.m")
    public static volatile int field2143 = -1;

    @ObfuscatedName("et.t")
    public static int field2155 = 0;

    @ObfuscatedName("et.j")
    public static int field2144 = 0;

    @ObfuscatedName("et.n")
    public static int field2138 = 0;

    @ObfuscatedName("et.l")
    public static volatile int field2146 = 0;

    @ObfuscatedName("et.i")
    public static volatile int field2147 = 0;

    @ObfuscatedName("et.w")
    public static volatile int field2140 = 0;

    @ObfuscatedName("et.v")
    public static volatile long field2142 = 0L;

    @ObfuscatedName("et.o")
    public static int field2150 = 0;

    @ObfuscatedName("et.p")
    public static int field2151 = 0;

    @ObfuscatedName("et.b")
    public static int field2152 = 0;

    @ObfuscatedName("et.z")
    public static long field2149 = 0L;

    @ObfuscatedName("z.f(Ljava/awt/Component;I)V")
    public static void method173(Component arg0) {
        arg0.addMouseListener(field2148);
        arg0.addMouseMotionListener(field2148);
        arg0.addFocusListener(field2148);
    }

    @ObfuscatedName("fw.s(Ljava/awt/Component;B)V")
    public static void method3260(Component arg0) {
        arg0.removeMouseListener(field2148);
        arg0.removeMouseMotionListener(field2148);
        arg0.removeFocusListener(field2148);
        field2153 = 0;
    }

    @ObfuscatedName("aw.q(S)V")
    public static void method925() {
        if (field2148 != null) {
            class140 var0 = field2148;
            synchronized (field2148) {
                field2148 = null;
            }
        }
    }

    @ObfuscatedName("aq.g(IB)V")
    public static void method741(int arg0) {
        field2139 = arg0;
    }

    public final synchronized void mousePressed(MouseEvent arg0) {
        if (field2148 != null) {
            field2139 = 0;
            field2147 = arg0.getX();
            field2140 = arg0.getY();
            field2142 = class115.method645();
            if (arg0.isAltDown()) {
                field2146 = 4;
                field2153 = 4;
            } else if (arg0.isMetaDown()) {
                field2146 = 2;
                field2153 = 2;
            } else {
                field2146 = 1;
                field2153 = 1;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (field2148 != null) {
            field2139 = 0;
            field2153 = 0;
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
        if (field2148 != null) {
            field2139 = 0;
            field2141 = arg0.getX();
            field2143 = arg0.getY();
        }
    }

    public final synchronized void mouseExited(MouseEvent arg0) {
        if (field2148 != null) {
            field2139 = 0;
            field2141 = -1;
            field2143 = -1;
        }
    }

    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (field2148 != null) {
            field2139 = 0;
            field2141 = arg0.getX();
            field2143 = arg0.getY();
        }
    }

    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (field2148 != null) {
            field2139 = 0;
            field2141 = arg0.getX();
            field2143 = arg0.getY();
        }
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field2148 != null) {
            field2153 = 0;
        }
    }
}
