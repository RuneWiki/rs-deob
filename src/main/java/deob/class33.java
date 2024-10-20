package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

@ObfuscatedName("an")
public class class33 implements MouseListener, MouseMotionListener, FocusListener {

    @ObfuscatedName("an.n")
    public static class33 field223 = new class33();

    @ObfuscatedName("an.k")
    public static int field232 = 0;

    @ObfuscatedName("an.w")
    public static volatile int field236 = 0;

    @ObfuscatedName("an.s")
    public static volatile int field225 = 0;

    @ObfuscatedName("an.q")
    public static volatile int field226 = -1;

    @ObfuscatedName("an.m")
    public static volatile int field227 = -1;

    @ObfuscatedName("an.x")
    public static int field231 = 0;

    @ObfuscatedName("an.j")
    public static volatile long field234 = -1L;

    @ObfuscatedName("an.v")
    public static int field229 = 0;

    @ObfuscatedName("an.h")
    public static long field224 = 0L;

    @ObfuscatedName("an.t")
    public static volatile int field233 = 0;

    @ObfuscatedName("an.u")
    public static volatile int field228 = 0;

    @ObfuscatedName("an.d")
    public static volatile int field220 = 0;

    @ObfuscatedName("an.b")
    public static volatile long field221 = 0L;

    @ObfuscatedName("an.a")
    public static int field237 = 0;

    @ObfuscatedName("an.l")
    public static int field238 = 0;

    @ObfuscatedName("an.e")
    public static int field239 = 0;

    @ObfuscatedName("an.g")
    public static long field240 = 0L;

    @ObfuscatedName("bu.c(Ljava/awt/Component;I)V")
    public static void method2115(Component arg0) {
        arg0.addMouseListener(field223);
        arg0.addMouseMotionListener(field223);
        arg0.addFocusListener(field223);
    }

    @ObfuscatedName("gb.p(I)V")
    public static void method3659() {
        if (field223 != null) {
            class33 var0 = field223;
            synchronized (field223) {
                field223 = null;
            }
        }
    }

    @ObfuscatedName("nd.f(II)V")
    public static void method6418(int arg0) {
        field236 = arg0;
    }

    @ObfuscatedName("an.n(Ljava/awt/event/MouseEvent;I)I")
    public final int method604(MouseEvent arg0) {
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
        if (field223 != null) {
            field236 = 0;
            field228 = arg0.getX();
            field220 = arg0.getY();
            field221 = class271.method5624();
            field233 = this.method604(arg0);
            if (field233 != 0) {
                field225 = field233;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (field223 != null) {
            field236 = 0;
            field225 = 0;
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
        if (field223 != null) {
            field236 = 0;
            field226 = -1;
            field227 = -1;
            field234 = arg0.getWhen();
        }
    }

    public final synchronized void mouseDragged(MouseEvent arg0) {
        this.mouseMoved(arg0);
    }

    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (field223 != null) {
            field236 = 0;
            field226 = arg0.getX();
            field227 = arg0.getY();
            field234 = arg0.getWhen();
        }
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field223 != null) {
            field225 = 0;
        }
    }
}
