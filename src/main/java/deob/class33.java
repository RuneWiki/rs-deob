package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

@ObfuscatedName("ae")
public class class33 implements MouseListener, MouseMotionListener, FocusListener {

    @ObfuscatedName("ae.k")
    public static int field227 = 0;

    @ObfuscatedName("ae.a")
    public static class33 field220 = new class33();

    @ObfuscatedName("ae.m")
    public static volatile int field236 = 0;

    @ObfuscatedName("ae.p")
    public static volatile int field222 = 0;

    @ObfuscatedName("ae.s")
    public static volatile int field223 = -1;

    @ObfuscatedName("ae.r")
    public static volatile int field224 = -1;

    @ObfuscatedName("ae.v")
    public static volatile long field225 = -1L;

    @ObfuscatedName("ae.y")
    public static long field234 = 0L;

    @ObfuscatedName("ae.c")
    public static int field226 = 0;

    @ObfuscatedName("ae.w")
    public static int field228 = 0;

    @ObfuscatedName("ae.b")
    public static volatile int field230 = 0;

    @ObfuscatedName("ae.t")
    public static volatile int field231 = 0;

    @ObfuscatedName("ae.g")
    public static volatile int field232 = 0;

    @ObfuscatedName("ae.x")
    public static volatile long field218 = 0L;

    @ObfuscatedName("ae.n")
    public static int field238 = 0;

    @ObfuscatedName("ae.e")
    public static int field235 = 0;

    @ObfuscatedName("ae.h")
    public static int field240 = 0;

    @ObfuscatedName("ae.f")
    public static long field237 = 0L;

    @ObfuscatedName("ft.o(Ljava/awt/Component;I)V")
    public static void method2975(Component arg0) {
        arg0.addMouseListener(field220);
        arg0.addMouseMotionListener(field220);
        arg0.addFocusListener(field220);
    }

    @ObfuscatedName("nl.q(Ljava/awt/Component;I)V")
    public static void method6026(Component arg0) {
        arg0.removeMouseListener(field220);
        arg0.removeMouseMotionListener(field220);
        arg0.removeFocusListener(field220);
        field222 = 0;
    }

    @ObfuscatedName("hw.l(I)V")
    public static void method4091() {
        class33 var0 = field220;
        synchronized (field220) {
            field226 = field222;
            field227 = field223;
            field228 = field224;
            field234 = field225;
            field238 = field230;
            field235 = field231;
            field240 = field232;
            field237 = field218;
            field230 = 0;
        }
    }

    @ObfuscatedName("kl.k(I)I")
    public static int method4970() {
        return ++field236 - 1;
    }

    @ObfuscatedName("ae.a(Ljava/awt/event/MouseEvent;I)I")
    public final int method550(MouseEvent arg0) {
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
            field236 = 0;
            field231 = arg0.getX();
            field232 = arg0.getY();
            field218 = class270.method2485();
            field230 = this.method550(arg0);
            if (field230 != 0) {
                field222 = field230;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (field220 != null) {
            field236 = 0;
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
            field236 = 0;
            field223 = -1;
            field224 = -1;
            field225 = arg0.getWhen();
        }
    }

    public final synchronized void mouseDragged(MouseEvent arg0) {
        this.mouseMoved(arg0);
    }

    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (field220 != null) {
            field236 = 0;
            field223 = arg0.getX();
            field224 = arg0.getY();
            field225 = arg0.getWhen();
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
