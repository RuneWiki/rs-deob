package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

@ObfuscatedName("as")
public class class33 implements MouseListener, MouseMotionListener, FocusListener {

    @ObfuscatedName("as.k")
    public static int field221 = 0;

    @ObfuscatedName("as.o")
    public static class33 field222 = new class33();

    @ObfuscatedName("as.g")
    public static volatile int field223 = 0;

    @ObfuscatedName("as.z")
    public static volatile int field226 = 0;

    @ObfuscatedName("as.a")
    public static volatile int field225 = -1;

    @ObfuscatedName("as.u")
    public static volatile int field237 = -1;

    @ObfuscatedName("as.e")
    public static volatile long field227 = -1L;

    @ObfuscatedName("as.l")
    public static int field239 = 0;

    @ObfuscatedName("as.y")
    public static long field231 = 0L;

    @ObfuscatedName("as.v")
    public static int field230 = 0;

    @ObfuscatedName("as.f")
    public static volatile int field232 = 0;

    @ObfuscatedName("as.s")
    public static volatile int field233 = 0;

    @ObfuscatedName("as.h")
    public static volatile int field234 = 0;

    @ObfuscatedName("as.d")
    public static volatile long field220 = 0L;

    @ObfuscatedName("as.q")
    public static int field236 = 0;

    @ObfuscatedName("as.j")
    public static int field241 = 0;

    @ObfuscatedName("as.x")
    public static int field238 = 0;

    @ObfuscatedName("as.b")
    public static long field228 = 0L;

    @ObfuscatedName("dy.n(Ljava/awt/Component;I)V")
    public static void method2357(Component arg0) {
        arg0.addMouseListener(field222);
        arg0.addMouseMotionListener(field222);
        arg0.addFocusListener(field222);
    }

    @ObfuscatedName("dj.c(I)V")
    public static void method2355() {
        if (field222 != null) {
            class33 var0 = field222;
            synchronized (field222) {
                field222 = null;
            }
        }
    }

    @ObfuscatedName("am.m(I)I")
    public static int method755() {
        return ++field223 - 1;
    }

    @ObfuscatedName("bk.k(II)V")
    public static void method1777(int arg0) {
        field223 = arg0;
    }

    @ObfuscatedName("as.o(Ljava/awt/event/MouseEvent;B)I")
    public final int method574(MouseEvent arg0) {
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
            field223 = 0;
            field233 = arg0.getX();
            field234 = arg0.getY();
            field220 = class397.method3986();
            field232 = this.method574(arg0);
            if (field232 != 0) {
                field226 = field232;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (field222 != null) {
            field223 = 0;
            field226 = 0;
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
            field223 = 0;
            field225 = -1;
            field237 = -1;
            field227 = arg0.getWhen();
        }
    }

    public final synchronized void mouseDragged(MouseEvent arg0) {
        this.mouseMoved(arg0);
    }

    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (field222 != null) {
            field223 = 0;
            field225 = arg0.getX();
            field237 = arg0.getY();
            field227 = arg0.getWhen();
        }
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field222 != null) {
            field226 = 0;
        }
    }
}
