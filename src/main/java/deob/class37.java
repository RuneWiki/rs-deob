package deob;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

@ObfuscatedName("ap")
public class class37 implements MouseListener, MouseMotionListener, FocusListener {

    @ObfuscatedName("ap.x")
    public static int field242 = 0;

    @ObfuscatedName("ap.h")
    public static class37 field249 = new class37();

    @ObfuscatedName("ap.j")
    public static volatile int field235 = 0;

    @ObfuscatedName("ap.y")
    public static long field243 = 0L;

    @ObfuscatedName("ap.d")
    public static volatile int field248 = 0;

    @ObfuscatedName("ap.n")
    public static volatile int field237 = -1;

    @ObfuscatedName("ap.r")
    public static volatile int field238 = -1;

    @ObfuscatedName("ap.l")
    public static volatile long field239 = -1L;

    @ObfuscatedName("ap.s")
    public static int field246 = 0;

    @ObfuscatedName("ap.p")
    public static int field241 = 0;

    @ObfuscatedName("ap.b")
    public static volatile int field244 = 0;

    @ObfuscatedName("ap.o")
    public static volatile int field232 = 0;

    @ObfuscatedName("ap.u")
    public static volatile int field245 = 0;

    @ObfuscatedName("ap.z")
    public static volatile long field247 = 0L;

    @ObfuscatedName("ap.t")
    public static int field234 = 0;

    @ObfuscatedName("ap.w")
    public static int field240 = 0;

    @ObfuscatedName("ap.m")
    public static int field250 = 0;

    @ObfuscatedName("ap.q")
    public static long field236 = 0L;

    @ObfuscatedName("bu.a(B)V")
    public static void method1938() {
        if (field249 != null) {
            class37 var0 = field249;
            synchronized (field249) {
                field249 = null;
            }
        }
    }

    @ObfuscatedName("ib.f(I)V")
    public static void method4669() {
        class37 var0 = field249;
        synchronized (field249) {
            field246 = field248;
            field241 = field237;
            field242 = field238;
            field243 = field239;
            field234 = field244;
            field240 = field232;
            field250 = field245;
            field236 = field247;
            field244 = 0;
        }
    }

    @ObfuscatedName("ap.c(Ljava/awt/event/MouseEvent;I)I")
    public final int method665(MouseEvent arg0) {
        int var2 = arg0.getButton();
        if (arg0.isAltDown() || var2 == 2) {
            return 4;
        } else if (arg0.isMetaDown() || var2 == 3) {
            return 2;
        } else {
            return 1;
        }
    }

    public final synchronized void mousePressed(MouseEvent arg0) {
        if (field249 != null) {
            field235 = 0;
            field232 = arg0.getX();
            field245 = arg0.getY();
            field247 = class280.method2629();
            field244 = this.method665(arg0);
            if (field244 != 0) {
                field248 = field244;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (field249 != null) {
            field235 = 0;
            field248 = 0;
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
        this.mouseMoved(arg0);
    }

    public final synchronized void mouseExited(MouseEvent arg0) {
        if (field249 != null) {
            field235 = 0;
            field237 = -1;
            field238 = -1;
            field239 = arg0.getWhen();
        }
    }

    public final synchronized void mouseDragged(MouseEvent arg0) {
        this.mouseMoved(arg0);
    }

    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (field249 != null) {
            field235 = 0;
            field237 = arg0.getX();
            field238 = arg0.getY();
            field239 = arg0.getWhen();
        }
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field249 != null) {
            field248 = 0;
        }
    }
}
