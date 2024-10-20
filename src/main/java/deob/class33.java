package deob;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

@ObfuscatedName("aj")
public class class33 implements MouseListener, MouseMotionListener, FocusListener {

    @ObfuscatedName("aj.f")
    public static class33 field222 = new class33();

    @ObfuscatedName("aj.b")
    public static volatile int field225 = 0;

    @ObfuscatedName("aj.n")
    public static volatile int field236 = 0;

    @ObfuscatedName("aj.s")
    public static volatile int field240 = -1;

    @ObfuscatedName("aj.l")
    public static volatile int field226 = -1;

    @ObfuscatedName("aj.q")
    public static volatile long field227 = -1L;

    @ObfuscatedName("aj.o")
    public static int field228 = 0;

    @ObfuscatedName("aj.r")
    public static int field229 = 0;

    @ObfuscatedName("aj.p")
    public static int field230 = 0;

    @ObfuscatedName("aj.w")
    public static long field231 = 0L;

    @ObfuscatedName("aj.k")
    public static volatile int field232 = 0;

    @ObfuscatedName("aj.d")
    public static volatile int field233 = 0;

    @ObfuscatedName("aj.m")
    public static volatile int field235 = 0;

    @ObfuscatedName("aj.u")
    public static volatile long field224 = 0L;

    @ObfuscatedName("aj.t")
    public static int field220 = 0;

    @ObfuscatedName("aj.g")
    public static int field237 = 0;

    @ObfuscatedName("aj.x")
    public static int field234 = 0;

    @ObfuscatedName("aj.a")
    public static long field223 = 0L;

    @ObfuscatedName("di.v(I)V")
    public static void method2580() {
        if (field222 != null) {
            class33 var0 = field222;
            synchronized (field222) {
                field222 = null;
            }
        }
    }

    @ObfuscatedName("fv.c(I)V")
    public static void method3142() {
        class33 var0 = field222;
        synchronized (field222) {
            field228 = field236;
            field229 = field240;
            field230 = field226;
            field231 = field227;
            field220 = field232;
            field237 = field233;
            field234 = field235;
            field223 = field224;
            field232 = 0;
        }
    }

    @ObfuscatedName("bb.i(I)I")
    public static int method1593() {
        return ++field225 - 1;
    }

    @ObfuscatedName("jl.f(II)V")
    public static void method4664(int arg0) {
        field225 = arg0;
    }

    @ObfuscatedName("aj.b(Ljava/awt/event/MouseEvent;B)I")
    public final int method567(MouseEvent arg0) {
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
        if (field222 != null) {
            field225 = 0;
            field233 = arg0.getX();
            field235 = arg0.getY();
            field224 = class270.method2724();
            field232 = this.method567(arg0);
            if (field232 != 0) {
                field236 = field232;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (field222 != null) {
            field225 = 0;
            field236 = 0;
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
        if (field222 != null) {
            field225 = 0;
            field240 = -1;
            field226 = -1;
            field227 = arg0.getWhen();
        }
    }

    public final synchronized void mouseDragged(MouseEvent arg0) {
        this.mouseMoved(arg0);
    }

    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (field222 != null) {
            field225 = 0;
            field240 = arg0.getX();
            field226 = arg0.getY();
            field227 = arg0.getWhen();
        }
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field222 != null) {
            field236 = 0;
        }
    }
}
