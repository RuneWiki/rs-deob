package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

@ObfuscatedName("bi")
public class class55 implements MouseListener, MouseMotionListener, FocusListener {

    @ObfuscatedName("bi.p")
    public static class55 field480 = new class55();

    @ObfuscatedName("bi.k")
    public static int field493 = 0;

    @ObfuscatedName("bi.l")
    public static volatile int field481 = 0;

    @ObfuscatedName("bi.b")
    public static volatile int field482 = 0;

    @ObfuscatedName("bi.i")
    public static volatile int field489 = -1;

    @ObfuscatedName("bi.c")
    public static volatile int field478 = -1;

    @ObfuscatedName("bi.f")
    public static volatile long field485 = -1L;

    @ObfuscatedName("bi.m")
    public static int field486 = 0;

    @ObfuscatedName("bi.u")
    public static int field488 = 0;

    @ObfuscatedName("bi.x")
    public static long field483 = 0L;

    @ObfuscatedName("bi.r")
    public static volatile int field490 = 0;

    @ObfuscatedName("bi.v")
    public static volatile int field491 = 0;

    @ObfuscatedName("bi.y")
    public static volatile int field492 = 0;

    @ObfuscatedName("bi.g")
    public static volatile long field501 = 0L;

    @ObfuscatedName("bi.a")
    public static int field494 = 0;

    @ObfuscatedName("bi.j")
    public static int field484 = 0;

    @ObfuscatedName("bi.t")
    public static int field496 = 0;

    @ObfuscatedName("bi.h")
    public static long field498 = 0L;

    @ObfuscatedName("j.q(Ljava/awt/Component;B)V")
    public static void method186(Component arg0) {
        arg0.addMouseListener(field480);
        arg0.addMouseMotionListener(field480);
        arg0.addFocusListener(field480);
    }

    @ObfuscatedName("hj.w(B)V")
    public static void method3728() {
        if (field480 != null) {
            class55 var0 = field480;
            synchronized (field480) {
                field480 = null;
            }
        }
    }

    @ObfuscatedName("bi.e(Ljava/awt/event/MouseEvent;I)I")
    public final int method869(MouseEvent arg0) {
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
        if (field480 != null) {
            field481 = 0;
            field491 = arg0.getX();
            field492 = arg0.getY();
            field501 = class298.method3576();
            field490 = this.method869(arg0);
            if (field490 != 0) {
                field482 = field490;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (field480 != null) {
            field481 = 0;
            field482 = 0;
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
        if (field480 != null) {
            field481 = 0;
            field489 = -1;
            field478 = -1;
            field485 = arg0.getWhen();
        }
    }

    public final synchronized void mouseDragged(MouseEvent arg0) {
        this.mouseMoved(arg0);
    }

    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (field480 != null) {
            field481 = 0;
            field489 = arg0.getX();
            field478 = arg0.getY();
            field485 = arg0.getWhen();
        }
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field480 != null) {
            field482 = 0;
        }
    }
}
