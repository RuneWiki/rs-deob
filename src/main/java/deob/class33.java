package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

@ObfuscatedName("az")
public class class33 implements MouseListener, MouseMotionListener, FocusListener {

    @ObfuscatedName("az.m")
    public static class33 field220 = new class33();

    @ObfuscatedName("az.t")
    public static volatile int field217 = 0;

    @ObfuscatedName("az.s")
    public static volatile int field222 = 0;

    @ObfuscatedName("az.j")
    public static volatile int field223 = -1;

    @ObfuscatedName("az.w")
    public static volatile int field224 = -1;

    @ObfuscatedName("az.n")
    public static volatile long field221 = -1L;

    @ObfuscatedName("az.r")
    public static int field226 = 0;

    @ObfuscatedName("az.o")
    public static int field227 = 0;

    @ObfuscatedName("az.v")
    public static int field228 = 0;

    @ObfuscatedName("az.d")
    public static long field238 = 0L;

    @ObfuscatedName("az.h")
    public static volatile int field240 = 0;

    @ObfuscatedName("az.g")
    public static volatile int field233 = 0;

    @ObfuscatedName("az.e")
    public static volatile int field229 = 0;

    @ObfuscatedName("az.a")
    public static volatile long field218 = 0L;

    @ObfuscatedName("az.u")
    public static int field234 = 0;

    @ObfuscatedName("az.k")
    public static int field235 = 0;

    @ObfuscatedName("az.f")
    public static int field236 = 0;

    @ObfuscatedName("az.l")
    public static long field237 = 0L;

    @ObfuscatedName("ep.c(Ljava/awt/Component;I)V")
    public static void method2630(Component arg0) {
        arg0.addMouseListener(field220);
        arg0.addMouseMotionListener(field220);
        arg0.addFocusListener(field220);
    }

    @ObfuscatedName("kd.b(Ljava/awt/Component;I)V")
    public static void method4970(Component arg0) {
        arg0.removeMouseListener(field220);
        arg0.removeMouseMotionListener(field220);
        arg0.removeFocusListener(field220);
        field222 = 0;
    }

    @ObfuscatedName("mw.p(S)V")
    public static void method5713() {
        if (field220 != null) {
            class33 var0 = field220;
            synchronized (field220) {
                field220 = null;
            }
        }
    }

    @ObfuscatedName("bb.m(I)V")
    public static void method1874() {
        class33 var0 = field220;
        synchronized (field220) {
            field226 = field222;
            field227 = field223;
            field228 = field224;
            field238 = field221;
            field234 = field240;
            field235 = field233;
            field236 = field229;
            field237 = field218;
            field240 = 0;
        }
    }

    @ObfuscatedName("du.t(IB)V")
    public static void method2598(int arg0) {
        field217 = arg0;
    }

    @ObfuscatedName("az.s(Ljava/awt/event/MouseEvent;I)I")
    public final int method606(MouseEvent arg0) {
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
        if (field220 != null) {
            field217 = 0;
            field233 = arg0.getX();
            field229 = arg0.getY();
            field218 = class416.method5860();
            field240 = this.method606(arg0);
            if (field240 != 0) {
                field222 = field240;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (field220 != null) {
            field217 = 0;
            field222 = 0;
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
        if (field220 != null) {
            field217 = 0;
            field223 = -1;
            field224 = -1;
            field221 = arg0.getWhen();
        }
    }

    public final synchronized void mouseDragged(MouseEvent arg0) {
        this.mouseMoved(arg0);
    }

    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (field220 != null) {
            field217 = 0;
            field223 = arg0.getX();
            field224 = arg0.getY();
            field221 = arg0.getWhen();
        }
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field220 != null) {
            field222 = 0;
        }
    }
}
